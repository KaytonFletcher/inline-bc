// Generated from Calculator.g4 by ANTLR 4.7.2
 
    import java.util.HashMap; 
    import java.lang.Math;
    import java.util.Scanner;

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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
<<<<<<< HEAD
			"T__9", "T__10", "T__11", "PRINT", "PLUS", "MINUS", "MULT", "DIV", "POW", 
			"NOT", "AND", "OR", "SQRT", "SIN", "COS", "LOG", "EXP", "READ", "NEWLINE", 
			"COMMENT", "INLINE_COMMENT", "ID", "DOUBLE", "WS", "ZERO_ERROR", "NEGATIVE_SQRT"
=======
			"T__9", "T__10", "T__11", "PLUS", "MINUS", "MULT", "DIV", "POW", "NOT", 
			"AND", "OR", "SQRT", "SIN", "COS", "LOG", "EXP", "READ", "NEWLINE", "COMMENT", 
			"INLINE_COMMENT", "ID", "DOUBLE", "WS", "ZERO_ERROR", "NEGATIVE_SQRT"
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
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

	 
	    HashMap<String, Double> hmap = new HashMap<String, Double>();
	    Scanner scnr = new Scanner(System.in);


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
<<<<<<< HEAD
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u00e1\b\1\4\2\t"+
=======
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u00d9\b\1\4\2\t"+
>>>>>>> 79b620764f42dac44c96221d471aba250811bd92
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
<<<<<<< HEAD
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\5\35\u009b\n\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u00a3\n\36\f\36\16\36\u00a6\13\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\7\37\u00af\n\37\f\37\16\37\u00b2\13"+
		"\37\3\37\3\37\3 \6 \u00b7\n \r \16 \u00b8\3!\7!\u00bc\n!\f!\16!\u00bf"+
		"\13!\3!\5!\u00c2\n!\3!\6!\u00c5\n!\r!\16!\u00c6\3\"\6\"\u00ca\n\"\r\""+
		"\16\"\u00cb\3\"\3\"\3#\6#\u00d1\n#\r#\16#\u00d2\3#\3#\3#\3$\3$\3$\3$\6"+
		"$\u00dc\n$\r$\16$\u00dd\3$\3$\3\u00a4\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%\3\2\7\4\2\f\f\17"+
		"\17\5\2C\\aac|\3\2\62;\3\2\60\60\4\2\13\13\"\"\2\u00ea\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5K"+
		"\3\2\2\2\7M\3\2\2\2\tP\3\2\2\2\13S\3\2\2\2\rU\3\2\2\2\17X\3\2\2\2\21["+
		"\3\2\2\2\23^\3\2\2\2\25a\3\2\2\2\27d\3\2\2\2\31f\3\2\2\2\33h\3\2\2\2\35"+
		"n\3\2\2\2\37p\3\2\2\2!r\3\2\2\2#t\3\2\2\2%v\3\2\2\2\'x\3\2\2\2)z\3\2\2"+
		"\2+}\3\2\2\2-\u0080\3\2\2\2/\u0086\3\2\2\2\61\u0089\3\2\2\2\63\u008c\3"+
		"\2\2\2\65\u008f\3\2\2\2\67\u0092\3\2\2\29\u009a\3\2\2\2;\u009e\3\2\2\2"+
		"=\u00ac\3\2\2\2?\u00b6\3\2\2\2A\u00c1\3\2\2\2C\u00c9\3\2\2\2E\u00d0\3"+
		"\2\2\2G\u00d7\3\2\2\2IJ\7*\2\2J\4\3\2\2\2KL\7+\2\2L\6\3\2\2\2MN\7-\2\2"+
		"NO\7-\2\2O\b\3\2\2\2PQ\7/\2\2QR\7/\2\2R\n\3\2\2\2ST\7?\2\2T\f\3\2\2\2"+
		"UV\7-\2\2VW\7?\2\2W\16\3\2\2\2XY\7/\2\2YZ\7?\2\2Z\20\3\2\2\2[\\\7,\2\2"+
		"\\]\7?\2\2]\22\3\2\2\2^_\7\61\2\2_`\7?\2\2`\24\3\2\2\2ab\7`\2\2bc\7?\2"+
		"\2c\26\3\2\2\2de\7$\2\2e\30\3\2\2\2fg\7.\2\2g\32\3\2\2\2hi\7r\2\2ij\7"+
		"t\2\2jk\7k\2\2kl\7p\2\2lm\7v\2\2m\34\3\2\2\2no\7-\2\2o\36\3\2\2\2pq\7"+
		"/\2\2q \3\2\2\2rs\7,\2\2s\"\3\2\2\2tu\7\61\2\2u$\3\2\2\2vw\7`\2\2w&\3"+
		"\2\2\2xy\7#\2\2y(\3\2\2\2z{\7(\2\2{|\7(\2\2|*\3\2\2\2}~\7~\2\2~\177\7"+
		"~\2\2\177,\3\2\2\2\u0080\u0081\7u\2\2\u0081\u0082\7s\2\2\u0082\u0083\7"+
		"t\2\2\u0083\u0084\7v\2\2\u0084\u0085\7*\2\2\u0085.\3\2\2\2\u0086\u0087"+
		"\7u\2\2\u0087\u0088\7*\2\2\u0088\60\3\2\2\2\u0089\u008a\7e\2\2\u008a\u008b"+
		"\7*\2\2\u008b\62\3\2\2\2\u008c\u008d\7n\2\2\u008d\u008e\7*\2\2\u008e\64"+
		"\3\2\2\2\u008f\u0090\7g\2\2\u0090\u0091\7*\2\2\u0091\66\3\2\2\2\u0092"+
		"\u0093\7t\2\2\u0093\u0094\7g\2\2\u0094\u0095\7c\2\2\u0095\u0096\7f\2\2"+
		"\u0096\u0097\7*\2\2\u0097\u0098\7+\2\2\u00988\3\2\2\2\u0099\u009b\7\17"+
		"\2\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\7\f\2\2\u009d:\3\2\2\2\u009e\u009f\7\61\2\2\u009f\u00a0\7,\2\2"+
		"\u00a0\u00a4\3\2\2\2\u00a1\u00a3\13\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6"+
		"\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a7\u00a8\7,\2\2\u00a8\u00a9\7\61\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00ab\b\36\2\2\u00ab<\3\2\2\2\u00ac\u00b0\7%\2\2\u00ad\u00af"+
		"\n\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\b\37"+
		"\2\2\u00b4>\3\2\2\2\u00b5\u00b7\t\3\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8"+
		"\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9@\3\2\2\2\u00ba"+
		"\u00bc\t\4\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0"+
		"\u00c2\t\5\2\2\u00c1\u00bd\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2"+
		"\2\2\u00c3\u00c5\t\4\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7B\3\2\2\2\u00c8\u00ca\t\6\2\2"+
		"\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc"+
		"\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\b\"\2\2\u00ceD\3\2\2\2\u00cf"+
		"\u00d1\t\4\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\7\61\2\2\u00d5"+
		"\u00d6\7\62\2\2\u00d6F\3\2\2\2\u00d7\u00d8\5-\27\2\u00d8\u00d9\7*\2\2"+
		"\u00d9\u00db\7/\2\2\u00da\u00dc\t\4\2\2\u00db\u00da\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00e0\7+\2\2\u00e0H\3\2\2\2\r\2\u009a\u00a4\u00b0\u00b8\u00bd\u00c1\u00c6"+
		"\u00cb\u00d2\u00dd\3\b\2\2";
