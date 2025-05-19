from .antlr.TimemaniaParserVisitor import TimemaniaParserVisitor
from .antlr.TimemaniaParser import TimemaniaParser

# Classe responsável pela análise semântica do código-fonte
class SemanticAnalyzer(TimemaniaParserVisitor):
    def __init__(self):
        # Tabela de símbolos: guarda o nome e tipo de variáveis declaradas
        self.symbol_table = {}  # Ex: {'x': 'int', 'nome': 'string'}
        # Lista de mensagens de erro semântico encontradas durante a análise
        self.errors = []

    # Visita as declarações de variáveis (ex: int x;)
    def visitDeclaracoes(self, ctx):
        for declaracao in ctx.getChildren():
            # Verifica se a declaração tem tipo e nome válidos
            if hasattr(declaracao, 'tipo') and declaracao.tipo():
                tipo = declaracao.tipo().getText()
                nome = declaracao.ID().getText()

                # Verifica se a variável já foi declarada anteriormente
                if nome in self.symbol_table:
                    self.errors.append(f"Erro semântico: variável '{nome}' já foi declarada.")
                else:
                    # Armazena a variável e seu tipo na tabela de símbolos
                    self.symbol_table[nome] = tipo
        # Continua a visita nos filhos do nó
        return self.visitChildren(ctx)

    # Visita os comandos (ex: atribuições, leia, escreva)
    def visitComando(self, ctx):
        # Verifica se é uma atribuição (ex: x = expressão;)
        if ctx.ID() and ctx.expressao():
            nome = ctx.ID().getText()

            # Verifica se a variável foi declarada
            if nome not in self.symbol_table:
                self.errors.append(f"Erro semântico: variável '{nome}' não foi declarada.")
            else:
                tipo_var = self.symbol_table[nome]         # Tipo da variável
                tipo_expr = self.visit(ctx.expressao())    # Tipo da expressão atribuída

                # Verifica compatibilidade de tipos na atribuição
                if tipo_var != tipo_expr and tipo_expr != 'erro':
                    self.errors.append(
                        f"Erro de tipo: variável '{nome}' é '{tipo_var}', mas expressão é '{tipo_expr}'."
                    )

        return self.visitChildren(ctx)

    # Visita expressões aritméticas e lógicas
    def visitExpressao(self, ctx):
        filhos = ctx.getChildren()

        # Expressão binária (ex: a + b, a == b, a && b)
        if len(filhos) == 3:
            esq = self.visit(filhos[0])      # Lado esquerdo
            op = filhos[1].getText()         # Operador
            dir = self.visit(filhos[2])      # Lado direito

            # Operações aritméticas exigem dois inteiros
            if op in ['+', '-', '*', '/']:
                if esq == 'int' and dir == 'int':
                    return 'int'
                else:
                    self.errors.append(f"Erro de tipo: operação '{op}' inválida entre '{esq}' e '{dir}'.")
                    return 'erro'

            # Operações lógicas exigem operandos do mesmo tipo
            elif op in ['==', '&&', '||']:
                if esq == dir:
                    return 'int'  # Representa booleano como inteiro (0/1)
                else:
                    self.errors.append(
                        f"Erro de tipo: comparação lógica inválida entre '{esq}' e '{dir}'."
                    )
                    return 'erro'

        # Expressão com apenas um filho (ex: um literal ou variável)
        elif len(filhos) == 1:
            return self.visit(filhos[0])

        # Operador unário (ex: !a)
        elif len(filhos) == 2:
            tipo = self.visit(filhos[1])
            return 'int' if tipo == 'int' else 'erro'

        return 'erro'

    # Visita os termos (intermediários entre expressão e fator)
    def visitTermo(self, ctx):
        return self.visitChildren(ctx)

    # Visita os fatores (literals, identificadores, expressões entre parênteses)
    def visitFator(self, ctx):
        if ctx.INT():
            return 'int'
        elif ctx.STRING():
            return 'string'
        elif ctx.ID():
            nome = ctx.ID().getText()

            # Verifica se a variável foi declarada
            if nome in self.symbol_table:
                return self.symbol_table[nome]
            else:
                self.errors.append(f"Erro semântico: variável '{nome}' usada sem declaração.")
                return 'erro'
        elif ctx.expressao():
            return self.visit(ctx.expressao())

        return 'erro'

    # Exibe os erros encontrados na análise semântica
    def report_errors(self):
        if not self.errors:
            print("Análise semântica concluída sem erros.")
        else:
            for erro in self.errors:
                print("Erro!", erro)
