package de.gausss.aoc.ex2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Ex2Test {
    private Ex2 exercise = new Ex2("ex2-test.txt");

    @Test
    void testA() {
        assertEquals(2, exercise.solveA());
    }

    @Test
    void testB() {
        assertEquals(1, exercise.solveB());
    }
}
