package de.gausss.aoc.ex6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex6Test {
    private final Ex6 exercise = new Ex6("ex6-test.txt");

    @Test
    void solveA() {
        assertEquals(exercise.solveA(), 11);
    }

    @Test
    void solveB() {
        assertEquals(exercise.solveA(), 0);
    }
}