grammar Calculator;

@header{ 
    import java.util.HashMap; 
    import java.lang.Math;
}

@members{ 
    HashMap<String, Double> hmap = new HashMap<String, Double>();
}

program: line+ ;

// { System.out.println("Value: "+ $expr.val); hmap.put($ID.text, $expr.val); }

line: 
    expr { System.out.println("result: "+ Double.toString($expr.val)); } 
    | shorthand { System.out.println("result: "+ Double.toString($shorthand.val)); } 
    | equation  
    | COMMENT { System.out.println($COMMENT.text);} 
    | NEWLINE
    ;

expr returns [Double val]: 
    '(' expr ')' 
    | el=expr op=POW er=expr { $val= Math.pow($el.val,$er.val);}
    | el=expr op=(MULT|DIV) er=expr 
    { if($op.text.equals("*")){$val=$el.val*$er.val;} else {$val=$el.val/$er.val;} }

    | el=expr op=(PLUS|MINUS) er=expr
    { if($op.text.equals("+")){$val=$el.val+$er.val;} else {$val=$el.val-$er.val;} }

    | DOUBLE { $val=Double.parseDouble($DOUBLE.text); }
    | ID { $val=hmap.getOrDefault($ID.text, 0.0);}
    ;

shorthand returns [Double val]:
    ID op='++' { hmap.put($ID.text, hmap.getOrDefault($ID.text,0.0) + 1); $val=hmap.getOrDefault($ID.text,0.0)-1;}
    | op='++' ID { hmap.put($ID.text, hmap.getOrDefault($ID.text,0.0) + 1); $val=hmap.getOrDefault($ID.text,0.0);}
    | ID op='--' { hmap.put($ID.text, hmap.getOrDefault($ID.text,0.0) - 1); $val=hmap.getOrDefault($ID.text,0.0)+1;}
    | op='--' ID { hmap.put($ID.text, hmap.getOrDefault($ID.text,0.0) - 1); $val=hmap.getOrDefault($ID.text,0.0);}
;

equation returns [Double val]:
    ID '=' expr { hmap.put($ID.text, $expr.val); }
    | ID '+=' expr { hmap.put($ID.text, hmap.getOrDefault($ID.text,0.0) + $expr.val); }
    | ID '-=' expr { hmap.put($ID.text, hmap.getOrDefault($ID.text,0.0) - $expr.val); }
    | ID '*=' expr { hmap.put($ID.text, hmap.getOrDefault($ID.text,0.0) * $expr.val); }
    | ID '/=' expr { hmap.put($ID.text, hmap.getOrDefault($ID.text,0.0) / $expr.val); }
    | ID '^=' expr { hmap.put($ID.text, Math.pow(hmap.getOrDefault($ID.text,0.0), $expr.val)); }
;

PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
POW: '^';

NEWLINE:'\r'? '\n' ;
COMMENT: '/*' .*? '*/';
ID: [_A-Za-z]+;
//INT: [0-9]+ ;
DOUBLE: [+-]?([0-9]*[.])?[0-9]+;
WS : [ \t]+ -> skip ;