lexer grammar InternalAltarica;
@header {
package fr.onair.dsl.safety.altarica.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T11 : '!' ;
T12 : 'priority' ;
T13 : 'and' ;
T14 : '&' ;
T15 : 'or' ;
T16 : '|' ;
T17 : '~' ;
T18 : 'not' ;
T19 : 'true' ;
T20 : 'false' ;
T21 : 'integer' ;
T22 : 'bool' ;
T23 : 'in' ;
T24 : 'out' ;
T25 : 'inout' ;
T26 : 'const' ;
T27 : ';' ;
T28 : '=' ;
T29 : ':' ;
T30 : 'domain' ;
T31 : '[' ;
T32 : ',' ;
T33 : ']' ;
T34 : '{' ;
T35 : '}' ;
T36 : 'node' ;
T37 : 'edon' ;
T38 : 'init' ;
T39 : 'extern' ;
T40 : 'flow' ;
T41 : 'event' ;
T42 : 'state' ;
T43 : 'sub' ;
T44 : 'assert' ;
T45 : 'sync' ;
T46 : '<' ;
T47 : '>' ;
T48 : '>=' ;
T49 : 'trans' ;
T50 : '|-' ;
T51 : '->' ;
T52 : ':=' ;
T53 : 'case {' ;
T54 : 'else' ;
T55 : 'if' ;
T56 : 'then' ;
T57 : '+' ;
T58 : '-' ;
T59 : '*' ;
T60 : '/' ;
T61 : '!=' ;
T62 : '<=' ;
T63 : '=>' ;
T64 : '(' ;
T65 : ')' ;
T66 : '.' ;
T67 : 'Main' ;
T68 : '?' ;

// $ANTLR src "../fr.onair.dsl.safety.altarica.ui/src-gen/fr/onair/dsl/safety/altarica/ui/contentassist/antlr/internal/InternalAltarica.g" 11260
RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

// $ANTLR src "../fr.onair.dsl.safety.altarica.ui/src-gen/fr/onair/dsl/safety/altarica/ui/contentassist/antlr/internal/InternalAltarica.g" 11262
RULE_INT : ('0'..'9')+;

// $ANTLR src "../fr.onair.dsl.safety.altarica.ui/src-gen/fr/onair/dsl/safety/altarica/ui/contentassist/antlr/internal/InternalAltarica.g" 11264
RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

// $ANTLR src "../fr.onair.dsl.safety.altarica.ui/src-gen/fr/onair/dsl/safety/altarica/ui/contentassist/antlr/internal/InternalAltarica.g" 11266
RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

// $ANTLR src "../fr.onair.dsl.safety.altarica.ui/src-gen/fr/onair/dsl/safety/altarica/ui/contentassist/antlr/internal/InternalAltarica.g" 11268
RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

// $ANTLR src "../fr.onair.dsl.safety.altarica.ui/src-gen/fr/onair/dsl/safety/altarica/ui/contentassist/antlr/internal/InternalAltarica.g" 11270
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../fr.onair.dsl.safety.altarica.ui/src-gen/fr/onair/dsl/safety/altarica/ui/contentassist/antlr/internal/InternalAltarica.g" 11272
RULE_ANY_OTHER : .;


