// Generated from C:/Users/hyper/Documents/GitHub/freeze-tag/src/main/antlr\FreezeTag.g4 by ANTLR 4.6
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FreezeTagParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FreezeTagVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FreezeTagParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(FreezeTagParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreezeTagParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(FreezeTagParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreezeTagParser#subject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubject(FreezeTagParser.SubjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreezeTagParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(FreezeTagParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreezeTagParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode(FreezeTagParser.NodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreezeTagParser#nodeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeType(FreezeTagParser.NodeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreezeTagParser#nodeProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeProperty(FreezeTagParser.NodePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FreezeTagParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(FreezeTagParser.RelationContext ctx);
}