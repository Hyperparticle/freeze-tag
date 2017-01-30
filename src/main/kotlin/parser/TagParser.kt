package parser

import java.util.*

/**
 * Parses input strings and outputs formatted Tag statements.
 *
 * Created on 1/29/2017
 * @author Dan Kondratyuk
 */
class TagParser {

    fun parse(statement: String): TagStatement {
        val tagStatement = TagStatement()

        // Please forgive me for this messy imperative code

        val tokens = splitTokens(statement)

        tokens
                .filter { !it.isNullOrBlank() }
                .forEach {
                    val expression = parseExpression(it)
                    tagStatement.add(expression)
                }

        return tagStatement
    }

    private fun splitTokens(statement: String): List<String> {
        val symbolConjunction = TagSymbol.symbolTable.keys
                .map { Regex.escape(it) }
                .joinToString("|")
        val symbolRegex = Regex("(?=($symbolConjunction))")

        val split = statement.split(symbolRegex)
                .map(String::trim)

        return split
    }

    private fun parseExpression(token: String): TagExpression {
        if (token.isNullOrBlank()) {
            throw ParseException("Expression cannot be blank.")
        }

        val symbol = TagSymbol.symbolTable[token.substring(0, 1)]
                ?: throw ParseException("Expression must start with a symbol: $token")

        val keyValuePair = token
                .substring(1)
                .split(Regex("\\s+"), 2)

        val isRequest = keyValuePair[0].endsWith(TagSymbol.requestSymbol)

        val key = when {
            isRequest -> keyValuePair[0].dropLast(1)
            else -> keyValuePair[0]
        }

        val value = when {
            keyValuePair.size > 1 -> keyValuePair[1]
            else -> ""
        }

        if (key.isNullOrBlank() && !value.isNullOrBlank()) {
            throw ParseException("Expression symbol must be a prefix: $token")
        }

        if (key.contains(TagSymbol.requestSymbol) || value.contains(TagSymbol.requestSymbol)) {
            throw ParseException("Expression can only have one request symbol as a postfix $token")
        }

        return TagExpression(symbol, key, value, isRequest)
    }

}