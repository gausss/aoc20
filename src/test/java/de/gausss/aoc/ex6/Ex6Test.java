package de.gausss.aoc.ex6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import de.gausss.aoc.Solvable;

@TestInstance(Lifecycle.PER_CLASS)
class Ex6Test {

    private Solvable exercise;

    @BeforeAll
    void init() throws Exception {
        exercise = new Ex6("ex6-test.txt");
    }

    @Test
    void testA() {
        assertEquals(exercise.solveA(), 11);
    }
}
