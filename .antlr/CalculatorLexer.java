// Generated from /Users/rohankharwadkar/Desktop/AntlrCalculator/Calculator.g4 by ANTLR 4.7.1
 
    import java.util.HashMap; 
    import java.lang.Math;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, PLUS=11, MINUS=12, MULT=13, DIV=14, POW=15, NOT=16, AND=17, OR=18, 
		SQRT=19, SIN=20, COS=21, LOG=22, EXP=23, NEWLINE=24, COMMENT=25, INLINE_COMMENT=26, 
		ID=27, DOUBLE=28, WS=29, ZERO_ERROR=30, NEGATIVE_SQRT=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "PLUS", "MINUS", "MULT", "DIV", "POW", "NOT", "AND", "OR", "SQRT", 
		"SIN", "COS", "LOG", "EXP", "NEWLINE", "COMMENT", "INLINE_COMMENT", "ID", 
		"DOUBLE", "WS", "ZERO_ERROR", "NEGATIVE_SQRT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'++'", "'--'", "'='", "'+='", "'-='", "'*='", "'/='", 
		"'^='", "'+'", "'-'", "'*'", "'/'", "'^'", "'!'", "'&&'", "'||'", "'sqrt'", 
		"'s'", "'c'", "'l'", "'e'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "PLUS", 
		"MINUS", "MULT", "DIV", "POW", "NOT", "AND", "OR", "SQRT", "SIN", "COS", 
		"LOG", "EXP", "NEWLINE", "COMMENT", "INLINE_COMMENT", "ID", "DOUBLE", 
		"WS", "ZERO_ERROR", "NEGATIVE_SQRT"
	};
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

	 
	    HashMap<String, Double> hmap = new HashMap<String, Double>();


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00c6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\5\31}\n\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\7\32\u0085\n\32\f\32\16\32\u0088\13\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\7\33\u0091\n\33\f\33\16\33\u0094\13\33"+
		"\3\33\3\33\3\34\6\34\u0099\n\34\r\34\16\34\u009a\3\35\5\35\u009e\n\35"+
		"\3\35\7\35\u00a1\n\35\f\35\16\35\u00a4\13\35\3\35\5\35\u00a7\n\35\3\35"+
		"\6\35\u00aa\n\35\r\35\16\35\u00ab\3\36\6\36\u00af\n\36\r\36\16\36\u00b0"+
		"\3\36\3\36\3\37\6\37\u00b6\n\37\r\37\16\37\u00b7\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \6 \u00c1\n \r \16 \u00c2\3 \3 \3\u0086\2!\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!\3\2\b\4\2\f\f\17"+
		"\17\5\2C\\aac|\4\2--//\3\2\62;\3\2\60\60\4\2\13\13\"\"\2\u00d0\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5C\3\2\2\2\7E\3\2\2\2\tH\3\2\2\2\13K\3"+
		"\2\2\2\rM\3\2\2\2\17P\3\2\2\2\21S\3\2\2\2\23V\3\2\2\2\25Y\3\2\2\2\27\\"+
		"\3\2\2\2\31^\3\2\2\2\33`\3\2\2\2\35b\3\2\2\2\37d\3\2\2\2!f\3\2\2\2#h\3"+
		"\2\2\2%k\3\2\2\2\'n\3\2\2\2)s\3\2\2\2+u\3\2\2\2-w\3\2\2\2/y\3\2\2\2\61"+
		"|\3\2\2\2\63\u0080\3\2\2\2\65\u008e\3\2\2\2\67\u0098\3\2\2\29\u009d\3"+
		"\2\2\2;\u00ae\3\2\2\2=\u00b5\3\2\2\2?\u00bc\3\2\2\2AB\7*\2\2B\4\3\2\2"+
		"\2CD\7+\2\2D\6\3\2\2\2EF\7-\2\2FG\7-\2\2G\b\3\2\2\2HI\7/\2\2IJ\7/\2\2"+
		"J\n\3\2\2\2KL\7?\2\2L\f\3\2\2\2MN\7-\2\2NO\7?\2\2O\16\3\2\2\2PQ\7/\2\2"+
		"QR\7?\2\2R\20\3\2\2\2ST\7,\2\2TU\7?\2\2U\22\3\2\2\2VW\7\61\2\2WX\7?\2"+
		"\2X\24\3\2\2\2YZ\7`\2\2Z[\7?\2\2[\26\3\2\2\2\\]\7-\2\2]\30\3\2\2\2^_\7"+
		"/\2\2_\32\3\2\2\2`a\7,\2\2a\34\3\2\2\2bc\7\61\2\2c\36\3\2\2\2de\7`\2\2"+
		"e \3\2\2\2fg\7#\2\2g\"\3\2\2\2hi\7(\2\2ij\7(\2\2j$\3\2\2\2kl\7~\2\2lm"+
		"\7~\2\2m&\3\2\2\2no\7u\2\2op\7s\2\2pq\7t\2\2qr\7v\2\2r(\3\2\2\2st\7u\2"+
		"\2t*\3\2\2\2uv\7e\2\2v,\3\2\2\2wx\7n\2\2x.\3\2\2\2yz\7g\2\2z\60\3\2\2"+
		"\2{}\7\17\2\2|{\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\7\f\2\2\177\62\3\2\2"+
		"\2\u0080\u0081\7\61\2\2\u0081\u0082\7,\2\2\u0082\u0086\3\2\2\2\u0083\u0085"+
		"\13\2\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0087\3\2\2\2"+
		"\u0086\u0084\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a"+
		"\7,\2\2\u008a\u008b\7\61\2\2\u008b\u008c\3\2\2\2\u008c\u008d\b\32\2\2"+
		"\u008d\64\3\2\2\2\u008e\u0092\7%\2\2\u008f\u0091\n\2\2\2\u0090\u008f\3"+
		"\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\b\33\2\2\u0096\66\3\2\2"+
		"\2\u0097\u0099\t\3\2\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b8\3\2\2\2\u009c\u009e\t\4\2\2\u009d"+
		"\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a6\3\2\2\2\u009f\u00a1\t\5"+
		"\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a7\t\6"+
		"\2\2\u00a6\u00a2\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8"+
		"\u00aa\t\5\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac:\3\2\2\2\u00ad\u00af\t\7\2\2\u00ae\u00ad"+
		"\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b3\b\36\2\2\u00b3<\3\2\2\2\u00b4\u00b6\t\5\2\2"+
		"\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8"+
		"\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\7\61\2\2\u00ba\u00bb\7\62\2\2"+
		"\u00bb>\3\2\2\2\u00bc\u00bd\5\'\24\2\u00bd\u00be\7*\2\2\u00be\u00c0\7"+
		"/\2\2\u00bf\u00c1\t\5\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\7+"+
		"\2\2\u00c5@\3\2\2\2\16\2|\u0086\u0092\u009a\u009d\u00a2\u00a6\u00ab\u00b0"+
		"\u00b7\u00c2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}