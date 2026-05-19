grammar Tema39568;

// Reglas del parser
programa       : instrucciones EOF ;
instrucciones  : instruccion+ ;
instruccion    : decision ;
decision       : SI PARENTESIS_IZQ condicion PARENTESIS_DER LLAVE_IZQ sentencia LLAVE_DER
                 ( SINO LLAVE_IZQ sentencia LLAVE_DER )? ;
sentencia
    : salida sentencia?  #SalidaExpr
    | terminar           #TerminarExpr
    ;
salida    : IMPRIMIR PARENTESIS_IZQ CADENA PARENTESIS_DER PUNTO_COMA ;
terminar  : RETORNAR PUNTO_COMA ;
condicion : CERO | UNO ;

// Reglas del lexer
SI            : 'if' ;
SINO          : 'else' ;
IMPRIMIR      : 'printf' ;
RETORNAR      : 'return' ;
PARENTESIS_IZQ : '(' ;
PARENTESIS_DER : ')' ;
LLAVE_IZQ     : '{' ;
LLAVE_DER     : '}' ;
PUNTO_COMA    : ';' ;
CERO          : '0' ;
UNO           : '1' ;
CADENA        : '"' [a-zA-Z0-9.,!?:; ]* '"' ;
WS            : [ \t\r\n]+ -> skip ;
