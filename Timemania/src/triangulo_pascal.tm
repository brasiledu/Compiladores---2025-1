start
    // Triângulo de Pascal - Versão corrigida
    escreva("Gerador de Triangulo de Pascal");
    
    escreva("Digite o numero de linhas (deve ser >= 1):");
    leia(n);
    
    se (n < 1) entao {
        escreva("ERRO: O numero deve ser maior ou igual a 1!");
    } senao {
        // Implementar usando método linha por linha
        i := 0;
        enquanto (i < n) faca {
            // Imprime os espaços iniciais para centralização (opcional)
            j := 0;
            
            // Imprime o primeiro 1 da linha
            c := 1;
            escreva(c);
            
            // Calcula e imprime os demais valores usando o Teorema Binomial
            k := 1;
            enquanto (k <= i) faca {
                c := c * (i - k + 1) / k;
                escreva(" ");
                escreva(c);
                k := k + 1;
            }
            
            // Quebra de linha para a próxima linha do triângulo
            escreva("");
            
            i := i + 1;
        }
    }
    
    flamengo("Triangulo de Pascal gerado com sucesso!");
end;