=======
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\5\34\u0093\n\34\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u009b"+
		"\n\35\f\35\16\35\u009e\13\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\7\36\u00a7"+
		"\n\36\f\36\16\36\u00aa\13\36\3\36\3\36\3\37\6\37\u00af\n\37\r\37\16\37"+
		"\u00b0\3 \7 \u00b4\n \f \16 \u00b7\13 \3 \5 \u00ba\n \3 \6 \u00bd\n \r"+
		" \16 \u00be\3!\6!\u00c2\n!\r!\16!\u00c3\3!\3!\3\"\6\"\u00c9\n\"\r\"\16"+
		"\"\u00ca\3\"\3\"\3\"\3#\3#\3#\3#\6#\u00d4\n#\r#\16#\u00d5\3#\3#\3\u009c"+
		"\2$\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$\3\2\7\4\2\f\f\17\17\5\2C\\aac|\3\2\62;\3\2\60\60\4\2\13"+
		"\13\"\"\2\u00e2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\3G\3\2\2\2\5I\3\2\2\2\7K\3\2\2\2\tM\3\2\2\2\13O\3\2\2\2\rR\3\2"+
		"\2\2\17U\3\2\2\2\21W\3\2\2\2\23Z\3\2\2\2\25]\3\2\2\2\27`\3\2\2\2\31c\3"+
		"\2\2\2\33f\3\2\2\2\35h\3\2\2\2\37j\3\2\2\2!l\3\2\2\2#n\3\2\2\2%p\3\2\2"+
		"\2\'r\3\2\2\2)u\3\2\2\2+x\3\2\2\2-~\3\2\2\2/\u0081\3\2\2\2\61\u0084\3"+
		"\2\2\2\63\u0087\3\2\2\2\65\u008a\3\2\2\2\67\u0092\3\2\2\29\u0096\3\2\2"+
		"\2;\u00a4\3\2\2\2=\u00ae\3\2\2\2?\u00b9\3\2\2\2A\u00c1\3\2\2\2C\u00c8"+
		"\3\2\2\2E\u00cf\3\2\2\2GH\7=\2\2H\4\3\2\2\2IJ\7\f\2\2J\6\3\2\2\2KL\7*"+
		"\2\2L\b\3\2\2\2MN\7+\2\2N\n\3\2\2\2OP\7-\2\2PQ\7-\2\2Q\f\3\2\2\2RS\7/"+
		"\2\2ST\7/\2\2T\16\3\2\2\2UV\7?\2\2V\20\3\2\2\2WX\7-\2\2XY\7?\2\2Y\22\3"+
		"\2\2\2Z[\7/\2\2[\\\7?\2\2\\\24\3\2\2\2]^\7,\2\2^_\7?\2\2_\26\3\2\2\2`"+
		"a\7\61\2\2ab\7?\2\2b\30\3\2\2\2cd\7`\2\2de\7?\2\2e\32\3\2\2\2fg\7-\2\2"+
		"g\34\3\2\2\2hi\7/\2\2i\36\3\2\2\2jk\7,\2\2k \3\2\2\2lm\7\61\2\2m\"\3\2"+
		"\2\2no\7`\2\2o$\3\2\2\2pq\7#\2\2q&\3\2\2\2rs\7(\2\2st\7(\2\2t(\3\2\2\2"+
		"uv\7~\2\2vw\7~\2\2w*\3\2\2\2xy\7u\2\2yz\7s\2\2z{\7t\2\2{|\7v\2\2|}\7*"+
		"\2\2},\3\2\2\2~\177\7u\2\2\177\u0080\7*\2\2\u0080.\3\2\2\2\u0081\u0082"+
		"\7e\2\2\u0082\u0083\7*\2\2\u0083\60\3\2\2\2\u0084\u0085\7n\2\2\u0085\u0086"+
		"\7*\2\2\u0086\62\3\2\2\2\u0087\u0088\7g\2\2\u0088\u0089\7*\2\2\u0089\64"+
		"\3\2\2\2\u008a\u008b\7t\2\2\u008b\u008c\7g\2\2\u008c\u008d\7c\2\2\u008d"+
		"\u008e\7f\2\2\u008e\u008f\7*\2\2\u008f\u0090\7+\2\2\u0090\66\3\2\2\2\u0091"+
		"\u0093\7\17\2\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3"+
		"\2\2\2\u0094\u0095\7\f\2\2\u00958\3\2\2\2\u0096\u0097\7\61\2\2\u0097\u0098"+
		"\7,\2\2\u0098\u009c\3\2\2\2\u0099\u009b\13\2\2\2\u009a\u0099\3\2\2\2\u009b"+
		"\u009e\3\2\2\2\u009c\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009f\3\2"+
		"\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7,\2\2\u00a0\u00a1\7\61\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a3\b\35\2\2\u00a3:\3\2\2\2\u00a4\u00a8\7%\2\2"+
		"\u00a5\u00a7\n\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6"+
		"\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab"+
		"\u00ac\b\36\2\2\u00ac<\3\2\2\2\u00ad\u00af\t\3\2\2\u00ae\u00ad\3\2\2\2"+
		"\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1>\3"+
		"\2\2\2\u00b2\u00b4\t\4\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b8\u00ba\t\5\2\2\u00b9\u00b5\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00bc\3\2\2\2\u00bb\u00bd\t\4\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf@\3\2\2\2\u00c0\u00c2"+
		"\t\6\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\b!\2\2\u00c6B\3\2\2\2\u00c7"+
		"\u00c9\t\4\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2"+
		"\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\7\61\2\2\u00cd"+
		"\u00ce\7\62\2\2\u00ceD\3\2\2\2\u00cf\u00d0\5+\26\2\u00d0\u00d1\7*\2\2"+
		"\u00d1\u00d3\7/\2\2\u00d2\u00d4\t\4\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d8\7+\2\2\u00d8F\3\2\2\2\r\2\u0092\u009c\u00a8\u00b0\u00b5\u00b9\u00be"+
		"\u00c3\u00ca\u00d5\3\b\2\2";
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