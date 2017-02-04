package parser

import grammar.TagExpression
import grammar.TagStatement
import grammar.TagSymbol

/**
 * Parses input strings and outputs formatted Tag statements.
 *
 * Created on 1/29/2017
 * @author Dan Kondratyuk
 */
class TagParser {

    private val validator: TagValidator = TagValidator()

    /**
     * Parse the supplied statement and produce its corresponding statement object.
     * @throws ParseException if one of the expressions in the statement is invalid
     */
    fun parse(statement: String): TagStatement {
        val tagStatement = TagStatement()

        val expressions = parseExpressions(statement)
        validator.validate(expressions)
        tagStatement.add(expressions)

        return tagStatement
    }

    /**
     * Parse the supplied statement as a list of expressions.
     * Use this method to ignore statement-level validation.
     * @throws ParseException if one of the expressions in the statement is invalid
     */
    fun parseExpressions(statement: String): List<TagExpression> =
            splitTokens(statement)
                .filter { !it.isNullOrBlank() }
                .map{ parseExpression(it) }

    /**
     * Split the statement into its constituent (string) expressions
     */
    private fun splitTokens(statement: String): List<String> =
            statement.split(TagSymbol.symbolRegex).map(String::trim)

    /**
     * Parses the token, returning its expression value
     * @throws ParseException if the expression is invalid
     */
    private fun parseExpression(token: String): TagExpression {
        val symbol = TagSymbol.symbolMap[token.substring(0, 1)]
                ?: throw ParseException("Expression must start with a symbol: $token")

        // Split key-value pair by first occurrence of whitespace
        val keyValuePair = token
                .substring(1)
                .split(Regex("\\s+"), 2)

        val isRequest = keyValuePair[0].endsWith(TagSymbol.requestSymbol)

        val key = when {
            isRequest -> keyValuePair[0].dropLast(TagSymbol.requestSymbol.length)
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
            throw ParseException("Expression can only have one '${TagSymbol.requestSymbol}' symbol: $token")
        }

        return TagExpression(symbol, key, value, isRequest, token)
    }

}