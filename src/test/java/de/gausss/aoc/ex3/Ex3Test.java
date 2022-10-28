package de.gausss.aoc.ex3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Ex3Test {
    private Ex3 exercise = new Ex3("ex3-test.txt");

    @Test
    void testA() {
        assertEquals(7, exercise.solveA());
    }

    @Test
    void testB() {
        assertEquals(336, exercise.solveB());
    }
}
