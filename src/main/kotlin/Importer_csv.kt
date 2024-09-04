import kotlin.io.path.Path
import org.apache.poi.ss.usermodel.WorkbookFactory

fun main() {

    val file = Path("../../Downloads/Produktliste.csv").toFile()
    val sheet = WorkbookFactory.create(file).getSheetAt(0)
    val lines = mutableListOf("code;name;unit;price;")

    sheet.rowIterator().forEach {
        lines.add(
            "${it.getCell(0).toString().dropLast(2)};" +
                    it.getCell((1)).stringCellValue.replace(";", ",") + ";" +
                    "St.;" +
                    it.getCell((2)).toString().replace("€", "")
                        .replace(".0", "")
                        .replace(".", ",") + ";"
        )
    }
    lines.removeAt(1)

    val targetFile = Path("../../Downloads/produktliste_transormiert.csv").toFile()
    targetFile.writeText(lines.joinToString("\n"))
    println(lines.joinToString("\n"))
}
    
