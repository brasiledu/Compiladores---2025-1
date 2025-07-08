; Código LLVM IR gerado pelo Compilador Timemania
target triple = "arm64-apple-darwin24.5.0"

declare i32 @printf(i8*, ...)
declare i32 @scanf(i8*, ...)

@param = global i32 0
@resultado = global i32 0
@x = global i32 0
@y = global i32 0
@.str1 = private unnamed_addr constant [38 x i8] c"=== COMPILACAO COMPLETA REALIZADA ===\00", align 1
@.str2 = private unnamed_addr constant [41 x i8] c"=== DEMO RAPIDA COMPILADOR TIMEMANIA ===\00", align 1
@.str3 = private unnamed_addr constant [26 x i8] c"Digite o primeiro numero:\00", align 1
@.str4 = private unnamed_addr constant [25 x i8] c"Digite o segundo numero:\00", align 1
@.str5 = private unnamed_addr constant [15 x i8] c"Multiplicacao:\00", align 1
@.str6 = private unnamed_addr constant [27 x i8] c"O primeiro numero eh maior\00", align 1
@.str7 = private unnamed_addr constant [35 x i8] c"O segundo numero eh maior ou igual\00", align 1
@.str8 = private unnamed_addr constant [6 x i8] c"Soma:\00", align 1

@.str = private unnamed_addr constant [4 x i8] c"%d\0A\00", align 1
@.str_input = private unnamed_addr constant [3 x i8] c"%d\00", align 1
@.str_msg = private unnamed_addr constant [4 x i8] c"%s\0A\00", align 1

define i32 @main() {
  br label %entry
entry:
  %str_ptr0 = getelementptr [41 x i8], [41 x i8]* @.str2, i32 0, i32 0
  call i32 (i8*, ...) @printf(i8* %str_ptr0)
  %str_ptr1 = getelementptr [26 x i8], [26 x i8]* @.str3, i32 0, i32 0
  call i32 (i8*, ...) @printf(i8* %str_ptr1)
  %scanf_ptr2 = getelementptr [3 x i8], [3 x i8]* @.str_input, i32 0, i32 0
  call i32 (i8*, ...) @scanf(i8* %scanf_ptr2, i32* @x)
  %str_ptr3 = getelementptr [25 x i8], [25 x i8]* @.str4, i32 0, i32 0
  call i32 (i8*, ...) @printf(i8* %str_ptr3)
  %scanf_ptr4 = getelementptr [3 x i8], [3 x i8]* @.str_input, i32 0, i32 0
  call i32 (i8*, ...) @scanf(i8* %scanf_ptr4, i32* @y)
  %add1_5 = load i32, i32* @x
  %add2_6 = load i32, i32* @y
  %t0 = add i32 %add1_5, %add2_6
  store i32 %t0, i32* @resultado
  %str_ptr7 = getelementptr [6 x i8], [6 x i8]* @.str8, i32 0, i32 0
  call i32 (i8*, ...) @printf(i8* %str_ptr7)
  %param8 = load i32, i32* @resultado
  %str_ptr8 = getelementptr [4 x i8], [4 x i8]* @.str, i32 0, i32 0
  call i32 (i8*, ...) @printf(i8* %str_ptr8, i32 %param8)
  %mul1_9 = load i32, i32* @x
  %mul2_10 = load i32, i32* @y
  %t1 = mul i32 %mul1_9, %mul2_10
  store i32 %t1, i32* @resultado
  %str_ptr11 = getelementptr [15 x i8], [15 x i8]* @.str5, i32 0, i32 0
  call i32 (i8*, ...) @printf(i8* %str_ptr11)
  %param12 = load i32, i32* @resultado
  %str_ptr12 = getelementptr [4 x i8], [4 x i8]* @.str, i32 0, i32 0
  call i32 (i8*, ...) @printf(i8* %str_ptr12, i32 %param12)
  %cmp1_13 = load i32, i32* @x
  %cmp2_14 = load i32, i32* @y
  %t2 = icmp sgt i32 %cmp1_13, %cmp2_14
  br i1 %t2, label %cont15, label %L0
cont15:
  %str_ptr16 = getelementptr [27 x i8], [27 x i8]* @.str6, i32 0, i32 0
  call i32 (i8*, ...) @printf(i8* %str_ptr16)
  br label %L1
L0:
  %str_ptr17 = getelementptr [35 x i8], [35 x i8]* @.str7, i32 0, i32 0
  call i32 (i8*, ...) @printf(i8* %str_ptr17)
  br label %L1
L1:
  %str_ptr18 = getelementptr [38 x i8], [38 x i8]* @.str1, i32 0, i32 0
  call i32 (i8*, ...) @printf(i8* %str_ptr18)
  br label %program_end
program_end:
  ret i32 0
}