lexer grammar TimemaniaLexer;

<<<<<<< HEAD
// Palavras-chave da linguagem
=======
// Definição de tokens para palavras-chave
VASCO: 'vasco';
>>>>>>> d6c0c88be28bc583a551ea763c98f119eeba5367
FLAMENGO: 'flamengo';
CORINTHIANS: 'corinthians';
PALMEIRAS: 'palmeiras';
SANTOS: 'santos';
START: 'start';
END: 'end';
SE: 'se';
ENTAO: 'entao';
SENAO: 'senao';
ENQUANTO: 'enquanto';
FACA: 'faca';
ESCREVA: 'escreva';
LEIA: 'leia';
VASCO: 'vasco';
// Operadores aritméticos
PLUS: '+' ;
MINUS: '-';
MULT: '*';
DIV: '/';
MOD: '%';
OPERATOR: [+*/-];
DELIMITER: [;,];
PARENTESE: [()]; // Parênteses
COMPARADOR: '>' | '<' | '==' | '!=' | '<=' | '>='; // Comparadores
CHAVE: '{' | '}'; // Chaves

<<<<<<< HEAD

// Operadores lógicos
AND: '&&';
OR: '||';
NOT: '!';

// Símbolos especiais
ASSIGN: ':=';
SEMICOLON: ';';
COMMA: ',';

// Literais e identificadores
NUMBER: [0-9]+ ('.' [0-9]+)?;  // Suporte para números decimais
ID: [a-zA-Z_][a-zA-Z0-9_]*;
STRING: '"' (~["\r\n] | '\\"')* '"';  // Melhor tratamento para strings com escape

// Ignorando espaços em branco e comentários
COMMENT: '//' ~[\r\n]* -> skip;
MULTILINE_COMMENT: '/*' .*? '*/' -> skip;  // Suporte para comentários multilinhas
WS: [ \t\r\n]+ -> skip;
=======
// Ignorar espaços em branco
WS: [ \t\r\n]+ -> skip;
>>>>>>> d6c0c88be28bc583a551ea763c98f119eeba5367
