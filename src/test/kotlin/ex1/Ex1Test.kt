package ex1

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import readInputNumbers
import kotlin.test.assertEquals

internal class Ex1Test {

    var input: List<Int> = listOf();

    @BeforeEach
    internal fun setUp() {
        input = readInputNumbers("ex1-test.txt")
    }

    @Test
    fun testA() {
        assertEquals(ex1.solveA(input), 514579)
    }

    @Test
    fun testB() {
        assertEquals(ex1.solveB(input), 241861950)
    }
}