grammar lang;

// Parser rules

prog: LBRACE com* RBRACE EOF;

com:
	ID ASSIGN exp SEMICOLON								        # Assignment
	| SKIP_CMD SEMICOLON									    # Skip
	| LSQUARE com* NDETCH com* RSQUARE SEMICOLON			    # NondeterministicChoice
	| WHILE LPAREN bExp RPAREN LBRACE com* RBRACE SEMICOLON	    # KleeneStar;

exp: aExp | bExp;

aExp:
	aExp '*' aExp			# Multiplication
	| aExp '/' aExp			# Division
	| aExp '+' aExp			# Addition
	| aExp '-' aExp			# Subtraction
	| LPAREN aExp RPAREN	# AParenthesis
	| INT					# Integer
	| ID					# ArithmeticVariable;

bExp:
	NOT bExp bExp_tail
	| ID bExp_tail
	| TRUE bExp_tail
	| FALSE bExp_tail
	| aExp bExp_tail
	| LPAREN bExp RPAREN bExp_tail
	;

bExp_tail:
	EQ exp bExp_tail
	| GT exp bExp_tail
	| LT exp bExp_tail
	| AND exp bExp_tail
	|
	;


// Lexer rules

SKIP_CMD: 'skip';
LBRACE: '{';
RBRACE: '}';
LPAREN: '(';
RPAREN: ')';
LSQUARE: '[';
RSQUARE: ']';
NDETCH: '||';
WHILE: 'while';
SEMICOLON: ';';
ASSIGN: ':=';
TRUE: 'true';
FALSE: 'false';
NOT: 'not';
AND: 'and';
OR: 'or';
EQ: '=';
GT: '>';
LT: '<';
GE: '>=';
LE: '<=';
ID: [a-zA-Z]+;
INT: [0-9]+;

WS: [ \t\r\n]+ -> skip;