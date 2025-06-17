# Início do programa Timemania
# ========================================
# Seção de declarações
# Declaração: inteiro contador
# Declaração: inteiro limite
# Declaração: inteiro resultado
# Declaração: texto mensagem
# Seção de comandos principais
contador = 1
limite = 10
mensagem = Processando...
# Início do comando SE
t0 = contador < limite
if !t0 goto L1
# Bloco ENTÃO
param mensagem
call escreva, 1
# Início do comando ENQUANTO
L2:
t1 = contador <= 5
if !t1 goto L3
# Corpo do loop ENQUANTO
t2 = contador * 2
t3 = t2 + 1
resultado = t3
param resultado
call escreva, 1
t4 = contador + 1
contador = t4
goto L2
L3:
# Fim do comando ENQUANTO
L1:
# Fim do comando SE
# Início do comando PARA
contador = 6
L4:
t5 = contador <= 8
if !t5 goto L5
# Corpo do loop PARA
t6 = contador * contador
resultado = t6
param resultado
call escreva, 1
t7 = contador + 1
contador = t7
goto L4
L5:
# Fim do comando PARA
# Início do comando SE
t8 = resultado > 50
t9 = contador < 15
t10 = t8 AND t9
if !t10 goto L6
# Bloco ENTÃO
param Condição satisfeita
call escreva, 1
goto L7
L6:
# Bloco SENÃO
param Condição não satisfeita
call escreva, 1
L7:
# Fim do comando SE
param Programa executado com sucesso!
call escreva, 1
# Fim do programa