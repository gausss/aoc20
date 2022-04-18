package ex1

import org.junit.jupiter.api.Test
import readInputLines
import kotlin.test.assertEquals

internal class Ex1Test {

    @Test
    fun testEx1() {
        val input = readInputLines("ex1-test.txt")
        assertEquals(ex1.solve(input), 514579)
    }
}