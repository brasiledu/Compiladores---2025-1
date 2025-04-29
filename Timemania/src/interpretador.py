<<<<<<< HEAD
import sys
import os
from antlr4 import *
=======
from antlr4 import * 
>>>>>>> d6c0c88be28bc583a551ea763c98f119eeba5367
from TimemaniaLexer import TimemaniaLexer
from TimemaniaParser import TimemaniaParser

class TimemaniaInterpreter:
    def __init__(self):
        self.variables = {}  # Armazenar variáveis
        self.debug = False   # Modo de debug
        
    def toggle_debug(self):
        self.debug = not self.debug
        print(f"Modo debug: {'ATIVADO' if self.debug else 'DESATIVADO'}")

    def run(self, input_file):
        try:
            # Carregar o arquivo e criar o lexer
            input_stream = FileStream(input_file, encoding='utf-8')
            lexer = TimemaniaLexer(input_stream)
            stream = CommonTokenStream(lexer)
            
            # Criar o parser e iniciar a análise
            parser = TimemaniaParser(stream)
            tree = parser.programa()
            
            # Interpretar o programa
            self.visit_programa(tree)
        except Exception as e:
            print(f"Erro ao executar programa: {e}")
            import traceback
            traceback.print_exc()
    
    def visit_programa(self, ctx):
        # Visitar cada comando no programa
        for i in range(ctx.getChildCount()):
            child = ctx.getChild(i)
            if hasattr(TimemaniaParser, 'ComandoContext') and isinstance(child, TimemaniaParser.ComandoContext):
                self.visit_comando(child)
            # Se ComandoContext não existir, tenta processar diretamente cada filho
            elif hasattr(child, 'getChildCount') and child.getChildCount() > 0:
                self.process_node(child)
                
    def process_node(self, node):
        # Método genérico para processar nós quando a estrutura exata não é conhecida
        node_text = node.getText()
        
        # Tenta identificar o tipo de comando pelo texto
        if '=' in node_text and not '==' in node_text:
            # Possível atribuição
            self.process_assignment(node)
        elif 'ESCREVA' in node_text:
            # Possível comando de saída
            self.process_output(node)
        elif 'LEIA' in node_text:
            # Possível comando de entrada
            self.process_input(node)
        elif 'SE' in node_text:
            # Possível estrutura condicional
            self.process_conditional(node)
        elif 'ENQUANTO' in node_text:
            # Possível loop
            self.process_loop(node)
        elif any(team in node_text for team in ['FLAMENGO', 'CORINTHIANS', 'PALMEIRAS', 'SANTOS']):
            # Possível comando futebol
            self.process_football(node)
        else:
            # Tenta processar filhos recursivamente
            for i in range(node.getChildCount()):
                self.process_node(node.getChild(i))
    
    def process_assignment(self, node):
        # Processamento genérico de atribuição
        text = node.getText()
        parts = text.split('=', 1)
        if len(parts) == 2:
            var_name = parts[0].strip()
            expr_text = parts[1].strip()
            valor = self.evaluate_expression_text(expr_text)
            self.variables[var_name] = valor
            if self.debug:
                print(f"DEBUG: Atribuição {var_name} = {valor}")
    
    def process_output(self, node):
        # Processamento genérico de saída
        for i in range(node.getChildCount()):
            child = node.getChild(i)
            if '"' in child.getText():
                # É uma string
                texto = child.getText().strip('"')
                print(texto)
            elif child.getText() not in ['ESCREVA', '"']:
                # É uma expressão
                valor = self.evaluate_node(child)
                print(valor)
    
    def process_input(self, node):
        # Processamento genérico de entrada
        var_name = None
        for i in range(node.getChildCount()):
            child = node.getChild(i)
            if child.getText() not in ['LEIA']:
                var_name = child.getText()
        
        if var_name:
            try:
                entrada = input()
                # Tentar converter para inteiro
                try:
                    valor = int(entrada)
                except ValueError:
                    valor = entrada
                
                self.variables[var_name] = valor
                if self.debug:
                    print(f"DEBUG: Leitura {var_name} = {valor}")
            except Exception as e:
                print(f"Erro na leitura: {e}")
                self.variables[var_name] = 0
    
    def process_conditional(self, node):
        # Processamento genérico de condicional
        condicao = None
        bloco_se = None
        bloco_senao = None
        
        in_se_bloco = False
        in_senao_bloco = False
        
        for i in range(node.getChildCount()):
            child = node.getChild(i)
            text = child.getText()
            
            if text == 'SE':
                continue
            elif text == 'ENTAO':
                in_se_bloco = True
                continue
            elif text == 'SENAO':
                in_se_bloco = False
                in_senao_bloco = True
                continue
            elif text == 'FIM':
                break
            
            if not in_se_bloco and not in_senao_bloco and not condicao:
                condicao = child
            elif in_se_bloco:
                bloco_se = child if not bloco_se else bloco_se
            elif in_senao_bloco:
                bloco_senao = child if not bloco_senao else bloco_senao
        
        if condicao:
            condicao_result = self.evaluate_condition(condicao)
            if self.debug:
                print(f"DEBUG: Condição IF avaliada como {condicao_result}")
                
            if condicao_result and bloco_se:
                self.process_node(bloco_se)
            elif not condicao_result and bloco_senao:
                self.process_node(bloco_senao)
    
    def process_loop(self, node):
        # Processamento genérico de loop
        condicao = None
        bloco = None
        
        in_bloco = False
        
        for i in range(node.getChildCount()):
            child = node.getChild(i)
            text = child.getText()
            
            if text == 'ENQUANTO':
                continue
            elif text == 'FACA':
                in_bloco = True
                continue
            elif text == 'FIM':
                break
            
            if not in_bloco and not condicao:
                condicao = child
            elif in_bloco:
                bloco = child if not bloco else bloco
        
        if condicao and bloco:
            while self.evaluate_condition(condicao):
                self.process_node(bloco)
                if self.debug:
                    print(f"DEBUG: Iteração ENQUANTO")
    
    def process_football(self, node):
        # Processamento genérico de comandos de futebol
        text = node.getText()
        
        if 'FLAMENGO' in text:
            for i in range(node.getChildCount()):
                child = node.getChild(i)
                if '"' in child.getText():
                    mensagem = child.getText().strip('"')
                    print(f"Flamengo diz: {mensagem}")
                    break
        elif 'CORINTHIANS' in text:
            for i in range(node.getChildCount()):
                child = node.getChild(i)
                if child.getText().isdigit():
                    num = int(child.getText())
                    print(f"Corinthians marcou {num} gols")
                    break
        elif 'PALMEIRAS' in text:
            print("Palmeiras não tem mundial")
        elif 'SANTOS' in text:
            for i in range(node.getChildCount()):
                child = node.getChild(i)
                if '"' in child.getText():
                    jogador = child.getText().strip('"')
                    print(f"Santos: {jogador} foi o melhor do mundo")
                    break
                
    def visit_comando(self, ctx):
        # Determinar o tipo de comando e visitar o nó apropriado
        for i in range(ctx.getChildCount()):
            child = ctx.getChild(i)
            
            if hasattr(TimemaniaParser, 'AtribuicaoContext') and isinstance(child, TimemaniaParser.AtribuicaoContext):
                self.visit_atribuicao(child)
                return
            elif hasattr(TimemaniaParser, 'IoContext') and isinstance(child, TimemaniaParser.IoContext):
                self.visit_io(child)
                return
            elif hasattr(TimemaniaParser, 'ControleContext') and isinstance(child, TimemaniaParser.ControleContext):
                self.visit_controle(child)
                return
            elif hasattr(TimemaniaParser, 'FutebolContext') and isinstance(child, TimemaniaParser.FutebolContext):
                self.visit_futebol(child)
                return
    
    def visit_atribuicao(self, ctx):
        # Extrair nome da variável
        var_name = ctx.ID().getText()
        
        # Avaliar expressão e atribuir à variável
        valor = self.evaluate_expressao(ctx.expressao())
        self.variables[var_name] = valor
        
        if self.debug:
            print(f"DEBUG: Atribuição {var_name} = {valor}")
    
    def visit_io(self, ctx):
        if ctx.ESCREVA():
            # Comando escreva
            if ctx.expressao():
                valor = self.evaluate_expressao(ctx.expressao())
                print(valor)
            elif ctx.STRING():
                # Extrair string sem as aspas
                texto = ctx.STRING().getText()[1:-1]  # Ou .strip('"') dependendo da sua implementação
                print(texto)
        elif ctx.LEIA():
            # Comando leia: ler entrada do usuário
            var_name = ctx.ID().getText()
            try:
                entrada = input()
                # Tentar converter para inteiro
                try:
                    valor = int(entrada)
                except ValueError:
                    # Se não for possível converter para inteiro, mantém como string
                    valor = entrada
                    
                self.variables[var_name] = valor
                if self.debug:
                    print(f"DEBUG: Leitura {var_name} = {valor}")
            except Exception as e:
                print(f"Erro na leitura: {e}")
                self.variables[var_name] = 0
    
    def visit_controle(self, ctx):
        if ctx.SE():
            # Estrutura if-else
            condicao_result = self.evaluate_condicao(ctx.condicao())
            if self.debug:
                print(f"DEBUG: Condição IF avaliada como {condicao_result}")
                
            if condicao_result:
                self.visit_bloco(ctx.bloco(0))
            elif ctx.SENAO() and len(ctx.bloco()) > 1:
                self.visit_bloco(ctx.bloco(1))
        elif ctx.ENQUANTO():
            # Laço while
            while self.evaluate_condicao(ctx.condicao()):
                self.visit_bloco(ctx.bloco(0))
                if self.debug:
                    print(f"DEBUG: Iteração ENQUANTO")
    
    def visit_futebol(self, ctx):
        # Implementação das funções de futebol
        if ctx.FLAMENGO():
            mensagem = ctx.STRING().getText().strip('"')  # Removendo as aspas
            print(f"Flamengo diz: {mensagem}")
        elif ctx.CORINTHIANS():
            num = int(ctx.NUMBER().getText())
            print(f"Corinthians marcou {num} gols")
        elif ctx.PALMEIRAS():
            print("Palmeiras não tem mundial")
        elif ctx.SANTOS():
            jogador = ctx.STRING().getText().strip('"')  # Removendo as aspas
            print(f"Santos: {jogador} foi o melhor do mundo")
    
    def visit_bloco(self, ctx):
        # Executar cada comando no bloco
        for i in range(ctx.getChildCount()):
            child = ctx.getChild(i)
            if hasattr(TimemaniaParser, 'ComandoContext') and isinstance(child, TimemaniaParser.ComandoContext):
                self.visit_comando(child)
            else:
                # Fallback para processamento genérico
                self.process_node(child)
    
    def evaluate_expressao(self, ctx):
        try:
            if ctx.getChildCount() == 1:
                # Apenas um termo
                return self.evaluate_termo(ctx.termo())
            
            # Expressão com operador + ou -
            if ctx.PLUS():
                return self.evaluate_expressao(ctx.expressao()) + self.evaluate_termo(ctx.termo())
            elif ctx.MINUS():
                return self.evaluate_expressao(ctx.expressao()) - self.evaluate_termo(ctx.termo())
        except Exception as e:
            if self.debug:
                print(f"DEBUG: Erro ao avaliar expressão: {e}")
            # Abordagem alternativa para avaliar a expressão
            return self.evaluate_node(ctx)
        
        return 0  # Não deve chegar aqui
    
    def evaluate_termo(self, ctx):
        try:
            if ctx.getChildCount() == 1:
                # Apenas um fator
                return self.evaluate_fator(ctx.fator())
            
            # Termo com operador * ou /
            if ctx.MULT():
                return self.evaluate_termo(ctx.termo()) * self.evaluate_fator(ctx.fator())
            elif ctx.DIV():
                divisor = self.evaluate_fator(ctx.fator())
                if divisor == 0:
                    print("ERRO: Divisão por zero!")
                    return 0
                return self.evaluate_termo(ctx.termo()) // divisor  # Divisão inteira
        except Exception as e:
            if self.debug:
                print(f"DEBUG: Erro ao avaliar termo: {e}")
            # Abordagem alternativa para avaliar o termo
            return self.evaluate_node(ctx)
        
        return 0  # Não deve chegar aqui
    
    def evaluate_fator(self, ctx):
        try:
            if ctx.NUMBER():
                return int(ctx.NUMBER().getText())
            elif ctx.ID():
                var_name = ctx.ID().getText()
                if var_name in self.variables:
                    return self.variables[var_name]
                else:
                    print(f"ERRO: Variável '{var_name}' não definida. Assumindo valor 0.")
                    self.variables[var_name] = 0
                    return 0
            elif ctx.expressao():
                return self.evaluate_expressao(ctx.expressao())
        except Exception as e:
            if self.debug:
                print(f"DEBUG: Erro ao avaliar fator: {e}")
            # Abordagem alternativa para avaliar o fator
            return self.evaluate_node(ctx)
        
        return 0  # Não deve chegar aqui
    
    def evaluate_condicao(self, ctx):
        try:
            # Avaliar os dois lados da expressão condicional
            left = self.evaluate_expressao(ctx.expressao(0))
            right = self.evaluate_expressao(ctx.expressao(1))
            
            # Determinar o operador e aplicar a comparação
            op = ctx.operador()
            
            if op.LESS():
                return left < right
            elif op.LESSEQ():
                return left <= right
            elif op.GREATER():
                return left > right
            elif op.GREATEREQ():
                return left >= right
            elif op.EQUAL():
                return left == right
            elif op.NOTEQUAL():
                return left != right
        except Exception as e:
            if self.debug:
                print(f"DEBUG: Erro ao avaliar condição: {e}")
            # Abordagem alternativa para avaliar a condição
            return self.evaluate_condition(ctx)
        
        return False  # Não deve chegar aqui
    
    # Métodos de avaliação alternativos para quando a navegação direta da árvore falha
    def evaluate_node(self, node):
        if node is None:
            return 0
            
        # Tenta extrair valores diretamente
        text = node.getText()
        
        # Se é um número
        if text.isdigit():
            return int(text)
        
        # Se é uma variável
        if text in self.variables:
            return self.variables[text]
            
        # Se é uma expressão com operador
        if '+' in text:
            parts = text.split('+', 1)
            return self.evaluate_expression_text(parts[0]) + self.evaluate_expression_text(parts[1])
        elif '-' in text:
            parts = text.split('-', 1)
            return self.evaluate_expression_text(parts[0]) - self.evaluate_expression_text(parts[1])
        elif '*' in text:
            parts = text.split('*', 1)
            return self.evaluate_expression_text(parts[0]) * self.evaluate_expression_text(parts[1])
        elif '/' in text:
            parts = text.split('/', 1)
            divisor = self.evaluate_expression_text(parts[1])
            if divisor == 0:
                print("ERRO: Divisão por zero!")
                return 0
            return self.evaluate_expression_text(parts[0]) // divisor
            
        # Se tem filhos, processa recursivamente
        if hasattr(node, 'getChildCount') and node.getChildCount() > 0:
            # Se tem apenas um filho
            if node.getChildCount() == 1:
                return self.evaluate_node(node.getChild(0))
                
            # Caso contrário, tenta encontrar operadores entre os filhos
            operators = []
            operands = []
            
            for i in range(node.getChildCount()):
                child = node.getChild(i)
                child_text = child.getText()
                
                if child_text in ['+', '-', '*', '/', '<', '>', '<=', '>=', '==', '!=']:
                    operators.append(child_text)
                else:
                    operands.append(child)
                    
            # Se encontrou um operador entre dois operandos
            if len(operators) == 1 and len(operands) == 2:
                left = self.evaluate_node(operands[0])
                right = self.evaluate_node(operands[1])
                
                if operators[0] == '+':
                    return left + right
                elif operators[0] == '-':
                    return left - right
                elif operators[0] == '*':
                    return left * right
                elif operators[0] == '/':
                    if right == 0:
                        print("ERRO: Divisão por zero!")
                        return 0
                    return left // right
                    
        # Não conseguiu avaliar
        return 0
        
    def evaluate_expression_text(self, text):
        # Avalia uma expressão a partir de seu texto
        text = text.strip()
        
        # Se é um número
        if text.isdigit():
            return int(text)
            
        # Se é uma variável
        if text in self.variables:
            return self.variables[text]
            
        # Verifica operações básicas
        if '+' in text:
            parts = text.split('+', 1)
            return self.evaluate_expression_text(parts[0]) + self.evaluate_expression_text(parts[1])
        elif '-' in text:
            parts = text.split('-', 1)
            return self.evaluate_expression_text(parts[0]) - self.evaluate_expression_text(parts[1])
        elif '*' in text:
            parts = text.split('*', 1)
            return self.evaluate_expression_text(parts[0]) * self.evaluate_expression_text(parts[1])
        elif '/' in text:
            parts = text.split('/', 1)
            divisor = self.evaluate_expression_text(parts[1])
            if divisor == 0:
                print("ERRO: Divisão por zero!")
                return 0
            return self.evaluate_expression_text(parts[0]) // divisor
            
        # Não conseguiu avaliar
        return 0
        
    def evaluate_condition(self, node):
        # Avalia uma condição a partir de um nó
        text = node.getText()
        
        # Verifica operadores de comparação
        if '<=' in text:
            parts = text.split('<=', 1)
            return self.evaluate_expression_text(parts[0]) <= self.evaluate_expression_text(parts[1])
        elif '>=' in text:
            parts = text.split('>=', 1)
            return self.evaluate_expression_text(parts[0]) >= self.evaluate_expression_text(parts[1])
        elif '==' in text:
            parts = text.split('==', 1)
            return self.evaluate_expression_text(parts[0]) == self.evaluate_expression_text(parts[1])
        elif '!=' in text:
            parts = text.split('!=', 1)
            return self.evaluate_expression_text(parts[0]) != self.evaluate_expression_text(parts[1])
        elif '<' in text:
            parts = text.split('<', 1)
            return self.evaluate_expression_text(parts[0]) < self.evaluate_expression_text(parts[1])
        elif '>' in text:
            parts = text.split('>', 1)
            return self.evaluate_expression_text(parts[0]) > self.evaluate_expression_text(parts[1])
            
        # Método alternativo: procura operadores entre os filhos
        if hasattr(node, 'getChildCount') and node.getChildCount() >= 3:
            left = None
            right = None
            op = None
            
            for i in range(node.getChildCount()):
                child = node.getChild(i)
                child_text = child.getText()
                
                if child_text in ['<', '>', '<=', '>=', '==', '!=']:
                    op = child_text
                elif left is None:
                    left = child
                elif right is None:
                    right = child
                    
            if left and right and op:
                left_val = self.evaluate_node(left)
                right_val = self.evaluate_node(right)
                
                if op == '<':
                    return left_val < right_val
                elif op == '<=':
                    return left_val <= right_val
                elif op == '>':
                    return left_val > right_val
                elif op == '>=':
                    return left_val >= right_val
                elif op == '==':
                    return left_val == right_val
                elif op == '!=':
                    return left_val != right_val
                    
        return False

    def visitFutebol(self, ctx):
        if ctx.VASCO():
            texto = ctx.STRING().getText().strip('"')
            print(f"Vasco é o time da virada! Mensagem: {texto}")
        elif ctx.FLAMENGO():
            texto = ctx.STRING().getText().strip('"')
            print(f"Flamengo: {texto}")
        elif ctx.CORINTHIANS():
            numero = ctx.NUMBER().getText()
            print(f"Corinthians número: {numero}")
        elif ctx.PALMEIRAS():
            print("Palmeiras não tem mundial 🏆🚫")
        elif ctx.SANTOS():
            texto = ctx.STRING().getText().strip('"')
            print(f"Santos: {texto}")

def main():
<<<<<<< HEAD
    if len(sys.argv) > 1:
        file_path = sys.argv[1]
    else:
        # Procura por arquivos .tm no diretório atual como alternativa
        tm_files = [f for f in os.listdir('.') if f.endswith('.tm')]
        if tm_files:
            file_path = tm_files[0]
            print(f"Nenhum arquivo especificado. Usando o arquivo encontrado: {file_path}")
        else:
            file_path = input("Digite o nome do arquivo Timemania a executar: ")
    
    if not os.path.exists(file_path):
        print(f"Erro: O arquivo '{file_path}' não foi encontrado.")
        return
    
    interpreter = TimemaniaInterpreter()
    print(f"Executando programa Timemania: {file_path}")
    interpreter.run(file_path)
=======
    with open("teste_vasco.tm") as f:
        input_stream = InputStream(f.read())

    lexer = TimemaniaLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = TimemaniaParser(stream)
    tree = parser.programa()

    visitor = TimemaniaVisitor()
    visitor.visit(tree)
>>>>>>> d6c0c88be28bc583a551ea763c98f119eeba5367

if __name__ == "__main__":
    main()
