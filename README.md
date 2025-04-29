Timemania Compiler
Timemania Logo Status License

Timemania é um compilador/interpretador para uma linguagem de programação educacional com tema esportivo brasileiro, desenvolvido como parte do curso de Compiladores (2025-1).

📋 Sobre o Projeto
O compilador Timemania é uma implementação de uma linguagem de programação estruturada com palavras-chave inspiradas em times de futebol brasileiros. Este projeto demonstra conceitos fundamentais de compiladores como análise léxica, análise sintática e interpretação.

🔧 Tecnologias Utilizadas
ANTLR4: Para geração de lexer e parser
Python: Para o interpretador
Java: Para geração dos códigos ANTLR
🚀 Começando
Pré-requisitos
Python 3.6 ou superior
ANTLR4 Runtime para Python
Java Runtime Environment (para geração do ANTLR)
Instalação
Clone o repositório:
bash
git clone https://github.com/brasiledu/Compiladores---2025-1.git
cd Compiladores---2025-1/Timemania
Instale as dependências:
bash
pip install antlr4-python3-runtime
Gere os arquivos do ANTLR (caso precise reconstruir o lexer/parser):
bash
antlr4 -Dlanguage=Python3 src/TimemaniaLexer.g4
antlr4 -Dlanguage=Python3 src/TimemaniaParser.g4
📖 Sintaxe da Linguagem Timemania
A linguagem Timemania possui uma sintaxe simples e expressiva, com palavras-chave temáticas.

Estrutura Básica
Code
start
    // Seu código aqui
end
Palavras-chave
Estrutura: start, end
Times: flamengo, corinthians, palmeiras, santos, vasco
Controle: se, entao, senao, enquanto, faca
E/S: escreva, leia
Operadores
Aritméticos: +, -, *, /, %
Comparação: >, <, ==, !=, <=, >=
Lógicos: &&, ||, !
Atribuição: :=
Exemplos de Comandos
Code
// Entrada e saída
escreva("Digite seu nome:")
leia(nome)

// Atribuição
idade := 25

// Controle de fluxo
se idade >= 18 entao {
    escreva("Maior de idade")
} senao {
    escreva("Menor de idade")
}

// Loops
contador := 1
enquanto contador <= 10 faca {
    escreva(contador)
    contador := contador + 1
}

// Comandos temáticos
flamengo "Hoje tem gol do Gabigol!"
💻 Como Usar
Execute o interpretador com um arquivo fonte .tm:

bash
python src/interpretador.py exemplos/hello_world.tm
📝 Exemplos
Hello World
Code
start
    mensagem := "Olá, mundo da Timemania!"
    escreva(mensagem)
end
Calculadora Simples
Code
start
    escreva("Digite o primeiro número:")
    leia(a)
    escreva("Digite o segundo número:")
    leia(b)
    
    soma := a + b
    escreva(soma)
    
    diferenca := a - b
    escreva(diferenca)
    
    produto := a * b
    escreva(produto)
    
    se b != 0 entao {
        divisao := a / b
        escreva(divisao)
    } senao {
        escreva("Não é possível dividir por zero")
    }
end
🔍 Depuração
O projeto inclui um visualizador de árvore sintática para ajudar na depuração:

Python
from tree_visualizer import TreeVisualizer
visualizer = TreeVisualizer(parser)
visualizer.visualize(tree)
📚 Estrutura do Projeto
Code
Timemania/
├── src/
│   ├── TimemaniaLexer.g4        # Definição léxica
│   ├── TimemaniaParser.g4       # Definição sintática
│   ├── interpretador.py         # Interpretador principal
│   ├── tree_visualizer.py       # Ferramenta de visualização
│   └── main.py                  # Ponto de entrada
├── exemplos/                    # Programas de exemplo
│   ├── hello_world.tm
│   ├── calculadora.tm
│   └── triangulo_pascal.tm
└── README.md                    # Esta documentação
🤝 Contribuindo
Contribuições são bem-vindas! Para contribuir:

Faça um fork do projeto
Crie uma branch para sua feature (git checkout -b feature/nova-feature)
Faça commit das suas alterações (git commit -m 'Adiciona nova feature')
Faça push para a branch (git push origin feature/nova-feature)
Abra um Pull Request
📜 Licença
Este projeto está licenciado sob a Licença MIT - veja o arquivo LICENSE para detalhes.

✅ To-Do
 Implementar suporte para funções
 Adicionar mais tipos de dados
 Melhorar mensagens de erro
 Criar ambiente de desenvolvimento integrado
Desenvolvido por Eduardo - Curso de Compiladores 2025-1
