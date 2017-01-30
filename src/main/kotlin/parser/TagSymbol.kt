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
        val symbolTable: Map<String, TagSymbol> = mapOf(
                "@" to AT,
                "#" to HASH,
                "+" to PLUS,
                "-" to MINUS
        )

        val symbols: Set<String> = symbolTable.keys
    }
}