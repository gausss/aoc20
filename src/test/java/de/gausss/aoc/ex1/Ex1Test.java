package de.gausss.aoc.ex1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import de.gausss.aoc.Solvable;

@TestInstance(Lifecycle.PER_CLASS)
public class Ex1Test {

    private Solvable exercise;

    @BeforeAll
    void init() throws Exception {
        exercise = new Ex1("ex1-test.txt");
    }

    @Test
    void testA() {
        assertEquals(exercise.solveA(), 514579);
    }

    @Test
    void testB() {
        assertEquals(exercise.solveB(), 241861950);
    }
}
