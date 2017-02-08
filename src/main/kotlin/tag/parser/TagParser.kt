package tag.parser

import tag.grammar.TagStatement
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream

/**
 * Parses input strings and outputs formatted Tag statements.
 *
 * Created on 1/29/2017
 * @author Dan Kondratyuk
 */
class TagParser {

    /**
     * Parse the supplied statement and produce its corresponding statement object.
     */
    fun parse(statement: String): TagStatement {
        val cs = ANTLRInputStream(statement.byteInputStream())
        val lexer = FreezeTagLexer(cs)
        val tokens = CommonTokenStream(lexer)
        val parser = FreezeTagParser(tokens)

        val listener = TagListener()

        parser.addParseListener(listener)
        parser.start()

        return listener.statement
    }

}
