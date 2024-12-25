package de.gausss.aoc.ex5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import de.gausss.aoc.Solvable;

@TestInstance(Lifecycle.PER_CLASS)
public class Ex5Test {

    private Solvable exercise;

    @BeforeAll
    void init() throws Exception {
        exercise = new Ex5("ex5-test.txt");
    }

    @Test
    void testA() {
        assertEquals(820, exercise.solveA());
    }

}
