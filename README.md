# AntlrCalculator
Creating a bc grammar using antlr4 and java

To compile:
This generates java files ->

antlr4 Calculator.g4;

This compiles java files ->

javac Calculator*.java;

To then test the grammar, use grun (-tree is optional to see parse tree).

grun Calculator program SOMETHING.txt

Replace SOMETHING with the text file you wish to run. For the read() function,
you will need to input a number via the command line to read it into the variable.
It will halt the program until input is provided.

If you wish to use the VScode parse tree extension, make sure you configure the launch.json
like so (your version may vary) -> 

{
    "version": "2.0.0",
    "configurations": [
      {
        "name": "antlr4-calculator",
        "type": "antlr-debug",
        "request": "launch",
        "input": "SOMETHING.txt",
        "grammar": "Calculator.g4",
        "startRule": "program",
        "printParseTree": true,
        "visualParseTree": true
     }
     ]
  }
