package grammar

import grammar.TagSymbol

/**
 * A Tag expression, composed of a prefix symbol, a key-value pair, and a request designation.
 *
 * Expression: (@|#|\\+|-)(.*)
 *
 * Created on 1/29/2017
 * @author Dan Kondratyuk
 */
data class TagExpression(
        val symbol: TagSymbol,
        val key: String,
        val value: String,
        val isRequest: Boolean,
        val token: String
) {
    val isNodeTag: Boolean = symbol == TagSymbol.AT
    val isPropertyTag: Boolean = !isNodeTag

    val isUnary: Boolean = value.isBlank()
    val isBinary: Boolean = !isUnary

    override fun toString(): String {
        return token
    }
}