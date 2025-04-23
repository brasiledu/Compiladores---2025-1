start
  escreva("Digite o número de linhas do Triângulo de Pascal (n ≥ 1): ");
  leia(n);
  
  se (n < 1) entao {
    escreva("ERRO: O número deve ser maior ou igual a 1.");
  }
  senao {
    linha := 1;
    enquanto (linha <= n) faca {
      coluna := 0;
      valor := 1;
      
      enquanto (coluna < linha) faca {
        escreva(valor);
        valor := (valor * (linha - coluna)) / (coluna + 1);
        coluna := coluna + 1;
      }
      
      escreva(""); // Quebra de linha
      linha := linha + 1;
    }
  }
end