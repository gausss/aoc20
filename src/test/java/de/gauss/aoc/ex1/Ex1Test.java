package de.gauss.aoc.ex1;

import de.gausss.aoc.ex1.Ex1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex1Test {
    private Ex1 exercise = new Ex1("ex1-test.txt");

    @Test
    void testA() {
        assertEquals(exercise.solveA(), 514579);
    }

    @Test
    void testB() {
        assertEquals(exercise.solveB(), 241861950);
    }
}
