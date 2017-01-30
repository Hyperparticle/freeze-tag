package parser

/**
 * A Tag expression, composed of a prefix symbol, a key-value pair, and a request designation.
 *
 * Created on 1/29/2017
 * @author Dan Kondratyuk
 */
data class TagExpression(
        val symbol: TagSymbol,
        val key: String,
        val value: String,
        val isRequest: Boolean
)