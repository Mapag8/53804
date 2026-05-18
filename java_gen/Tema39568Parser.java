// Generated from /home/mapag8/Escritorio/Compilador 53804/Tema39568.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Tema39568Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, PRINTF=3, RETURN=4, LPAREN=5, RPAREN=6, LBRACE=7, RBRACE=8, 
		SEMI=9, CERO=10, UNO=11, CADENA=12, WS=13;
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
			null, "IF", "ELSE", "PRINTF", "RETURN", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "SEMI", "CERO", "UNO", "CADENA", "WS"
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Tema39568Parser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tema39568Listener ) ((Tema39568Listener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tema39568Listener ) ((Tema39568Listener)listener).exitPrograma(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tema39568Listener ) ((Tema39568Listener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tema39568Listener ) ((Tema39568Listener)listener).exitInstrucciones(this);
		}
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
			} while ( _la==IF );
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionContext extends ParserRuleContext {
		public DecisionContext decision() {
			return getRuleContext(DecisionContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tema39568Listener ) ((Tema39568Listener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tema39568Listener ) ((Tema39568Listener)listener).exitInstruccion(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecisionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Tema39568Parser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(Tema39568Parser.LPAREN, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(Tema39568Parser.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(Tema39568Parser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(Tema39568Parser.LBRACE, i);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(Tema39568Parser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(Tema39568Parser.RBRACE, i);
		}
		public TerminalNode ELSE() { return getToken(Tema39568Parser.ELSE, 0); }
		public DecisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tema39568Listener ) ((Tema39568Listener)listener).enterDecision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tema39568Listener ) ((Tema39568Listener)listener).exitDecision(this);
		}
	}

	public final DecisionContext decision() throws RecognitionException {
		DecisionContext _localctx = new DecisionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decision);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(IF);
			setState(27);
			match(LPAREN);
			setState(28);
			condicion();
			setState(29);
			match(RPAREN);
			setState(30);
			match(LBRACE);
			setState(31);
			sentencia();
			setState(32);
			match(RBRACE);
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(33);
				match(ELSE);
				setState(34);
				match(LBRACE);
				setState(35);
				sentencia();
				setState(36);
				match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class TerminarExprContext extends SentenciaContext {
		public TerminarContext terminar() {
			return getRuleContext(TerminarContext.class,0);
		}
		public TerminarExprContext(SentenciaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tema39568Listener ) ((Tema39568Listener)listener).enterTerminarExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tema39568Listener ) ((Tema39568Listener)listener).exitTerminarExpr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SalidaExprContext extends SentenciaContext {
		public SalidaContext salida() {
			return getRuleContext(SalidaContext.class,0);
		}
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public SalidaExprContext(SentenciaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tema39568Listener ) ((Tema39568Listener)listener).enterSalidaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tema39568Listener ) ((Tema39568Listener)listener).exitSalidaExpr(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sentencia);
		int _la;
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINTF:
				_localctx = new SalidaExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				salida();
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRINTF || _la==RETURN) {
					{
					setState(41);
					sentencia();
					}
				}

				}
				break;
			case RETURN:
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

	@SuppressWarnings("CheckReturnValue")
	public static class SalidaContext extends ParserRuleContext {
		public TerminalNode PRINTF() { return getToken(Tema39568Parser.PRINTF, 0); }
		public TerminalNode LPAREN() { return getToken(Tema39568Parser.LPAREN, 0); }
		public TerminalNode CADENA() { return getToken(Tema39568Parser.CADENA, 0); }
		public TerminalNode RPAREN() { return getToken(Tema39568Parser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(Tema39568Parser.SEMI, 0); }
		public SalidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_salida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tema39568Listener ) ((Tema39568Listener)listener).enterSalida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tema39568Listener ) ((Tema39568Listener)listener).exitSalida(this);
		}
	}

	public final SalidaContext salida() throws RecognitionException {
		SalidaContext _localctx = new SalidaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_salida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(PRINTF);
			setState(48);
			match(LPAREN);
			setState(49);
			match(CADENA);
			setState(50);
			match(RPAREN);
			setState(51);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TerminarContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(Tema39568Parser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(Tema39568Parser.SEMI, 0); }
		public TerminarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tema39568Listener ) ((Tema39568Listener)listener).enterTerminar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tema39568Listener ) ((Tema39568Listener)listener).exitTerminar(this);
		}
	}

	public final TerminarContext terminar() throws RecognitionException {
		TerminarContext _localctx = new TerminarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_terminar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(RETURN);
			setState(54);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionContext extends ParserRuleContext {
		public TerminalNode CERO() { return getToken(Tema39568Parser.CERO, 0); }
		public TerminalNode UNO() { return getToken(Tema39568Parser.UNO, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tema39568Listener ) ((Tema39568Listener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tema39568Listener ) ((Tema39568Listener)listener).exitCondicion(this);
		}
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
		"\u0004\u0001\r;\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001\u0015\b\u0001\u000b"+
		"\u0001\f\u0001\u0016\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\'\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0003\u0004+\b\u0004\u0001\u0004\u0003\u0004.\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0000\u0000\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000\u0001\u0001\u0000"+
		"\n\u000b6\u0000\u0010\u0001\u0000\u0000\u0000\u0002\u0014\u0001\u0000"+
		"\u0000\u0000\u0004\u0018\u0001\u0000\u0000\u0000\u0006\u001a\u0001\u0000"+
		"\u0000\u0000\b-\u0001\u0000\u0000\u0000\n/\u0001\u0000\u0000\u0000\f5"+
		"\u0001\u0000\u0000\u0000\u000e8\u0001\u0000\u0000\u0000\u0010\u0011\u0003"+
		"\u0002\u0001\u0000\u0011\u0012\u0005\u0000\u0000\u0001\u0012\u0001\u0001"+
		"\u0000\u0000\u0000\u0013\u0015\u0003\u0004\u0002\u0000\u0014\u0013\u0001"+
		"\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0014\u0001"+
		"\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0003\u0001"+
		"\u0000\u0000\u0000\u0018\u0019\u0003\u0006\u0003\u0000\u0019\u0005\u0001"+
		"\u0000\u0000\u0000\u001a\u001b\u0005\u0001\u0000\u0000\u001b\u001c\u0005"+
		"\u0005\u0000\u0000\u001c\u001d\u0003\u000e\u0007\u0000\u001d\u001e\u0005"+
		"\u0006\u0000\u0000\u001e\u001f\u0005\u0007\u0000\u0000\u001f \u0003\b"+
		"\u0004\u0000 &\u0005\b\u0000\u0000!\"\u0005\u0002\u0000\u0000\"#\u0005"+
		"\u0007\u0000\u0000#$\u0003\b\u0004\u0000$%\u0005\b\u0000\u0000%\'\u0001"+
		"\u0000\u0000\u0000&!\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000"+
		"\'\u0007\u0001\u0000\u0000\u0000(*\u0003\n\u0005\u0000)+\u0003\b\u0004"+
		"\u0000*)\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+.\u0001\u0000"+
		"\u0000\u0000,.\u0003\f\u0006\u0000-(\u0001\u0000\u0000\u0000-,\u0001\u0000"+
		"\u0000\u0000.\t\u0001\u0000\u0000\u0000/0\u0005\u0003\u0000\u000001\u0005"+
		"\u0005\u0000\u000012\u0005\f\u0000\u000023\u0005\u0006\u0000\u000034\u0005"+
		"\t\u0000\u00004\u000b\u0001\u0000\u0000\u000056\u0005\u0004\u0000\u0000"+
		"67\u0005\t\u0000\u00007\r\u0001\u0000\u0000\u000089\u0007\u0000\u0000"+
		"\u00009\u000f\u0001\u0000\u0000\u0000\u0004\u0016&*-";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}