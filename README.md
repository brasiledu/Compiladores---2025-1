# 🏆 Compilador Timemania

<div align="center">
  <p><em>Um compilador educacional inspirado no universo do futebol brasileiro</em></p>
</div>

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

#### Tipos Primitivos

1. **`inteiro`** - Números inteiros positivos e negativos
   - Suporta valores na faixa de -2147483648 a 2147483647
   - Operações: `+`, `-`, `*`, `/`, `%` (módulo)
   - Exemplos:
     ```
     idade := 25;
     gols_marcados := 3;
     saldo := -10;
     ```

2. **`texto`** - Cadeias de caracteres (strings)
   - Delimitadas por aspas duplas
   - Suporta concatenação com operador `++`
   - Métodos disponíveis: `tamanho()`, `maiusculo()`, `minusculo()`
   - Exemplos:
     ```
     nome := "Pelé";
     titulo := "Hexa" ++ "campeão";  // Resulta em "Hexacampeão"
     ```

3. **`booleano`** - Valores lógicos
   - Valores possíveis: `verdadeiro` ou `falso`
   - Operações: `&&` (E lógico), `||` (OU lógico), `!` (NÃO lógico)
   - Exemplos:
     ```
     esta_aprovado := verdadeiro;
     e_titular := gols > 0 && faltas < 3;
     ```

#### Tipos Compostos

1. **`registro`** - Agrupamento de campos relacionados
   - Definição com a palavra-chave `registro`
   - Acesso aos campos com notação de ponto
   - Exemplo:
     ```
     // Definição do tipo
     tipo Jogador := registro {
         nome: texto;
         numero: inteiro;
         titular: booleano;
     }
     
     // Uso
     ronaldo := Jogador;
     ronaldo.nome := "Ronaldo";
     ronaldo.numero := 9;
     ronaldo.titular := verdadeiro;
     ```

2. **`vetor`** - Coleção indexada de elementos do mesmo tipo
   - Criação com função `criar_vetor(tamanho)`
   - Indexação baseada em zero usando colchetes
   - Função `tamanho()` para obter o número de elementos
   - Exemplo:
     ```
     // Criar vetor de 11 elementos
     titulares := criar_vetor(11);
     
     // Atribuir valores
     titulares[0] := "Goleiro";
     titulares[1] := "Lateral Direito";
     
     // Obter o tamanho
     total := tamanho(titulares);  // Retorna 11
     ```

#### Conversão Entre Tipos

- **`para_numero(expr)`**: Converte texto em valor numérico
- **`para_texto(expr)`**: Converte qualquer tipo em texto
- Exemplos:
  ```
  idade_texto := "25";
  idade := para_numero(idade_texto);  // Converte para inteiro 25
  
  placar := para_texto(5) ++ " x " ++ para_texto(3);  // Resulta em "5 x 3"
  ```

### Escopo de Variáveis

- **Global**: Variáveis definidas no programa principal são acessíveis em todo o código
- **Local**: Variáveis definidas dentro de funções, procedimentos ou blocos têm escopo limitado
- **Parâmetros**: Valores passados para funções/procedimentos têm escopo local dentro deles

### Sintaxe Especial
```
start
    // Times como comandos especiais de saída
    vasco("Gigante da Colina");      // Imprime com prefixo "Vasco da Gama:"
    flamengo("Mengão");              // Imprime com prefixo "Flamengo diz:"
    corinthians(1910);               // Imprime com prefixo "Corinthians mostra:"
    palmeiras();                     // Imprime "Palmeiras não tem Mundial"
    santos("Rei Pelé");              // Imprime com prefixo "Santos FC apresenta:"
    
    // Estruturas de controle familiares
    se (gols > 3) entao {
        escreva("Goleada!");
    } senao {
        escreva("Jogo equilibrado");
    }
    
    // Loops
    contador := 1;
    enquanto (contador <= 10) faca {
        escreva(contador);
        contador := contador + 1;
    }
    
    // Loop com incremento automático
    para i := 1 ate 5 faca {
        escreva("Iteração " ++ para_texto(i));
    }
end;
```

