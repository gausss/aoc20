package de.gausss.aoc.ex5;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

import de.gausss.aoc.Solvable;
import de.gausss.aoc.Utils;

class Ex5 implements Solvable {

    private final List<String> data;
    private final static int[] ROWS = IntStream.range(0, 128).toArray();
    private final static int[] COLUMNS = IntStream.range(0, 8).toArray();

    public static void main(String[] args) throws Exception {
        new Ex5("ex5.txt").solve();
    }

    public Ex5(String dataFile) throws URISyntaxException, IOException {
        data = Utils.readInputLines(dataFile);
    }

    @Override
    public Number solveA() {
        return data.stream()
                .map(this::parseSeatId)
                .max(Comparator.naturalOrder())
                .orElse(0);
    }

    private int parseSeatId(String boardingPasscode) {
        var rowCode = boardingPasscode.substring(0, 7);
        var columnCode = boardingPasscode.substring(7);

        return parseCode(Ex5.ROWS, rowCode) * 8 + parseCode(Ex5.COLUMNS, columnCode);
    }

    private int parseCode(int[] inputRange, String code) {
        if (inputRange.length == 1) {
            return inputRange[0];
        }

        var remainingInput = binaryPartition(inputRange, code.charAt(0));
        var remainingCode = code.substring(1);
        return parseCode(remainingInput, remainingCode);
    }

    private int[] binaryPartition(int[] input, char key) {
        var mid = input.length / 2;
        if ('F' == key || 'L' == key) {
            return Arrays.copyOfRange(input, 0, mid);
        } else if ('B' == key || 'R' == key) {
            return Arrays.copyOfRange(input, mid, input.length);
        }

        return new int[]{};
    }
}
