package de.gausss.aoc.ex1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Ex1Test {
    private final Ex1 exercise = new Ex1("ex1-test.txt");

    @Test
    void testA() {
        assertEquals(exercise.solveA(), 514579);
    }

    @Test
    void testB() {
        assertEquals(exercise.solveB(), 241861950);
    }
}
