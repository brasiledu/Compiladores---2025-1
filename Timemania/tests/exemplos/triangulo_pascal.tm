start
    inteiro n;
    inteiro linha;
    inteiro valor;
    inteiro col;
    inteiro numerador;
    
    // Triângulo de Pascal - Com entrada do usuário
    vasco("Gerador de Triangulo de Pascal");
    
    // Solicita o número de linhas ao usuário
    vasco("Digite o numero de linhas (deve ser >= 1):");
    leia(n);
    
    se (n < 1) entao {
        escreva("ERRO: O numero deve ser maior ou igual a 1!");
    } senao {
        // Usamos uma abordagem diferente: pré-calculamos todos os valores
        linha := 0;
        enquanto (linha < n) faca {
            // Primeiro valor sempre é 1
            escreva("1");
            
            // Para a linha 0, só temos um elemento
            se (linha > 0) entao {
                // Para cada elemento adicional na linha
                valor := 1;
                col := 0;
                enquanto (col < linha) faca {
                    // Fórmula com multiplicação antes da divisão
                    // para evitar perda de precisão
                    numerador := valor * (linha - col);
                    valor := numerador / (col + 1);
                    
                    // Garante o espaço entre os valores
                    escreva(" ");
                    escreva(valor);
                    
                    col := col + 1;
                }
            }
            
            escreva("");  // Quebra de linha
            linha := linha + 1;
        }
    }
    
    flamengo("Triangulo de Pascal gerado com sucesso e o palmeiras nao tem mundial!!");
end;