package de.gauss.aoc.ex2;

import de.gausss.aoc.ex2.Ex2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
