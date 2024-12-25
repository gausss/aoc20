package de.gausss.aoc.ex4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import de.gausss.aoc.Solvable;

@TestInstance(Lifecycle.PER_CLASS)
public class Ex4Test {

    private Solvable exercise;

    @BeforeAll
    void init() throws Exception {
        exercise = new Ex4("ex4-test.txt");
    }

    @Test
    void testA() {
        assertEquals(2L, exercise.solveA());
    }

}
