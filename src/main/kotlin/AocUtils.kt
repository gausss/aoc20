import java.io.File

fun readInputLines(name: String): List<String> {
    return File(ClassLoader.getSystemResource(name).toURI()).readLines(Charsets.UTF_8);
}

fun readInputNumbers(name: String): List<Int> {
    return File(ClassLoader.getSystemResource(name).toURI()).readLines(Charsets.UTF_8).map {
        it.toInt();
    };
}