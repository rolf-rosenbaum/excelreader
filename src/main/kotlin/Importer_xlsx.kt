import kotlin.io.path.Path

fun main() {
    val file = Path("../../Downloads/Produktliste.csv").toFile()
    val lines = mutableListOf("code;name;unit;price;")
    file.readLines().forEach {
        val (code, name, price) = it.split(";").map { l -> l.trim() }
        lines.add("$code;$name;St.;${price.drop(2)};")
    }
    val targetFile = Path("../../Downloads/produktliste_transormiert.csv").toFile()
    targetFile.writeText(lines.joinToString("\n"))
    println(lines.joinToString("\n"))
}
    
