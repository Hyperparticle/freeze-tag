package parser

/**
 * A symbol prefix for an expression.
 *
 * Created on 1/29/2017
 *
 * @param symbol the associated string
 *
 * @author Dan Kondratyuk
 */
enum class TagSymbol(val symbol: String) {
    AT("@"),
    HASH("#"),
    PLUS("+"),
    MINUS("-");

    companion object {
        /** Maps symbol strings to their corresponding enumerated type */
        val symbolMap: Map<String, TagSymbol> = TagSymbol.values().associateBy({ it.symbol }, { it } )

        /** The symbol to indicate if the expression is a request */
        val requestSymbol: String = "?"

        private val symbolConjunction = TagSymbol.symbolMap.keys
                .map { Regex.escape(it) }
                .joinToString("|")

        /** A regex that matches an expression by its symbol prefix (using lookahead) */
        val symbolRegex = Regex("(?=($symbolConjunction))")
    }
}