package de.gausss.aoc;

import java.io.IOException;
import java.net.URISyntaxException;

public abstract class AocExercise<T> {
    protected T data;

    public AocExercise(String dataFile) {
        try {
            data = readData(dataFile);
        } catch (IOException | URISyntaxException e) {
           throw new IllegalArgumentException("Failed to read input file.", e);
        }
    }

    public void solve() {
        System.out.printf("Part A -> %s \n", solveA());
        System.out.printf("Part B -> %s", solveB());
    }

    protected abstract T readData(String dataFile) throws URISyntaxException, IOException;

    public abstract int solveA();

    public abstract int solveB();
}
