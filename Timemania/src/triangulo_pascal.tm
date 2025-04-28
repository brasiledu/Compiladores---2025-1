start
  escreva("Digite o numero de linhas do Triangulo de Pascal: ");
  leia(n);
  
  se (n < 1) entao {
    escreva("ERRO: O numero deve ser maior ou igual a 1");
  }
  senao {
    linha := 1;
    
    enquanto (linha <= n) faca {
      // Imprime cada linha do triângulo
      coluna := 0;
      valor := 1;
      
      // Imprime os valores da linha atual
      enquanto (coluna < linha) faca {
        escreva(valor);
        
        // Calcula o próximo valor usando a fórmula combinatória
        // C(n,k+1) = C(n,k) * (n-k) / (k+1)
        novoValor := valor * (linha - coluna - 1) / (coluna + 1);
        valor := novoValor;
        coluna := coluna + 1;
      }
      
      escreva("");  // Nova linha
      linha := linha + 1;
    }
  }
end