package parser

/**
 * Thrown when an invalid statement is parsed.
 *
 * Created on 1/29/2017
 * @author Dan Kondratyuk
 */
class ParseException(message: String? = null) : RuntimeException(message)