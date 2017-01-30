package parser

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

}