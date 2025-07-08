import sys
import os
from antlr4 import *
from TimemaniaLexer import TimemaniaLexer
from TimemaniaParser import TimemaniaParser
from TimemaniaParserVisitor import TimemaniaParserVisitor
from semantic_analyzer import SemanticAnalyzer 
from tree_to_png import TreeToPNG, create_simplified_tree_png
from tac_visitor import TACVisitor
from llvm_generator import generate_llvm_from_tac_file

def main():
    # Verificar argumentos
    if len(sys.argv) < 2 or len(sys.argv) > 3:
        print("Compilador Timemania - Pipeline Completo")
        print("=" * 50)
        print("Uso:")
        print("  python main.py <arquivo.tm>                    # Análise normal")
        print("  python main.py <arquivo.tm> --png              # Gerar PNG completo")
        print("  python main.py <arquivo.tm> --png-simples      # Gerar PNG simplificado")
        print("  python main.py <arquivo.tm> --gerar-tac        # Gerar código TAC")
        print("  python main.py <arquivo.tm> --gerar-llvm       # Gerar código LLVM IR")
        print("  python main.py <arquivo.tm> --compilar         # Pipeline completo")
        print("")
        print("Exemplos:")
        print("  python main.py ../tests/teste_simples.tm")
        print("  python main.py ../tests/teste_simples.tm --gerar-llvm")
        print("  python main.py ../tests/teste_tac_completo.tm --compilar")
        print("")
        print("Para mais informações, veja: README.md")
        return
    
    generate_png = False
    generate_simple = False
    generate_tac = False
    generate_llvm = False
    full_compile = False
    
    if len(sys.argv) == 3:
        if sys.argv[2] == "--png":
            generate_png = True
        elif sys.argv[2] == "--png-simples":
            generate_simple = True
        elif sys.argv[2] == "--gerar-tac":
            generate_tac = True
        elif sys.argv[2] == "--gerar-llvm":
            generate_llvm = True
        elif sys.argv[2] == "--compilar":
            full_compile = True
        else:
            print("Opção inválida. Use --png, --png-simples, --gerar-tac, --gerar-llvm ou --compilar")
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
            print("Gerando PNG completo da árvore sintática...")
            tree_generator = TreeToPNG(parser)
            png_path = tree_generator.generate_png(tree, f"arvore_{base_name}")
            
        elif generate_simple:
            print("Gerando PNG simplificado da árvore sintática...")
            png_path = create_simplified_tree_png(tree, parser, f"arvore_simples_{base_name}")

    # ANÁLISE SEMÂNTICA
    print("\nIniciando análise semântica do programa...")
    analisador = SemanticAnalyzer()
    analisador.visitPrograma(tree)  # Chama explicitamente o método visitPrograma
    analisador.report_errors()

    # Se houver erros semânticos, interromper a execução
    if analisador.errors:
        print("Execução interrompida devido a erros semânticos.")
        return
    else:
        print("Análise semântica concluída sem erros!")

    # GERAÇÃO DE CÓDIGO TAC
    if generate_tac or generate_llvm or full_compile:
        print("\nIniciando geração de código TAC...")
        
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
            
            print(f"Código TAC gerado em: {tac_filename}")
            
            if generate_tac:
                # Mostrar o código TAC gerado
                print("\nCódigo TAC gerado:")
                print("=" * 40)
                print(tac_visitor.get_tac_code())
                print("=" * 40)
            
        except Exception as e:
            print(f"Erro na geração de código TAC: {e}")
            import traceback
            traceback.print_exc()
            return

    # GERAÇÃO DE CÓDIGO LLVM IR
    if generate_llvm or full_compile:
        print("\nIniciando geração de código LLVM IR...")
        
        try:
            # Nome dos arquivos
            base_name = os.path.splitext(os.path.basename(arquivo))[0]
            tac_filename = f"{base_name}.tac"
            llvm_filename = f"{base_name}.ll"
            
            # Verificar se o arquivo TAC existe
            if not os.path.exists(tac_filename):
                print(f"Arquivo TAC não encontrado: {tac_filename}")
                print("   Execute primeiro com --gerar-tac para gerar o arquivo TAC")
                return
            
            # Gerar código LLVM IR
            llvm_code = generate_llvm_from_tac_file(tac_filename, llvm_filename)
            
            print(f"Código LLVM IR gerado em: {llvm_filename}")
            
            if generate_llvm:
                # Mostrar parte do código LLVM gerado
                print("\nCódigo LLVM IR gerado (primeiras 30 linhas):")
                print("=" * 50)
                lines = llvm_code.split('\n')
                for i, line in enumerate(lines[:30]):
                    print(f"{i+1:2d}: {line}")
                if len(lines) > 30:
                    print(f"... ({len(lines)-30} linhas restantes)")
                print("=" * 50)
            
        except Exception as e:
            print(f"Erro na geração de código LLVM IR: {e}")
            import traceback
            traceback.print_exc()
            return

    # COMPILAÇÃO COMPLETA
    if full_compile:
        print("\nIniciando compilação completa...")
        
        try:
            base_name = os.path.splitext(os.path.basename(arquivo))[0]
            llvm_filename = f"{base_name}.ll"
            executable_name = base_name
            
            # Verificar se LLVM está instalado
            import subprocess
            
            print("Verificando ferramentas LLVM...")
            
            # Compilar LLVM IR para executável
            cmd = f"clang {llvm_filename} -o {executable_name}"
            print(f"Executando: {cmd}")
            
            result = subprocess.run(cmd, shell=True, capture_output=True, text=True)
            
            if result.returncode == 0:
                print(f"Executável gerado: {executable_name}")
                print("\nCompilação completa realizada com sucesso!")
                print(f"   Para executar: ./{executable_name}")
            else:
                print(f"Erro na compilação LLVM:")
                print(result.stderr)
                
        except Exception as e:
            print(f"Erro na compilação completa: {e}")
            print("Certifique-se de que o LLVM/Clang está instalado:")
            print("   macOS: brew install llvm")
            print("   Ubuntu: sudo apt-get install clang llvm")
            import traceback
            traceback.print_exc()
            return

if __name__ == "__main__":
    main()
