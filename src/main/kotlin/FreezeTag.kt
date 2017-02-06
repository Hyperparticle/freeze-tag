import parser.ParseException
import parser.TagParser

/**
 * The main program entry point.
 *
 * Created on 1/29/2017
 * @author Dan Kondratyuk
 */
fun main(args: Array<String>) {
    val parser = TagParser()

    // Evaluate Tag statements in a loop
    System.`in`.reader().forEachLine { line ->
        val statement = try {
            parser.parse(line)
        } catch (e: ParseException) {
            System.err.println(e.message)
            return@forEachLine
        }

        println(statement)
    }


//    val cs = ANTLRInputStream(`is`)
//    val lexer = FreezeTagLexer(cs)
//    val tokens = CommonTokenStream(lexer)
//    val parser = FreezeTagParser(tokens)
//    parser.addParseListener(TagListener())
//    parser.start()
}

//private class TagListener : FreezeTagBaseListener() {
//
//}