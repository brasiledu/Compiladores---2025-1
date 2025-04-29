start
    // Calculadora básica para demonstrar o Timemania
    
    // Exibe mensagem de boas-vindas
    msg := "Bem-vindo à Calculadora Timemania!";
    escreva(msg);
    
    // Solicita um número ao usuário
    escreva("Digite um número:");
    leia(numero);
    
    // Realiza cálculos simples
    dobro := numero + numero;
    quadrado := numero * numero;
    
    // Exibe resultados
    escreva("O dobro do número é:");
    escreva(dobro);
    
    escreva("O quadrado do número é:");
    escreva(quadrado);
    
    // Estrutura condicional para verificar se é par ou ímpar
    resto := numero % 2;
    
    zero := 4;

    se (zero < 1)entao{
        escreva("O número é par");
    } senao {
        escreva("O número é ímpar");
    }
    
    // Comando temático para finalizar
    flamengo("Cálculos realizados com sucesso!");
    vasco("pau no rabo do mengo");
end;
