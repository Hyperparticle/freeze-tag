package parser

import io.kotlintest.specs.StringSpec

/**
 *
 *
 * Created on 1/29/2017
 * @author Dan Kondratyuk
 */
class TestTagParser : StringSpec() {

    val parser = TagParser()

    init {
        "should parse a single expression statement" {
            val statement = parser.parse("#name dog")
        }
    }

}