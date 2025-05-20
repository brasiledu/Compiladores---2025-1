from antlr4 import *
from TimemaniaLexer import TimemaniaLexer
from TimemaniaParser import TimemaniaParser
from interpretador import TimemaniaVisitor  
from semantic_analyzer import SemanticAnalyzer 

def main():
    arquivo = "tests/teste_erros_semanticos.tm"
    
    try:
        # Ler o arquivo de entrada
        with open(arquivo, "r") as f:
            codigo = f.read()
    except FileNotFoundError:
        print(f"Erro: O arquivo {arquivo} não foi encontrado.")
        return
    except IOError as e:
        print(f"Erro ao ler o arquivo {arquivo}: {e}")
        return

    # Criar o fluxo de entrada
    input_stream = InputStream(codigo)

    # Passar pelo analisador léxico
    lexer = TimemaniaLexer(input_stream)
    token_stream = CommonTokenStream(lexer)

    # Passar pelo analisador sintático
    parser = TimemaniaParser(token_stream)

    try:
        # Análise sintática
        tree = parser.programa()  # 'programa' deve ser o ponto de entrada da sua gramática
    except Exception as e:
        print(f"Erro na análise sintática: {e}")
        return

    # Exibir a árvore sintática
    print(tree.toStringTree(recog=parser))

    # ANÁLISE SEMÂNTICA
    analisador = SemanticAnalyzer()
    analisador.visit(tree)
    analisador.report_errors()

    # Se houver erros semânticos, interromper a execução
    if analisador.errors:
        print("Execução interrompida devido a erros semânticos.")
        return

    # Interpretar o código com o Visitor
    visitor = TimemaniaVisitor()

    try:
        visitor.visit(tree)
    except Exception as e:
        print(f"Erro ao interpretar a árvore: {e}")
        return

if __name__ == "__main__":
    main()
