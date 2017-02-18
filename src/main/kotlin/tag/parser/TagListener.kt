package tag.parser

import tag.grammar.*

/**
 *
 *
 * Created on 2/5/2017
 * @author Dan Kondratyuk
 */
class TagListener : FreezeTagBaseListener() {

    private lateinit var subject: TagNode
    private var relation: TagRelation? = null
    private var obj: TagNode? = null

    lateinit var statement: TagStatement private set

    override fun exitStart(ctx: FreezeTagParser.StartContext?) {
        statement = TagStatement(subject, relation, obj)
    }

    override fun exitSubject(ctx: FreezeTagParser.SubjectContext) {
        subject = createNode(ctx.node())
    }

    override fun exitRelation(ctx: FreezeTagParser.RelationContext) {
        val symbol = TagSymbol[ctx.PROP_S().text.trim()]!!
        val id = ctx.ID().text.trim()
        relation = TagRelation(symbol, id)
    }

    override fun exitPredicate(ctx: FreezeTagParser.PredicateContext) {
        obj = createNode(ctx.node())
    }

    private fun createNode(ctx: FreezeTagParser.NodeContext?): TagNode {
        val type = ctx?.nodeType()?.ID()?.text?.trim()

        val create = toPropertyMap(ctx, TagSymbol.PLUS)
        val delete = toPropertyMap(ctx, TagSymbol.MINUS)
        val match = toPropertyMap(ctx, TagSymbol.HASH)

        return TagNode(type ?: "", create, delete, match)
    }

    private fun toPropertyMap(ctx: FreezeTagParser.NodeContext?, symbol: TagSymbol): List<Pair<String, String>> {
        return ctx?.nodeProperty().orEmpty()
                .filter { TagSymbol[it.PROP_S().text.trim()]!! == symbol }
                .map {
                    val key = it.ID().text.trim()
                    val value = it.string().text.trim()
                    Pair(key, value)
                }
    }

}