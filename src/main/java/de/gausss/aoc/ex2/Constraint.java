package de.gausss.aoc.ex2;

import java.util.function.Predicate;

record Constraint(int lower, int upper, char match, String content) {

    public boolean isValid(Predicate<Constraint> policy) {
        return policy.test(this);
    }

    public static Constraint from(String input) {
        var splits = input.split(" ");
        var occurrences = splits[0].split("-");
        var match = splits[1].charAt(0);

        return new Constraint(Integer.parseInt(occurrences[0]), Integer.parseInt(occurrences[1]), match, splits[2]);
    }
}