# Início do programa Timemania
# ========================================
# Seção de declarações
# Declaração: inteiro n
# Declaração: inteiro linha
# Declaração: inteiro valor
# Declaração: inteiro col
# Declaração: inteiro numerador
# Seção de comandos principais
param Gerador de Triangulo de Pascal
call vasco, 1
param Digite o numero de linhas (deve ser >= 1):
call vasco, 1
param n
call leia, 1
# Início do comando SE
t0 = n < 1
if !t0 goto L0
# Bloco ENTÃO
param ERRO: O numero deve ser maior ou igual a 1!
call escreva, 1
goto L1
L0:
# Bloco SENÃO
linha = 0
# Início do comando ENQUANTO
L2:
t1 = linha < n
if !t1 goto L3
# Corpo do loop ENQUANTO
param 1
call escreva, 1
# Início do comando SE
t2 = linha > 0
if !t2 goto L5
# Bloco ENTÃO
valor = 1
col = 0
# Início do comando ENQUANTO
L6:
t3 = col < linha
if !t3 goto L7
# Corpo do loop ENQUANTO
t4 = linha - col
t5 = valor * t4
numerador = t5
t6 = col + 1
t7 = numerador / t6
valor = t7
param  
call escreva, 1
param valor
call escreva, 1
t8 = col + 1
col = t8
goto L6
L7:
# Fim do comando ENQUANTO
L5:
# Fim do comando SE
param 
call escreva, 1
t9 = linha + 1
linha = t9
goto L2
L3:
# Fim do comando ENQUANTO
L1:
# Fim do comando SE
param Triangulo de Pascal gerado com sucesso e o palmeiras nao tem mundial!!
call flamengo, 1
# Fim do programa