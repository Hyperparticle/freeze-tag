package parser

import grammar.TagExpression

/**
 * Validates the semantics of Tag statements (as a list of Tag expressions)
 *
 * Created on 1/31/2017
 * @author Dan Kondratyuk
 */
internal class TagValidator {

    /**
     * Ensures that the list of expressions is semantically valid (i.e., correct grammar)
     * @throws ParseException if the grammar is invalid
     */
    fun validate(expressions: List<TagExpression>) {
        var expectNodeTag = false
        expressions.forEach { expression ->
            if (expression.isNodeTag && !expression.isUnary) {
                throw ParseException("Expression must be unary (one value): $expression")
            } else if (expression.isPropertyTag && !expression.isBinary) {
                expectNodeTag = true
            } else if (expectNodeTag) {
                if (!expression.isNodeTag || !expression.isUnary) {
                    throw ParseException("Unary property must be followed by a unary node $expression")
                }

                expectNodeTag = false
            }
        }

        if (expectNodeTag) {
            throw ParseException("Expression must be binary (two values): ${expressions.last()}")
        }
    }

}