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
        val symbol = TagSymbol[ctx.PROP_S().text]!!
        val id = ctx.ID().text
        relation = TagRelation(symbol, id)
    }

    override fun exitPredicate(ctx: FreezeTagParser.PredicateContext) {
        obj = createNode(ctx.node())
    }

    private fun createNode(ctx: FreezeTagParser.NodeContext?): TagNode {
        val type = ctx?.nodeType()?.ID()?.text
        val properties = ctx?.nodeProperty()?.map {
            val symbol = TagSymbol[it.PROP_S().text]!!
            val key = it.ID(0).text
            val value = it.ID(1).text
            TagProperty(symbol, key, value)
        }

        return TagNode(type, properties)
    }

}