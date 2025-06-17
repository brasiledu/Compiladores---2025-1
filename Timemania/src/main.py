import sys
import os
from antlr4 import *
from TimemaniaLexer import TimemaniaLexer
from TimemaniaParser import TimemaniaParser
from TimemaniaParserVisitor import TimemaniaParserVisitor
from semantic_analyzer import SemanticAnalyzer 
from tree_to_png import TreeToPNG, create_simplified_tree_png
from tac_visitor import TACVisitor

def main():
    # Verificar argumentos
    if len(sys.argv) < 2 or len(sys.argv) > 3:
        print("🏗️ Compilador Timemania - Análise Completa")
        print("=" * 50)
        print("Uso:")
        print("  python main.py <arquivo.tm>                    # Análise normal")
        print("  python main.py <arquivo.tm> --png              # Gerar PNG completo")
        print("  python main.py <arquivo.tm> --png-simples      # Gerar PNG simplificado")
        print("  python main.py <arquivo.tm> --gerar-tac        # Gerar código TAC")
        print("")
        print("Exemplos:")
        print("  python main.py ../tests/exemplos/teste_simples.tm")
        print("  python main.py ../tests/exemplos/teste_simples.tm --png-simples")
        print("  python main.py ../tests/exemplos/teste_simples.tm --gerar-tac")
        print("")
        print("📋 Para mais informações, veja: ARVORE_PNG_GUIA.md")
        return
    
    generate_png = False
    generate_simple = False
    generate_tac = False
    
    if len(sys.argv) == 3:
        if sys.argv[2] == "--png":
            generate_png = True
        elif sys.argv[2] == "--png-simples":
            generate_simple = True
        elif sys.argv[2] == "--gerar-tac":
            generate_tac = True
        else:
            print("Opção inválida. Use --png, --png-simples ou --gerar-tac")
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

    # Exibir a árvore sintática (apenas se não estiver gerando PNG ou TAC)
    if not generate_png and not generate_simple and not generate_tac:
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
        print("❌ Execução interrompida devido a erros semânticos.")
        return
    else:
        print("✅ Análise semântica concluída sem erros!")

    # GERAÇÃO DE CÓDIGO TAC
    if generate_tac:
        print("\n⚡ Iniciando geração de código TAC...")
        
        try:
            # Criar visitador TAC
            tac_visitor = TACVisitor()
            
            # Visitar a árvore e gerar TAC
            tac_visitor.visitPrograma(tree)
            
            # Nome do arquivo TAC
            base_name = os.path.splitext(os.path.basename(arquivo))[0]
            tac_filename = f"{base_name}.tac"
            
            # Salvar código TAC em arquivo
            tac_visitor.save_tac_to_file(tac_filename)
            
            print(f"✅ Código TAC gerado em: {tac_filename}")
            
            # Mostrar o código TAC gerado
            print("\n📋 Código TAC gerado:")
            print("=" * 40)
            print(tac_visitor.get_tac_code())
            print("=" * 40)
            
        except Exception as e:
            print(f"❌ Erro na geração de código TAC: {e}")
            import traceback
            traceback.print_exc()
            return

if __name__ == "__main__":
    main()
