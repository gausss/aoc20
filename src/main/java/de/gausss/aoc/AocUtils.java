package de.gausss.aoc;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public final class AocUtils {

    public static List<String> readInputLines(String name) throws URISyntaxException, IOException {
        return Files.readAllLines(Path.of(ClassLoader.getSystemResource(name).toURI())).stream()
                .collect(Collectors.toUnmodifiableList());
    }

    public static List<Integer> readInputNumbers(String name) throws URISyntaxException, IOException {
        return Files.readAllLines(Path.of(ClassLoader.getSystemResource(name).toURI())).stream().map(Integer::valueOf)
                .collect(Collectors.toUnmodifiableList());
    }

    public static boolean xor(boolean a, boolean b) {
        return (a && !b) || (!a && b);
    }
}
