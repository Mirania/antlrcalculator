// Generated from C:/Users/Utilizador/eclipse-workspace/misc/src/calcv2\Grammar.g4 by ANTLR 4.7.2
package calculator.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(GrammarParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(GrammarParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parexpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParexpr(GrammarParser.ParexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parexpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParexpr(GrammarParser.ParexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code highexpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterHighexpr(GrammarParser.HighexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code highexpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitHighexpr(GrammarParser.HighexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalexpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralexpr(GrammarParser.LiteralexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalexpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralexpr(GrammarParser.LiteralexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code implicitexpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterImplicitexpr(GrammarParser.ImplicitexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code implicitexpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitImplicitexpr(GrammarParser.ImplicitexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powexpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPowexpr(GrammarParser.PowexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powexpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPowexpr(GrammarParser.PowexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lowexpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLowexpr(GrammarParser.LowexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lowexpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLowexpr(GrammarParser.LowexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#parens}.
	 * @param ctx the parse tree
	 */
	void enterParens(GrammarParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#parens}.
	 * @param ctx the parse tree
	 */
	void exitParens(GrammarParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(GrammarParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(GrammarParser.LiteralContext ctx);
}