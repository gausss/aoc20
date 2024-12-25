package de.gausss.aoc.ex6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Ex6Test {
    private final Ex6 exercise = new Ex6("ex6-test.txt");

    @Test
    void testA() {
        assertEquals(exercise.solveA(), 11);
    }
}