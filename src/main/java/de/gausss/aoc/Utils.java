package de.gausss.aoc;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public final class Utils {

    public static String readString(String name) throws URISyntaxException, IOException {
        return Files.readString(Path.of(ClassLoader.getSystemResource(name).toURI()));
    }

    public static List<String> readInputLines(String name) throws URISyntaxException, IOException {
        return Files.readAllLines(Path.of(ClassLoader.getSystemResource(name).toURI())).stream().toList();
    }

    public static List<Integer> readInputNumbers(String name) throws URISyntaxException, IOException {
        return Files.readAllLines(Path.of(ClassLoader.getSystemResource(name).toURI())).stream().map(Integer::valueOf).toList();
    }

    public static boolean xor(boolean a, boolean b) {
        return (a && !b) || (!a && b);
    }
}
