package ex1

import readInputNumbers

fun solveA(input: List<Int>): Int {
    for (numA: Int in input) {
        for (numB: Int in input) {
            if (numA + numB == 2020) {
                return numA * numB
            }
        }
    }

    return 0;
}

fun solveB(input: List<Int>): Int {
    for (numA: Int in input) {
        for (numB: Int in input) {
            for (numC: Int in input) {
                if (numA + numB + numC == 2020) {
                    return numA * numB * numC
                }
            }
        }
    }

    return 0;
}

fun main(args: Array<String>) {
    val input = readInputNumbers("ex1.txt")
    val resultA = solveA(input)
    println("A: $resultA")
    val resultB = solveB(input)
    println("B: $resultB")
}

