import java.io.File

fun readInputLines(name: String): List<String> {
    return File(ClassLoader.getSystemResource(name).toURI()).readLines(Charsets.UTF_8);
}