package de.gausss.aoc.ex6;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;

import de.gausss.aoc.Exercise;
import de.gausss.aoc.Utils;

class Ex6 extends Exercise<String> {
    public static void main(String[] args) {
        new Ex6("ex6.txt").solve();
    }

    public Ex6(String dataFile) {
        super(dataFile);
    }

    @Override
    protected String readData(String dataFile) throws URISyntaxException, IOException {
        return Utils.readString(dataFile);
    }

    @Override
    public Number solveA() {
        return Arrays.stream(data.split("\n{2}"))
                     .map(group -> group.replace("\n", ""))
                     .map(group -> group.chars().mapToObj(i -> (char) i))
                     .mapToInt(groupAnswers -> countUnique(groupAnswers.toList()))
                     .sum();
    }

    int countUnique(List<Character> answers) {
        return answers.stream().reduce("", (acc, answer) -> {
            if (acc.indexOf(answer) == -1) {
                return acc + answer;
            }

            return acc;
        }, String::concat).length();
    }
}
