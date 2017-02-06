// Generated from C:/Users/hyper/Documents/GitHub/freeze-tag/src/main/antlr\FreezeTag.g4 by ANTLR 4.6
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FreezeTagParser}.
 */
public interface FreezeTagListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FreezeTagParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(FreezeTagParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreezeTagParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(FreezeTagParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreezeTagParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(FreezeTagParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreezeTagParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(FreezeTagParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreezeTagParser#subject}.
	 * @param ctx the parse tree
	 */
	void enterSubject(FreezeTagParser.SubjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreezeTagParser#subject}.
	 * @param ctx the parse tree
	 */
	void exitSubject(FreezeTagParser.SubjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreezeTagParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(FreezeTagParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreezeTagParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(FreezeTagParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreezeTagParser#node}.
	 * @param ctx the parse tree
	 */
	void enterNode(FreezeTagParser.NodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreezeTagParser#node}.
	 * @param ctx the parse tree
	 */
	void exitNode(FreezeTagParser.NodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreezeTagParser#nodeType}.
	 * @param ctx the parse tree
	 */
	void enterNodeType(FreezeTagParser.NodeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreezeTagParser#nodeType}.
	 * @param ctx the parse tree
	 */
	void exitNodeType(FreezeTagParser.NodeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreezeTagParser#nodeProperty}.
	 * @param ctx the parse tree
	 */
	void enterNodeProperty(FreezeTagParser.NodePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreezeTagParser#nodeProperty}.
	 * @param ctx the parse tree
	 */
	void exitNodeProperty(FreezeTagParser.NodePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link FreezeTagParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(FreezeTagParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FreezeTagParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(FreezeTagParser.RelationContext ctx);
}