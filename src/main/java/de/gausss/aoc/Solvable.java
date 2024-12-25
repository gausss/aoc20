package de.gausss.aoc;

public interface Solvable {

    default void solve() {
        System.out.printf("Part A -> %s \n", solveA());
        System.out.printf("Part B -> %s \n", solveB());
    }

    default Number solveA() {
        return 0;
    }

    default Number solveB() {
        return 0;
    }
}
