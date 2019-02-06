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
		T__9=10, T__10=11, T__11=12, PRINT=13, PLUS=14, MINUS=15, MULT=16, DIV=17, 
		POW=18, NOT=19, AND=20, OR=21, SQRT=22, SIN=23, COS=24, LOG=25, EXP=26, 
		READ=27, NEWLINE=28, COMMENT=29, INLINE_COMMENT=30, ID=31, DOUBLE=32, 
		WS=33, ZERO_ERROR=34, NEGATIVE_SQRT=35;
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
			null, "'('", "')'", "'++'", "'--'", "'='", "'+='", "'-='", "'*='", "'/='", 
			"'^='", "'\"'", "','", "'print'", "'+'", "'-'", "'*'", "'/'", "'^'", 
			"'!'", "'&&'", "'||'", "'sqrt('", "'s('", "'c('", "'l('", "'e('", "'read()'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "PRINT", "PLUS", "MINUS", "MULT", "DIV", "POW", "NOT", "AND", "OR", 
			"SQRT", "SIN", "COS", "LOG", "EXP", "READ", "NEWLINE", "COMMENT", "INLINE_COMMENT", 
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
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				line();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << PRINT) | (1L << MINUS) | (1L << NOT) | (1L << SQRT) | (1L << SIN) | (1L << COS) | (1L << LOG) | (1L << EXP) | (1L << NEWLINE) | (1L << ID) | (1L << DOUBLE))) != 0) );
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
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				((LineContext)_localctx).expr = expr(0);
				 if(!Double.isNaN(((LineContext)_localctx).expr.val)){System.out.println("result: "+ Double.toString(((LineContext)_localctx).expr.val));} 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				((LineContext)_localctx).shorthand = shorthand();
				 System.out.println("result: "+ Double.toString(((LineContext)_localctx).shorthand.val)); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(23);
				equation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(24);
				match(NEWLINE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
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
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(30);
					expr(0);
					}
					break;
				case 2:
					{
					setState(31);
					equation();
					}
					break;
				case 3:
					{
					setState(32);
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
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				setState(40);
				match(MINUS);
				setState(41);
				((ExprContext)_localctx).expr = expr(15);
				 ((ExprContext)_localctx).val =  ((ExprContext)_localctx).expr.val * -1; 
				}
				break;
			case T__0:
				{
				setState(44);
				match(T__0);
				setState(45);
				((ExprContext)_localctx).expr = expr(0);
				setState(46);
				match(T__1);
				((ExprContext)_localctx).val =  ((ExprContext)_localctx).expr.val;
				}
				break;
			case DOUBLE:
				{
				setState(49);
				((ExprContext)_localctx).DOUBLE = match(DOUBLE);
				 ((ExprContext)_localctx).val = Double.parseDouble((((ExprContext)_localctx).DOUBLE!=null?((ExprContext)_localctx).DOUBLE.getText():null)); 
				}
				break;
			case ID:
				{
				setState(51);
				((ExprContext)_localctx).ID = match(ID);
				 ((ExprContext)_localctx).val = hmap.getOrDefault((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null), 0.0);
				}
				break;
			case NOT:
				{
				setState(53);
				match(NOT);
				setState(54);
				((ExprContext)_localctx).expr = expr(8);
				 if(((ExprContext)_localctx).expr.val == 0.0){((ExprContext)_localctx).val =  1.0;} else {((ExprContext)_localctx).val =  0.0;} 
				}
				break;
			case SQRT:
				{
				setState(57);
				match(SQRT);
				setState(58);
				((ExprContext)_localctx).expr = expr(0);
				setState(59);
				match(T__1);
				 if(((ExprContext)_localctx).expr.val < 0){((ExprContext)_localctx).val =  Double.NaN; 
				        System.out.println("Runtime error (func=(main), adr=6): Square root of a negative number"); }
				        else{((ExprContext)_localctx).val =  Math.sqrt(((ExprContext)_localctx).expr.val);} 
				}
				break;
			case SIN:
				{
				setState(62);
				match(SIN);
				setState(63);
				((ExprContext)_localctx).expr = expr(0);
				setState(64);
				match(T__1);
				 ((ExprContext)_localctx).val =  Math.sin(((ExprContext)_localctx).expr.val); 
				}
				break;
			case COS:
				{
				setState(67);
				match(COS);
				setState(68);
				((ExprContext)_localctx).expr = expr(0);
				setState(69);
				match(T__1);
				 ((ExprContext)_localctx).val =  Math.cos(((ExprContext)_localctx).expr.val); 
				}
				break;
			case LOG:
				{
				setState(72);
				match(LOG);
				setState(73);
				((ExprContext)_localctx).expr = expr(0);
				setState(74);
				match(T__1);
				 ((ExprContext)_localctx).val =  Math.log(((ExprContext)_localctx).expr.val); 
				}
				break;
			case EXP:
				{
				setState(77);
				match(EXP);
				setState(78);
				((ExprContext)_localctx).expr = expr(0);
				setState(79);
				match(T__1);
				 ((ExprContext)_localctx).val =  Math.exp(((ExprContext)_localctx).expr.val); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(109);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(84);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(85);
						((ExprContext)_localctx).op = match(POW);
						setState(86);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(14);
						 ((ExprContext)_localctx).val =  Math.pow(((ExprContext)_localctx).el.val,((ExprContext)_localctx).er.val);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(89);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(90);
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
						setState(91);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(13);
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
						setState(94);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(95);
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
						setState(96);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(12);
						 if((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null).equals("+")){((ExprContext)_localctx).val = ((ExprContext)_localctx).el.val+((ExprContext)_localctx).er.val;} else {((ExprContext)_localctx).val = ((ExprContext)_localctx).el.val-((ExprContext)_localctx).er.val;} 
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(99);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(100);
						((ExprContext)_localctx).op = match(AND);
						setState(101);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(8);
						 if(((ExprContext)_localctx).el.val != 0.0 && ((ExprContext)_localctx).er.val != 0.0){((ExprContext)_localctx).val =  1.0;} else{((ExprContext)_localctx).val =  0.0;} 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(104);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(105);
						((ExprContext)_localctx).op = match(OR);
						setState(106);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(7);
						 if(((ExprContext)_localctx).el.val != 0.0 || ((ExprContext)_localctx).er.val != 0.0){((ExprContext)_localctx).val =  1.0;} else{((ExprContext)_localctx).val =  0.0;} 
						}
						break;
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				((ShorthandContext)_localctx).ID = match(ID);
				setState(115);
				((ShorthandContext)_localctx).op = match(T__2);
				 hmap.put((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null), hmap.getOrDefault((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null),0.0) + 1); ((ShorthandContext)_localctx).val = hmap.getOrDefault((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null),0.0)-1;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				((ShorthandContext)_localctx).op = match(T__2);
				setState(118);
				((ShorthandContext)_localctx).ID = match(ID);
				 hmap.put((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null), hmap.getOrDefault((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null),0.0) + 1); ((ShorthandContext)_localctx).val = hmap.getOrDefault((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null),0.0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				((ShorthandContext)_localctx).ID = match(ID);
				setState(121);
				((ShorthandContext)_localctx).op = match(T__3);
				 hmap.put((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null), hmap.getOrDefault((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null),0.0) - 1); ((ShorthandContext)_localctx).val = hmap.getOrDefault((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null),0.0)+1;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				((ShorthandContext)_localctx).op = match(T__3);
				setState(124);
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
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				((EquationContext)_localctx).ID = match(ID);
				setState(129);
				match(T__4);
				setState(130);
				((EquationContext)_localctx).expr = expr(0);
				 hmap.put((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null), ((EquationContext)_localctx).expr.val); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				((EquationContext)_localctx).ID = match(ID);
				setState(134);
				match(T__5);
				setState(135);
				((EquationContext)_localctx).expr = expr(0);
				 hmap.put((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null), hmap.getOrDefault((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null),0.0) + ((EquationContext)_localctx).expr.val); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				((EquationContext)_localctx).ID = match(ID);
				setState(139);
				match(T__6);
				setState(140);
				((EquationContext)_localctx).expr = expr(0);
				 hmap.put((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null), hmap.getOrDefault((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null),0.0) - ((EquationContext)_localctx).expr.val); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				((EquationContext)_localctx).ID = match(ID);
				setState(144);
				match(T__7);
				setState(145);
				((EquationContext)_localctx).expr = expr(0);
				 hmap.put((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null), hmap.getOrDefault((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null),0.0) * ((EquationContext)_localctx).expr.val); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(148);
				((EquationContext)_localctx).ID = match(ID);
				setState(149);
				match(T__8);
				setState(150);
				((EquationContext)_localctx).expr = expr(0);
				 hmap.put((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null), hmap.getOrDefault((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null),0.0) / ((EquationContext)_localctx).expr.val); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(153);
				((EquationContext)_localctx).ID = match(ID);
				setState(154);
				match(T__9);
				setState(155);
				((EquationContext)_localctx).expr = expr(0);
				 hmap.put((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null), Math.pow(hmap.getOrDefault((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null),0.0), ((EquationContext)_localctx).expr.val)); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(158);
				((EquationContext)_localctx).ID = match(ID);
				setState(159);
				match(T__4);
				setState(160);
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
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
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
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}