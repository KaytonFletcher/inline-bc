// Generated from Calculator.g4 by ANTLR 4.7.2
 
    import java.util.HashMap; 
    import java.lang.Math;
    import java.util.Scanner;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
<<<<<<< HEAD
		T__9=10, T__10=11, T__11=12, PRINT=13, PLUS=14, MINUS=15, MULT=16, DIV=17, 
		POW=18, NOT=19, AND=20, OR=21, SQRT=22, SIN=23, COS=24, LOG=25, EXP=26, 
		READ=27, NEWLINE=28, COMMENT=29, INLINE_COMMENT=30, ID=31, DOUBLE=32, 
		WS=33, ZERO_ERROR=34, NEGATIVE_SQRT=35;
=======
		T__9=10, T__10=11, T__11=12, PLUS=13, MINUS=14, MULT=15, DIV=16, POW=17, 
		NOT=18, AND=19, OR=20, SQRT=21, SIN=22, COS=23, LOG=24, EXP=25, READ=26, 
		NEWLINE=27, COMMENT=28, INLINE_COMMENT=29, ID=30, DOUBLE=31, WS=32, ZERO_ERROR=33, 
		NEGATIVE_SQRT=34;
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_expr = 2, RULE_shorthand = 3, RULE_equation = 4, 
		RULE_print = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "expr", "shorthand", "equation", "print"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
<<<<<<< HEAD
			null, "'('", "')'", "'++'", "'--'", "'='", "'+='", "'-='", "'*='", "'/='", 
			"'^='", "'\"'", "','", "'print'", "'+'", "'-'", "'*'", "'/'", "'^'", 
			"'!'", "'&&'", "'||'", "'sqrt('", "'s('", "'c('", "'l('", "'e('", "'read()'"
=======
			null, "';'", "'\n'", "'('", "')'", "'++'", "'--'", "'='", "'+='", "'-='", 
			"'*='", "'/='", "'^='", "'+'", "'-'", "'*'", "'/'", "'^'", "'!'", "'&&'", 
			"'||'", "'sqrt('", "'s('", "'c('", "'l('", "'e('", "'read()'"
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
<<<<<<< HEAD
			null, "PRINT", "PLUS", "MINUS", "MULT", "DIV", "POW", "NOT", "AND", "OR", 
			"SQRT", "SIN", "COS", "LOG", "EXP", "READ", "NEWLINE", "COMMENT", "INLINE_COMMENT", 
=======
			null, "PLUS", "MINUS", "MULT", "DIV", "POW", "NOT", "AND", "OR", "SQRT", 
			"SIN", "COS", "LOG", "EXP", "READ", "NEWLINE", "COMMENT", "INLINE_COMMENT", 
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
			"ID", "DOUBLE", "WS", "ZERO_ERROR", "NEGATIVE_SQRT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	 
	    HashMap<String, Double> hmap = new HashMap<String, Double>();
	    Scanner scnr = new Scanner(System.in);

	public CalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(13); 
=======
			setState(10);
			line();
			setState(16);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(11);
					match(T__0);
					setState(12);
					match(T__1);
					setState(13);
					line();
					}
					} 
				}
				setState(18);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(20);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
<<<<<<< HEAD
				{
				setState(12);
				line();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << PRINT) | (1L << MINUS) | (1L << NOT) | (1L << SQRT) | (1L << SIN) | (1L << COS) | (1L << LOG) | (1L << EXP) | (1L << NEWLINE) | (1L << ID) | (1L << DOUBLE))) != 0) );
=======
				setState(19);
				match(T__0);
				}
			}

>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public ExprContext expr;
		public ShorthandContext shorthand;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<ShorthandContext> shorthand() {
			return getRuleContexts(ShorthandContext.class);
		}
		public ShorthandContext shorthand(int i) {
			return getRuleContext(ShorthandContext.class,i);
		}
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CalculatorParser.NEWLINE, 0); }
		public TerminalNode PRINT() { return getToken(CalculatorParser.PRINT, 0); }
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
<<<<<<< HEAD
			setState(37);
=======
			setState(38);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(17);
=======
				setState(22);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
				((LineContext)_localctx).expr = expr(0);
				 if(!Double.isNaN(((LineContext)_localctx).expr.val)){System.out.println("result: "+ Double.toString(((LineContext)_localctx).expr.val));} 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(20);
