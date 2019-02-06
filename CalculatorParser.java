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
			"'^='", "'+'", "'-'", "'*'", "'/'", "'^'", "'!'", "'&&'", "'||'", "'sqrt('", 
			"'s('", "'c('", "'l('", "'e('"
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << MINUS) | (1L << NOT) | (1L << SQRT) | (1L << SIN) | (1L << COS) | (1L << LOG) | (1L << EXP) | (1L << NEWLINE) | (1L << ID) | (1L << DOUBLE))) != 0) );
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
			setState(31);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				((LineContext)_localctx).expr = expr(0);
				 if(!Double.isNaN(((LineContext)_localctx).expr.val)){System.out.println("result: "+ Double.toString(((LineContext)_localctx).expr.val));} 
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
				shorthand();
				setState(27);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(24);
					expr(0);
					}
					break;
				case 2:
					{
					setState(25);
					equation();
					}
					break;
				case 3:
					{
					setState(26);
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
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				setState(34);
				match(MINUS);
				setState(35);
				((ExprContext)_localctx).expr = expr(15);
				 ((ExprContext)_localctx).val =  ((ExprContext)_localctx).expr.val * -1; 
				}
				break;
			case T__0:
				{
				setState(38);
				match(T__0);
				setState(39);
				((ExprContext)_localctx).expr = expr(0);
				setState(40);
				match(T__1);
				((ExprContext)_localctx).val =  ((ExprContext)_localctx).expr.val;
				}
				break;
			case DOUBLE:
				{
				setState(43);
				((ExprContext)_localctx).DOUBLE = match(DOUBLE);
				 ((ExprContext)_localctx).val = Double.parseDouble((((ExprContext)_localctx).DOUBLE!=null?((ExprContext)_localctx).DOUBLE.getText():null)); 
				}
				break;
			case ID:
				{
				setState(45);
				((ExprContext)_localctx).ID = match(ID);
				 ((ExprContext)_localctx).val = hmap.getOrDefault((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null), 0.0);
				}
				break;
			case NOT:
				{
				setState(47);
				match(NOT);
				setState(48);
				((ExprContext)_localctx).expr = expr(8);
				 if(((ExprContext)_localctx).expr.val == 0.0){((ExprContext)_localctx).val =  1.0;} else {((ExprContext)_localctx).val =  0.0;} 
				}
				break;
			case SQRT:
				{
				setState(51);
				match(SQRT);
				setState(52);
				((ExprContext)_localctx).expr = expr(0);
				setState(53);
				match(T__1);
				 if(((ExprContext)_localctx).expr.val < 0){((ExprContext)_localctx).val =  Double.NaN; 
				        System.out.println("Runtime error (func=(main), adr=6): Square root of a negative number"); }
				        else{((ExprContext)_localctx).val =  Math.sqrt(((ExprContext)_localctx).expr.val);} 
				}
				break;
			case SIN:
				{
				setState(56);
				match(SIN);
				setState(57);
				((ExprContext)_localctx).expr = expr(0);
				setState(58);
				match(T__1);
				 ((ExprContext)_localctx).val =  Math.sin(((ExprContext)_localctx).expr.val); 
				}
				break;
			case COS:
				{
				setState(61);
				match(COS);
				setState(62);
				((ExprContext)_localctx).expr = expr(0);
				setState(63);
				match(T__1);
				 ((ExprContext)_localctx).val =  Math.cos(((ExprContext)_localctx).expr.val); 
				}
				break;
			case LOG:
				{
				setState(66);
				match(LOG);
				setState(67);
				((ExprContext)_localctx).expr = expr(0);
				setState(68);
				match(T__1);
				 ((ExprContext)_localctx).val =  Math.log(((ExprContext)_localctx).expr.val); 
				}
				break;
			case EXP:
				{
				setState(71);
				match(EXP);
				setState(72);
				((ExprContext)_localctx).expr = expr(0);
				setState(73);
				match(T__1);
				 ((ExprContext)_localctx).val =  Math.exp(((ExprContext)_localctx).expr.val); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(103);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(78);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(79);
						((ExprContext)_localctx).op = match(POW);
						setState(80);
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
						setState(83);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(84);
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
						setState(85);
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
						setState(88);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(89);
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
						setState(90);
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
						setState(93);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(94);
						((ExprContext)_localctx).op = match(AND);
						setState(95);
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
						setState(98);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(99);
						((ExprContext)_localctx).op = match(OR);
						setState(100);
						((ExprContext)_localctx).er = ((ExprContext)_localctx).expr = expr(7);
						 if(((ExprContext)_localctx).el.val != 0.0 || ((ExprContext)_localctx).er.val != 0.0){((ExprContext)_localctx).val =  1.0;} else{((ExprContext)_localctx).val =  0.0;} 
						}
						break;
					}
					} 
				}
				setState(107);
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
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				((ShorthandContext)_localctx).ID = match(ID);
				setState(109);
				((ShorthandContext)_localctx).op = match(T__2);
				 hmap.put((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null), hmap.getOrDefault((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null),0.0) + 1); ((ShorthandContext)_localctx).val = hmap.getOrDefault((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null),0.0)-1;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				((ShorthandContext)_localctx).op = match(T__2);
				setState(112);
				((ShorthandContext)_localctx).ID = match(ID);
				 hmap.put((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null), hmap.getOrDefault((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null),0.0) + 1); ((ShorthandContext)_localctx).val = hmap.getOrDefault((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null),0.0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				((ShorthandContext)_localctx).ID = match(ID);
				setState(115);
				((ShorthandContext)_localctx).op = match(T__3);
				 hmap.put((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null), hmap.getOrDefault((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null),0.0) - 1); ((ShorthandContext)_localctx).val = hmap.getOrDefault((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null),0.0)+1;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				((ShorthandContext)_localctx).op = match(T__3);
				setState(118);
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
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				((EquationContext)_localctx).ID = match(ID);
				setState(123);
				match(T__4);
				setState(124);
				((EquationContext)_localctx).expr = expr(0);
				 hmap.put((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null), ((EquationContext)_localctx).expr.val); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				((EquationContext)_localctx).ID = match(ID);
				setState(128);
				match(T__5);
				setState(129);
				((EquationContext)_localctx).expr = expr(0);
				 hmap.put((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null), hmap.getOrDefault((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null),0.0) + ((EquationContext)_localctx).expr.val); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				((EquationContext)_localctx).ID = match(ID);
				setState(133);
				match(T__6);
				setState(134);
				((EquationContext)_localctx).expr = expr(0);
				 hmap.put((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null), hmap.getOrDefault((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null),0.0) - ((EquationContext)_localctx).expr.val); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				((EquationContext)_localctx).ID = match(ID);
				setState(138);
				match(T__7);
				setState(139);
				((EquationContext)_localctx).expr = expr(0);
				 hmap.put((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null), hmap.getOrDefault((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null),0.0) * ((EquationContext)_localctx).expr.val); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(142);
				((EquationContext)_localctx).ID = match(ID);
				setState(143);
				match(T__8);
				setState(144);
				((EquationContext)_localctx).expr = expr(0);
				 hmap.put((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null), hmap.getOrDefault((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null),0.0) / ((EquationContext)_localctx).expr.val); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(147);
				((EquationContext)_localctx).ID = match(ID);
				setState(148);
				match(T__9);
				setState(149);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u009d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\36\n\3\3\3\3\3\5\3\"\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4O\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7"+
		"\4j\n\4\f\4\16\4m\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5{\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u009b"+
		"\n\6\3\6\2\3\6\7\2\4\6\b\n\2\4\3\2\17\20\3\2\r\16\2\u00b4\2\r\3\2\2\2"+
		"\4!\3\2\2\2\6N\3\2\2\2\bz\3\2\2\2\n\u009a\3\2\2\2\f\16\5\4\3\2\r\f\3\2"+
		"\2\2\16\17\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\3\3\2\2\2\21\22\5\6\4"+
		"\2\22\23\b\3\1\2\23\"\3\2\2\2\24\25\5\b\5\2\25\26\b\3\1\2\26\"\3\2\2\2"+
		"\27\"\5\n\6\2\30\"\7\32\2\2\31\35\5\b\5\2\32\36\5\6\4\2\33\36\5\n\6\2"+
		"\34\36\5\b\5\2\35\32\3\2\2\2\35\33\3\2\2\2\35\34\3\2\2\2\36\37\3\2\2\2"+
		"\37 \b\3\1\2 \"\3\2\2\2!\21\3\2\2\2!\24\3\2\2\2!\27\3\2\2\2!\30\3\2\2"+
		"\2!\31\3\2\2\2\"\5\3\2\2\2#$\b\4\1\2$%\7\16\2\2%&\5\6\4\21&\'\b\4\1\2"+
		"\'O\3\2\2\2()\7\3\2\2)*\5\6\4\2*+\7\4\2\2+,\b\4\1\2,O\3\2\2\2-.\7\36\2"+
		"\2.O\b\4\1\2/\60\7\35\2\2\60O\b\4\1\2\61\62\7\22\2\2\62\63\5\6\4\n\63"+
		"\64\b\4\1\2\64O\3\2\2\2\65\66\7\25\2\2\66\67\5\6\4\2\678\7\4\2\289\b\4"+
		"\1\29O\3\2\2\2:;\7\26\2\2;<\5\6\4\2<=\7\4\2\2=>\b\4\1\2>O\3\2\2\2?@\7"+
		"\27\2\2@A\5\6\4\2AB\7\4\2\2BC\b\4\1\2CO\3\2\2\2DE\7\30\2\2EF\5\6\4\2F"+
		"G\7\4\2\2GH\b\4\1\2HO\3\2\2\2IJ\7\31\2\2JK\5\6\4\2KL\7\4\2\2LM\b\4\1\2"+
		"MO\3\2\2\2N#\3\2\2\2N(\3\2\2\2N-\3\2\2\2N/\3\2\2\2N\61\3\2\2\2N\65\3\2"+
		"\2\2N:\3\2\2\2N?\3\2\2\2ND\3\2\2\2NI\3\2\2\2Ok\3\2\2\2PQ\f\17\2\2QR\7"+
		"\21\2\2RS\5\6\4\20ST\b\4\1\2Tj\3\2\2\2UV\f\16\2\2VW\t\2\2\2WX\5\6\4\17"+
		"XY\b\4\1\2Yj\3\2\2\2Z[\f\r\2\2[\\\t\3\2\2\\]\5\6\4\16]^\b\4\1\2^j\3\2"+
		"\2\2_`\f\t\2\2`a\7\23\2\2ab\5\6\4\nbc\b\4\1\2cj\3\2\2\2de\f\b\2\2ef\7"+
		"\24\2\2fg\5\6\4\tgh\b\4\1\2hj\3\2\2\2iP\3\2\2\2iU\3\2\2\2iZ\3\2\2\2i_"+
		"\3\2\2\2id\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\7\3\2\2\2mk\3\2\2\2"+
		"no\7\35\2\2op\7\5\2\2p{\b\5\1\2qr\7\5\2\2rs\7\35\2\2s{\b\5\1\2tu\7\35"+
		"\2\2uv\7\6\2\2v{\b\5\1\2wx\7\6\2\2xy\7\35\2\2y{\b\5\1\2zn\3\2\2\2zq\3"+
		"\2\2\2zt\3\2\2\2zw\3\2\2\2{\t\3\2\2\2|}\7\35\2\2}~\7\7\2\2~\177\5\6\4"+
		"\2\177\u0080\b\6\1\2\u0080\u009b\3\2\2\2\u0081\u0082\7\35\2\2\u0082\u0083"+
		"\7\b\2\2\u0083\u0084\5\6\4\2\u0084\u0085\b\6\1\2\u0085\u009b\3\2\2\2\u0086"+
		"\u0087\7\35\2\2\u0087\u0088\7\t\2\2\u0088\u0089\5\6\4\2\u0089\u008a\b"+
		"\6\1\2\u008a\u009b\3\2\2\2\u008b\u008c\7\35\2\2\u008c\u008d\7\n\2\2\u008d"+
		"\u008e\5\6\4\2\u008e\u008f\b\6\1\2\u008f\u009b\3\2\2\2\u0090\u0091\7\35"+
		"\2\2\u0091\u0092\7\13\2\2\u0092\u0093\5\6\4\2\u0093\u0094\b\6\1\2\u0094"+
		"\u009b\3\2\2\2\u0095\u0096\7\35\2\2\u0096\u0097\7\f\2\2\u0097\u0098\5"+
		"\6\4\2\u0098\u0099\b\6\1\2\u0099\u009b\3\2\2\2\u009a|\3\2\2\2\u009a\u0081"+
		"\3\2\2\2\u009a\u0086\3\2\2\2\u009a\u008b\3\2\2\2\u009a\u0090\3\2\2\2\u009a"+
		"\u0095\3\2\2\2\u009b\13\3\2\2\2\n\17\35!Nikz\u009a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}