package de.gausss.aoc.ex4;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;

import de.gausss.aoc.Exercise;
import de.gausss.aoc.Utils;

class Ex4 extends Exercise<List<String>> {
    public static void main(String[] args) {
        new Ex4("ex4.txt").solve();
    }

    public Ex4(String dataFile) {
        super(dataFile);
    }

    @Override
    protected List<String> readData(String dataFile) throws URISyntaxException, IOException {
        return Arrays.stream(Utils.readString(dataFile).split("\\n\\n")).toList();
    }

    @Override
    public Number solveA() {
        return data.stream()
                .map(Passport::fromString)
                .filter(Passport::isValid)
                .count();
    }

    @Override
    public Number solveB() {
        return 0;
    }
}
