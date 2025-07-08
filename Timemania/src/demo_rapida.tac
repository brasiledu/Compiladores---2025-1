# Início do programa Timemania
# ========================================
# Seção de declarações
# Declaração: inteiro x
# Declaração: inteiro y
# Declaração: inteiro resultado
# Seção de comandos principais
param === DEMO RAPIDA COMPILADOR TIMEMANIA ===
call escreva, 1
param Digite o primeiro numero:
call escreva, 1
param x
call leia, 1
param Digite o segundo numero:
call escreva, 1
param y
call leia, 1
t0 = x + y
resultado = t0
param Soma:
call escreva, 1
param resultado
call escreva, 1
t1 = x * y
resultado = t1
param Multiplicacao:
call escreva, 1
param resultado
call escreva, 1
# Início do comando SE
t2 = x > y
if !t2 goto L0
# Bloco ENTÃO
param O primeiro numero eh maior
call escreva, 1
goto L1
L0:
# Bloco SENÃO
param O segundo numero eh maior ou igual
call escreva, 1
L1:
# Fim do comando SE
param === COMPILACAO COMPLETA REALIZADA ===
call escreva, 1
# Fim do programa