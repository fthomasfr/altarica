lexer grammar InternalAltarica;
@header {
package fr.onair.dsl.safety.altarica.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T11 : 'const' ;
T12 : ';' ;
T13 : '=' ;
T14 : ':' ;
T15 : 'domain' ;
T16 : '[' ;
T17 : ',' ;
T18 : ']' ;
T19 : '{' ;
T20 : '}' ;
T21 : 'node' ;
T22 : 'Main' ;
T23 : 'edon' ;
T24 : 'init' ;
T25 : 'extern' ;
T26 : 'flow' ;
T27 : 'event' ;
T28 : '!' ;
T29 : 'priority' ;
T30 : 'state' ;
T31 : 'sub' ;
T32 : 'assert' ;
T33 : 'sync' ;
T34 : '<' ;
T35 : '>' ;
T36 : '?' ;
T37 : '>=' ;
T38 : 'trans' ;
T39 : '|-' ;
T40 : '->' ;
T41 : ':=' ;
T42 : 'case {' ;
T43 : 'else' ;
T44 : 'if' ;
T45 : 'then' ;
T46 : '+' ;
T47 : '-' ;
T48 : '*' ;
T49 : '/' ;
T50 : 'and' ;
T51 : '&' ;
T52 : 'or' ;
T53 : '|' ;
T54 : '!=' ;
T55 : '<=' ;
T56 : '=>' ;
T57 : '~' ;
T58 : 'not' ;
T59 : '(' ;
T60 : ')' ;
T61 : '.' ;
T62 : 'true' ;
T63 : 'false' ;
T64 : 'integer' ;
T65 : 'bool' ;
T66 : 'in' ;
T67 : 'out' ;
T68 : 'inout' ;

// $ANTLR src "../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g" 5089
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g" 5091
RULE_INT : ('0'..'9')+;

// $ANTLR src "../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g" 5093
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g" 5095
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g" 5097
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g" 5099
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../fr.onair.dsl.safety.altarica/src-gen/fr/onair/dsl/safety/altarica/parser/antlr/internal/InternalAltarica.g" 5101
RULE_ANY_OTHER : .;


