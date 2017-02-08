package tag.grammar

/**
 *
 *
 * Created on 2/5/2017
 * @author Dan Kondratyuk
 */
data class TagNode(
        val type: String,
        val create: List<Pair<String, String>>,
        val delete: List<Pair<String, String>>,
        val match: List<Pair<String, String>>
)