### Funções e Procedimentos

- **Funções**: Retornam valores e podem ser usadas em expressões
  ```
  funcao calcular_media(nota1: inteiro, nota2: inteiro): inteiro {
      total := nota1 + nota2;
      retorna total / 2;
  }
  
  media_final := calcular_media(7, 9);  // Retorna 8
  ```

- **Procedimentos**: Não retornam valores, apenas executam ações
  ```
  procedimento mostrar_tabela(posicao: inteiro, nome: texto) {
      escreva(para_texto(posicao) ++ ". " ++ nome);
  }
  
  mostrar_tabela(1, "Flamengo");  // Exibe: "1. Flamengo"
  ```

### Recursos Principais
- ✅ Entrada/saída via `leia()` e `escreva()`
- ✅ Saída formatada com `escreva_sem_quebra()`
- ✅ Controle de fluxo com `se-entao-senao`, `enquanto-faca`, `para-ate`
- ✅ Expressões aritméticas e lógicas com precedência definida
- ✅ Funções e procedimentos com parâmetros
- ✅ Manipulação de arrays/vetores
- ✅ Registros para agrupamento de dados relacionados
- ✅ Tratamento de erros com mensagens claras e contextualizadas
- ✅ Comentários de linha (`//`) e bloco (`/* */`)

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
        escreva("APROVADO com media " ++ para_texto(media));
    } senao {
        escreva("REPROVADO com media " ++ para_texto(media));
    }
end;
```

### Triângulo de Pascal

```
start
    escreva("Gerador de Triangulo de Pascal");
    
    escreva("Digite o numero de linhas:");
    leia(n);
    
    se (n < 1) entao {
        escreva("ERRO: O numero deve ser maior ou igual a 1!");
    } senao {
        linha := 0;
        enquanto (linha < n) faca {
            // Primeiro valor de cada linha sempre é 1
            escreva_sem_quebra("1 ");
            
            // Calcula valores adicionais
            se (linha > 0) entao {
                valor := 1;
                col := 0;
                enquanto (col < linha) faca {
                    valor := valor * (linha - col) / (col + 1);
                    escreva_sem_quebra(para_texto(valor));
                    escreva_sem_quebra(" ");
                    col := col + 1;
                }
            }
            
            // Nova linha
            escreva("");
            linha := linha + 1;
        }
        
        escreva("Triangulo de Pascal gerado com sucesso!");
    }
end;
```

### Uso de Registro e Vetor

```
start
    // Definição do tipo jogador
    tipo Jogador := registro {
        nome: texto;
        camisa: inteiro;
        gols: inteiro;
    }
    
    // Criação de um vetor de jogadores
    time := criar_vetor(3);
    
    // Cadastro de jogadores
    jogador1 := Jogador;
    jogador1.nome := "Neymar";
    jogador1.camisa := 10;
    jogador1.gols := 5;
    time[0] := jogador1;
    
    jogador2 := Jogador;
    jogador2.nome := "Ronaldo";
    jogador2.camisa := 9;
    jogador2.gols := 8;
    time[1] := jogador2;
    
    jogador3 := Jogador;
    jogador3.nome := "Romário";
    jogador3.camisa := 11;
    jogador3.gols := 7;
    time[2] := jogador3;
    
    // Exibindo artilheiro
    melhor := 0;
    indice_melhor := 0;
    
    para i := 0 ate tamanho(time) - 1 faca {
        se (time[i].gols > melhor) entao {
            melhor := time[i].gols;
            indice_melhor := i;
        }
    }
    
    escreva("Artilheiro do time: " ++ time[indice_melhor].nome);
    escreva("Número de gols: " ++ para_texto(melhor));
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

Link do projeto: [https://github.com/brasiledu/compiladores---2025-1](https://github.com/brasiledu/compiladores---2025-1)

---

<div align="center">
  <sub>Feito com ❤️ por brasiledu</sub>
</div>
