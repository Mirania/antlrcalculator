grammar Grammar;

main: expression;

//operators must appear from highest to lowest priority order
expression  : literal                                   # literalexpr
            | 'sqrt' parens                             # sqrtexpr
            | parens                                    # parexpr
            | expression '^' expression                 # powexpr
            | expression parens                         # implicitexpr
            | expression ('*'|'/'|'%') expression       # highexpr
            | expression ('+'|'-') expression           # lowexpr;

parens: '(' expression ')';

literal: ('-'|'+')? NUMBER;

NUMBER : [0-9]+('.'[0-9]+)?;
WHITESPACE : (' '|'\n'|'\t'|'\r') -> skip;