=======
				setState(25);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
				((LineContext)_localctx).shorthand = shorthand();
				 System.out.println("result: "+ Double.toString(((LineContext)_localctx).shorthand.val)); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< HEAD
				setState(23);
=======
				setState(28);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
				equation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
<<<<<<< HEAD
				setState(24);
=======
				setState(29);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
				match(NEWLINE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
<<<<<<< HEAD
				setState(25);
				match(PRINT);
				setState(26);
				print();
				 System.out.println(); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(29);
				shorthand();
				setState(33);
=======
				setState(30);
				shorthand();
				setState(34);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
<<<<<<< HEAD
					setState(30);
=======
					setState(31);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
					expr(0);
					}
					break;
				case 2:
					{
<<<<<<< HEAD
					setState(31);
=======
					setState(32);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
					equation();
					}
					break;
				case 3:
					{
<<<<<<< HEAD
					setState(32);
=======
					setState(33);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
					shorthand();
					}
					break;
				}
				 System.out.println("Parsing Error"); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Double val;
		public ExprContext el;
		public ExprContext expr;
		public Token DOUBLE;
		public Token ID;
		public Token op;
		public ExprContext er;
		public TerminalNode MINUS() { return getToken(CalculatorParser.MINUS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DOUBLE() { return getToken(CalculatorParser.DOUBLE, 0); }
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public TerminalNode NOT() { return getToken(CalculatorParser.NOT, 0); }
		public TerminalNode SQRT() { return getToken(CalculatorParser.SQRT, 0); }
		public TerminalNode SIN() { return getToken(CalculatorParser.SIN, 0); }
		public TerminalNode COS() { return getToken(CalculatorParser.COS, 0); }
		public TerminalNode LOG() { return getToken(CalculatorParser.LOG, 0); }
		public TerminalNode EXP() { return getToken(CalculatorParser.EXP, 0); }
		public TerminalNode READ() { return getToken(CalculatorParser.READ, 0); }
		public TerminalNode POW() { return getToken(CalculatorParser.POW, 0); }
		public TerminalNode MULT() { return getToken(CalculatorParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(CalculatorParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(CalculatorParser.PLUS, 0); }
		public TerminalNode AND() { return getToken(CalculatorParser.AND, 0); }
		public TerminalNode OR() { return getToken(CalculatorParser.OR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(82);
=======
			setState(85);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
<<<<<<< HEAD
				setState(40);
				match(MINUS);
				setState(41);
				((ExprContext)_localctx).expr = expr(15);
=======
				setState(41);
				match(MINUS);
				setState(42);
				((ExprContext)_localctx).expr = expr(16);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
				 ((ExprContext)_localctx).val =  ((ExprContext)_localctx).expr.val * -1; 
				}
				break;
			case T__2:
				{
<<<<<<< HEAD
				setState(44);
				match(T__0);
				setState(45);
				((ExprContext)_localctx).expr = expr(0);
				setState(46);
				match(T__1);
=======
				setState(45);
				match(T__2);
				setState(46);
				((ExprContext)_localctx).expr = expr(0);
				setState(47);
				match(T__3);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
				((ExprContext)_localctx).val =  ((ExprContext)_localctx).expr.val;
				}
				break;
			case DOUBLE:
				{
<<<<<<< HEAD
				setState(49);
=======
				setState(50);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
				((ExprContext)_localctx).DOUBLE = match(DOUBLE);
				 ((ExprContext)_localctx).val = Double.parseDouble((((ExprContext)_localctx).DOUBLE!=null?((ExprContext)_localctx).DOUBLE.getText():null)); 
				}
				break;
			case ID:
				{
<<<<<<< HEAD
				setState(51);
=======
				setState(52);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
				((ExprContext)_localctx).ID = match(ID);
				 ((ExprContext)_localctx).val = hmap.getOrDefault((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null), 0.0);
				}
				break;
			case NOT:
				{
<<<<<<< HEAD
				setState(53);
				match(NOT);
				setState(54);
				((ExprContext)_localctx).expr = expr(8);
=======
				setState(54);
				match(NOT);
				setState(55);
				((ExprContext)_localctx).expr = expr(9);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
				 if(((ExprContext)_localctx).expr.val == 0.0){((ExprContext)_localctx).val =  1.0;} else {((ExprContext)_localctx).val =  0.0;} 
				}
				break;
			case SQRT:
				{
<<<<<<< HEAD
				setState(57);
				match(SQRT);
				setState(58);
				((ExprContext)_localctx).expr = expr(0);
				setState(59);
				match(T__1);
=======
				setState(58);
				match(SQRT);
				setState(59);
				((ExprContext)_localctx).expr = expr(0);
				setState(60);
				match(T__3);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
				 if(((ExprContext)_localctx).expr.val < 0){((ExprContext)_localctx).val =  Double.NaN; 
				        System.out.println("Runtime error (func=(main), adr=6): Square root of a negative number"); }
				        else{((ExprContext)_localctx).val =  Math.sqrt(((ExprContext)_localctx).expr.val);} 
				}
				break;
			case SIN:
				{
<<<<<<< HEAD
				setState(62);
				match(SIN);
				setState(63);
				((ExprContext)_localctx).expr = expr(0);
				setState(64);
				match(T__1);
=======
				setState(63);
				match(SIN);
				setState(64);
				((ExprContext)_localctx).expr = expr(0);
				setState(65);
				match(T__3);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
				 ((ExprContext)_localctx).val =  Math.sin(((ExprContext)_localctx).expr.val); 
				}
				break;
			case COS:
				{
<<<<<<< HEAD
				setState(67);
				match(COS);
				setState(68);
				((ExprContext)_localctx).expr = expr(0);
				setState(69);
				match(T__1);
=======
				setState(68);
				match(COS);
				setState(69);
				((ExprContext)_localctx).expr = expr(0);
				setState(70);
				match(T__3);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
				 ((ExprContext)_localctx).val =  Math.cos(((ExprContext)_localctx).expr.val); 
				}
				break;
			case LOG:
				{
<<<<<<< HEAD
				setState(72);
				match(LOG);
				setState(73);
				((ExprContext)_localctx).expr = expr(0);
				setState(74);
				match(T__1);
=======
				setState(73);
				match(LOG);
				setState(74);
				((ExprContext)_localctx).expr = expr(0);
				setState(75);
				match(T__3);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
				 ((ExprContext)_localctx).val =  Math.log(((ExprContext)_localctx).expr.val); 
				}
				break;
			case EXP:
				{
<<<<<<< HEAD
				setState(77);
				match(EXP);
				setState(78);
				((ExprContext)_localctx).expr = expr(0);
				setState(79);
				match(T__1);
=======
				setState(78);
				match(EXP);
				setState(79);
				((ExprContext)_localctx).expr = expr(0);
				setState(80);
				match(T__3);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
				 ((ExprContext)_localctx).val =  Math.exp(((ExprContext)_localctx).expr.val); 
				}
				break;
			case READ:
				{
				setState(83);
				match(READ);
				 ((ExprContext)_localctx).val =  scnr.nextDouble(); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
<<<<<<< HEAD
			setState(111);
=======
			setState(114);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
<<<<<<< HEAD
					setState(109);
=======
					setState(112);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
<<<<<<< HEAD
						setState(84);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(85);
						((ExprContext)_localctx).op = match(POW);
						setState(86);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(14);
=======
						setState(87);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(88);
						((ExprContext)_localctx).op = match(POW);
						setState(89);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(15);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
						 ((ExprContext)_localctx).val =  Math.pow(((ExprContext)_localctx).el.val,((ExprContext)_localctx).er.val);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
<<<<<<< HEAD
						setState(89);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(90);
=======
						setState(92);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(93);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
<<<<<<< HEAD
						setState(91);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(13);
=======
						setState(94);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(14);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
						 if((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null).equals("*")){((ExprContext)_localctx).val = ((ExprContext)_localctx).el.val*((ExprContext)_localctx).er.val;} 
						                  else { if(((ExprContext)_localctx).er.val != 0.0){((ExprContext)_localctx).val = ((ExprContext)_localctx).el.val/((ExprContext)_localctx).er.val;}
						                          else{((ExprContext)_localctx).val = Double.NaN; System.out.println("Runtime error (func=(main), adr=6): Divide by zero");}} 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
<<<<<<< HEAD
						setState(94);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(95);
=======
						setState(97);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(98);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
<<<<<<< HEAD
						setState(96);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(12);
=======
						setState(99);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(13);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
						 if((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null).equals("+")){((ExprContext)_localctx).val = ((ExprContext)_localctx).el.val+((ExprContext)_localctx).er.val;} else {((ExprContext)_localctx).val = ((ExprContext)_localctx).el.val-((ExprContext)_localctx).er.val;} 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
<<<<<<< HEAD
						setState(99);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(100);
						((ExprContext)_localctx).op = match(AND);
						setState(101);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(8);
=======
						setState(102);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(103);
						((ExprContext)_localctx).op = match(AND);
						setState(104);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(9);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
						 if(((ExprContext)_localctx).el.val != 0.0 && ((ExprContext)_localctx).er.val != 0.0){((ExprContext)_localctx).val =  1.0;} else{((ExprContext)_localctx).val =  0.0;} 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
<<<<<<< HEAD
						setState(104);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(105);
						((ExprContext)_localctx).op = match(OR);
						setState(106);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(7);
=======
						setState(107);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(108);
						((ExprContext)_localctx).op = match(OR);
						setState(109);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(8);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
						 if(((ExprContext)_localctx).el.val != 0.0 || ((ExprContext)_localctx).er.val != 0.0){((ExprContext)_localctx).val =  1.0;} else{((ExprContext)_localctx).val =  0.0;} 
						}
						break;
					}
					} 
				}
<<<<<<< HEAD
				setState(113);
=======
				setState(116);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShorthandContext extends ParserRuleContext {
		public Double val;
		public Token ID;
		public Token op;
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public ShorthandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shorthand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterShorthand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitShorthand(this);
		}
	}

	public final ShorthandContext shorthand() throws RecognitionException {
		ShorthandContext _localctx = new ShorthandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_shorthand);
		try {
<<<<<<< HEAD
			setState(126);
=======
			setState(129);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(114);
				((ShorthandContext)_localctx).ID = match(ID);
				setState(115);
				((ShorthandContext)_localctx).op = match(T__2);
=======
				setState(117);
				((ShorthandContext)_localctx).ID = match(ID);
				setState(118);
				((ShorthandContext)_localctx).op = match(T__4);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
				 hmap.put((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null), hmap.getOrDefault((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null),0.0) + 1); ((ShorthandContext)_localctx).val = hmap.getOrDefault((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null),0.0)-1;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(117);
				((ShorthandContext)_localctx).op = match(T__2);
				setState(118);
=======
				setState(120);
				((ShorthandContext)_localctx).op = match(T__4);
				setState(121);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
				((ShorthandContext)_localctx).ID = match(ID);
				 hmap.put((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null), hmap.getOrDefault((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null),0.0) + 1); ((ShorthandContext)_localctx).val = hmap.getOrDefault((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null),0.0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< HEAD
				setState(120);
				((ShorthandContext)_localctx).ID = match(ID);
				setState(121);
				((ShorthandContext)_localctx).op = match(T__3);
=======
				setState(123);
				((ShorthandContext)_localctx).ID = match(ID);
				setState(124);
				((ShorthandContext)_localctx).op = match(T__5);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
				 hmap.put((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null), hmap.getOrDefault((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null),0.0) - 1); ((ShorthandContext)_localctx).val = hmap.getOrDefault((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null),0.0)+1;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
<<<<<<< HEAD
				setState(123);
				((ShorthandContext)_localctx).op = match(T__3);
				setState(124);
=======
				setState(126);
				((ShorthandContext)_localctx).op = match(T__5);
				setState(127);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
				((ShorthandContext)_localctx).ID = match(ID);
				 hmap.put((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null), hmap.getOrDefault((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null),0.0) - 1); ((ShorthandContext)_localctx).val = hmap.getOrDefault((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null),0.0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EquationContext extends ParserRuleContext {
		public Double val;
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode READ() { return getToken(CalculatorParser.READ, 0); }
		public EquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterEquation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitEquation(this);
		}
	}

	public final EquationContext equation() throws RecognitionException {
		EquationContext _localctx = new EquationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_equation);
		try {
<<<<<<< HEAD
			setState(162);
=======
			setState(165);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(128);
				((EquationContext)_localctx).ID = match(ID);
				setState(129);
				match(T__4);
				setState(130);
=======
				setState(131);
				((EquationContext)_localctx).ID = match(ID);
				setState(132);
				match(T__6);
				setState(133);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
				((EquationContext)_localctx).expr = expr(0);
				 hmap.put((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null), ((EquationContext)_localctx).expr.val); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(133);
				((EquationContext)_localctx).ID = match(ID);
				setState(134);
				match(T__5);
				setState(135);
=======
				setState(136);
				((EquationContext)_localctx).ID = match(ID);
				setState(137);
				match(T__7);
				setState(138);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
				((EquationContext)_localctx).expr = expr(0);
				 hmap.put((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null), hmap.getOrDefault((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null),0.0) + ((EquationContext)_localctx).expr.val); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< HEAD
				setState(138);
				((EquationContext)_localctx).ID = match(ID);
				setState(139);
				match(T__6);
				setState(140);
=======
				setState(141);
				((EquationContext)_localctx).ID = match(ID);
				setState(142);
				match(T__8);
				setState(143);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
				((EquationContext)_localctx).expr = expr(0);
				 hmap.put((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null), hmap.getOrDefault((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null),0.0) - ((EquationContext)_localctx).expr.val); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
<<<<<<< HEAD
				setState(143);
				((EquationContext)_localctx).ID = match(ID);
				setState(144);
				match(T__7);
				setState(145);
=======
				setState(146);
				((EquationContext)_localctx).ID = match(ID);
				setState(147);
				match(T__9);
				setState(148);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
				((EquationContext)_localctx).expr = expr(0);
				 hmap.put((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null), hmap.getOrDefault((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null),0.0) * ((EquationContext)_localctx).expr.val); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
<<<<<<< HEAD
				setState(148);
				((EquationContext)_localctx).ID = match(ID);
				setState(149);
				match(T__8);
				setState(150);
=======
				setState(151);
				((EquationContext)_localctx).ID = match(ID);
				setState(152);
				match(T__10);
				setState(153);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
				((EquationContext)_localctx).expr = expr(0);
				 hmap.put((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null), hmap.getOrDefault((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null),0.0) / ((EquationContext)_localctx).expr.val); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
<<<<<<< HEAD
				setState(153);
				((EquationContext)_localctx).ID = match(ID);
				setState(154);
				match(T__9);
				setState(155);
=======
				setState(156);
				((EquationContext)_localctx).ID = match(ID);
				setState(157);
				match(T__11);
				setState(158);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
				((EquationContext)_localctx).expr = expr(0);
				 hmap.put((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null), Math.pow(hmap.getOrDefault((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null),0.0), ((EquationContext)_localctx).expr.val)); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
<<<<<<< HEAD
				setState(158);
				((EquationContext)_localctx).ID = match(ID);
				setState(159);
				match(T__4);
				setState(160);
=======
				setState(161);
				((EquationContext)_localctx).ID = match(ID);
				setState(162);
				match(T__6);
				setState(163);
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
				match(READ);
				 double toAdd = scnr.nextDouble(); hmap.put((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null), toAdd); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public Token ID;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculatorListener ) ((CalculatorListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_print);
		int _la;
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(T__10);
				setState(165);
				((PrintContext)_localctx).ID = match(ID);
				setState(166);
				match(T__10);
				System.out.print((((PrintContext)_localctx).ID!=null?((PrintContext)_localctx).ID.getText():null)); 
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(168);
					match(T__11);
					setState(169);
					print();
					}
				}

				}
				break;
			case T__0:
			case MINUS:
			case NOT:
			case SQRT:
			case SIN:
			case COS:
			case LOG:
			case EXP:
			case ID:
			case DOUBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				((PrintContext)_localctx).expr = expr(0);
				System.out.print(((PrintContext)_localctx).expr.val); 
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(174);
					match(T__11);
					setState(175);
					print();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
<<<<<<< HEAD
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00b7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3$\n\3"+
		"\3\3\3\3\5\3(\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4U\n\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\7\4p\n\4\f\4\16\4s\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5\u0081\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a5\n\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7\u00ad\n\7\3\7\3\7\3\7\3\7\5\7\u00b3\n\7\5\7\u00b5\n\7\3\7\2\3\6\b"+
		"\2\4\6\b\n\f\2\4\3\2\22\23\3\2\20\21\2\u00d2\2\17\3\2\2\2\4\'\3\2\2\2"+
		"\6T\3\2\2\2\b\u0080\3\2\2\2\n\u00a4\3\2\2\2\f\u00b4\3\2\2\2\16\20\5\4"+
		"\3\2\17\16\3\2\2\2\20\21\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\3\3\2"+
		"\2\2\23\24\5\6\4\2\24\25\b\3\1\2\25(\3\2\2\2\26\27\5\b\5\2\27\30\b\3\1"+
		"\2\30(\3\2\2\2\31(\5\n\6\2\32(\7\36\2\2\33\34\7\17\2\2\34\35\5\f\7\2\35"+
		"\36\b\3\1\2\36(\3\2\2\2\37#\5\b\5\2 $\5\6\4\2!$\5\n\6\2\"$\5\b\5\2# \3"+
		"\2\2\2#!\3\2\2\2#\"\3\2\2\2$%\3\2\2\2%&\b\3\1\2&(\3\2\2\2\'\23\3\2\2\2"+
		"\'\26\3\2\2\2\'\31\3\2\2\2\'\32\3\2\2\2\'\33\3\2\2\2\'\37\3\2\2\2(\5\3"+
		"\2\2\2)*\b\4\1\2*+\7\21\2\2+,\5\6\4\21,-\b\4\1\2-U\3\2\2\2./\7\3\2\2/"+
		"\60\5\6\4\2\60\61\7\4\2\2\61\62\b\4\1\2\62U\3\2\2\2\63\64\7\"\2\2\64U"+
		"\b\4\1\2\65\66\7!\2\2\66U\b\4\1\2\678\7\25\2\289\5\6\4\n9:\b\4\1\2:U\3"+
		"\2\2\2;<\7\30\2\2<=\5\6\4\2=>\7\4\2\2>?\b\4\1\2?U\3\2\2\2@A\7\31\2\2A"+
		"B\5\6\4\2BC\7\4\2\2CD\b\4\1\2DU\3\2\2\2EF\7\32\2\2FG\5\6\4\2GH\7\4\2\2"+
		"HI\b\4\1\2IU\3\2\2\2JK\7\33\2\2KL\5\6\4\2LM\7\4\2\2MN\b\4\1\2NU\3\2\2"+
		"\2OP\7\34\2\2PQ\5\6\4\2QR\7\4\2\2RS\b\4\1\2SU\3\2\2\2T)\3\2\2\2T.\3\2"+
		"\2\2T\63\3\2\2\2T\65\3\2\2\2T\67\3\2\2\2T;\3\2\2\2T@\3\2\2\2TE\3\2\2\2"+
		"TJ\3\2\2\2TO\3\2\2\2Uq\3\2\2\2VW\f\17\2\2WX\7\24\2\2XY\5\6\4\20YZ\b\4"+
		"\1\2Zp\3\2\2\2[\\\f\16\2\2\\]\t\2\2\2]^\5\6\4\17^_\b\4\1\2_p\3\2\2\2`"+
		"a\f\r\2\2ab\t\3\2\2bc\5\6\4\16cd\b\4\1\2dp\3\2\2\2ef\f\t\2\2fg\7\26\2"+
		"\2gh\5\6\4\nhi\b\4\1\2ip\3\2\2\2jk\f\b\2\2kl\7\27\2\2lm\5\6\4\tmn\b\4"+
		"\1\2np\3\2\2\2oV\3\2\2\2o[\3\2\2\2o`\3\2\2\2oe\3\2\2\2oj\3\2\2\2ps\3\2"+
		"\2\2qo\3\2\2\2qr\3\2\2\2r\7\3\2\2\2sq\3\2\2\2tu\7!\2\2uv\7\5\2\2v\u0081"+
		"\b\5\1\2wx\7\5\2\2xy\7!\2\2y\u0081\b\5\1\2z{\7!\2\2{|\7\6\2\2|\u0081\b"+
		"\5\1\2}~\7\6\2\2~\177\7!\2\2\177\u0081\b\5\1\2\u0080t\3\2\2\2\u0080w\3"+
		"\2\2\2\u0080z\3\2\2\2\u0080}\3\2\2\2\u0081\t\3\2\2\2\u0082\u0083\7!\2"+
		"\2\u0083\u0084\7\7\2\2\u0084\u0085\5\6\4\2\u0085\u0086\b\6\1\2\u0086\u00a5"+
		"\3\2\2\2\u0087\u0088\7!\2\2\u0088\u0089\7\b\2\2\u0089\u008a\5\6\4\2\u008a"+
		"\u008b\b\6\1\2\u008b\u00a5\3\2\2\2\u008c\u008d\7!\2\2\u008d\u008e\7\t"+
		"\2\2\u008e\u008f\5\6\4\2\u008f\u0090\b\6\1\2\u0090\u00a5\3\2\2\2\u0091"+
		"\u0092\7!\2\2\u0092\u0093\7\n\2\2\u0093\u0094\5\6\4\2\u0094\u0095\b\6"+
		"\1\2\u0095\u00a5\3\2\2\2\u0096\u0097\7!\2\2\u0097\u0098\7\13\2\2\u0098"+
		"\u0099\5\6\4\2\u0099\u009a\b\6\1\2\u009a\u00a5\3\2\2\2\u009b\u009c\7!"+
		"\2\2\u009c\u009d\7\f\2\2\u009d\u009e\5\6\4\2\u009e\u009f\b\6\1\2\u009f"+
		"\u00a5\3\2\2\2\u00a0\u00a1\7!\2\2\u00a1\u00a2\7\7\2\2\u00a2\u00a3\7\35"+
		"\2\2\u00a3\u00a5\b\6\1\2\u00a4\u0082\3\2\2\2\u00a4\u0087\3\2\2\2\u00a4"+
		"\u008c\3\2\2\2\u00a4\u0091\3\2\2\2\u00a4\u0096\3\2\2\2\u00a4\u009b\3\2"+
		"\2\2\u00a4\u00a0\3\2\2\2\u00a5\13\3\2\2\2\u00a6\u00a7\7\r\2\2\u00a7\u00a8"+
		"\7!\2\2\u00a8\u00a9\7\r\2\2\u00a9\u00ac\b\7\1\2\u00aa\u00ab\7\16\2\2\u00ab"+
		"\u00ad\5\f\7\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b5\3\2"+
		"\2\2\u00ae\u00af\5\6\4\2\u00af\u00b2\b\7\1\2\u00b0\u00b1\7\16\2\2\u00b1"+
		"\u00b3\5\f\7\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2"+
		"\2\2\u00b4\u00a6\3\2\2\2\u00b4\u00ae\3\2\2\2\u00b5\r\3\2\2\2\r\21#\'T"+
		"oq\u0080\u00a4\u00ac\u00b2\u00b4";
=======
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00aa\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\7\2\21\n\2\f\2\16\2\24"+
		"\13\2\3\2\5\2\27\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3%\n\3\3\3\3\3\5\3)\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4X"+
		"\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4s\n\4\f\4\16\4v\13\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0084\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a8\n\6\3\6\2\3\6"+
		"\7\2\4\6\b\n\2\4\3\2\21\22\3\2\17\20\2\u00c4\2\f\3\2\2\2\4(\3\2\2\2\6"+
		"W\3\2\2\2\b\u0083\3\2\2\2\n\u00a7\3\2\2\2\f\22\5\4\3\2\r\16\7\3\2\2\16"+
		"\17\7\4\2\2\17\21\5\4\3\2\20\r\3\2\2\2\21\24\3\2\2\2\22\20\3\2\2\2\22"+
		"\23\3\2\2\2\23\26\3\2\2\2\24\22\3\2\2\2\25\27\7\3\2\2\26\25\3\2\2\2\26"+
		"\27\3\2\2\2\27\3\3\2\2\2\30\31\5\6\4\2\31\32\b\3\1\2\32)\3\2\2\2\33\34"+
		"\5\b\5\2\34\35\b\3\1\2\35)\3\2\2\2\36)\5\n\6\2\37)\7\35\2\2 $\5\b\5\2"+
		"!%\5\6\4\2\"%\5\n\6\2#%\5\b\5\2$!\3\2\2\2$\"\3\2\2\2$#\3\2\2\2%&\3\2\2"+
		"\2&\'\b\3\1\2\')\3\2\2\2(\30\3\2\2\2(\33\3\2\2\2(\36\3\2\2\2(\37\3\2\2"+
		"\2( \3\2\2\2)\5\3\2\2\2*+\b\4\1\2+,\7\20\2\2,-\5\6\4\22-.\b\4\1\2.X\3"+
		"\2\2\2/\60\7\5\2\2\60\61\5\6\4\2\61\62\7\6\2\2\62\63\b\4\1\2\63X\3\2\2"+
		"\2\64\65\7!\2\2\65X\b\4\1\2\66\67\7 \2\2\67X\b\4\1\289\7\24\2\29:\5\6"+
		"\4\13:;\b\4\1\2;X\3\2\2\2<=\7\27\2\2=>\5\6\4\2>?\7\6\2\2?@\b\4\1\2@X\3"+
		"\2\2\2AB\7\30\2\2BC\5\6\4\2CD\7\6\2\2DE\b\4\1\2EX\3\2\2\2FG\7\31\2\2G"+
		"H\5\6\4\2HI\7\6\2\2IJ\b\4\1\2JX\3\2\2\2KL\7\32\2\2LM\5\6\4\2MN\7\6\2\2"+
		"NO\b\4\1\2OX\3\2\2\2PQ\7\33\2\2QR\5\6\4\2RS\7\6\2\2ST\b\4\1\2TX\3\2\2"+
		"\2UV\7\34\2\2VX\b\4\1\2W*\3\2\2\2W/\3\2\2\2W\64\3\2\2\2W\66\3\2\2\2W8"+
		"\3\2\2\2W<\3\2\2\2WA\3\2\2\2WF\3\2\2\2WK\3\2\2\2WP\3\2\2\2WU\3\2\2\2X"+
		"t\3\2\2\2YZ\f\20\2\2Z[\7\23\2\2[\\\5\6\4\21\\]\b\4\1\2]s\3\2\2\2^_\f\17"+
		"\2\2_`\t\2\2\2`a\5\6\4\20ab\b\4\1\2bs\3\2\2\2cd\f\16\2\2de\t\3\2\2ef\5"+
		"\6\4\17fg\b\4\1\2gs\3\2\2\2hi\f\n\2\2ij\7\25\2\2jk\5\6\4\13kl\b\4\1\2"+
		"ls\3\2\2\2mn\f\t\2\2no\7\26\2\2op\5\6\4\npq\b\4\1\2qs\3\2\2\2rY\3\2\2"+
		"\2r^\3\2\2\2rc\3\2\2\2rh\3\2\2\2rm\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2"+
		"\2u\7\3\2\2\2vt\3\2\2\2wx\7 \2\2xy\7\7\2\2y\u0084\b\5\1\2z{\7\7\2\2{|"+
		"\7 \2\2|\u0084\b\5\1\2}~\7 \2\2~\177\7\b\2\2\177\u0084\b\5\1\2\u0080\u0081"+
		"\7\b\2\2\u0081\u0082\7 \2\2\u0082\u0084\b\5\1\2\u0083w\3\2\2\2\u0083z"+
		"\3\2\2\2\u0083}\3\2\2\2\u0083\u0080\3\2\2\2\u0084\t\3\2\2\2\u0085\u0086"+
		"\7 \2\2\u0086\u0087\7\t\2\2\u0087\u0088\5\6\4\2\u0088\u0089\b\6\1\2\u0089"+
		"\u00a8\3\2\2\2\u008a\u008b\7 \2\2\u008b\u008c\7\n\2\2\u008c\u008d\5\6"+
		"\4\2\u008d\u008e\b\6\1\2\u008e\u00a8\3\2\2\2\u008f\u0090\7 \2\2\u0090"+
		"\u0091\7\13\2\2\u0091\u0092\5\6\4\2\u0092\u0093\b\6\1\2\u0093\u00a8\3"+
		"\2\2\2\u0094\u0095\7 \2\2\u0095\u0096\7\f\2\2\u0096\u0097\5\6\4\2\u0097"+
		"\u0098\b\6\1\2\u0098\u00a8\3\2\2\2\u0099\u009a\7 \2\2\u009a\u009b\7\r"+
		"\2\2\u009b\u009c\5\6\4\2\u009c\u009d\b\6\1\2\u009d\u00a8\3\2\2\2\u009e"+
		"\u009f\7 \2\2\u009f\u00a0\7\16\2\2\u00a0\u00a1\5\6\4\2\u00a1\u00a2\b\6"+
		"\1\2\u00a2\u00a8\3\2\2\2\u00a3\u00a4\7 \2\2\u00a4\u00a5\7\t\2\2\u00a5"+
		"\u00a6\7\34\2\2\u00a6\u00a8\b\6\1\2\u00a7\u0085\3\2\2\2\u00a7\u008a\3"+
		"\2\2\2\u00a7\u008f\3\2\2\2\u00a7\u0094\3\2\2\2\u00a7\u0099\3\2\2\2\u00a7"+
		"\u009e\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a8\13\3\2\2\2\13\22\26$(Wrt\u0083"+
		"\u00a7";
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}