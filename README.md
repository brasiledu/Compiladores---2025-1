# 🏆 Timemania Compiler

![Status](https://img.shields.io/badge/Status-Em%20desenvolvimento-orange)
![License](https://img.shields.io/badge/License-MIT-blue)

**Timemania** é um compilador/interpretador para uma linguagem de programação educacional com tema esportivo brasileiro, desenvolvido como parte do curso de **Compiladores (2025-1)**. ⚽🎓

---

## 📋 Sobre o Projeto

O compilador **Timemania** é uma implementação de uma linguagem de programação estruturada com palavras-chave inspiradas em **times de futebol brasileiros**. Este projeto demonstra conceitos fundamentais de compiladores, como:
- **Análise léxica**
- **Análise sintática**
- **Interpretação**

---

## 🔧 Tecnologias Utilizadas

- **ANTLR4**: Para geração de lexer e parser
- **Python**: Para o interpretador
- **Java**: Para geração dos códigos ANTLR

---

## 🚀 Começando

### Pré-requisitos

Certifique-se de ter instalado:
- **Python 3.6 ou superior**
- **ANTLR4 Runtime para Python**
- **Java Runtime Environment** (para geração do ANTLR)

### Instalação

1. Clone o repositório:
   ```bash
   git clone https://github.com/brasiledu/Compiladores---2025-1.git
   cd Compiladores---2025-1/Timemania

   Instale as dependências:

bash
pip install antlr4-python3-runtime
Gere os arquivos do ANTLR (caso precise reconstruir o lexer/parser):

bash
antlr4 -Dlanguage=Python3 src/TimemaniaLexer.g4
antlr4 -Dlanguage=Python3 src/TimemaniaParser.g4

## 📖 Sintaxe da Linguagem Timemania

A linguagem **Timemania** possui uma **sintaxe simples e expressiva**, com palavras-chave temáticas que homenageiam o futebol brasileiro. ⚽

### Estrutura Básica

```plaintext
start
    // Seu código aqui
end

### Palavras-chave

- **Estrutura**: `start`, `end`
- **Times**: `flamengo`, `corinthians`, `palmeiras`, `santos`, `vasco`
- **Controle**: `se`, `entao`, `senao`, `enquanto`, `faca`
- **E/S**: `escreva`, `leia`

---

### Operadores

- **Aritméticos**: `+`, `-`, `*`, `/`, `%`
- **Comparação**: `>`, `<`, `==`, `!=`, `<=`, `>=`
- **Lógicos**: `&&`, `||`, `!`
- **Atribuição**: `:=`

---

### Exemplos de Comandos

```plaintext
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

## 💻 Como Usar

Execute o interpretador com um arquivo fonte `.tm`:

```bash
python src/interpretador.py exemplos/hello_world.tm

📝 Exemplos
Hello World
plaintext
start
    mensagem := "Olá, mundo da Timemania!"
    escreva(mensagem)
end
Calculadora Simples
plaintext
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
