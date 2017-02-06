import tag.parser.*

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
        } catch (e: Exception) {
            println(e.message)
            return@forEachLine
        }

        println(statement)
    }
}
