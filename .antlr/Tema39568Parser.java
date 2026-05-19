// Generated from /home/mapag8/Escritorio/53804/Tema39568.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Tema39568Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SI=1, SINO=2, IMPRIMIR=3, RETORNAR=4, PARENTESIS_IZQ=5, PARENTESIS_DER=6, 
		LLAVE_IZQ=7, LLAVE_DER=8, PUNTO_COMA=9, CERO=10, UNO=11, CADENA=12, WS=13;
	public static final int
		RULE_programa = 0, RULE_instrucciones = 1, RULE_instruccion = 2, RULE_decision = 3, 
		RULE_sentencia = 4, RULE_salida = 5, RULE_terminar = 6, RULE_condicion = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instrucciones", "instruccion", "decision", "sentencia", 
			"salida", "terminar", "condicion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'printf'", "'return'", "'('", "')'", "'{'", 
			"'}'", "';'", "'0'", "'1'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SI", "SINO", "IMPRIMIR", "RETORNAR", "PARENTESIS_IZQ", "PARENTESIS_DER", 
			"LLAVE_IZQ", "LLAVE_DER", "PUNTO_COMA", "CERO", "UNO", "CADENA", "WS"
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
	public String getGrammarFileName() { return "Tema39568.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Tema39568Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Tema39568Parser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			instrucciones();
			setState(17);
			match(EOF);
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

	public static class InstruccionesContext extends ParserRuleContext {
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(19);
				instruccion();
				}
				}
				setState(22); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SI );
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

	public static class InstruccionContext extends ParserRuleContext {
		public DecisionContext decision() {
			return getRuleContext(DecisionContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruccion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			decision();
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

	public static class DecisionContext extends ParserRuleContext {
		public TerminalNode SI() { return getToken(Tema39568Parser.SI, 0); }
		public TerminalNode PARENTESIS_IZQ() { return getToken(Tema39568Parser.PARENTESIS_IZQ, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PARENTESIS_DER() { return getToken(Tema39568Parser.PARENTESIS_DER, 0); }
		public List<TerminalNode> LLAVE_IZQ() { return getTokens(Tema39568Parser.LLAVE_IZQ); }
		public TerminalNode LLAVE_IZQ(int i) {
			return getToken(Tema39568Parser.LLAVE_IZQ, i);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public List<TerminalNode> LLAVE_DER() { return getTokens(Tema39568Parser.LLAVE_DER); }
		public TerminalNode LLAVE_DER(int i) {
			return getToken(Tema39568Parser.LLAVE_DER, i);
		}
		public TerminalNode SINO() { return getToken(Tema39568Parser.SINO, 0); }
		public DecisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decision; }
	}

	public final DecisionContext decision() throws RecognitionException {
		DecisionContext _localctx = new DecisionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decision);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(SI);
			setState(27);
			match(PARENTESIS_IZQ);
			setState(28);
			condicion();
			setState(29);
			match(PARENTESIS_DER);
			setState(30);
			match(LLAVE_IZQ);
			setState(31);
			sentencia();
			setState(32);
			match(LLAVE_DER);
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINO) {
				{
				setState(33);
				match(SINO);
				setState(34);
				match(LLAVE_IZQ);
				setState(35);
				sentencia();
				setState(36);
				match(LLAVE_DER);
				}
			}

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

	public static class SentenciaContext extends ParserRuleContext {
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
	 
		public SentenciaContext() { }
		public void copyFrom(SentenciaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TerminarExprContext extends SentenciaContext {
		public TerminarContext terminar() {
			return getRuleContext(TerminarContext.class,0);
		}
		public TerminarExprContext(SentenciaContext ctx) { copyFrom(ctx); }
	}
	public static class SalidaExprContext extends SentenciaContext {
		public SalidaContext salida() {
			return getRuleContext(SalidaContext.class,0);
		}
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public SalidaExprContext(SentenciaContext ctx) { copyFrom(ctx); }
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sentencia);
		int _la;
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPRIMIR:
				_localctx = new SalidaExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				salida();
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IMPRIMIR || _la==RETORNAR) {
					{
					setState(41);
					sentencia();
					}
				}

				}
				break;
			case RETORNAR:
				_localctx = new TerminarExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				terminar();
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

	public static class SalidaContext extends ParserRuleContext {
		public TerminalNode IMPRIMIR() { return getToken(Tema39568Parser.IMPRIMIR, 0); }
		public TerminalNode PARENTESIS_IZQ() { return getToken(Tema39568Parser.PARENTESIS_IZQ, 0); }
		public TerminalNode CADENA() { return getToken(Tema39568Parser.CADENA, 0); }
		public TerminalNode PARENTESIS_DER() { return getToken(Tema39568Parser.PARENTESIS_DER, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(Tema39568Parser.PUNTO_COMA, 0); }
		public SalidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_salida; }
	}

	public final SalidaContext salida() throws RecognitionException {
		SalidaContext _localctx = new SalidaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_salida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(IMPRIMIR);
			setState(48);
			match(PARENTESIS_IZQ);
			setState(49);
			match(CADENA);
			setState(50);
			match(PARENTESIS_DER);
			setState(51);
			match(PUNTO_COMA);
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

	public static class TerminarContext extends ParserRuleContext {
		public TerminalNode RETORNAR() { return getToken(Tema39568Parser.RETORNAR, 0); }
		public TerminalNode PUNTO_COMA() { return getToken(Tema39568Parser.PUNTO_COMA, 0); }
		public TerminarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminar; }
	}

	public final TerminarContext terminar() throws RecognitionException {
		TerminarContext _localctx = new TerminarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_terminar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(RETORNAR);
			setState(54);
			match(PUNTO_COMA);
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

	public static class CondicionContext extends ParserRuleContext {
		public TerminalNode CERO() { return getToken(Tema39568Parser.CERO, 0); }
		public TerminalNode UNO() { return getToken(Tema39568Parser.UNO, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_la = _input.LA(1);
			if ( !(_la==CERO || _la==UNO) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17=\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\3\6\3"+
		"\27\n\3\r\3\16\3\30\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5)\n\5\3\6\3\6\5\6-\n\6\3\6\5\6\60\n\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\3\3\2\f\r\28\2\22"+
		"\3\2\2\2\4\26\3\2\2\2\6\32\3\2\2\2\b\34\3\2\2\2\n/\3\2\2\2\f\61\3\2\2"+
		"\2\16\67\3\2\2\2\20:\3\2\2\2\22\23\5\4\3\2\23\24\7\2\2\3\24\3\3\2\2\2"+
		"\25\27\5\6\4\2\26\25\3\2\2\2\27\30\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2"+
		"\31\5\3\2\2\2\32\33\5\b\5\2\33\7\3\2\2\2\34\35\7\3\2\2\35\36\7\7\2\2\36"+
		"\37\5\20\t\2\37 \7\b\2\2 !\7\t\2\2!\"\5\n\6\2\"(\7\n\2\2#$\7\4\2\2$%\7"+
		"\t\2\2%&\5\n\6\2&\'\7\n\2\2\')\3\2\2\2(#\3\2\2\2()\3\2\2\2)\t\3\2\2\2"+
		"*,\5\f\7\2+-\5\n\6\2,+\3\2\2\2,-\3\2\2\2-\60\3\2\2\2.\60\5\16\b\2/*\3"+
		"\2\2\2/.\3\2\2\2\60\13\3\2\2\2\61\62\7\5\2\2\62\63\7\7\2\2\63\64\7\16"+
		"\2\2\64\65\7\b\2\2\65\66\7\13\2\2\66\r\3\2\2\2\678\7\6\2\289\7\13\2\2"+
		"9\17\3\2\2\2:;\t\2\2\2;\21\3\2\2\2\6\30(,/";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}