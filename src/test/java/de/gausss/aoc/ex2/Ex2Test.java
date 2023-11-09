package de.gausss.aoc.ex2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Ex2Test {
    private final Ex2 exercise = new Ex2("ex2-test.txt");

    @Test
    void testA() {
        assertEquals(2L, exercise.solveA());
    }

    @Test
    void testB() {
        assertEquals(1L, exercise.solveB());
    }
}
