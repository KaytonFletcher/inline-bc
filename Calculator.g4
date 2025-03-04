grammar Calculator;

@header{ 
    import java.util.HashMap; 
    import java.lang.Math;
    import java.util.Scanner;
}

@members{ 
    HashMap<String, Double> hmap = new HashMap<String, Double>();
    Scanner scnr = new Scanner(System.in);
}

program: (line';'?)+;

line: 
    expr { if(!Double.isNaN($expr.val)){System.out.println("result: "+ Double.toString($expr.val));} } 
    | shorthand { System.out.println("result: "+ Double.toString($shorthand.val)); } 
    | equation  
    | PRINT print { System.out.println(); }
    //| shorthand (expr | equation | shorthand) { System.out.println("Parsing Error"); }
    | COMMENT
    | INLINE_COMMENT
    | NEWLINE
;

expr returns [Double val]: 
     MINUS expr { $val = $expr.val * -1; }
    |'(' expr ')' {$val = $expr.val;}
    | el=expr op=POW er=expr { $val= Math.pow($el.val,$er.val);}
    | el=expr op=(MULT|DIV) er=expr 
    { if($op.text.equals("*")){$val=$el.val*$er.val;} 
        else { if($er.val != 0){$val=$el.val/$er.val;}
                else{$val=Double.NaN; System.out.println("Runtime error: Divide by zero");}
            } }
    | el=expr op=(PLUS|MINUS) er=expr
    { if($op.text.equals("+")){$val=$el.val+$er.val;} else {$val=$el.val-$er.val;} }

    | DOUBLE { $val=Double.parseDouble($DOUBLE.text); }
    | ID { $val=hmap.getOrDefault($ID.text, 0.0);}

    | NOT expr { if($expr.val == 0.0){$val = 1.0;} else {$val = 0.0;} }

    | el=expr op=AND er=expr
    { if($el.val != 0.0 && $er.val != 0.0){$val = 1.0;} else{$val = 0.0;} } 

    | el=expr op=OR er=expr
    { if($el.val != 0.0 || $er.val != 0.0){$val = 1.0;} else{$val = 0.0;} }

    | SQRT expr ')' 
    { if($expr.val < 0){$val = Double.NaN; 
        System.out.println("Runtime error: Square root of a negative number"); }
        else{$val = Math.sqrt($expr.val);} }

    | SIN expr ')' { $val = Math.sin($expr.val); }
    | COS expr ')' { $val = Math.cos($expr.val); }
    | LOG expr ')' { $val = Math.log($expr.val); } 
    | EXP expr ')' { $val = Math.exp($expr.val); }
    

    | READ { $val = scnr.nextDouble(); }
    ;

shorthand returns [Double val]:
    ID op='++' { hmap.put($ID.text, hmap.getOrDefault($ID.text,0.0) + 1); $val=hmap.getOrDefault($ID.text,0.0)-1;}
    | op='++' ID { hmap.put($ID.text, hmap.getOrDefault($ID.text,0.0) + 1); $val=hmap.getOrDefault($ID.text,0.0);}
    | ID op='--' { hmap.put($ID.text, hmap.getOrDefault($ID.text,0.0) - 1); $val=hmap.getOrDefault($ID.text,0.0)+1;}
    | op='--' ID { hmap.put($ID.text, hmap.getOrDefault($ID.text,0.0) - 1); $val=hmap.getOrDefault($ID.text,0.0);}
;

equation returns [Double val]:
    ID '=' el=expr op=AND er=expr { hmap.put($ID.text, $el.val); if($el.val != 0.0 && $er.val != 0.0){System.out.println("result: 1.0");} else{System.out.println("result: 0.0");} }
    | ID '=' el=expr op=OR er=expr { hmap.put($ID.text, $el.val); if($el.val != 0.0 || $er.val != 0.0){System.out.println("result: 1.0");} else{System.out.println("result: 0.0");}}
    | ID '=' expr { hmap.put($ID.text, $expr.val); }
    | ID '+=' expr { hmap.put($ID.text, hmap.getOrDefault($ID.text,0.0) + $expr.val); }
    | ID '-=' expr { hmap.put($ID.text, hmap.getOrDefault($ID.text,0.0) - $expr.val); }
    | ID '*=' expr { hmap.put($ID.text, hmap.getOrDefault($ID.text,0.0) * $expr.val); }
    | ID '/=' expr { hmap.put($ID.text, hmap.getOrDefault($ID.text,0.0) / $expr.val); }
    | ID '^=' expr { hmap.put($ID.text, Math.pow(hmap.getOrDefault($ID.text,0.0), $expr.val)); }
    | ID '=' READ  { double toAdd = scnr.nextDouble(); hmap.put($ID.text, toAdd); }
    //| ID '=' el=expr op=AND er=expr { System.out.println("hi"); }
;

print:
    '"'ID'"' {System.out.print($ID.text); } (',' print)? 
    | expr {System.out.print($expr.val); } (',' print)? 
;

PRINT: 'print';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
POW: '^';
NOT: '!';
AND: '&&';
OR: '||';
SQRT: 'sqrt(';
SIN: 's(';
COS: 'c(';
LOG: 'l(';
EXP: 'e(';
READ: 'read()';


NEWLINE:'\r'? '\n';
COMMENT: '/*' .*? '*/';
INLINE_COMMENT: '#' .*? '\n';
ID: [_A-Za-z]+;
//INT: [0-9]+ ;
DOUBLE: ([0-9]*[.])?[0-9]+;
WS : [ \t]+ -> skip ;
NEGATIVE_SQRT: SQRT'(''-'[0-9]+')';