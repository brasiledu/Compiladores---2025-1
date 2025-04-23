from antlr4 import *
from TimemaniaLexer import TimemaniaLexer
from TimemaniaParser import TimemaniaParser

def main():
    # Ler o arquivo de entrada
    arquivo = "tests/exemplo_entrada.tm"
    with open(arquivo, "r") as f:
        codigo = f.read()

    # Criar o fluxo de entrada
    input_stream = InputStream(codigo)

    # Passar pelo analisador léxico
    lexer = TimemaniaLexer(input_stream)
    token_stream = CommonTokenStream(lexer)

    # Passar pelo analisador sintático
    parser = TimemaniaParser(token_stream)
    tree = parser.programa()

    # Exibir a árvore sintática
    print(tree.toStringTree(recog=parser))

if __name__ == "__main__":
    main()