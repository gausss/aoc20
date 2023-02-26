package de.gausss.aoc.ex3;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import de.gausss.aoc.Exercise;
import de.gausss.aoc.Utils;

class Ex3 extends Exercise<List<String>> {
    public static void main(String[] args) {
        new Ex3("ex3.txt").solve();
    }

    public Ex3(String dataFile) {
        super(dataFile);
    }

    @Override
    protected List<String> readData(String dataFile) throws URISyntaxException, IOException {
        return Utils.readInputLines(dataFile);
    }

    @Override
    public Number solveA() {
        Grid grid = Grid.fromFile(data);
        return traverse(grid, 3, 1);
    }

    @Override
    public Number solveB() {
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
