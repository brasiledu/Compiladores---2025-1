from TimemaniaParserVisitor import TimemaniaParserVisitor
from TimemaniaParser import TimemaniaParser

# Classe responsável pela análise semântica do código-fonte
class SemanticAnalyzer(TimemaniaParserVisitor):
    def __init__(self):
        self.symbol_table = {}  
        self.variable_values = {}  # Nova tabela para rastrear valores
        self.errors = []

    # Visita o programa principal (nó raiz)
    def visitPrograma(self, ctx):
        print("🚀 Iniciando análise semântica do programa...")
        
        # Processa todas as declarações primeiro
        declaracoes = ctx.declaracao()
        if declaracoes:
            for declaracao in declaracoes:
                # Verificar tipo específico da declaração e chamar método apropriado
                if declaracao.variavelSimples():
                    self.visitVariavelSimples(declaracao.variavelSimples())
                elif declaracao.variavel():
                    self.visitVariavel(declaracao.variavel())
                else:
                    self.visit(declaracao)
        
        # Depois processa todos os comandos
        comandos = ctx.comando()
        if comandos:
            for comando in comandos:
                # Verificar tipo específico do comando e chamar método apropriado
                if comando.atribuicao():
                    self.visitAtribuicao(comando.atribuicao())
                elif comando.chamadaFuncao():
                    self.visitChamadaFuncao(comando.chamadaFuncao())
                else:
                    self.visit(comando)
        
        print("✅ Análise semântica do programa concluída!")
        return None

    # Visita declarações de variáveis simples (tipo nome;)
    def visitVariavelSimples(self, ctx):
        tipo = ctx.tipoSimples().getText()
        nome = ctx.ID().getText()
        
        # Verifica se a variável já foi declarada
        if nome in self.symbol_table:
            self.errors.append(f"Erro semântico: variável '{nome}' já foi declarada.")
        else:
            # Armazena a variável e seu tipo na tabela de símbolos
            self.symbol_table[nome] = tipo
            print(f"✓ Variável '{nome}' do tipo '{tipo}' declarada.")
        
        return self.visitChildren(ctx)

    # Visita declarações de variáveis
    def visitVariavel(self, ctx):
        tipo = ctx.tipoSimples().getText()
        
        # Processa todas as variáveis declaradas na mesma linha
        ids = ctx.ID()
        for id_token in ids:
            nome = id_token.getText()
            
            # Verifica se a variável já foi declarada
            if nome in self.symbol_table:
                self.errors.append(f"Erro semântico: variável '{nome}' já foi declarada.")
            else:
                # Armazena a variável e seu tipo na tabela de símbolos
                self.symbol_table[nome] = tipo
                print(f"✓ Variável '{nome}' do tipo '{tipo}' declarada.")
        
        return self.visitChildren(ctx)

    # Visita atribuições
    def visitAtribuicao(self, ctx):
        nome = ctx.ID().getText()
        
        # Verifica se a variável foi declarada
        if nome not in self.symbol_table:
            self.errors.append(f"Erro semântico: variável '{nome}' não foi declarada.")
        else:
            tipo_var = self.symbol_table[nome]
            print(f"✓ Atribuição à variável '{nome}' do tipo '{tipo_var}'.")
            
            # Rastreia valores para detecção de divisão por zero
            valor = self.get_expression_value(ctx.expressaoGeral())
            if valor is not None:
                self.variable_values[nome] = valor
            
            # Verifica tipos na expressão atribuída
            self.check_expression_types(ctx.expressaoGeral())
        
        return self.visitChildren(ctx)
    
    # Método para verificar tipos em expressões
    def check_expression_types(self, ctx):
        if hasattr(ctx, 'expressao') and ctx.expressao():
            expr_ctx = ctx.expressao()
            self.check_arithmetic_expression(expr_ctx)
        elif hasattr(ctx, 'condicao') and ctx.condicao():
            cond_ctx = ctx.condicao()
            self.check_logical_expression(cond_ctx)
    
    # Verifica operações aritméticas
    def check_arithmetic_expression(self, ctx):
        if hasattr(ctx, 'termo') and ctx.termo():
            termos = ctx.termo()
            if len(termos) > 1:  # Tem operação aritmética
                for i in range(len(termos)):
                    termo = termos[i]
                    tipo = self.get_term_type(termo)
                    
                    # Verifica divisão por zero
                    if i > 0:  # A partir do segundo termo
                        operador_tokens = ctx.OPERADOR_ARITMETICO()
                        if operador_tokens and len(operador_tokens) >= i:
                            op = operador_tokens[i-1].getText()
                            if op == '/' or op == '%':
                                self.check_division_by_zero(termo)
                    
                    # Verifica compatibilidade de tipos
                    if i > 0:  # A partir do segundo termo
                        tipo_anterior = self.get_term_type(termos[i-1])
                        if tipo and tipo_anterior and tipo != tipo_anterior:
                            self.errors.append(f"Erro semântico: operação aritmética entre tipos incompatíveis ({tipo_anterior} e {tipo}).")
    
    # Verifica operações lógicas
    def check_logical_expression(self, ctx):
        # Verifica operações AND/OR
        if hasattr(ctx, 'condicaoOr') and ctx.condicaoOr():
            self.check_logical_or(ctx.condicaoOr())
    
    def check_logical_or(self, ctx):
        if hasattr(ctx, 'condicaoAnd') and ctx.condicaoAnd():
            cond_and_list = ctx.condicaoAnd()
            if len(cond_and_list) > 1:  # Tem operação OR
                tipos = []
                for cond_and in cond_and_list:
                    tipo = self.get_logical_expression_type(cond_and)
                    if tipo:
                        tipos.append(tipo)
                
                # Verifica se todos os tipos são compatíveis com operações lógicas
                for tipo in tipos:
                    if tipo not in ['booleano', 'inteiro']:
                        self.errors.append(f"Erro semântico: operação lógica OR com tipo incompatível ({tipo}).")
            
            # Verifica cada expressão AND
            for cond_and in cond_and_list:
                self.check_logical_and(cond_and)
    
    def check_logical_and(self, ctx):
        if hasattr(ctx, 'condicaoUnary') and ctx.condicaoUnary():
            cond_unary_list = ctx.condicaoUnary()
            if len(cond_unary_list) > 1:  # Tem operação AND
                tipos = []
                for cond_unary in cond_unary_list:
                    tipo = self.get_logical_expression_type(cond_unary)
                    if tipo:
                        tipos.append(tipo)
                
                # Verifica se há tipos incompatíveis
                for i in range(len(tipos)):
                    if tipos[i] not in ['booleano', 'inteiro']:
                        self.errors.append(f"Erro semântico: operação lógica AND com tipo incompatível ({tipos[i]}).")
                    
                    # Verifica incompatibilidade entre tipos diferentes
                    for j in range(i + 1, len(tipos)):
                        if tipos[i] != tipos[j] and 'texto' in [tipos[i], tipos[j]]:
                            self.errors.append(f"Erro semântico: operação lógica AND entre tipos incompatíveis ({tipos[i]} e {tipos[j]}).")
    
    def get_logical_expression_type(self, ctx):
        if hasattr(ctx, 'condicaoAtom') and ctx.condicaoAtom():
            atom = ctx.condicaoAtom()
            if hasattr(atom, 'expressao') and atom.expressao():
                expr_list = atom.expressao()
                if len(expr_list) > 0:
                    return self.get_expression_type(expr_list[0])
        return None
    
    # Verifica divisão por zero
    def check_division_by_zero(self, termo_ctx):
        if hasattr(termo_ctx, 'NUMBER') and termo_ctx.NUMBER():
            valor = termo_ctx.NUMBER().getText()
            if valor == '0':
                self.errors.append("Erro semântico: divisão por zero detectada.")
        elif hasattr(termo_ctx, 'ID') and termo_ctx.ID():
            id_list = termo_ctx.ID()
            if isinstance(id_list, list) and len(id_list) > 0:
                var_name = id_list[0].getText()
            else:
                var_name = id_list.getText()
            
            # Verifica se a variável tem valor 0
            if var_name in self.variable_values and self.variable_values[var_name] == 0:
                self.errors.append(f"Erro semântico: divisão por zero detectada (variável '{var_name}' tem valor 0).")
    
    # Obtém o tipo de um termo
    def get_term_type(self, termo_ctx):
        if hasattr(termo_ctx, 'NUMBER') and termo_ctx.NUMBER():
            return 'inteiro'
        elif hasattr(termo_ctx, 'STRING') and termo_ctx.STRING():
            return 'texto'
        elif hasattr(termo_ctx, 'ID') and termo_ctx.ID():
            id_list = termo_ctx.ID()
            if isinstance(id_list, list) and len(id_list) > 0:
                var_name = id_list[0].getText()
            else:
                var_name = id_list.getText()
            return self.symbol_table.get(var_name, None)
        return None
    
    # Obtém o tipo de uma expressão
    def get_expression_type(self, expr_ctx):
        if hasattr(expr_ctx, 'termo') and expr_ctx.termo():
            return self.get_term_type(expr_ctx.termo()[0])
        return None

    # Obtém o valor de uma expressão (quando possível)
    def get_expression_value(self, expr_ctx):
        if hasattr(expr_ctx, 'expressao') and expr_ctx.expressao():
            expr = expr_ctx.expressao()
            if hasattr(expr, 'termo') and expr.termo():
                termos = expr.termo()
                if len(termos) == 1:  # Expressão simples sem operações
                    return self.get_term_value(termos[0])
        return None
    
    # Obtém o valor de um termo (quando possível)
    def get_term_value(self, termo_ctx):
        if hasattr(termo_ctx, 'NUMBER') and termo_ctx.NUMBER():
            return int(termo_ctx.NUMBER().getText())
        elif hasattr(termo_ctx, 'STRING') and termo_ctx.STRING():
            return termo_ctx.STRING().getText().strip('"')
        elif hasattr(termo_ctx, 'ID') and termo_ctx.ID():
            id_list = termo_ctx.ID()
            if isinstance(id_list, list) and len(id_list) > 0:
                var_name = id_list[0].getText()
            else:
                var_name = id_list.getText()
            return self.variable_values.get(var_name, None)
        return None

    # Visita chamadas de função (escreva, leia)
    def visitChamadaFuncao(self, ctx):
        nome_funcao = ctx.ID().getText()
        
        if nome_funcao == "escreva" or nome_funcao == "escreva_s":
            print(f"✓ Comando de saída: {nome_funcao}")
        elif nome_funcao == "leia":
            print(f"✓ Comando de entrada: {nome_funcao}")
        
        return self.visitChildren(ctx)

    # Visita termos (variáveis, números, strings)
    def visitTermo(self, ctx):
        if ctx.ID():
            # ctx.ID() pode retornar uma lista, então pegamos o primeiro elemento
            id_list = ctx.ID()
            if isinstance(id_list, list) and len(id_list) > 0:
                nome = id_list[0].getText()
            else:
                nome = id_list.getText()
                
            if nome not in self.symbol_table:
                # Só adiciona erro se não for uma função conhecida
                if nome not in ["escreva", "escreva_s", "leia"]:
                    self.errors.append(f"Erro semântico: variável '{nome}' não foi declarada.")
            else:
                print(f"✓ Uso da variável '{nome}'.")
        
        return self.visitChildren(ctx)

    # Método para reportar erros
    def report_errors(self):
        if self.errors:
            print("\n❌ ERROS SEMÂNTICOS ENCONTRADOS:")
            for erro in self.errors:
                print(f"  - {erro}")
        else:
            print("\n✅ Nenhum erro semântico encontrado!")
