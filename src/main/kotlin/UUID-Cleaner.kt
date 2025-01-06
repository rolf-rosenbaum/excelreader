import kotlin.io.path.Path


fun main() {

    val file = Path("../../Downloads/delete_ids.csv").toFile()
    val foo = file.readLines().mapNotNull { line ->
        if (line.length == 36) """"${line.replace(";", "")}",""" else null
    }
    val targetFile = Path("../../Downloads/delete_ids_cleaned.csv").toFile()
    targetFile.writeText(foo.joinToString("\n"))


}