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
		T__9=10, PLUS=11, MINUS=12, MULT=13, DIV=14, POW=15, NEWLINE=16, COMMENT=17, 
		ID=18, DOUBLE=19, WS=20;
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
			"'^='", "'+'", "'-'", "'*'", "'/'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "PLUS", 
			"MINUS", "MULT", "DIV", "POW", "NEWLINE", "COMMENT", "ID", "DOUBLE", 
			"WS"
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << NEWLINE) | (1L << COMMENT) | (1L << ID) | (1L << DOUBLE))) != 0) );
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
		public Token COMMENT;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ShorthandContext shorthand() {
			return getRuleContext(ShorthandContext.class,0);
		}
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(CalculatorParser.COMMENT, 0); }
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
			setState(25);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
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
				((LineContext)_localctx).COMMENT = match(COMMENT);
				 System.out.println((((LineContext)_localctx).COMMENT!=null?((LineContext)_localctx).COMMENT.getText():null));
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(24);
				match(NEWLINE);
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
		public Token DOUBLE;
		public Token ID;
		public Token op;
		public ExprContext er;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DOUBLE() { return getToken(CalculatorParser.DOUBLE, 0); }
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public TerminalNode POW() { return getToken(CalculatorParser.POW, 0); }
		public TerminalNode MULT() { return getToken(CalculatorParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(CalculatorParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(CalculatorParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CalculatorParser.MINUS, 0); }
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
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(28);
				match(T__0);
				setState(29);
				expr(0);
				setState(30);
				match(T__1);
				}
				break;
			case DOUBLE:
				{
				setState(32);
				((ExprContext)_localctx).DOUBLE = match(DOUBLE);
				 ((ExprContext)_localctx).val = Double.parseDouble((((ExprContext)_localctx).DOUBLE!=null?((ExprContext)_localctx).DOUBLE.getText():null)); 
				}
				break;
			case ID:
				{
				setState(34);
				((ExprContext)_localctx).ID = match(ID);
				 ((ExprContext)_localctx).val = hmap.getOrDefault((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null), 0.0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(53);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(38);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(39);
						((ExprContext)_localctx).op = match(POW);
						setState(40);
						((ExprContext)_localctx).er = expr(6);
						 ((ExprContext)_localctx).val =  Math.pow(((ExprContext)_localctx).el.val,((ExprContext)_localctx).er.val);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(43);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(44);
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
						setState(45);
						((ExprContext)_localctx).er = expr(5);
						 if((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null).equals("*")){((ExprContext)_localctx).val = ((ExprContext)_localctx).el.val*((ExprContext)_localctx).er.val;} else {((ExprContext)_localctx).val = ((ExprContext)_localctx).el.val/((ExprContext)_localctx).er.val;} 
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.el = _prevctx;
						_localctx.el = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(48);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(49);
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
						setState(50);
						((ExprContext)_localctx).er = expr(4);
						 if((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null).equals("+")){((ExprContext)_localctx).val = ((ExprContext)_localctx).el.val+((ExprContext)_localctx).er.val;} else {((ExprContext)_localctx).val = ((ExprContext)_localctx).el.val-((ExprContext)_localctx).er.val;} 
						}
						break;
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				((ShorthandContext)_localctx).ID = match(ID);
				setState(59);
				((ShorthandContext)_localctx).op = match(T__2);
				 hmap.put((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null), hmap.getOrDefault((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null),0.0) + 1); ((ShorthandContext)_localctx).val = hmap.getOrDefault((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null),0.0)-1;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				((ShorthandContext)_localctx).op = match(T__2);
				setState(62);
				((ShorthandContext)_localctx).ID = match(ID);
				 hmap.put((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null), hmap.getOrDefault((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null),0.0) + 1); ((ShorthandContext)_localctx).val = hmap.getOrDefault((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null),0.0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				((ShorthandContext)_localctx).ID = match(ID);
				setState(65);
				((ShorthandContext)_localctx).op = match(T__3);
				 hmap.put((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null), hmap.getOrDefault((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null),0.0) - 1); ((ShorthandContext)_localctx).val = hmap.getOrDefault((((ShorthandContext)_localctx).ID!=null?((ShorthandContext)_localctx).ID.getText():null),0.0)+1;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				((ShorthandContext)_localctx).op = match(T__3);
				setState(68);
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
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				((EquationContext)_localctx).ID = match(ID);
				setState(73);
				match(T__4);
				setState(74);
				((EquationContext)_localctx).expr = expr(0);
				 hmap.put((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null), ((EquationContext)_localctx).expr.val); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				((EquationContext)_localctx).ID = match(ID);
				setState(78);
				match(T__5);
				setState(79);
				((EquationContext)_localctx).expr = expr(0);
				 hmap.put((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null), hmap.getOrDefault((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null),0.0) + ((EquationContext)_localctx).expr.val); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				((EquationContext)_localctx).ID = match(ID);
				setState(83);
				match(T__6);
				setState(84);
				((EquationContext)_localctx).expr = expr(0);
				 hmap.put((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null), hmap.getOrDefault((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null),0.0) - ((EquationContext)_localctx).expr.val); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(87);
				((EquationContext)_localctx).ID = match(ID);
				setState(88);
				match(T__7);
				setState(89);
				((EquationContext)_localctx).expr = expr(0);
				 hmap.put((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null), hmap.getOrDefault((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null),0.0) * ((EquationContext)_localctx).expr.val); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(92);
				((EquationContext)_localctx).ID = match(ID);
				setState(93);
				match(T__8);
				setState(94);
				((EquationContext)_localctx).expr = expr(0);
				 hmap.put((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null), hmap.getOrDefault((((EquationContext)_localctx).ID!=null?((EquationContext)_localctx).ID.getText():null),0.0) / ((EquationContext)_localctx).expr.val); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(97);
				((EquationContext)_localctx).ID = match(ID);
				setState(98);
				match(T__9);
				setState(99);
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
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26k\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3\34\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4\'\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\7\48\n\4\f\4\16\4;\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5I\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6i"+
		"\n\6\3\6\2\3\6\7\2\4\6\b\n\2\4\3\2\17\20\3\2\r\16\2w\2\r\3\2\2\2\4\33"+
		"\3\2\2\2\6&\3\2\2\2\bH\3\2\2\2\nh\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16"+
		"\17\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20\3\3\2\2\2\21\22\5\6\4\2\22\23"+
		"\b\3\1\2\23\34\3\2\2\2\24\25\5\b\5\2\25\26\b\3\1\2\26\34\3\2\2\2\27\34"+
		"\5\n\6\2\30\31\7\23\2\2\31\34\b\3\1\2\32\34\7\22\2\2\33\21\3\2\2\2\33"+
		"\24\3\2\2\2\33\27\3\2\2\2\33\30\3\2\2\2\33\32\3\2\2\2\34\5\3\2\2\2\35"+
		"\36\b\4\1\2\36\37\7\3\2\2\37 \5\6\4\2 !\7\4\2\2!\'\3\2\2\2\"#\7\25\2\2"+
		"#\'\b\4\1\2$%\7\24\2\2%\'\b\4\1\2&\35\3\2\2\2&\"\3\2\2\2&$\3\2\2\2\'9"+
		"\3\2\2\2()\f\7\2\2)*\7\21\2\2*+\5\6\4\b+,\b\4\1\2,8\3\2\2\2-.\f\6\2\2"+
		"./\t\2\2\2/\60\5\6\4\7\60\61\b\4\1\2\618\3\2\2\2\62\63\f\5\2\2\63\64\t"+
		"\3\2\2\64\65\5\6\4\6\65\66\b\4\1\2\668\3\2\2\2\67(\3\2\2\2\67-\3\2\2\2"+
		"\67\62\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:\7\3\2\2\2;9\3\2\2\2<="+
		"\7\24\2\2=>\7\5\2\2>I\b\5\1\2?@\7\5\2\2@A\7\24\2\2AI\b\5\1\2BC\7\24\2"+
		"\2CD\7\6\2\2DI\b\5\1\2EF\7\6\2\2FG\7\24\2\2GI\b\5\1\2H<\3\2\2\2H?\3\2"+
		"\2\2HB\3\2\2\2HE\3\2\2\2I\t\3\2\2\2JK\7\24\2\2KL\7\7\2\2LM\5\6\4\2MN\b"+
		"\6\1\2Ni\3\2\2\2OP\7\24\2\2PQ\7\b\2\2QR\5\6\4\2RS\b\6\1\2Si\3\2\2\2TU"+
		"\7\24\2\2UV\7\t\2\2VW\5\6\4\2WX\b\6\1\2Xi\3\2\2\2YZ\7\24\2\2Z[\7\n\2\2"+
		"[\\\5\6\4\2\\]\b\6\1\2]i\3\2\2\2^_\7\24\2\2_`\7\13\2\2`a\5\6\4\2ab\b\6"+
		"\1\2bi\3\2\2\2cd\7\24\2\2de\7\f\2\2ef\5\6\4\2fg\b\6\1\2gi\3\2\2\2hJ\3"+
		"\2\2\2hO\3\2\2\2hT\3\2\2\2hY\3\2\2\2h^\3\2\2\2hc\3\2\2\2i\13\3\2\2\2\t"+
		"\17\33&\679Hh";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}