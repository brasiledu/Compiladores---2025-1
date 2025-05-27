start
inteiro n;
inteiro linha;
inteiro valor;
inteiro col;
inteiro numerador;

n := 5;
linha := 0;

enquanto (linha < n) faca {
    escreva("1");
    
    se (linha > 0) entao {
        valor := 1;
        col := 0;
        enquanto (col < linha) faca {
            numerador := valor * (linha - col);
            valor := numerador / (col + 1);
            escreva(" ");
            escreva(valor);
            col := col + 1;
        }
    }
    
    escreva("");
    linha := linha + 1;
}
end;
