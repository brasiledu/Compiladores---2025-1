parser grammar TimemaniaParser;

options { tokenVocab=TimemaniaLexer; }

// Regras sintáticas usando os tokens definidos
programa: START comando+ END;

comando: atribuicao
       | futebol
       | io
       | controle;

atribuicao: ID ASSIGN expressao DELIMITER;

futebol: VASCO PARENTESE STRING PARENTESE DELIMITER
       | FLAMENGO PARENTESE STRING PARENTESE DELIMITER
       | CORINTHIANS PARENTESE NUMBER PARENTESE DELIMITER
       | PALMEIRAS PARENTESE PARENTESE DELIMITER
       | SANTOS PARENTESE STRING PARENTESE DELIMITER;


io: ESCREVA PARENTESE expressao PARENTESE DELIMITER
   | LEIA PARENTESE ID PARENTESE DELIMITER;

controle: SE PARENTESE condicao PARENTESE ENTAO bloco (SENAO bloco)?
        | ENQUANTO PARENTESE condicao PARENTESE FACA bloco;

bloco: CHAVE comando+ CHAVE;

expressao: termo (OPERATOR termo)*;

termo: NUMBER | ID | PARENTESE expressao PARENTESE;

<<<<<<< HEAD
condicao: expressao (OPERATOR expressao)? ;

// Dentro de TimemaniaParser.g4
comparacao: expressao (COMPARADOR expressao)? ; // Use o novo token COMPARADOR aqui!
=======
condicao: expressao (OPERATOR expressao)?;
>>>>>>> d6c0c88be28bc583a551ea763c98f119eeba5367
