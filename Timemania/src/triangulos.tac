# Início do programa Timemania
# ========================================
# Seção de declarações
# Declaração: inteiro a
# Declaração: inteiro b
# Declaração: inteiro c
# Seção de comandos principais
param Classificacao de Triangulos
call escreva, 1
param Digite o valor do primeiro lado:
call escreva, 1
param a
call leia, 1
param Digite o valor do segundo lado:
call escreva, 1
param b
call leia, 1
param Digite o valor do terceiro lado:
call escreva, 1
param c
call leia, 1
# Início do comando SE
t0 = a <= 0
t1 = b <= 0
t2 = t0 OR t1
t3 = c <= 0
t4 = t2 OR t3
if !t4 goto L0
# Bloco ENTÃO
param ERRO: Todos os lados devem ser positivos!
call escreva, 1
goto L1
L0:
# Bloco SENÃO
# Início do comando SE
t5 = a + b
t6 = t5 > c
if !t6 goto L2
# Bloco ENTÃO
# Início do comando SE
t7 = a + c
t8 = t7 > b
if !t8 goto L4
# Bloco ENTÃO
# Início do comando SE
t9 = b + c
t10 = t9 > a
if !t10 goto L6
# Bloco ENTÃO
# Início do comando SE
t11 = a == b
if !t11 goto L8
# Bloco ENTÃO
# Início do comando SE
t12 = b == c
if !t12 goto L10
# Bloco ENTÃO
param Triangulo equilatero valido
call escreva, 1
goto L11
L10:
# Bloco SENÃO
param Triangulo isosceles valido
call escreva, 1
L11:
# Fim do comando SE
goto L9
L8:
# Bloco SENÃO
# Início do comando SE
t13 = b == c
if !t13 goto L12
# Bloco ENTÃO
param Triangulo isosceles valido
call escreva, 1
goto L13
L12:
# Bloco SENÃO
# Início do comando SE
t14 = a == c
if !t14 goto L14
# Bloco ENTÃO
param Triangulo isosceles valido
call escreva, 1
goto L15
L14:
# Bloco SENÃO
param Triangulo escaleno valido
call escreva, 1
L15:
# Fim do comando SE
L13:
# Fim do comando SE
L9:
# Fim do comando SE
goto L7
L6:
# Bloco SENÃO
param Medidas invalidas
call escreva, 1
L7:
# Fim do comando SE
goto L5
L4:
# Bloco SENÃO
param Medidas invalidas
call escreva, 1
L5:
# Fim do comando SE
goto L3
L2:
# Bloco SENÃO
param Medidas invalidas
call escreva, 1
L3:
# Fim do comando SE
L1:
# Fim do comando SE
# Fim do programa