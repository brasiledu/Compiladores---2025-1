; Código LLVM IR gerado pelo Compilador Timemania
target triple = "arm64-apple-darwin24.5.0"

declare i32 @printf(i8*, ...)
declare i32 @scanf(i8*, ...)

@a = global i32 0
@b = global i32 0
@c = global i32 0
@.str1 = private unnamed_addr constant [28 x i8] c"Classificacao de Triangulos\00", align 1
@.str2 = private unnamed_addr constant [33 x i8] c"Digite o valor do primeiro lado:\00", align 1
@.str3 = private unnamed_addr constant [32 x i8] c"Digite o valor do segundo lado:\00", align 1
@.str4 = private unnamed_addr constant [33 x i8] c"Digite o valor do terceiro lado:\00", align 1
@.str5 = private unnamed_addr constant [42 x i8] c"ERRO: Todos os lados devem ser positivos!\00", align 1
@.str6 = private unnamed_addr constant [18 x i8] c"Medidas invalidas\00", align 1
@.str7 = private unnamed_addr constant [28 x i8] c"Triangulo equilatero valido\00", align 1
@.str8 = private unnamed_addr constant [26 x i8] c"Triangulo escaleno valido\00", align 1
@.str9 = private unnamed_addr constant [27 x i8] c"Triangulo isosceles valido\00", align 1

@.str = private unnamed_addr constant [4 x i8] c"%d\0A\00", align 1
@.str_input = private unnamed_addr constant [3 x i8] c"%d\00", align 1
@.str_msg = private unnamed_addr constant [4 x i8] c"%s\0A\00", align 1

define i32 @main() {
  br label %entry
entry:
  %str_ptr0 = getelementptr [28 x i8], [28 x i8]* @.str1, i32 0, i32 0
  call i32 (i8*, ...) @printf(i8* %str_ptr0)
  %str_ptr1 = getelementptr [33 x i8], [33 x i8]* @.str2, i32 0, i32 0
  call i32 (i8*, ...) @printf(i8* %str_ptr1)
  %scanf_ptr2 = getelementptr [3 x i8], [3 x i8]* @.str_input, i32 0, i32 0
  call i32 (i8*, ...) @scanf(i8* %scanf_ptr2, i32* @a)
  %str_ptr3 = getelementptr [32 x i8], [32 x i8]* @.str3, i32 0, i32 0
  call i32 (i8*, ...) @printf(i8* %str_ptr3)
  %scanf_ptr4 = getelementptr [3 x i8], [3 x i8]* @.str_input, i32 0, i32 0
  call i32 (i8*, ...) @scanf(i8* %scanf_ptr4, i32* @b)
  %str_ptr5 = getelementptr [33 x i8], [33 x i8]* @.str4, i32 0, i32 0
  call i32 (i8*, ...) @printf(i8* %str_ptr5)
  %scanf_ptr6 = getelementptr [3 x i8], [3 x i8]* @.str_input, i32 0, i32 0
  call i32 (i8*, ...) @scanf(i8* %scanf_ptr6, i32* @c)
  %cmp1_7 = load i32, i32* @a
  %t0 = icmp sle i32 %cmp1_7, 0
  %cmp1_8 = load i32, i32* @b
  %t1 = icmp sle i32 %cmp1_8, 0
  %t2 = or i1 %t0, %t1
  %cmp1_9 = load i32, i32* @c
  %t3 = icmp sle i32 %cmp1_9, 0
  %t4 = or i1 %t2, %t3
  br i1 %t4, label %cont10, label %L0
cont10:
  %str_ptr11 = getelementptr [42 x i8], [42 x i8]* @.str5, i32 0, i32 0
  call i32 (i8*, ...) @printf(i8* %str_ptr11)
  br label %L1
L0:
  %add1_12 = load i32, i32* @a
  %add2_13 = load i32, i32* @b
  %t5 = add i32 %add1_12, %add2_13
  %cmp2_14 = load i32, i32* @c
  %t6 = icmp sgt i32 %t5, %cmp2_14
  br i1 %t6, label %cont15, label %L2
cont15:
  %add1_16 = load i32, i32* @a
  %add2_17 = load i32, i32* @c
  %t7 = add i32 %add1_16, %add2_17
  %cmp2_18 = load i32, i32* @b
  %t8 = icmp sgt i32 %t7, %cmp2_18
  br i1 %t8, label %cont19, label %L4
cont19:
  %add1_20 = load i32, i32* @b
  %add2_21 = load i32, i32* @c
  %t9 = add i32 %add1_20, %add2_21
  %cmp2_22 = load i32, i32* @a
  %t10 = icmp sgt i32 %t9, %cmp2_22
  br i1 %t10, label %cont23, label %L6
cont23:
  %cmp1_24 = load i32, i32* @a
  %cmp2_25 = load i32, i32* @b
  %t11 = icmp eq i32 %cmp1_24, %cmp2_25
  br i1 %t11, label %cont26, label %L8
cont26:
  %cmp1_27 = load i32, i32* @b
  %cmp2_28 = load i32, i32* @c
  %t12 = icmp eq i32 %cmp1_27, %cmp2_28
  br i1 %t12, label %cont29, label %L10
cont29:
  %str_ptr30 = getelementptr [28 x i8], [28 x i8]* @.str7, i32 0, i32 0
  call i32 (i8*, ...) @printf(i8* %str_ptr30)
  br label %L11
L10:
  %str_ptr31 = getelementptr [27 x i8], [27 x i8]* @.str9, i32 0, i32 0
  call i32 (i8*, ...) @printf(i8* %str_ptr31)
  br label %L11
L11:
  br label %L9
L8:
  %cmp1_32 = load i32, i32* @b
  %cmp2_33 = load i32, i32* @c
  %t13 = icmp eq i32 %cmp1_32, %cmp2_33
  br i1 %t13, label %cont34, label %L12
cont34:
  %str_ptr35 = getelementptr [27 x i8], [27 x i8]* @.str9, i32 0, i32 0
  call i32 (i8*, ...) @printf(i8* %str_ptr35)
  br label %L13
L12:
  %cmp1_36 = load i32, i32* @a
  %cmp2_37 = load i32, i32* @c
  %t14 = icmp eq i32 %cmp1_36, %cmp2_37
  br i1 %t14, label %cont38, label %L14
cont38:
  %str_ptr39 = getelementptr [27 x i8], [27 x i8]* @.str9, i32 0, i32 0
  call i32 (i8*, ...) @printf(i8* %str_ptr39)
  br label %L15
L14:
  %str_ptr40 = getelementptr [26 x i8], [26 x i8]* @.str8, i32 0, i32 0
  call i32 (i8*, ...) @printf(i8* %str_ptr40)
  br label %L15
L15:
  br label %L13
L13:
  br label %L9
L9:
  br label %L7
L6:
  %str_ptr41 = getelementptr [18 x i8], [18 x i8]* @.str6, i32 0, i32 0
  call i32 (i8*, ...) @printf(i8* %str_ptr41)
  br label %L7
L7:
  br label %L5
L4:
  %str_ptr42 = getelementptr [18 x i8], [18 x i8]* @.str6, i32 0, i32 0
  call i32 (i8*, ...) @printf(i8* %str_ptr42)
  br label %L5
L5:
  br label %L3
L2:
  %str_ptr43 = getelementptr [18 x i8], [18 x i8]* @.str6, i32 0, i32 0
  call i32 (i8*, ...) @printf(i8* %str_ptr43)
  br label %L3
L3:
  br label %L1
L1:
  br label %program_end
program_end:
  ret i32 0
}