// Generated from Calculator.g4 by ANTLR 4.7.2
 
    import java.util.HashMap; 
    import java.lang.Math;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CalculatorParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CalculatorParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(CalculatorParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(CalculatorParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CalculatorParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CalculatorParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#shorthand}.
	 * @param ctx the parse tree
	 */
	void enterShorthand(CalculatorParser.ShorthandContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#shorthand}.
	 * @param ctx the parse tree
	 */
	void exitShorthand(CalculatorParser.ShorthandContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(CalculatorParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(CalculatorParser.EquationContext ctx);
}