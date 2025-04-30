parser grammar TimemaniaParser;

options { tokenVocab=TimemaniaLexer; }

// Programa principal
programa: START (declaracao)* comando+ END;

// Declarações
declaracao: constante
          | tipagem
          | variavel
          | funcaoProcedimento;

// Constantes
constante: CONST ID ASSIGN expressao DELIMITER;

// Definição de tipos
tipagem: TIPO ID ASSIGN tipoDefinicao DELIMITER;

tipoDefinicao: tipoSimples
             | tipoEstruturado;

tipoSimples: ID
           | INTEIRO
           | TEXTO
           | BOOLEANO;

tipoEstruturado: registroTipo
               | vetorTipo;

registroTipo: REGISTRO CHAVE (ID DOISPONTOS tipoDefinicao DELIMITER)+ CHAVE;

vetorTipo: VETOR COLCHETE expressao COLCHETE DE tipoSimples;

// Variáveis
variavel: VAR ID (VIRGULA ID)* DOISPONTOS tipoSimples DELIMITER;

// Funções e Procedimentos
funcaoProcedimento: funcao
                  | procedimento;

funcao: FUNCAO ID PARENTESE parametro? PARENTESE DOISPONTOS tipoSimples CHAVE comando+ retorno CHAVE;

procedimento: PROCEDIMENTO ID PARENTESE parametro? PARENTESE CHAVE comando+ CHAVE;

parametro: ID DOISPONTOS tipoSimples (VIRGULA ID DOISPONTOS tipoSimples)*;

retorno: RETORNA expressao DELIMITER;

// Comandos existentes
comando: atribuicao
       | futebol
       | io
       | controle
       | chamadaFuncao;

atribuicao: ID ASSIGN expressao DELIMITER;

futebol: VASCO PARENTESE STRING PARENTESE DELIMITER
       | FLAMENGO PARENTESE STRING PARENTESE DELIMITER
       | CORINTHIANS PARENTESE NUMBER PARENTESE DELIMITER
       | PALMEIRAS PARENTESE PARENTESE DELIMITER
       | SANTOS PARENTESE STRING PARENTESE DELIMITER;

// Expandindo o IO para incluir saída sem quebra de linha
io: ESCREVA PARENTESE expressao PARENTESE DELIMITER
   | ESCREVA_SEM_QUEBRA PARENTESE expressao PARENTESE DELIMITER
   | LEIA PARENTESE ID PARENTESE DELIMITER;

// Estruturas de controle estendidas
controle: SE PARENTESE condicao PARENTESE ENTAO bloco (SENAO bloco)?
        | ENQUANTO PARENTESE condicao PARENTESE FACA bloco
        | PARA ID ASSIGN expressao ATE expressao FACA bloco
        | REPITA bloco ENQUANTO PARENTESE condicao PARENTESE DELIMITER;

bloco: CHAVE comando+ CHAVE;

// Nova construção para chamadas de função
chamadaFuncao: ID PARENTESE (expressao (VIRGULA expressao)*)? PARENTESE DELIMITER;

// Expressões e termos com suporte expandido
expressao: termo (OPERATOR termo)*
         | concatenacao;

// Adicionando concatenação de strings
concatenacao: termo CONCATENAR termo;

termo: NUMBER 
     | STRING
     | ID
     | ID COLCHETE expressao COLCHETE           // Acesso a vetor
     | ID PONTO ID                              // Acesso a registro
     | chamadaFuncao
     | PARENTESE expressao PARENTESE
     | conversor;                               // Conversão de tipos

// Conversores de tipo
conversor: PARA_TEXTO PARENTESE expressao PARENTESE
         | PARA_NUMERO PARENTESE expressao PARENTESE;

// Manipulação de arrays
arrayOp: CRIAR_VETOR PARENTESE expressao PARENTESE
       | TAMANHO PARENTESE ID PARENTESE;

condicao: expressao (OPERATOR expressao)? 
        | expressao COMPARADOR expressao;