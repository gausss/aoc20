package de.gausss.aoc.ex2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import de.gausss.aoc.Solvable;

@TestInstance(Lifecycle.PER_CLASS)
public class Ex2Test {

    private Solvable exercise;

    @BeforeAll
    void init() throws Exception {
        exercise = new Ex2("ex2-test.txt");
    }

    @Test
    void testA() {
        assertEquals(2L, exercise.solveA());
    }

    @Test
    void testB() {
        assertEquals(1L, exercise.solveB());
    }
}
