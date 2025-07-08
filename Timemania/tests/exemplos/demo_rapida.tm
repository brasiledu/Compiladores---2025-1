start
    inteiro x;
    inteiro y;
    inteiro resultado;
    
    escreva("=== DEMO RAPIDA COMPILADOR TIMEMANIA ===");
    escreva("Digite o primeiro numero:");
    leia(x);
    escreva("Digite o segundo numero:");
    leia(y);
    
    resultado := x + y;
    escreva("Soma:");
    escreva(resultado);
    
    resultado := x * y;
    escreva("Multiplicacao:");
    escreva(resultado);
    
    se (x > y) entao {
        escreva("O primeiro numero eh maior");
    } senao {
        escreva("O segundo numero eh maior ou igual");
    }
    
    escreva("=== COMPILACAO COMPLETA REALIZADA ===");
end;
