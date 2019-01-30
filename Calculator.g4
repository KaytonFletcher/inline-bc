grammar Calculator;

// exprList: topExpr ( ';' topExpr)* ';'? ; 

// varDef: VAR ID '=' expr;

@header{ import java.util.HashMap; }

@members{ 
    HashMap<String, Integer> hmap = new HashMap<String, Integer>();
}

program: line+ ;

// { System.out.println("Value: "+ $expr.i); hmap.put($ID.text, $expr.i); }

line: 
    expr { System.out.println("result: "+ Integer.toString($expr.i));} 
    | shorthand
    | ID '=' er=expr { hmap.put($ID.text, $er.i ); } 
    | ID operation '=' 
    | COMMENT { System.out.println($COMMENT.text);} 
    | NEWLINE
    ;

expr returns [int i]: 
    el=expr op='*' er=expr { $i=$el.i*$er.i; }
    | el=expr op='/' er=expr { $i=$el.i/$er.i; }
    | el=expr op='+' er=expr { $i=$el.i+$er.i; }
    | el=expr op='-' er=expr { $i=$el.i-$er.i; }
    | INT { $i=Integer.parseInt($INT.text); }
    | ID { $i=hmap.getOrDefault($ID.text, 0);}
    | '('e=expr')' 
    ;

muldiv:

;

addsub:


;




shorthand returns [int i]:
    ID op='++' { hmap.put($ID.text, hmap.getOrDefault($ID.text,0) + 1); $i=hmap.getOrDefault($ID.text,0)-1;}
    | op='++' ID { hmap.put($ID.text, hmap.getOrDefault($ID.text,0) + 1); $i=hmap.getOrDefault($ID.text,0);}
    | ID op='--' { hmap.put($ID.text, hmap.getOrDefault($ID.text,0) - 1); $i=hmap.getOrDefault($ID.text,0)+1;}
    | op='--' ID { hmap.put($ID.text, hmap.getOrDefault($ID.text,0) - 1); $i=hmap.getOrDefault($ID.text,0);}
;


operation [int i]:
    '+'
    | '-'
    | '/'
    | '*'
    | '^'
    ;

NEWLINE:'\r'? '\n' ;
COMMENT: '/*' .*? '*/';
ID: [_A-Za-z]+;
INT: [0-9]+ ;
WS : [ \t]+ -> skip ;