lexer grammar TimemaniaLexer;

// Palavras-chave
START: 'inicio';
END: 'fim';
CONST: 'const';
TIPO: 'tipo';
VAR: 'var';
FUNCAO: 'funcao';
PROCEDIMENTO: 'procedimento';
RETORNA: 'retorna';
SE: 'se';
ENTAO: 'entao';
SENAO: 'senao';
ENQUANTO: 'enquanto';
FACA: 'faca';
PARA: 'para';
ATE: 'ate';
REPITA: 'repita';
DE: 'de';

// Tipos
INTEIRO: 'inteiro';
TEXTO: 'texto';
BOOLEANO: 'booleano';

// Operadores lógicos
OR: 'ou';
AND: 'e';
NOT: 'nao';

// Operadores de comparação
COMPARADOR: '==' | '!=' | '>=' | '<=' | '>' | '<';

// Operadores aritméticos
OPERADOR_ARITMETICO: '+' | '-' | '*' | '/' | '%';

// Atribuição e outros
ASSIGN: '=';
CONCATENAR: '++';
DELIMITER: ';';
DOISPONTOS: ':';
VIRGULA: ',';
PONTO: '.';

// Agrupadores
ABRE_PARENTESE: '(';
FECHA_PARENTESE: ')';
ABRE_CHAVE: '{';
FECHA_CHAVE: '}';
ABRE_COLCHETE: '[';
FECHA_COLCHETE: ']';

// Identificadores e literais
ID: [a-zA-Z_][a-zA-Z_0-9]*;
NUMBER: [0-9]+;
STRING: '"' (~['"\\\r\n])* '"';

// Espaços em branco e comentários
WS: [ \t\r\n]+ -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/' .? '*/' -> skip;

// IO
ESCREVA: 'escreva';
ESCREVA_SEM_QUEBRA: 'escreva_s';
LEIA: 'leia';

// Conversores
PARA_TEXTO: 'texto';
PARA_NUMERO: 'numero';

// Vetores
CRIAR_VETOR: 'vetor';
TAMANHO: 'tamanho';

// Tipos estruturados
REGISTRO: 'registro';
VETOR: 'vetor';

// Temáticos (futebol)
VASCO: 'vasco';
FLAMENGO: 'flamengo';
CORINTHIANS: 'corinthians';
PALMEIRAS: 'palmeiras';
SANTOS: 'santos';