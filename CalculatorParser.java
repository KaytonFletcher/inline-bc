// Generated from Calculator.g4 by ANTLR 4.7.2
 
    import java.util.HashMap; 
    import java.lang.Math;

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
		T__9=10, PLUS=11, MINUS=12, MULT=13, DIV=14, POW=15, NOT=16, AND=17, OR=18, 
		SQRT=19, SIN=20, COS=21, LOG=22, EXP=23, NEWLINE=24, COMMENT=25, INLINE_COMMENT=26, 
		ID=27, DOUBLE=28, WS=29, ZERO_ERROR=30, NEGATIVE_SQRT=31;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_expr = 2, RULE_shorthand = 3, RULE_equation = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "expr", "shorthand", "equation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'++'", "'--'", "'='", "'+='", "'-='", "'*='", "'/='", 
			"'^='", "'+'", "'-'", "'*'", "'/'", "'^'", "'!'", "'&&'", "'||'", "'sqrt'", 
			"'s'", "'c'", "'l'", "'e'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "PLUS", 
			"MINUS", "MULT", "DIV", "POW", "NOT", "AND", "OR", "SQRT", "SIN", "COS", 
			"LOG", "EXP", "NEWLINE", "COMMENT", "INLINE_COMMENT", "ID", "DOUBLE", 
			"WS", "ZERO_ERROR", "NEGATIVE_SQRT"
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
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				line();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << MINUS) | (1L << NOT) | (1L << SQRT) | (1L << SIN) | (1L << COS) | (1L << LOG) | (1L << EXP) | (1L << NEWLINE) | (1L << ID) | (1L << DOUBLE) | (1L << ZERO_ERROR) | (1L << NEGATIVE_SQRT))) != 0) );
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
		public TerminalNode ZERO_ERROR() { return getToken(CalculatorParser.ZERO_ERROR, 0); }
		public TerminalNode NEGATIVE_SQRT() { return getToken(CalculatorParser.NEGATIVE_SQRT, 0); }
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
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				((LineContext)_localctx).expr = expr(0);
				 System.out.println("result: "+ Double.toString(((LineContext)_localctx).expr.val)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(18);
				((LineContext)_localctx).shorthand = shorthand();
				 System.out.println("result: "+ Double.toString(((LineContext)_localctx).shorthand.val)); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(21);
				equation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(22);
				match(NEWLINE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(23);
				match(ZERO_ERROR);
				System.out.println("Runtime error (func=(main), adr=6): Divide by zero");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(25);
				match(NEGATIVE_SQRT);
				System.out.println("Runtime error (func=(main), adr=6): Square root of a negative number");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(27);
				shorthand();
				setState(31);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(28);
					expr(0);
					}
					break;
				case 2:
					{
					setState(29);
					equation();
					}
					break;
				case 3:
					{
					setState(30);
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
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				setState(38);
				match(MINUS);
				setState(39);
				((ExprContext)_localctx).expr = expr(15);
				 ((ExprContext)_localctx).val =  ((ExprContext)_localctx).expr.val * -1; 
				}
				break;
			case T__0:
				{
				setState(42);
				match(T__0);
				setState(43);
				((ExprContext)_localctx).expr = expr(0);
				setState(44);
				match(T__1);
				((ExprContext)_localctx).val =  ((ExprContext)_localctx).expr.val;
				}
				break;
			case DOUBLE:
				{
				setState(47);
				((ExprContext)_localctx).DOUBLE = match(DOUBLE);
				 ((ExprContext)_localctx).val = Double.parseDouble((((ExprContext)_localctx).DOUBLE!=null?((ExprContext)_localctx).DOUBLE.getText():null)); 
				}
				break;
			case ID:
				{
				setState(49);
				((ExprContext)_localctx).ID = match(ID);
				 ((ExprContext)_localctx).val = hmap.getOrDefault((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null), 0.0);
				}
				break;
			case NOT:
				{
				setState(51);
				match(NOT);
				setState(52);
				((ExprContext)_localctx).expr = expr(8);
				 if(((ExprContext)_localctx).expr.val == 0.0){((ExprContext)_localctx).val =  1.0;} else {((ExprContext)_localctx).val =  0.0;} 
				}
				break;
			case SQRT:
				{
				setState(55);
				match(SQRT);
				setState(56);
				match(T__0);
				setState(57);
				((ExprContext)_localctx).expr = expr(0);
				setState(58);
				match(T__1);
				 ((ExprContext)_localctx).val =  Math.sqrt(((ExprContext)_localctx).expr.val); 
				}
				break;
			case SIN:
				{
				setState(61);
				match(SIN);
				setState(62);
				match(T__0);
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
				match(T__0);
				setState(69);
				((ExprContext)_localctx).expr = expr(0);
				setState(70);
				match(T__1);
				 ((ExprContext)_localctx).val =  Math.cos(((ExprContext)_localctx).expr.val); 
				}
				break;
			case LOG:
				{
				setState(73);
				match(LOG);
				setState(74);
				match(T__0);
				setState(75);
				((ExprContext)_localctx).expr = expr(0);
				setState(76);
				match(T__1);
				 ((ExprContext)_localctx).val =  Math.log(((ExprContext)_localctx).expr.val); 
				}
				break;
			case EXP:
				{
				setState(79);
				match(EXP);
				setState(80);
				match(T__0);
				setState(81);
				((ExprContext)_localctx).expr = expr(0);
				setState(82);
				match(T__1);
				 ((ExprContext)_localctx).val =  Math.exp(((ExprContext)_localctx).expr.val); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(112);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(87);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(88);
						((ExprContext)_localctx).op = match(POW);
						setState(89);
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
						setState(92);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(93);
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
						setState(94);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(13);
						 if((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null).equals("*")){((ExprContext)_localctx).val = ((ExprContext)_localctx).el.val*((ExprContext)_localctx).er.val;} else {((ExprContext)_localctx).val = ((ExprContext)_localctx).el.val/((ExprContext)_localctx).er.val;} 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(97);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(98);
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
						setState(99);
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
						setState(102);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(103);
						((ExprContext)_localctx).op = match(AND);
						setState(104);
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
						setState(107);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(108);
						((ExprContext)_localctx).op = match(OR);
						setState(109);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(7);
						 if(((ExprContext)_localctx).el.val != 0.0 || ((ExprContext)_localctx).er.val != 0.0){((ExprContext)_localctx).val =  1.0;} else{((ExprContext)_localctx).val =  0.0;} 
						}
						break;
					}
					} 
				}
				setState(116);
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
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				((ShorthandContext)_localctx).ID = match(ID);
				setState(118);
				((ShorthandContext)_localctx).op = match(T__2);
				 hmap.put((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null), hmap.getOrDefault((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null),0.0) + 1); ((ShorthandContext)_localctx).val = hmap.getOrDefault((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null),0.0)-1;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				((ShorthandContext)_localctx).op = match(T__2);
				setState(121);
				((ShorthandContext)_localctx).ID = match(ID);
				 hmap.put((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null), hmap.getOrDefault((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null),0.0) + 1); ((ShorthandContext)_localctx).val = hmap.getOrDefault((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null),0.0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				((ShorthandContext)_localctx).ID = match(ID);
				setState(124);
				((ShorthandContext)_localctx).op = match(T__3);
				 hmap.put((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null), hmap.getOrDefault((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null),0.0) - 1); ((ShorthandContext)_localctx).val = hmap.getOrDefault((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null),0.0)+1;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				((ShorthandContext)_localctx).op = match(T__3);
				setState(127);
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
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				((EquationContext)_localctx).ID = match(ID);
				setState(132);
				match(T__4);
				setState(133);
				((EquationContext)_localctx).expr = expr(0);
				 hmap.put((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null), ((EquationContext)_localctx).expr.val); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				((EquationContext)_localctx).ID = match(ID);
				setState(137);
				match(T__5);
				setState(138);
				((EquationContext)_localctx).expr = expr(0);
				 hmap.put((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null), hmap.getOrDefault((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null),0.0) + ((EquationContext)_localctx).expr.val); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				((EquationContext)_localctx).ID = match(ID);
				setState(142);
				match(T__6);
				setState(143);
				((EquationContext)_localctx).expr = expr(0);
				 hmap.put((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null), hmap.getOrDefault((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null),0.0) - ((EquationContext)_localctx).expr.val); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				((EquationContext)_localctx).ID = match(ID);
				setState(147);
				match(T__7);
				setState(148);
				((EquationContext)_localctx).expr = expr(0);
				 hmap.put((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null), hmap.getOrDefault((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null),0.0) * ((EquationContext)_localctx).expr.val); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(151);
				((EquationContext)_localctx).ID = match(ID);
				setState(152);
				match(T__8);
				setState(153);
				((EquationContext)_localctx).expr = expr(0);
				 hmap.put((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null), hmap.getOrDefault((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null),0.0) / ((EquationContext)_localctx).expr.val); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(156);
				((EquationContext)_localctx).ID = match(ID);
				setState(157);
				match(T__9);
				setState(158);
				((EquationContext)_localctx).expr = expr(0);
				 hmap.put((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null), Math.pow(hmap.getOrDefault((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null),0.0), ((EquationContext)_localctx).expr.val)); 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u00a6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\"\n\3\3\3\3\3"+
		"\5\3&\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4X\n"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4s\n\4\f\4\16\4v\13\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0084\n\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a4\n\6\3\6\2\3\6\7\2\4\6\b\n\2\4\3"+
		"\2\17\20\3\2\r\16\2\u00bf\2\r\3\2\2\2\4%\3\2\2\2\6W\3\2\2\2\b\u0083\3"+
		"\2\2\2\n\u00a3\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16\17\3\2\2\2\17\r\3\2"+
		"\2\2\17\20\3\2\2\2\20\3\3\2\2\2\21\22\5\6\4\2\22\23\b\3\1\2\23&\3\2\2"+
		"\2\24\25\5\b\5\2\25\26\b\3\1\2\26&\3\2\2\2\27&\5\n\6\2\30&\7\32\2\2\31"+
		"\32\7 \2\2\32&\b\3\1\2\33\34\7!\2\2\34&\b\3\1\2\35!\5\b\5\2\36\"\5\6\4"+
		"\2\37\"\5\n\6\2 \"\5\b\5\2!\36\3\2\2\2!\37\3\2\2\2! \3\2\2\2\"#\3\2\2"+
		"\2#$\b\3\1\2$&\3\2\2\2%\21\3\2\2\2%\24\3\2\2\2%\27\3\2\2\2%\30\3\2\2\2"+
		"%\31\3\2\2\2%\33\3\2\2\2%\35\3\2\2\2&\5\3\2\2\2\'(\b\4\1\2()\7\16\2\2"+
		")*\5\6\4\21*+\b\4\1\2+X\3\2\2\2,-\7\3\2\2-.\5\6\4\2./\7\4\2\2/\60\b\4"+
		"\1\2\60X\3\2\2\2\61\62\7\36\2\2\62X\b\4\1\2\63\64\7\35\2\2\64X\b\4\1\2"+
		"\65\66\7\22\2\2\66\67\5\6\4\n\678\b\4\1\28X\3\2\2\29:\7\25\2\2:;\7\3\2"+
		"\2;<\5\6\4\2<=\7\4\2\2=>\b\4\1\2>X\3\2\2\2?@\7\26\2\2@A\7\3\2\2AB\5\6"+
		"\4\2BC\7\4\2\2CD\b\4\1\2DX\3\2\2\2EF\7\27\2\2FG\7\3\2\2GH\5\6\4\2HI\7"+
		"\4\2\2IJ\b\4\1\2JX\3\2\2\2KL\7\30\2\2LM\7\3\2\2MN\5\6\4\2NO\7\4\2\2OP"+
		"\b\4\1\2PX\3\2\2\2QR\7\31\2\2RS\7\3\2\2ST\5\6\4\2TU\7\4\2\2UV\b\4\1\2"+
		"VX\3\2\2\2W\'\3\2\2\2W,\3\2\2\2W\61\3\2\2\2W\63\3\2\2\2W\65\3\2\2\2W9"+
		"\3\2\2\2W?\3\2\2\2WE\3\2\2\2WK\3\2\2\2WQ\3\2\2\2Xt\3\2\2\2YZ\f\17\2\2"+
		"Z[\7\21\2\2[\\\5\6\4\20\\]\b\4\1\2]s\3\2\2\2^_\f\16\2\2_`\t\2\2\2`a\5"+
		"\6\4\17ab\b\4\1\2bs\3\2\2\2cd\f\r\2\2de\t\3\2\2ef\5\6\4\16fg\b\4\1\2g"+
		"s\3\2\2\2hi\f\t\2\2ij\7\23\2\2jk\5\6\4\nkl\b\4\1\2ls\3\2\2\2mn\f\b\2\2"+
		"no\7\24\2\2op\5\6\4\tpq\b\4\1\2qs\3\2\2\2rY\3\2\2\2r^\3\2\2\2rc\3\2\2"+
		"\2rh\3\2\2\2rm\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\7\3\2\2\2vt\3\2"+
		"\2\2wx\7\35\2\2xy\7\5\2\2y\u0084\b\5\1\2z{\7\5\2\2{|\7\35\2\2|\u0084\b"+
		"\5\1\2}~\7\35\2\2~\177\7\6\2\2\177\u0084\b\5\1\2\u0080\u0081\7\6\2\2\u0081"+
		"\u0082\7\35\2\2\u0082\u0084\b\5\1\2\u0083w\3\2\2\2\u0083z\3\2\2\2\u0083"+
		"}\3\2\2\2\u0083\u0080\3\2\2\2\u0084\t\3\2\2\2\u0085\u0086\7\35\2\2\u0086"+
		"\u0087\7\7\2\2\u0087\u0088\5\6\4\2\u0088\u0089\b\6\1\2\u0089\u00a4\3\2"+
		"\2\2\u008a\u008b\7\35\2\2\u008b\u008c\7\b\2\2\u008c\u008d\5\6\4\2\u008d"+
		"\u008e\b\6\1\2\u008e\u00a4\3\2\2\2\u008f\u0090\7\35\2\2\u0090\u0091\7"+
		"\t\2\2\u0091\u0092\5\6\4\2\u0092\u0093\b\6\1\2\u0093\u00a4\3\2\2\2\u0094"+
		"\u0095\7\35\2\2\u0095\u0096\7\n\2\2\u0096\u0097\5\6\4\2\u0097\u0098\b"+
		"\6\1\2\u0098\u00a4\3\2\2\2\u0099\u009a\7\35\2\2\u009a\u009b\7\13\2\2\u009b"+
		"\u009c\5\6\4\2\u009c\u009d\b\6\1\2\u009d\u00a4\3\2\2\2\u009e\u009f\7\35"+
		"\2\2\u009f\u00a0\7\f\2\2\u00a0\u00a1\5\6\4\2\u00a1\u00a2\b\6\1\2\u00a2"+
		"\u00a4\3\2\2\2\u00a3\u0085\3\2\2\2\u00a3\u008a\3\2\2\2\u00a3\u008f\3\2"+
		"\2\2\u00a3\u0094\3\2\2\2\u00a3\u0099\3\2\2\2\u00a3\u009e\3\2\2\2\u00a4"+
		"\13\3\2\2\2\n\17!%Wrt\u0083\u00a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}