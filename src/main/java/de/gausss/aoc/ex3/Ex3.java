package de.gausss.aoc.ex3;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import de.gausss.aoc.AocExercise;
import de.gausss.aoc.AocUtils;

class Ex3 extends AocExercise<List<String>> {
    public static void main(String[] args) {
        new Ex3("ex3.txt").solve();
    }

    public Ex3(String dataFile) {
        super(dataFile);
    }

    @Override
    protected List<String> readData(String dataFile) throws URISyntaxException, IOException {
        return AocUtils.readInputLines(dataFile);
    }

    @Override
    public int solveA() {
        Grid grid = Grid.fromFile(data);
        return traverse(grid, 3, 1);
    }

    @Override
    public int solveB() {
        Grid grid = Grid.fromFile(data);
        return traverse(grid, 1, 1) * traverse(grid, 3, 1) * traverse(grid, 5, 1) * traverse(grid, 7, 1) * traverse(grid, 1, 2);
    }

    private int traverse(Grid grid, int xWalk, int yWalk) {
        var xIndex = 0;
        var yIndex = 0;
        var numTrees = 0;
        while(yIndex <= grid.yMax()) {
            xIndex += xWalk;
            yIndex += yWalk;
            if(grid.hasTree(xIndex, yIndex)) {
                numTrees++;
            }
        }

        return numTrees;
    }
}
