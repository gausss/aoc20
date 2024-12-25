package de.gausss.aoc.ex4;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;

import de.gausss.aoc.Solvable;
import de.gausss.aoc.Utils;

class Ex4 implements Solvable {

    private final List<String> data;

    public static void main(String[] args) throws Exception {
        new Ex4("ex4.txt").solve();
    }

    public Ex4(String dataFile) throws URISyntaxException, IOException {
        data = Arrays.stream(Utils.readString(dataFile).split("\\n\\n")).toList();
    }

    @Override
    public Number solveA() {
        return data.stream()
                .map(Passport::fromString)
                .filter(Passport::isValid)
                .count();
    }
}
