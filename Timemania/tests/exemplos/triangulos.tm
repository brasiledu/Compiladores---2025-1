start
    inteiro a;
    inteiro b;
    inteiro c;
    
    // Programa de Classificacao de Triangulos
    escreva("Classificacao de Triangulos");
    
    // Solicita os tres lados ao usuario
    escreva("Digite o valor do primeiro lado:");
    leia(a);
    
    escreva("Digite o valor do segundo lado:");
    leia(b);
    
    escreva("Digite o valor do terceiro lado:");
    leia(c);
    
    // Verifica se os valores são positivos
    se (a <= 0 || b <= 0 || c <= 0) entao {
        escreva("ERRO: Todos os lados devem ser positivos!");
    } senao {
        // Verifica se os lados formam um triangulo válido
        // (a soma de dois lados deve ser maior que o terceiro)
        se (a + b > c) entao {
            se (a + c > b) entao {
                se (b + c > a) entao {
                    // Classifica o triângulo válido
                    se (a == b) entao {
                        se (b == c) entao {
                            escreva("Triangulo equilatero valido");
                        } senao {
                            escreva("Triangulo isosceles valido");
                        }
                    } senao {
                        se (b == c) entao {
                            escreva("Triangulo isosceles valido");
                        } senao {
                            se (a == c) entao {
                                escreva("Triangulo isosceles valido");
                            } senao {
                                escreva("Triangulo escaleno valido");
                            }
                        }
                    }
                } senao {
                    escreva("Medidas invalidas");
                }
            } senao {
                escreva("Medidas invalidas");
            }
        } senao {
            escreva("Medidas invalidas");
        }
    }
end;