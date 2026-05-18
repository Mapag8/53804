// Generated from Tema39568.g4 by ANTLR 4.13.2
// jshint ignore: start
import antlr4 from 'antlr4';
import Tema39568Listener from './Tema39568Listener.js';
import Tema39568Visitor from './Tema39568Visitor.js';

const serializedATN = [4,1,13,59,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,
2,5,7,5,2,6,7,6,2,7,7,7,1,0,1,0,1,0,1,1,4,1,21,8,1,11,1,12,1,22,1,2,1,2,
1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,3,3,39,8,3,1,4,1,4,3,4,43,
8,4,1,4,3,4,46,8,4,1,5,1,5,1,5,1,5,1,5,1,5,1,6,1,6,1,6,1,7,1,7,1,7,0,0,8,
0,2,4,6,8,10,12,14,0,1,1,0,10,11,54,0,16,1,0,0,0,2,20,1,0,0,0,4,24,1,0,0,
0,6,26,1,0,0,0,8,45,1,0,0,0,10,47,1,0,0,0,12,53,1,0,0,0,14,56,1,0,0,0,16,
17,3,2,1,0,17,18,5,0,0,1,18,1,1,0,0,0,19,21,3,4,2,0,20,19,1,0,0,0,21,22,
1,0,0,0,22,20,1,0,0,0,22,23,1,0,0,0,23,3,1,0,0,0,24,25,3,6,3,0,25,5,1,0,
0,0,26,27,5,1,0,0,27,28,5,5,0,0,28,29,3,14,7,0,29,30,5,6,0,0,30,31,5,7,0,
0,31,32,3,8,4,0,32,38,5,8,0,0,33,34,5,2,0,0,34,35,5,7,0,0,35,36,3,8,4,0,
36,37,5,8,0,0,37,39,1,0,0,0,38,33,1,0,0,0,38,39,1,0,0,0,39,7,1,0,0,0,40,
42,3,10,5,0,41,43,3,8,4,0,42,41,1,0,0,0,42,43,1,0,0,0,43,46,1,0,0,0,44,46,
3,12,6,0,45,40,1,0,0,0,45,44,1,0,0,0,46,9,1,0,0,0,47,48,5,3,0,0,48,49,5,
5,0,0,49,50,5,12,0,0,50,51,5,6,0,0,51,52,5,9,0,0,52,11,1,0,0,0,53,54,5,4,
0,0,54,55,5,9,0,0,55,13,1,0,0,0,56,57,7,0,0,0,57,15,1,0,0,0,4,22,38,42,45];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class Tema39568Parser extends antlr4.Parser {

    static grammarFileName = "Tema39568.g4";
    static literalNames = [ null, "'if'", "'else'", "'printf'", "'return'", 
                            "'('", "')'", "'{'", "'}'", "';'", "'0'", "'1'" ];
    static symbolicNames = [ null, "IF", "ELSE", "PRINTF", "RETURN", "LPAREN", 
                             "RPAREN", "LBRACE", "RBRACE", "SEMI", "CERO", 
                             "UNO", "CADENA", "WS" ];
    static ruleNames = [ "programa", "instrucciones", "instruccion", "decision", 
                         "sentencia", "salida", "terminar", "condicion" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = Tema39568Parser.ruleNames;
        this.literalNames = Tema39568Parser.literalNames;
        this.symbolicNames = Tema39568Parser.symbolicNames;
    }



	programa() {
	    let localctx = new ProgramaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, Tema39568Parser.RULE_programa);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 16;
	        this.instrucciones();
	        this.state = 17;
	        this.match(Tema39568Parser.EOF);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	instrucciones() {
	    let localctx = new InstruccionesContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, Tema39568Parser.RULE_instrucciones);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 20; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 19;
	            this.instruccion();
	            this.state = 22; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(_la===1);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	instruccion() {
	    let localctx = new InstruccionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, Tema39568Parser.RULE_instruccion);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 24;
	        this.decision();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	decision() {
	    let localctx = new DecisionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, Tema39568Parser.RULE_decision);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 26;
	        this.match(Tema39568Parser.IF);
	        this.state = 27;
	        this.match(Tema39568Parser.LPAREN);
	        this.state = 28;
	        this.condicion();
	        this.state = 29;
	        this.match(Tema39568Parser.RPAREN);
	        this.state = 30;
	        this.match(Tema39568Parser.LBRACE);
	        this.state = 31;
	        this.sentencia();
	        this.state = 32;
	        this.match(Tema39568Parser.RBRACE);
	        this.state = 38;
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        if(_la===2) {
	            this.state = 33;
	            this.match(Tema39568Parser.ELSE);
	            this.state = 34;
	            this.match(Tema39568Parser.LBRACE);
	            this.state = 35;
	            this.sentencia();
	            this.state = 36;
	            this.match(Tema39568Parser.RBRACE);
	        }

	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	sentencia() {
	    let localctx = new SentenciaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, Tema39568Parser.RULE_sentencia);
	    var _la = 0;
	    try {
	        this.state = 45;
	        this._errHandler.sync(this);
	        switch(this._input.LA(1)) {
	        case 3:
	            localctx = new SalidaExprContext(this, localctx);
	            this.enterOuterAlt(localctx, 1);
	            this.state = 40;
	            this.salida();
	            this.state = 42;
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	            if(_la===3 || _la===4) {
	                this.state = 41;
	                this.sentencia();
	            }

	            break;
	        case 4:
	            localctx = new TerminarExprContext(this, localctx);
	            this.enterOuterAlt(localctx, 2);
	            this.state = 44;
	            this.terminar();
	            break;
	        default:
	            throw new antlr4.error.NoViableAltException(this);
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	salida() {
	    let localctx = new SalidaContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 10, Tema39568Parser.RULE_salida);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 47;
	        this.match(Tema39568Parser.PRINTF);
	        this.state = 48;
	        this.match(Tema39568Parser.LPAREN);
	        this.state = 49;
	        this.match(Tema39568Parser.CADENA);
	        this.state = 50;
	        this.match(Tema39568Parser.RPAREN);
	        this.state = 51;
	        this.match(Tema39568Parser.SEMI);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	terminar() {
	    let localctx = new TerminarContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 12, Tema39568Parser.RULE_terminar);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 53;
	        this.match(Tema39568Parser.RETURN);
	        this.state = 54;
	        this.match(Tema39568Parser.SEMI);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	condicion() {
	    let localctx = new CondicionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 14, Tema39568Parser.RULE_condicion);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 56;
	        _la = this._input.LA(1);
	        if(!(_la===10 || _la===11)) {
	        this._errHandler.recoverInline(this);
	        }
	        else {
	        	this._errHandler.reportMatch(this);
	            this.consume();
	        }
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

Tema39568Parser.EOF = antlr4.Token.EOF;
Tema39568Parser.IF = 1;
Tema39568Parser.ELSE = 2;
Tema39568Parser.PRINTF = 3;
Tema39568Parser.RETURN = 4;
Tema39568Parser.LPAREN = 5;
Tema39568Parser.RPAREN = 6;
Tema39568Parser.LBRACE = 7;
Tema39568Parser.RBRACE = 8;
Tema39568Parser.SEMI = 9;
Tema39568Parser.CERO = 10;
Tema39568Parser.UNO = 11;
Tema39568Parser.CADENA = 12;
Tema39568Parser.WS = 13;

Tema39568Parser.RULE_programa = 0;
Tema39568Parser.RULE_instrucciones = 1;
Tema39568Parser.RULE_instruccion = 2;
Tema39568Parser.RULE_decision = 3;
Tema39568Parser.RULE_sentencia = 4;
Tema39568Parser.RULE_salida = 5;
Tema39568Parser.RULE_terminar = 6;
Tema39568Parser.RULE_condicion = 7;

class ProgramaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = Tema39568Parser.RULE_programa;
    }

	instrucciones() {
	    return this.getTypedRuleContext(InstruccionesContext,0);
	};

	EOF() {
	    return this.getToken(Tema39568Parser.EOF, 0);
	};

	enterRule(listener) {
	    if(listener instanceof Tema39568Listener ) {
	        listener.enterPrograma(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof Tema39568Listener ) {
	        listener.exitPrograma(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof Tema39568Visitor ) {
	        return visitor.visitPrograma(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class InstruccionesContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = Tema39568Parser.RULE_instrucciones;
    }

	instruccion = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(InstruccionContext);
	    } else {
	        return this.getTypedRuleContext(InstruccionContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof Tema39568Listener ) {
	        listener.enterInstrucciones(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof Tema39568Listener ) {
	        listener.exitInstrucciones(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof Tema39568Visitor ) {
	        return visitor.visitInstrucciones(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class InstruccionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = Tema39568Parser.RULE_instruccion;
    }

	decision() {
	    return this.getTypedRuleContext(DecisionContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof Tema39568Listener ) {
	        listener.enterInstruccion(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof Tema39568Listener ) {
	        listener.exitInstruccion(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof Tema39568Visitor ) {
	        return visitor.visitInstruccion(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class DecisionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = Tema39568Parser.RULE_decision;
    }

	IF() {
	    return this.getToken(Tema39568Parser.IF, 0);
	};

	LPAREN() {
	    return this.getToken(Tema39568Parser.LPAREN, 0);
	};

	condicion() {
	    return this.getTypedRuleContext(CondicionContext,0);
	};

	RPAREN() {
	    return this.getToken(Tema39568Parser.RPAREN, 0);
	};

	LBRACE = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(Tema39568Parser.LBRACE);
	    } else {
	        return this.getToken(Tema39568Parser.LBRACE, i);
	    }
	};


	sentencia = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(SentenciaContext);
	    } else {
	        return this.getTypedRuleContext(SentenciaContext,i);
	    }
	};

	RBRACE = function(i) {
		if(i===undefined) {
			i = null;
		}
	    if(i===null) {
	        return this.getTokens(Tema39568Parser.RBRACE);
	    } else {
	        return this.getToken(Tema39568Parser.RBRACE, i);
	    }
	};


	ELSE() {
	    return this.getToken(Tema39568Parser.ELSE, 0);
	};

	enterRule(listener) {
	    if(listener instanceof Tema39568Listener ) {
	        listener.enterDecision(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof Tema39568Listener ) {
	        listener.exitDecision(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof Tema39568Visitor ) {
	        return visitor.visitDecision(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class SentenciaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = Tema39568Parser.RULE_sentencia;
    }


	 
		copyFrom(ctx) {
			super.copyFrom(ctx);
		}

}


class TerminarExprContext extends SentenciaContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	terminar() {
	    return this.getTypedRuleContext(TerminarContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof Tema39568Listener ) {
	        listener.enterTerminarExpr(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof Tema39568Listener ) {
	        listener.exitTerminarExpr(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof Tema39568Visitor ) {
	        return visitor.visitTerminarExpr(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

Tema39568Parser.TerminarExprContext = TerminarExprContext;

class SalidaExprContext extends SentenciaContext {

    constructor(parser, ctx) {
        super(parser);
        super.copyFrom(ctx);
    }

	salida() {
	    return this.getTypedRuleContext(SalidaContext,0);
	};

	sentencia() {
	    return this.getTypedRuleContext(SentenciaContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof Tema39568Listener ) {
	        listener.enterSalidaExpr(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof Tema39568Listener ) {
	        listener.exitSalidaExpr(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof Tema39568Visitor ) {
	        return visitor.visitSalidaExpr(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}

Tema39568Parser.SalidaExprContext = SalidaExprContext;

class SalidaContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = Tema39568Parser.RULE_salida;
    }

	PRINTF() {
	    return this.getToken(Tema39568Parser.PRINTF, 0);
	};

	LPAREN() {
	    return this.getToken(Tema39568Parser.LPAREN, 0);
	};

	CADENA() {
	    return this.getToken(Tema39568Parser.CADENA, 0);
	};

	RPAREN() {
	    return this.getToken(Tema39568Parser.RPAREN, 0);
	};

	SEMI() {
	    return this.getToken(Tema39568Parser.SEMI, 0);
	};

	enterRule(listener) {
	    if(listener instanceof Tema39568Listener ) {
	        listener.enterSalida(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof Tema39568Listener ) {
	        listener.exitSalida(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof Tema39568Visitor ) {
	        return visitor.visitSalida(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class TerminarContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = Tema39568Parser.RULE_terminar;
    }

	RETURN() {
	    return this.getToken(Tema39568Parser.RETURN, 0);
	};

	SEMI() {
	    return this.getToken(Tema39568Parser.SEMI, 0);
	};

	enterRule(listener) {
	    if(listener instanceof Tema39568Listener ) {
	        listener.enterTerminar(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof Tema39568Listener ) {
	        listener.exitTerminar(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof Tema39568Visitor ) {
	        return visitor.visitTerminar(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}



class CondicionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = Tema39568Parser.RULE_condicion;
    }

	CERO() {
	    return this.getToken(Tema39568Parser.CERO, 0);
	};

	UNO() {
	    return this.getToken(Tema39568Parser.UNO, 0);
	};

	enterRule(listener) {
	    if(listener instanceof Tema39568Listener ) {
	        listener.enterCondicion(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof Tema39568Listener ) {
	        listener.exitCondicion(this);
		}
	}

	accept(visitor) {
	    if ( visitor instanceof Tema39568Visitor ) {
	        return visitor.visitCondicion(this);
	    } else {
	        return visitor.visitChildren(this);
	    }
	}


}




Tema39568Parser.ProgramaContext = ProgramaContext; 
Tema39568Parser.InstruccionesContext = InstruccionesContext; 
Tema39568Parser.InstruccionContext = InstruccionContext; 
Tema39568Parser.DecisionContext = DecisionContext; 
Tema39568Parser.SentenciaContext = SentenciaContext; 
Tema39568Parser.SalidaContext = SalidaContext; 
Tema39568Parser.TerminarContext = TerminarContext; 
Tema39568Parser.CondicionContext = CondicionContext; 
