package de.gausss.aoc.ex3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import de.gausss.aoc.Solvable;

@TestInstance(Lifecycle.PER_CLASS)
public class Ex3Test {

    private Solvable exercise;

    @BeforeAll
    void init() throws Exception {
        exercise = new Ex3("ex3-test.txt");
    }

    @Test
    void testA() {
        assertEquals(7, exercise.solveA());
    }

    @Test
    void testB() {
        assertEquals(336, exercise.solveB());
    }
}
