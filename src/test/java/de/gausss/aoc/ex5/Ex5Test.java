package de.gausss.aoc.ex5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex5Test {
    private final Ex5 exercise = new Ex5("ex5-test.txt");

    @Test
    void testA() {
        assertEquals(820, exercise.solveA());
    }

}
