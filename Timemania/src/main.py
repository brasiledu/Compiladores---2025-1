import sys
import os
from antlr4 import *
from TimemaniaLexer import TimemaniaLexer
from TimemaniaParser import TimemaniaParser
from TimemaniaParserVisitor import TimemaniaParserVisitor
from semantic_analyzer import SemanticAnalyzer 
from tree_to_png import TreeToPNG, create_simplified_tree_png

def main():
    # Verificar argumentos
    if len(sys.argv) < 2 or len(sys.argv) > 3:
        print("🌳 Compilador Timemania - Gerador de Árvore Sintática")
        print("=" * 50)
        print("Uso:")
        print("  python main.py <arquivo.tm>                    # Análise normal")
        print("  python main.py <arquivo.tm> --png              # Gerar PNG completo")
        print("  python main.py <arquivo.tm> --png-simples      # Gerar PNG simplificado")
        print("")
        print("Exemplos:")
        print("  python main.py ../tests/exemplos/teste_simples.tm")
        print("  python main.py ../tests/exemplos/teste_simples.tm --png-simples")
        print("")
        print("📋 Para mais informações, veja: ARVORE_PNG_GUIA.md")
        return
    
    generate_png = False
    generate_simple = False
    
    if len(sys.argv) == 3:
        if sys.argv[2] == "--png":
            generate_png = True
        elif sys.argv[2] == "--png-simples":
            generate_simple = True
        else:
            print("Opção inválida. Use --png ou --png-simples")
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

    # Exibir a árvore sintática (apenas se não estiver gerando PNG)
    if not generate_png and not generate_simple:
        print(tree.toStringTree(recog=parser))

    # Gerar PNG se solicitado
    if generate_png or generate_simple:
        # Nome do arquivo base (sem extensão)
        base_name = os.path.splitext(os.path.basename(arquivo))[0]
        
        if generate_png:
            print("🎨 Gerando PNG completo da árvore sintática...")
            tree_generator = TreeToPNG(parser)
            png_path = tree_generator.generate_png(tree, f"arvore_{base_name}")
            
        elif generate_simple:
            print("🎨 Gerando PNG simplificado da árvore sintática...")
            png_path = create_simplified_tree_png(tree, parser, f"arvore_simples_{base_name}")

    # ANÁLISE SEMÂNTICA
    print("\n🚀 Iniciando análise semântica do programa...")
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
