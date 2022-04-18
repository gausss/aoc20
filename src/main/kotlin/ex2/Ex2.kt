package ex2

import readInputLines

fun solveA(input: List<String>): Int {
    return input
        .map { parsePolicy(it) }
        .map { it.isValidA() }
        .count { it == true }
}

fun solveB(input: List<String>): Int {
    return input
        .map { parsePolicy(it) }
        .map { it.isValidB() }
        .count { it == true }
}

fun parsePolicy(input: String): Policy {
    val splits = input.split(" ")
    val occurences = splits[0].split("-")
    val match = splits[1][0];

    return Policy(occurences[0].toInt(), occurences[1].toInt(), match, splits[2]);
}

fun main(args: Array<String>) {
    val input = readInputLines("ex2.txt")
    val resultA = solveA(input)
    println("A: $resultA")
    val resultB = solveB(input)
    println("B: $resultB")
}

