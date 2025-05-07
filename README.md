# 🏆 Compilador Timemania

<div align="center">
  <p><em>Um compilador educacional inspirado no universo do futebol brasileiro</em></p>
</div>

![Licença](https://img.shields.io/badge/license-MIT-green)
![Status](https://img.shields.io/badge/status-em%20desenvolvimento-yellow)
![Versão](https://img.shields.io/badge/vers%C3%A3o-1.0.0-blue)

## 📋 Índice
- [Sobre o Projeto](#-sobre-o-projeto)
- [Características da Linguagem](#-características-da-linguagem)
- [Instalação](#-instalação)
- [Como Usar](#-como-usar)
- [Exemplos](#-exemplos)
- [Estrutura do Projeto](#-estrutura-do-projeto)
- [Tecnologias Utilizadas](#-tecnologias-utilizadas)
- [Contribuição](#-contribuição)
- [Reconhecimentos](#-reconhecimentos)
- [Licença](#-licença)
- [Contato](#-contato)

## 🚀 Sobre o Projeto

Timemania é um compilador desenvolvido como projeto acadêmico que implementa uma linguagem de programação com elementos do futebol brasileiro. O projeto inclui análise léxica, sintática e visa proporcionar uma experiência educativa tanto para quem desenvolve o compilador quanto para os usuários da linguagem.

### Por que Timemania?

- 🎓 **Educacional**: Perfeito para aprender os conceitos fundamentais de compiladores
- 🇧🇷 **Temática brasileira**: Referências ao futebol nacional tornam o aprendizado divertido
- 🧩 **Modular**: Arquitetura que permite fácil expansão e experimentação

## 🔍 Características da Linguagem

### Tipos de Dados
- `inteiro` - números inteiros
- `texto` - strings de texto
- `booleano` - valores lógicos (verdadeiro/falso)
- Suporte a estruturas de dados como `registro` e `vetor`

### Sintaxe Especial
```
start
    // Times como comandos especiais
    vasco("Gigante da Colina");
    flamengo("Mengão");
    corinthians(1910);
    
    // Estruturas de controle familiares
    se (gols > 3) entao {
        escreva("Goleada!");
    } senao {
        escreva("Jogo equilibrado");
    }
end;
```

### Recursos Principais
- ✅ Entrada/saída via `leia()` e `escreva()`
- ✅ Controle de fluxo com `se-entao-senao`, `enquanto-faca`, `para-ate`
- ✅ Expressões aritméticas e lógicas com precedência definida
- ✅ Funções e procedimentos
- ✅ Tratamento de erros com mensagens claras

## 💻 Instalação

### Pré-requisitos
- JDK 11 ou superior
- ANTLR4 Runtime
- Graphviz (opcional, para visualização de AST)

### Passos
```bash
# Clone o repositório
git clone https://github.com/brasiledu/compiladores---2025-1.git

# Entre no diretório
cd compiladores---2025-1

# Compile o projeto
python -cp "lib/*:." src/*.py -d bin/

# Execute o compilador
python -cp "lib/*:bin" interpretador.py caminho/para/seu/programa.tm
```

## 🔧 Como Usar

1. Crie um arquivo com extensão `.tm` contendo seu programa
2. Execute o compilador passando o arquivo como argumento
3. Visualize a saída do programa ou os erros detectados

```bash
# Execução básica
python -cp "lib/*:bin" interpretador.py meu_programa.tm

# Gerar visualização da AST
python -cp "lib/*:bin" interpretador.py --ast meu_programa.tm

# Modo verbose com todos os tokens
python -cp "lib/*:bin" interpretador.py --verbose meu_programa.tm
```

## 📝 Exemplos

### Classificação de Triângulos

```
start
    escreva("Classificacao de Triangulos");
    
    escreva("Digite o valor do primeiro lado:");
    leia(a);
    
    escreva("Digite o valor do segundo lado:");
    leia(b);
    
    escreva("Digite o valor do terceiro lado:");
    leia(c);
    
    se (a <= 0 || b <= 0 || c <= 0) entao {
        escreva("ERRO: Todos os lados devem ser positivos!");
    } senao {
        se (a + b > c && a + c > b && b + c > a) entao {
            se (a == b && b == c) entao {
                escreva("Triangulo equilatero valido");
            } senao {
                se (a == b || b == c || a == c) entao {
                    escreva("Triangulo isosceles valido");
                } senao {
                    escreva("Triangulo escaleno valido");
                }
            }
        } senao {
            escreva("Medidas invalidas");
        }
    }
end;
```

### Cálculo de Média

```
start
    escreva("Calculo de Media");
    
    escreva("Digite a primeira nota:");
    leia(nota1);
    
    escreva("Digite a segunda nota:");
    leia(nota2);
    
    media := (nota1 + nota2) / 2;
    
    se (media >= 7) entao {
        escreva("APROVADO com media " + para_texto(media));
    } senao {
        escreva("REPROVADO com media " + para_texto(media));
    }
end;
```

## 📁 Estrutura do Projeto

```
timemania-compiler/
├── src/
│   ├── TimemaniaLexer.g4          # Gramática para análise léxica
│   ├── TimemaniaParser.g4         # Gramática para análise sintática
│   ├── TimemaniaLexer.py        # Analisador léxico gerado
│   ├── TimemaniaParser.py       # Analisador sintático gerado
│   ├── interpretador.py     # Classe principal do compilador
│   ├── TimemaniaErrorListener.py # Tratamento de erros personalizado
│   └── ASTGenerator.py          # Gerador de AST visualizável
├── lib/                           # Bibliotecas dependentes
├── examples/                      # Programas de exemplo
├── docs/                          # Documentação
└── README.md                      # Este arquivo
```

## 🛠️ Tecnologias Utilizadas

- **ANTLR4**: Framework para geração de analisadores léxicos e sintáticos
- **Python**: Linguagem principal de implementação
- **Graphviz**: Visualização de árvores sintáticas
- **JUnit**: Testes unitários

## 👥 Contribuição

Contribuições são bem-vindas! Se você quiser melhorar este projeto:

1. Faça um fork do projeto
2. Crie sua branch de feature (`git checkout -b feature/MinhaFeature`)
3. Commit suas alterações (`git commit -m 'Adiciona MinhaFeature'`)
4. Push para a branch (`git push origin feature/MinhaFeature`)
5. Abra um Pull Request

## 🏅 Reconhecimentos

- Prof. DR. [Ed Wilson] pela orientação no desenvolvimento do compilador
- Colegas de classe pela ajuda nos testes e feedback
- Comunidade ANTLR por fornecer excelentes ferramentas e documentação

## 📄 Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para detalhes.

## 📞 Contato

brasiledu - [eduardo.viniciusac@gmail.com](mailto:eduardo.viniciusac@gmail.com)

Link do projeto: [https://github.com/brasiledu/timemania-compiler](https://github.com/brasiledu/compiladores---2025-1)

---

<div align="center">
  <sub>Feito com ❤️ por brasiledu</sub>
</div>
