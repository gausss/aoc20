package de.gausss.aoc.ex2;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.function.Predicate;

import de.gausss.aoc.Solvable;
import de.gausss.aoc.Utils;

class Ex2 implements Solvable {

    private final List<String> data;

    public static void main(String[] args) throws Exception {
        new Ex2("ex2.txt").solve();
    }

    public Ex2(String dataFile) throws URISyntaxException, IOException {
        data = Utils.readInputLines(dataFile);
    }

    @Override
    public Number solveA() {
        Predicate<Constraint> policyA = constraint -> {
            var occurrences = constraint.content()
                    .chars()
                    .filter(character -> ((char) character) == constraint.match())
                    .count();
            return constraint.lower() >= occurrences && occurrences <= constraint.upper();
        };

        return countMatching(policyA);
    }

    @Override
    public Number solveB() {
        Predicate<Constraint> policyB = constraint -> {
            var lowerMatch = constraint.content().charAt(constraint.lower() - 1) == constraint.match();
            var upperMatch = constraint.content().charAt(constraint.upper() - 1) == constraint.match();
            return Utils.xor(lowerMatch, upperMatch);
        };

        return countMatching(policyB);
    }

    private long countMatching(Predicate<Constraint> policy) {
        return data.stream()
                .map(Constraint::from)
                .filter(constraint -> constraint.isValid(policy))
                .count();
    }
}
