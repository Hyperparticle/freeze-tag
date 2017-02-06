package tag.grammar

/**
 *
 *
 * Created on 2/5/2017
 * @author Dan Kondratyuk
 */
data class TagStatement(
    val subject: TagNode,
    val relation: TagRelation?,
    val obj: TagNode?
)