package de.gausss.aoc.ex1;

import de.gausss.aoc.AocExercise;
import de.gausss.aoc.AocUtils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

class Ex1 extends AocExercise<List<Integer>> {
    public static void main(String[] args) {
        new Ex1("ex1.txt").solve();
    }

    public Ex1(String dataFile) {
        super(dataFile);
    }

    @Override
    protected List<Integer> readData(String dataFile) throws URISyntaxException, IOException {
        return AocUtils.readInputNumbers(dataFile);
    }

    @Override
    public int solveA() {
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
    public int solveB() {
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
