#!/usr/bin/env python3

def generate_llvm_from_tac_file(tac_file_path: str, output_file_path: str) -> str:
    # Ler conteúdo TAC
    with open(tac_file_path, 'r', encoding='utf-8') as f:
        tac_content = f.read()
    
    # Gerar LLVM corrigido
    llvm_code = generate_corrected_llvm(tac_content)
    
    # Salvar arquivo
    with open(output_file_path, 'w', encoding='utf-8') as f:
        f.write(llvm_code)
    
    return llvm_code

def generate_corrected_llvm(tac_content: str) -> str:
    """Gera código LLVM corrigido a partir do conteúdo TAC"""
    lines = tac_content.split('\n')
    
    # Cabeçalho com declarações de funções
    llvm_lines = [
        "; Código LLVM IR gerado pelo Compilador Timemania",
        "target triple = \"arm64-apple-darwin24.5.0\"",
        "",
        "declare i32 @printf(i8*, ...)",
        "declare i32 @scanf(i8*, ...)",
        ""
    ]
    
    # Encontrar variáveis e strings
    variables = set()
    strings_used = set()
    
    for line in lines:
        # Detectar strings em param
        if line.startswith('param '):
            param_parts = line.split(maxsplit=1)
            if len(param_parts) > 1:
                param = param_parts[1]
                # Se contém espaços ou caracteres especiais, é uma string
                if ' ' in param or any(c in param for c in [':', '!', '.', ',', '(', ')']):
                    strings_used.add(param)
        
        if '=' in line and not line.startswith('#'):
            parts = line.split('=', 1)
            if len(parts) == 2:
                dest = parts[0].strip()
                expr = parts[1].strip()
                # Verificar se dest é um nome de variável válido (apenas letras, números e _)
                if not dest.startswith('t') and dest.replace('_', '').isalnum() and dest.isidentifier():
                    variables.add(dest)
                
                # Detectar variáveis em expressões (incluindo comparações)
                for op in ['==', '!=', '>=', '<=', '>', '<', '+', '-', '*', '/']:
                    if op in expr:
                        operands = expr.split(op)
                        if len(operands) == 2:
                            for operand in operands:
                                operand = operand.strip()
                                if operand.replace('_', '').isalnum() and operand.isidentifier() and not operand.startswith('t') and not operand.isdigit():
                                    variables.add(operand)
                        break
                
                # Para expressões simples sem operadores
                if not any(op in expr for op in ['==', '!=', '>=', '<=', '>', '<', '+', '-', '*', '/']):
                    if not expr.isdigit() and expr.replace('_', '').isalnum() and expr.isidentifier() and not expr.startswith('t'):
                        variables.add(expr)
    
    # Declarar variáveis globais
    for var in sorted(variables):
        llvm_lines.append(f"@{var} = global i32 0")
    
    # Criar constantes para strings
    string_constants = {}
    for i, string_text in enumerate(sorted(strings_used)):
        # Escapar caracteres especiais e calcular tamanho
        escaped_string = string_text.replace('\\', '\\\\').replace('"', '\\"')
        string_length = len(string_text) + 1  # +1 para \0
        
        const_name = f"@.str{i+1}"
        string_constants[string_text] = const_name
        llvm_lines.append(f"{const_name} = private unnamed_addr constant [{string_length} x i8] c\"{escaped_string}\\00\", align 1")
    
    # String de formato para printf e scanf
    llvm_lines.extend([
        "",
        "@.str = private unnamed_addr constant [4 x i8] c\"%d\\0A\\00\", align 1",
        "@.str_input = private unnamed_addr constant [3 x i8] c\"%d\\00\", align 1",
        "@.str_msg = private unnamed_addr constant [4 x i8] c\"%s\\0A\\00\", align 1",
        ""
    ])
    
    # Função main
    llvm_lines.extend([
        "define i32 @main() {",
        "  br label %entry",
        "entry:"
    ])
    
    temp_counter = 0
    temp_values = {}
    last_param = None  # Para rastrear o último parâmetro para funções como leia
    
    # Primeira passada: identificar params que são seguidos por call leia
    leia_params = set()
    for i, line in enumerate(lines):
        line = line.strip()
        if line.startswith('param ') and i + 1 < len(lines):
            next_line = lines[i + 1].strip()
            if next_line.startswith('call leia'):
                param_parts = line.split(maxsplit=1)
                if len(param_parts) > 1:
                    leia_params.add(param_parts[1])
    
    for line in lines:
        line = line.strip()
        if not line or line.startswith('#') or line.startswith('//'):
            continue
        
        # Labels (apenas labels válidos, não strings)
        if line.endswith(':') and not line.startswith('param '):
            label = line.rstrip(':')
            # Verificar se é um label válido (apenas letras, números, _ e não contém espaços)
            if label.replace('_', '').replace('L', '').isalnum() and ' ' not in label:
                if not llvm_lines[-1].strip().startswith('br '):
                    llvm_lines.append(f"  br label %{label}")
                llvm_lines.append(f"{label}:")
                continue
        
        # Atribuições e operações (excluir linhas que começam com 'param')
        if '=' in line and not line.startswith('param '):
            parts = line.split('=', 1)
            if len(parts) == 2:
                dest = parts[0].strip()
                expr = parts[1].strip()
                
                # CORREÇÃO PRINCIPAL: Detectar todas as comparações
                comparison_op = None
                for op in ['==', '!=', '>=', '<=', '>', '<']:
                    if op in expr:
                        comparison_op = op
                        break
                
                if comparison_op:
                    operands = expr.split(comparison_op)
                    if len(operands) == 2:
                        arg1, arg2 = operands[0].strip(), operands[1].strip()
                        
                        # Carregar primeiro operando
                        if arg1.isdigit():
                            val1 = arg1
                        elif arg1 in temp_values:
                            val1 = temp_values[arg1]
                        else:
                            val1_reg = f"%cmp1_{temp_counter}"
                            llvm_lines.append(f"  {val1_reg} = load i32, i32* @{arg1}")
                            val1 = val1_reg
                            temp_counter += 1
                        
                        # Segundo operando (constante ou variável)
                        if arg2.isdigit():
                            val2 = arg2
                        elif arg2 in temp_values:
                            val2 = temp_values[arg2]
                        else:
                            val2_reg = f"%cmp2_{temp_counter}"
                            llvm_lines.append(f"  {val2_reg} = load i32, i32* @{arg2}")
                            val2 = val2_reg
                            temp_counter += 1
                        
                        # Mapear operador para instrução LLVM
                        llvm_op = {
                            '==': 'icmp eq',
                            '!=': 'icmp ne', 
                            '>': 'icmp sgt',
                            '<': 'icmp slt',
                            '>=': 'icmp sge',
                            '<=': 'icmp sle'
                        }[comparison_op]
                        
                        # Gerar comparação correta
                        result_reg = f"%{dest}"
                        llvm_lines.append(f"  {result_reg} = {llvm_op} i32 {val1}, {val2}")
                        temp_values[dest] = result_reg
                        continue
                
                # Verificar operações aritméticas
                elif '+' in expr:
                    operands = expr.split('+')
                    if len(operands) == 2:
                        arg1, arg2 = operands[0].strip(), operands[1].strip()
                        
                        # Carregar primeiro operando
                        if arg1.isdigit():
                            val1 = arg1
                        elif arg1 in temp_values:
                            val1 = temp_values[arg1]
                        else:
                            val1_reg = f"%add1_{temp_counter}"
                            llvm_lines.append(f"  {val1_reg} = load i32, i32* @{arg1}")
                            val1 = val1_reg
                            temp_counter += 1
                        
                        # Segundo operando
                        if arg2.isdigit():
                            val2 = arg2
                        elif arg2 in temp_values:
                            val2 = temp_values[arg2]
                        else:
                            val2_reg = f"%add2_{temp_counter}"
                            llvm_lines.append(f"  {val2_reg} = load i32, i32* @{arg2}")
                            val2 = val2_reg
                            temp_counter += 1
                        
                        # Gerar soma
                        result_reg = f"%{dest}"
                        llvm_lines.append(f"  {result_reg} = add i32 {val1}, {val2}")
                        temp_values[dest] = result_reg
                        continue
                
                elif '-' in expr:
                    operands = expr.split('-')
                    if len(operands) == 2:
                        arg1, arg2 = operands[0].strip(), operands[1].strip()
                        
                        # Carregar operandos
                        if arg1.isdigit():
                            val1 = arg1
                        elif arg1 in temp_values:
                            val1 = temp_values[arg1]
                        else:
                            val1_reg = f"%sub1_{temp_counter}"
                            llvm_lines.append(f"  {val1_reg} = load i32, i32* @{arg1}")
                            val1 = val1_reg
                            temp_counter += 1
                        
                        if arg2.isdigit():
                            val2 = arg2
                        elif arg2 in temp_values:
                            val2 = temp_values[arg2]
                        else:
                            val2_reg = f"%sub2_{temp_counter}"
                            llvm_lines.append(f"  {val2_reg} = load i32, i32* @{arg2}")
                            val2 = val2_reg
                            temp_counter += 1
                        
                        # Gerar subtração
                        result_reg = f"%{dest}"
                        llvm_lines.append(f"  {result_reg} = sub i32 {val1}, {val2}")
                        temp_values[dest] = result_reg
                        continue
                
                elif '*' in expr:
                    operands = expr.split('*')
                    if len(operands) == 2:
                        arg1, arg2 = operands[0].strip(), operands[1].strip()
                        
                        # Carregar operandos
                        if arg1.isdigit():
                            val1 = arg1
                        elif arg1 in temp_values:
                            val1 = temp_values[arg1]
                        else:
                            val1_reg = f"%mul1_{temp_counter}"
                            llvm_lines.append(f"  {val1_reg} = load i32, i32* @{arg1}")
                            val1 = val1_reg
                            temp_counter += 1
                        
                        if arg2.isdigit():
                            val2 = arg2
                        elif arg2 in temp_values:
                            val2 = temp_values[arg2]
                        else:
                            val2_reg = f"%mul2_{temp_counter}"
                            llvm_lines.append(f"  {val2_reg} = load i32, i32* @{arg2}")
                            val2 = val2_reg
                            temp_counter += 1
                        
                        # Gerar multiplicação
                        result_reg = f"%{dest}"
                        llvm_lines.append(f"  {result_reg} = mul i32 {val1}, {val2}")
                        temp_values[dest] = result_reg
                        continue
                
                elif '/' in expr:
                    operands = expr.split('/')
                    if len(operands) == 2:
                        arg1, arg2 = operands[0].strip(), operands[1].strip()
                        
                        # Carregar operandos
                        if arg1.isdigit():
                            val1 = arg1
                        elif arg1 in temp_values:
                            val1 = temp_values[arg1]
                        else:
                            val1_reg = f"%div1_{temp_counter}"
                            llvm_lines.append(f"  {val1_reg} = load i32, i32* @{arg1}")
                            val1 = val1_reg
                            temp_counter += 1
                        
                        if arg2.isdigit():
                            val2 = arg2
                        elif arg2 in temp_values:
                            val2 = temp_values[arg2]
                        else:
                            val2_reg = f"%div2_{temp_counter}"
                            llvm_lines.append(f"  {val2_reg} = load i32, i32* @{arg2}")
                            val2 = val2_reg
                            temp_counter += 1
                        
                        # Gerar divisão
                        result_reg = f"%{dest}"
                        llvm_lines.append(f"  {result_reg} = sdiv i32 {val1}, {val2}")
                        temp_values[dest] = result_reg
                        continue
                
                # Operações lógicas
                elif ' OR ' in expr:
                    operands = expr.split(' OR ')
                    if len(operands) == 2:
                        arg1, arg2 = operands[0].strip(), operands[1].strip()
                        
                        # Carregar operandos (devem ser valores booleanos/temporários)
                        if arg1 in temp_values:
                            val1 = temp_values[arg1]
                        else:
                            val1_reg = f"%or1_{temp_counter}"
                            llvm_lines.append(f"  {val1_reg} = load i32, i32* @{arg1}")
                            val1 = val1_reg
                            temp_counter += 1
                        
                        if arg2 in temp_values:
                            val2 = temp_values[arg2]
                        else:
                            val2_reg = f"%or2_{temp_counter}"
                            llvm_lines.append(f"  {val2_reg} = load i32, i32* @{arg2}")
                            val2 = val2_reg
                            temp_counter += 1
                        
                        # Gerar OR lógico (i1 OR i1)
                        result_reg = f"%{dest}"
                        llvm_lines.append(f"  {result_reg} = or i1 {val1}, {val2}")
                        temp_values[dest] = result_reg
                        continue
                
                elif ' AND ' in expr:
                    operands = expr.split(' AND ')
                    if len(operands) == 2:
                        arg1, arg2 = operands[0].strip(), operands[1].strip()
                        
                        # Carregar operandos (devem ser valores booleanos/temporários)
                        if arg1 in temp_values:
                            val1 = temp_values[arg1]
                        else:
                            val1_reg = f"%and1_{temp_counter}"
                            llvm_lines.append(f"  {val1_reg} = load i32, i32* @{arg1}")
                            val1 = val1_reg
                            temp_counter += 1
                        
                        if arg2 in temp_values:
                            val2 = temp_values[arg2]
                        else:
                            val2_reg = f"%and2_{temp_counter}"
                            llvm_lines.append(f"  {val2_reg} = load i32, i32* @{arg2}")
                            val2 = val2_reg
                            temp_counter += 1
                        
                        # Gerar AND lógico (i1 AND i1)
                        result_reg = f"%{dest}"
                        llvm_lines.append(f"  {result_reg} = and i1 {val1}, {val2}")
                        temp_values[dest] = result_reg
                        continue
                
                # Atribuições simples
                elif expr.isdigit():
                    llvm_lines.append(f"  store i32 {expr}, i32* @{dest}")
                else:
                    # Verificar se expr é uma temporária ou variável
                    if expr in temp_values:
                        # É uma temporária - usar valor direto
                        llvm_lines.append(f"  store i32 {temp_values[expr]}, i32* @{dest}")
                    else:
                        # É uma variável - carregar normalmente
                        temp_reg = f"%tmp{temp_counter}"
                        temp_counter += 1
                        llvm_lines.append(f"  {temp_reg} = load i32, i32* @{expr}")
                        llvm_lines.append(f"  store i32 {temp_reg}, i32* @{dest}")
        
        # Saltos condicionais
        elif line.startswith('if !') and 'goto' in line:
            parts = line.split()
            if len(parts) >= 4:
                condition = parts[1].replace('!', '')
                label = parts[3]
                
                if condition in temp_values:
                    cont_label = f"cont{temp_counter}"
                    temp_counter += 1
                    llvm_lines.append(f"  br i1 {temp_values[condition]}, label %{cont_label}, label %{label}")
                    llvm_lines.append(f"{cont_label}:")
        
        # Saltos incondicionais
        elif line.startswith('goto '):
            parts = line.split()
            if len(parts) >= 2:
                label = parts[1]
                llvm_lines.append(f"  br label %{label}")
        
        # Chamadas printf
        elif line.startswith('param '):
            param_parts = line.split(maxsplit=1)
            if len(param_parts) > 1:
                param = param_parts[1]
                last_param = param  # Guardar para uso em call
                
                # Não imprimir se este param é para leia
                if param in leia_params:
                    continue
                
                # Verificar se é uma string (contém espaços ou caracteres especiais)
                if ' ' in param or any(c in param for c in [':', '!', '.', ',', '(', ')']):
                    # É uma string - usar constante
                    if param in string_constants:
                        str_ptr = f"%str_ptr{temp_counter}"
                        string_length = len(param)
                        temp_counter += 1
                        llvm_lines.append(f"  {str_ptr} = getelementptr [{string_length + 1} x i8], [{string_length + 1} x i8]* {string_constants[param]}, i32 0, i32 0")
                        llvm_lines.append(f"  call i32 (i8*, ...) @printf(i8* {str_ptr})")
                
                # Verificar se é um identificador válido (variável) ou número
                elif param.isdigit():
                    # Parâmetro numérico
                    str_ptr = f"%str_ptr{temp_counter}"
                    temp_counter += 1
                    llvm_lines.append(f"  {str_ptr} = getelementptr [4 x i8], [4 x i8]* @.str, i32 0, i32 0")
                    llvm_lines.append(f"  call i32 (i8*, ...) @printf(i8* {str_ptr}, i32 {param})")
                elif param.isidentifier() and param.replace('_', '').isalnum():
                    # Parâmetro variável válida
                    param_reg = f"%param{temp_counter}"
                    str_ptr = f"%str_ptr{temp_counter}"
                    temp_counter += 1
                    llvm_lines.append(f"  {param_reg} = load i32, i32* @{param}")
                    llvm_lines.append(f"  {str_ptr} = getelementptr [4 x i8], [4 x i8]* @.str, i32 0, i32 0")
                    llvm_lines.append(f"  call i32 (i8*, ...) @printf(i8* {str_ptr}, i32 {param_reg})")
                # Ignorar identificadores inválidos
        
        # Instruções call - implementar leia, vasco, escreva
        elif line.startswith('call '):
            parts = line.split(',')
            if len(parts) >= 2:
                call_part = parts[0].strip()  # "call funcao"
                param_count = parts[1].strip()  # "1"
                
                if 'leia' in call_part and last_param:
                    # Implementar leia - scanf para ler inteiro na variável last_param
                    if last_param.isidentifier() and last_param.replace('_', '').isalnum():
                        str_ptr = f"%scanf_ptr{temp_counter}"
                        temp_counter += 1
                        llvm_lines.append(f"  {str_ptr} = getelementptr [3 x i8], [3 x i8]* @.str_input, i32 0, i32 0")
                        llvm_lines.append(f"  call i32 (i8*, ...) @scanf(i8* {str_ptr}, i32* @{last_param})")
                    
                elif 'vasco' in call_part:
                    # Implementar vasco - printf de string (por enquanto ignorar)
                    continue
                    
                elif 'escreva' in call_part:
                    # Implementar escreva - printf já implementado nos params
                    continue
                    
                elif 'flamengo' in call_part:
                    # Implementar flamengo - printf de string (por enquanto ignorar)
                    continue
    
    # Finalizar
    llvm_lines.extend([
        "  br label %program_end",
        "program_end:",
        "  ret i32 0",
        "}"
    ])
    
    return '\n'.join(llvm_lines)


def generate_llvm_from_tac_file(tac_file_path: str, output_file_path: str) -> str:
    """
    Versão corrigida - substitui a função original
    """
    # Ler conteúdo TAC
    with open(tac_file_path, 'r', encoding='utf-8') as f:
        tac_content = f.read()
    
    # Gerar LLVM corrigido
    llvm_code = generate_corrected_llvm(tac_content)
    
    # Salvar arquivo
    with open(output_file_path, 'w', encoding='utf-8') as f:
        f.write(llvm_code)
    
    return llvm_code
