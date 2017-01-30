package parser

/**
 * A symbol prefix string for an expression.
 *
 * Created on 1/29/2017
 * @author Dan Kondratyuk
 */
enum class TagSymbol(val symbol: String) {
    AT("@"),
    HASH("#"),
    PLUS("+"),
    MINUS("-");

    companion object {
        /** Maps symbol strings to their corresponding enumerated type */
        val symbolTable: Map<String, TagSymbol> = TagSymbol.values().associateBy({ it.symbol }, { it } )
        val requestSymbol: String = "?"
    }
}