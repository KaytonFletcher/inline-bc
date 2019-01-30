grammar Calculator;

@header{ 
    import java.util.HashMap; 
    import java.lang.Math;
}

@members{ 
    HashMap<String, Integer> hmap = new HashMap<String, Integer>();
}

program: line+ ;

// { System.out.println("Value: "+ $expr.i); hmap.put($ID.text, $expr.i); }

line: 
    expr { System.out.println("result: "+ Integer.toString($expr.i)); } 
    | shorthand { System.out.println("result: "+ Integer.toString($shorthand.i)); } 
    | ID '=' er=expr { hmap.put($ID.text, $er.i ); } 
    | COMMENT { System.out.println($COMMENT.text);} 
    | NEWLINE
    ;

expr returns [int i]: 
    '(' expr ')' 
    | el=expr op=POW er=expr { $i= (int)Math.pow($el.i,$er.i);}
    | el=expr op=(MULT|DIV) er=expr 
    { if($op.text.equals("*")){$i=$el.i*$er.i;} else {$i=$el.i/$er.i;} }

    | el=expr op=(PLUS|MINUS) er=expr
    { if($op.text.equals("+")){$i=$el.i+$er.i;} else {$i=$el.i-$er.i;} }

    | INT { $i=Integer.parseInt($INT.text); }
    | ID { $i=hmap.getOrDefault($ID.text, 0);}
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

PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
POW: '^';

NEWLINE:'\r'? '\n' ;
COMMENT: '/*' .*? '*/';
ID: [_A-Za-z]+;
INT: [0-9]+ ;
WS : [ \t]+ -> skip ;