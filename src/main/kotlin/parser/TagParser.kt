package parser

import java.util.*

/**
 * Parses input strings and outputs formatted Tag statements.
 *
 * Created on 1/29/2017
 * @author Dan Kondratyuk
 */
class TagParser {

    private val symbolTokens = TagSymbol.symbols.joinToString()

    fun parse(statement: String): TagStatement {
        val tokenizer = StringTokenizer(statement, symbolTokens, true)

        val tagStatement = TagStatement()

        // Please forgive me for this messy imperative code

        val tokenScan = Scanner(statement)

        tokenScan.use {
            while (tokenScan.hasNext(symbolTokens)) {
                tokenScan.findInLine(symbolTokens)
            }
        }

        var expectToken = false
        var prevSymbol: TagSymbol? = null

        while (tokenizer.hasMoreTokens()) {
            expectToken = !expectToken
            val token = tokenizer.nextToken().trim()

            if (expectToken) {
                prevSymbol = TagSymbol.symbolTable[token]
                        ?: throw ParseException("Expression must start with a symbol: $token")
                continue
            }

            val expression = parseExpression(prevSymbol!!, token)
            tagStatement.add(expression)
        }

        return tagStatement
    }

    private fun parseExpression(symbol: TagSymbol, token: String): TagExpression {
        // Use scanner to eliminate whitespace
        val scanner = Scanner(token)

        val keyScan = scanner.next()
        val value = when { scanner.hasNext() -> scanner.next() else -> "" }
        var isRequest = false

        val key = when {
            keyScan.isEmpty() -> ""
            else -> when {
                keyScan.last() == '?' -> { isRequest = true; keyScan.dropLast(1) }
                else -> keyScan
            }
        }

        return TagExpression(symbol, key, value, isRequest)
    }

}