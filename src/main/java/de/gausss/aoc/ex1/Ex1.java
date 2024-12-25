package de.gausss.aoc.ex1;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import de.gausss.aoc.Solvable;
import de.gausss.aoc.Utils;

class Ex1 implements Solvable {

    private final List<Integer> data;

    public static void main(String[] args) throws Exception {
        new Ex1("ex1.txt").solve();
    }

    public Ex1(String dataFile) throws IOException, URISyntaxException {
        data = Utils.readInputNumbers(dataFile);
    }

    @Override
    public Number solveA() {
        for (int numA : data) {
            for (int numB : data) {
                if (numA + numB == 2020) {
                    return numA * numB;
                }
            }
        }

        return 0;
    }

    @Override
    public Number solveB() {
        for (int numA : data) {
            for (int numB : data) {
                for (int numC : data) {
                    if (numA + numB + numC == 2020) {
                        return numA * numB * numC;
                    }
                }
            }
        }

        return 0;
    }
}
