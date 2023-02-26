package de.gausss.aoc.ex1;

import de.gausss.aoc.Exercise;
import de.gausss.aoc.Utils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

class Ex1 extends Exercise<List<Integer>> {
    public static void main(String[] args) {
        new Ex1("ex1.txt").solve();
    }

    public Ex1(String dataFile) {
        super(dataFile);
    }

    @Override
    protected List<Integer> readData(String dataFile) throws URISyntaxException, IOException {
        return Utils.readInputNumbers(dataFile);
    }

    @Override
    public Number solveA() {
        for (Integer numA : data) {
            for (Integer numB : data) {
                if (numA + numB == 2020) {
                    return numA * numB;
                }
            }
        }

        return 0;
    }

    @Override
    public Number solveB() {
        for (Integer numA : data) {
            for (Integer numB : data) {
                for (Integer numC : data) {
                    if (numA + numB + numC == 2020) {
                        return numA * numB * numC;
                    }
                }
            }
        }

        return 0;
    }
}
