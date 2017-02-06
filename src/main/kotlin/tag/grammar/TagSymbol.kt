package tag.grammar

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
    HASH("#"),
    PLUS("+"),
    MINUS("-");

    companion object {
        /** Maps symbol strings to their corresponding enumerated type */
        val symbolMap: Map<String, TagSymbol> = values().associateBy({ it.symbol }, { it } )

        operator fun get(key: String): TagSymbol? = symbolMap[key]
    }
}