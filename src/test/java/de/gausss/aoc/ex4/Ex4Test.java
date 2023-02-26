package de.gausss.aoc.ex4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex4Test {
    private final Ex4 exercise = new Ex4("ex4-test.txt");

    @Test
    void testA() {
        assertEquals(2L, exercise.solveA());
    }

}
