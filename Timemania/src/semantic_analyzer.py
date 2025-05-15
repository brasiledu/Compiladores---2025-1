from .antlr.TimemaniaParserVisitor import TimemaniaParserVisitor
from .antlr.TimemaniaParser import TimemaniaParser

class SemanticAnalyzer(TimemaniaParserVisitor):
    def __init__(Self):
        self.symbol_table = {}

    def visitDeclaracoes(self, ctx):
        for decl in ctx.getChildren():
            tipo = decl.tipo().getText()
            nome = decl.ID().getText()

            if nome in self.symbol_table:
                print(f"Erro semântico: váriavel '{nome}' já está declarada.")
            else: 
                self.symbol_table[nome] = tipo
        return self.visitChildren(ctx)

    def visitComando(self, ctx):
        if ctx.ID():
            nome = ctx.ID.getText()
            if nome not in self.symbol_table:
                print(f"Erro semântico: variável '{nome}' não declarada.")
        return self.visitChildren(ctx)

    def visitExpressao(self, ctx):

    
        return self.visitChildren(ctx)