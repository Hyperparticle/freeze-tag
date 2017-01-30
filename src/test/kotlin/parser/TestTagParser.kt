package parser

import io.kotlintest.specs.StringSpec

/**
 * Tests for parsing the Tag grammar.
 *
 * Created on 1/29/2017
 * @author Dan Kondratyuk
 */
class TestTagParser : StringSpec() {

    init {
        "should parse a valid expression" {
            val singleExpressionTable = table(
                    headers("input", "symbol", "key", "value", "isRequest"),

                    row("@",                 TagSymbol.AT,    "",       "", false),
                    row("@widget",           TagSymbol.AT,    "widget", "", false),
                    row("@?",                TagSymbol.AT,    "",       "", true),
                    row("@gadget?",          TagSymbol.AT,    "gadget", "", true),
                    row(" \n\t@thing? \t ",  TagSymbol.AT,    "thing",  "", true),
                    row("#n",                TagSymbol.HASH,  "n",      "", false),
                    row("#name?",            TagSymbol.HASH,  "name",   "", true),

                    row("#name dog",         TagSymbol.HASH,  "name", "dog",       false),
                    row("+name dog",         TagSymbol.PLUS,  "name", "dog",       false),
                    row("-name dog",         TagSymbol.MINUS, "name", "dog",       false),
                    row("-has a dog",        TagSymbol.MINUS, "has",  "a dog",     false),
                    row(" #name\tan ant\n",  TagSymbol.HASH,  "name", "an ant",    false),
                    row("+has a\tb c\nd ",   TagSymbol.PLUS,  "has",  "a\tb c\nd", false)
            )

            val parser = TagParser()

            forAll(singleExpressionTable) {input, symbol, key, value, isRequest ->
                val statement = parser.parse(input)
                val expressions = statement.expressions

                expressions should haveSize(1)
                val expression = expressions.first()

                expression.symbol shouldBe symbol
                expression.key shouldBe key
                expression.value shouldBe value
                expression.isRequest shouldBe isRequest
            }
        }

        "should parse a valid multi-expression" {
            val multiExpressionTable = table(
                    headers("input", "count", "keys", "values"),

                    row("#name dog #color brown",   2, listOf("name", "color"),    listOf("dog", "brown")),
                    row("#name a b c  #name a b c", 2, listOf("name", "name"),     listOf("a b c", "a b c")),
                    row("#a b -c d #e f +g h",      4, listOf("a", "c", "f", "g"), listOf("b", "d", "f", "h"))
            )

            val parser = TagParser()

            forAll(multiExpressionTable) { input, count, keys, values ->
                val statement = parser.parse(input)
                val expressions = statement.expressions

                expressions should haveSize(count)

                // Zip the three lists into one
                val expectedPairs = keys.zip(values)
                expressions.zip(expectedPairs).forEach { pair ->
                    val expression = pair.first
                    val expectedKey = pair.second.first
                    val expectedValue = pair.second.second

                    expression.key shouldBe expectedKey
                    expression.value shouldBe expectedValue
                }
            }
        }

        "should parse a valid statement" {
            val statementTable = table(
                    headers("input", "count", "keys", "values"),

                    row("@person #name Emily", 2, listOf("person", "name"), listOf("", "Emily")),
                    row("@T #k v1 #k v2",      3, listOf("T", "k", "k"), listOf("", "v1", "v2")),
                    row("@T #k1 v1 #k3 @T #k2 v2", 5,
                            listOf("T", "k1", "k3", "T", "k2"),
                            listOf("",  "v1", "",   "",  "v2")
                    )
            )

            val parser = TagParser()

            forAll(statementTable) { input, size, keys, values ->
                val statement = parser.parse(input)
                val expressions = statement.expressions

                expressions should haveSize(size)

                // Zip the three lists into one
                val expectedPairs = keys.zip(values)
                expressions.zip(expectedPairs).forEach { pair ->
                    val expression = pair.first
                    val expectedKey = pair.second.first
                    val expectedValue = pair.second.second

                    expression.key shouldBe expectedKey
                    expression.value shouldBe expectedValue
                }
            }
        }

        "should fail to parse an invalid expression" {
            val statementTable = table(
                    headers("input"),
                    row("?"), row("@ ?"), row("# ?"),
                    row("hello?"), row("this should fail"), row("thisToo"),
                    row("@spot # the error"), row("+fail ?")
            )

            val parser = TagParser()

            forAll(statementTable) { input ->
                shouldThrow<ParseException> {
                    parser.parse(input)
                }
            }
        }
    }

}