import sys
from antlr4 import *
from TimemaniaLexer import TimemaniaLexer
from TimemaniaParser import TimemaniaParser
from TimemaniaParserVisitor import TimemaniaParserVisitor
from semantic_analyzer import SemanticAnalyzer 

def main():
    # Verificar se foi fornecido um arquivo como argumento
    if len(sys.argv) != 2:
        print("Uso: python main.py <arquivo.tm>")
        return
    
    arquivo = sys.argv[1]
    
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
    analisador.visitPrograma(tree)  # Chama explicitamente o método visitPrograma
    analisador.report_errors()

    # Se houver erros semânticos, interromper a execução
    if analisador.errors:
        print("Execução interrompida devido a erros semânticos.")
        return
    else:
        print("✅ Análise semântica concluída sem erros!")

if __name__ == "__main__":
    main()
