package ex2

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import readInputLines
import kotlin.test.assertEquals


internal class Ex2Test {
    var input: List<String> = listOf();

    @BeforeEach
    fun setUp() {
        input = readInputLines("ex2-test.txt")
    }

    @Test
    fun testA() {
        assertEquals(2, ex2.solveA(input))

    }

    @Test
    fun testB() {
        assertEquals(1, ex2.solveB(input))

    }
}