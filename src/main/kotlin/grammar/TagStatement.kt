package grammar

import java.util.*

/**
 * A Tag statement, composed of a list of Tag expressions.
 *
 * Created on 1/29/2017
 * @author Dan Kondratyuk
 */
class TagStatement {

    val expressionList: MutableList<TagExpression> = ArrayList()
    val expressions: List<TagExpression> = expressionList

    fun add(expression: TagExpression) {
        expressionList.add(expression)
    }

    fun add(expression: List<TagExpression>) {
        expressionList.addAll(expression)
    }

    override fun toString(): String {
        return expressions.toString()
    }

}