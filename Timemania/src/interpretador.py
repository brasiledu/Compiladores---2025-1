import sys
import os
from antlr4 import *
from TimemaniaLexer import TimemaniaLexer
from TimemaniaParser import TimemaniaParser

class TimemaniaInterpreter:
    def __init__(self):
        self.variables = {}  # Armazenar variáveis
        self.debug = False   # Modo de debug

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
            if isinstance(child, TimemaniaParser.ComandoContext):
                self.visit_comando(child)
                
    def visit_comando(self, ctx):
        # Determinar o tipo de comando e visitar o nó apropriado
        for i in range(ctx.getChildCount()):
            child = ctx.getChild(i)
            
            if isinstance(child, TimemaniaParser.AtribuicaoContext):
                self.visit_atribuicao(child)
                return
            elif isinstance(child, TimemaniaParser.IoContext):
                self.visit_io(child)
                return
            elif isinstance(child, TimemaniaParser.ControleContext):
                self.visit_controle(child)
                return
            elif isinstance(child, TimemaniaParser.FutebolContext):
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
                texto = ctx.STRING().getText()[1:-1]
                print(texto)
        elif ctx.LEIA():
            # Comando leia: ler entrada do usuário
            var_name = ctx.ID().getText()
            try:
                valor = int(input())
                self.variables[var_name] = valor
                if self.debug:
                    print(f"DEBUG: Leitura {var_name} = {valor}")
            except ValueError:
                print("Erro: Entrada inválida. Use um número inteiro.")
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
            mensagem = ctx.STRING().getText()[1:-1]
            print(f"Flamengo diz: {mensagem}")
        elif ctx.CORINTHIANS():
            num = int(ctx.NUMBER().getText())
            print(f"Corinthians marcou {num} gols")
        elif ctx.PALMEIRAS():
            print("Palmeiras não tem mundial")
        elif ctx.SANTOS():
            jogador = ctx.STRING().getText()[1:-1]
            print(f"Santos: {jogador} foi o melhor do mundo")
    
    def visit_bloco(self, ctx):
        # Executar cada comando no bloco
        for i in range(ctx.getChildCount()):
            child = ctx.getChild(i)
            if isinstance(child, TimemaniaParser.ComandoContext):
                self.visit_comando(child)
    
    def evaluate_expressao(self, ctx):
        if ctx.getChildCount() == 1:
            # Apenas um termo
            return self.evaluate_termo(ctx.termo())
        
        # Expressão com operador + ou -
        if ctx.PLUS():
            return self.evaluate_expressao(ctx.expressao()) + self.evaluate_termo(ctx.termo())
        elif ctx.MINUS():
            return self.evaluate_expressao(ctx.expressao()) - self.evaluate_termo(ctx.termo())
        
        return 0  # Não deve chegar aqui
    
    def evaluate_termo(self, ctx):
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
        
        return 0  # Não deve chegar aqui
    
    def evaluate_fator(self, ctx):
        if ctx.NUMBER():
            return int(ctx.NUMBER().getText())
        elif ctx.ID():
            var_name = ctx.ID().getText()
            if var_name in self.variables:
                return self.variables[var_name]
            else:
                print(f"ERRO: Variável '{var_name}' não definida. Assumindo valor 0.")
                return 0
        elif ctx.STRING():
            return ctx.STRING().getText()[1:-1]  # Remove as aspas
        elif ctx.expressao():
            return self.evaluate_expressao(ctx.expressao())
        
        return 0  # Não deve chegar aqui
    
    def evaluate_condicao(self, ctx):
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
        
        return False  # Não deve chegar aqui

def main():
    if len(sys.argv) > 1:
        file_path = sys.argv[1]
    else:
        file_path = "triangulo_pascal.tm"
    
    if not os.path.exists(file_path):
        print(f"Erro: O arquivo '{file_path}' não foi encontrado.")
        return
    
    interpreter = TimemaniaInterpreter()
    print(f"Executando programa Timemania: {file_path}")
    interpreter.run(file_path)

if __name__ == "__main__":
    main()