// triangulo_pascal.tm
escreva "Digite o número de linhas do Triângulo de Pascal:";
leia n;

se (n < 1) entao {
    escreva "ERRO: O número deve ser maior ou igual a 1";
} senao {
    // Gera o triângulo de Pascal
    linha := 0;
    enquanto (linha < n) faca {
        // Para cada linha, calcula os coeficientes
        c := 1;
        escreva c;  // Primeiro elemento (sempre 1)
        
        coluna := 1;
        enquanto (coluna <= linha) faca {
            // Calcula o próximo coeficiente usando a fórmula
            c := c * (linha - coluna + 1) / coluna;
            escreva c;
            coluna := coluna + 1;
        }

        escreva "";  // Nova linha
        linha := linha + 1;
    }
}