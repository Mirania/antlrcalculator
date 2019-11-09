// Generated from C:/Users/Utilizador/eclipse-workspace/misc/src/calcv2\Grammar.g4 by ANTLR 4.7.2
package calculator.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(GrammarParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parexpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParexpr(GrammarParser.ParexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code highexpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHighexpr(GrammarParser.HighexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalexpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralexpr(GrammarParser.LiteralexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sqrtexpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqrtexpr(GrammarParser.SqrtexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code implicitexpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicitexpr(GrammarParser.ImplicitexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powexpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowexpr(GrammarParser.PowexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lowexpr}
	 * labeled alternative in {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLowexpr(GrammarParser.LowexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#parens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(GrammarParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(GrammarParser.LiteralContext ctx);
}