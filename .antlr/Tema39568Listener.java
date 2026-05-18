// Generated from /home/mapag8/Escritorio/Compilador 53804/Tema39568.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Tema39568Parser}.
 */
public interface Tema39568Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Tema39568Parser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(Tema39568Parser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tema39568Parser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(Tema39568Parser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tema39568Parser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(Tema39568Parser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tema39568Parser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(Tema39568Parser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tema39568Parser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(Tema39568Parser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tema39568Parser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(Tema39568Parser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tema39568Parser#decision}.
	 * @param ctx the parse tree
	 */
	void enterDecision(Tema39568Parser.DecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tema39568Parser#decision}.
	 * @param ctx the parse tree
	 */
	void exitDecision(Tema39568Parser.DecisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SalidaExpr}
	 * labeled alternative in {@link Tema39568Parser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSalidaExpr(Tema39568Parser.SalidaExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SalidaExpr}
	 * labeled alternative in {@link Tema39568Parser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSalidaExpr(Tema39568Parser.SalidaExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TerminarExpr}
	 * labeled alternative in {@link Tema39568Parser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterTerminarExpr(Tema39568Parser.TerminarExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TerminarExpr}
	 * labeled alternative in {@link Tema39568Parser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitTerminarExpr(Tema39568Parser.TerminarExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tema39568Parser#salida}.
	 * @param ctx the parse tree
	 */
	void enterSalida(Tema39568Parser.SalidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tema39568Parser#salida}.
	 * @param ctx the parse tree
	 */
	void exitSalida(Tema39568Parser.SalidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tema39568Parser#terminar}.
	 * @param ctx the parse tree
	 */
	void enterTerminar(Tema39568Parser.TerminarContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tema39568Parser#terminar}.
	 * @param ctx the parse tree
	 */
	void exitTerminar(Tema39568Parser.TerminarContext ctx);
	/**
	 * Enter a parse tree produced by {@link Tema39568Parser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(Tema39568Parser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Tema39568Parser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(Tema39568Parser.CondicionContext ctx);
}