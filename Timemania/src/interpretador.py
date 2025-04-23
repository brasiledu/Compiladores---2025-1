from antlr4 import * 
from TimemaniaLexer import TimemaniaLexer
from TimemaniaParser import TimemaniaParser

class TimemaniaVisitor(ParseTreeVisitor):
    def __init__(self):
        self.variables = {}

    def visitPrograma(self, ctx):
        for comando in ctx.comando():
            self.visit(comando)

    def visitAtribuicao(self, ctx):
        var_name = ctx.ID().getText()
        value = self.visit(ctx.expressao())
        self.variables[var_name] = value

    def visitIo(self, ctx):
        if ctx.ESCREVA():
            value = self.visit(ctx.expressao())
            print(value, end=" ")
        elif ctx.LEIA():
            var_name = ctx.ID().getText()
            user_input = input()
            self.variables[var_name] = int(user_input)

    def visitControle(self, ctx):
        if ctx.SE():
            condition = self.visit(ctx.condicao())
            if condition:
                self.visit(ctx.bloco(0))
            elif ctx.SENAO():
                self.visit(ctx.bloco(1))
        elif ctx.ENQUANTO():
            while self.visit(ctx.condicao()):
                self.visit(ctx.bloco(0))

    def visitExpressao(self, ctx):
        if ctx.getChildCount() == 1:
            return self.visit(ctx.termo(0))
        left = self.visit(ctx.termo(0))
        operator = ctx.OPERATOR().getText()
        right = self.visit(ctx.termo(1))
        if operator == "+":
            return left + right
        elif operator == "-":
            return left - right
        elif operator == "*":
            return left * right
        elif operator == "/":
            return left // right

    def visitTermo(self, ctx):
        if ctx.NUMBER():
            return int(ctx.NUMBER().getText())
        elif ctx.ID():
            return self.variables.get(ctx.ID().getText(), 0)
        else:
            return self.visit(ctx.expressao())

    def visitCondicao(self, ctx):
        left = self.visit(ctx.expressao(0))
        if ctx.getChildCount() == 1:
            return left
        operator = ctx.OPERATOR().getText()
        right = self.visit(ctx.expressao(1))
        if operator == "<":
            return left < right
        elif operator == "<=":
            return left <= right
        elif operator == ">":
            return left > right
        elif operator == ">=":
            return left >= right
        elif operator == "==":
            return left == right
        elif operator == "!=":
            return left != right

    def visitBloco(self, ctx):
        for comando in ctx.comando():
            self.visit(comando)

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
    with open("teste_vasco.tm") as f:
        input_stream = InputStream(f.read())

    lexer = TimemaniaLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = TimemaniaParser(stream)
    tree = parser.programa()

    visitor = TimemaniaVisitor()
    visitor.visit(tree)

if __name__ == "__main__":
    main()
