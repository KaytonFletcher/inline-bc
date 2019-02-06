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
    | NEWLINE
    | ZERO_ERROR {System.out.println("Runtime error (func=(main), adr=6): Divide by zero");}
    | NEGATIVE_SQRT {System.out.println("Runtime error (func=(main), adr=6): Square root of a negative number");}
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

    | NOT expr { if($expr.val == 0.0){$val = 1.0;} else {$val = 0.0;} }

    | el=expr op=AND er=expr
    { if($el.val != 0.0 && $er.val != 0.0){$val = 1.0;} else{$val = 0.0;} } 

    | el=expr op=OR er=expr
    { if($el.val != 0.0 || $er.val != 0.0){$val = 1.0;} else{$val = 0.0;} }

    | SQRT '(' expr ')' { $val = Math.sqrt($expr.val); }

    | SIN '(' expr ')' { $val = Math.sin($expr.val); }
    | COS '(' expr ')' { $val = Math.cos($expr.val); }
    | LOG '(' expr ')' { $val = Math.log($expr.val); } 
    | EXP '(' expr ')' { $val = Math.exp($expr.val); }
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
NOT: '!';
AND: '&&';
OR: '||';
SQRT: 'sqrt';
SIN: 's';
COS: 'c';
LOG: 'l';
EXP: 'e';

NEWLINE:'\r'? '\n' ;
COMMENT: '/*' .*? '*/' -> skip;
INLINE_COMMENT: '#' ~[\r\n]* -> skip;
ID: [_A-Za-z]+;
//INT: [0-9]+ ;
DOUBLE: [+-]?([0-9]*[.])?[0-9]+;
WS : [ \t]+ -> skip ;
ZERO_ERROR: [0-9]+'/''0';
NEGATIVE_SQRT: SQRT'(''-'[0-9]+')';