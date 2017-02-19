package tag.parser

import tag.grammar.*
import java.util.*

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

        val node = TagNode(type ?: "", create, delete, match)

        validate(node)

        return node
    }

    private fun toPropertyMap(ctx: FreezeTagParser.NodeContext?, symbol: TagSymbol): List<Pair<String, String>> {
        return ctx?.nodeProperty().orEmpty()
                .filter { TagSymbol[it.PROP_S().text.trim()]!! == symbol }
                .map {
                    when {
                        it.string() == null -> Pair("", it.ID().text.trim())
                        else -> Pair(it.ID().text.trim(), it.string().text.trim())
                    }
                }
    }

    private fun validate(node: TagNode) {
        val createValue = node.create.find { it.first.isBlank() }
        if (createValue != null) {
            throw IllegalArgumentException("Create expression must have a pair of values: ${createValue.second}")
        }

        val deleteValue = node.delete.find { it.first.isBlank() }
        if (deleteValue != null) {
            throw IllegalArgumentException("Delete expression must have a pair of values: ${deleteValue.second}")
        }
    }

}