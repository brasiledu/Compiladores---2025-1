; Código LLVM IR gerado pelo Compilador Timemania
target triple = "arm64-apple-darwin24.5.0"

declare i32 @printf(i8*, ...)
declare i32 @scanf(i8*, ...)

@col = global i32 0
@linha = global i32 0
@n = global i32 0
@numerador = global i32 0
@valor = global i32 0
@.str1 = private unnamed_addr constant [43 x i8] c"Digite o numero de linhas (deve ser >= 1):\00", align 1
@.str2 = private unnamed_addr constant [44 x i8] c"ERRO: O numero deve ser maior ou igual a 1!\00", align 1
@.str3 = private unnamed_addr constant [31 x i8] c"Gerador de Triangulo de Pascal\00", align 1
@.str4 = private unnamed_addr constant [71 x i8] c"Triangulo de Pascal gerado com sucesso e o palmeiras nao tem mundial!!\00", align 1

@.str = private unnamed_addr constant [4 x i8] c"%d\0A\00", align 1
@.str_input = private unnamed_addr constant [3 x i8] c"%d\00", align 1
@.str_msg = private unnamed_addr constant [4 x i8] c"%s\0A\00", align 1

define i32 @main() {
  br label %entry
entry:
  %str_ptr0 = getelementptr [31 x i8], [31 x i8]* @.str3, i32 0, i32 0
  call i32 (i8*, ...) @printf(i8* %str_ptr0)
  %str_ptr1 = getelementptr [43 x i8], [43 x i8]* @.str1, i32 0, i32 0
  call i32 (i8*, ...) @printf(i8* %str_ptr1)
  %scanf_ptr2 = getelementptr [3 x i8], [3 x i8]* @.str_input, i32 0, i32 0
  call i32 (i8*, ...) @scanf(i8* %scanf_ptr2, i32* @n)
  %cmp1_3 = load i32, i32* @n
  %t0 = icmp slt i32 %cmp1_3, 1
  br i1 %t0, label %cont4, label %L0
cont4:
  %str_ptr5 = getelementptr [44 x i8], [44 x i8]* @.str2, i32 0, i32 0
  call i32 (i8*, ...) @printf(i8* %str_ptr5)
  br label %L1
L0:
  store i32 0, i32* @linha
  br label %L2
L2:
  %cmp1_6 = load i32, i32* @linha
  %cmp2_7 = load i32, i32* @n
  %t1 = icmp slt i32 %cmp1_6, %cmp2_7
  br i1 %t1, label %cont8, label %L3
cont8:
  %str_ptr9 = getelementptr [4 x i8], [4 x i8]* @.str, i32 0, i32 0
  call i32 (i8*, ...) @printf(i8* %str_ptr9, i32 1)
  %cmp1_10 = load i32, i32* @linha
  %t2 = icmp sgt i32 %cmp1_10, 0
  br i1 %t2, label %cont11, label %L5
cont11:
  store i32 1, i32* @valor
  store i32 0, i32* @col
  br label %L6
L6:
  %cmp1_12 = load i32, i32* @col
  %cmp2_13 = load i32, i32* @linha
  %t3 = icmp slt i32 %cmp1_12, %cmp2_13
  br i1 %t3, label %cont14, label %L7
cont14:
  %sub1_15 = load i32, i32* @linha
  %sub2_16 = load i32, i32* @col
  %t4 = sub i32 %sub1_15, %sub2_16
  %mul1_17 = load i32, i32* @valor
  %t5 = mul i32 %mul1_17, %t4
  store i32 %t5, i32* @numerador
  %add1_18 = load i32, i32* @col
  %t6 = add i32 %add1_18, 1
  %div1_19 = load i32, i32* @numerador
  %t7 = sdiv i32 %div1_19, %t6
  store i32 %t7, i32* @valor
  %param20 = load i32, i32* @valor
  %str_ptr20 = getelementptr [4 x i8], [4 x i8]* @.str, i32 0, i32 0
  call i32 (i8*, ...) @printf(i8* %str_ptr20, i32 %param20)
  %add1_21 = load i32, i32* @col
  %t8 = add i32 %add1_21, 1
  store i32 %t8, i32* @col
  br label %L6
L7:
  br label %L5
L5:
  %add1_22 = load i32, i32* @linha
  %t9 = add i32 %add1_22, 1
  store i32 %t9, i32* @linha
  br label %L2
L3:
  br label %L1
L1:
  %str_ptr23 = getelementptr [71 x i8], [71 x i8]* @.str4, i32 0, i32 0
  call i32 (i8*, ...) @printf(i8* %str_ptr23)
  br label %program_end
program_end:
  ret i32 0
}