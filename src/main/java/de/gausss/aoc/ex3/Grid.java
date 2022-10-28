package de.gausss.aoc.ex3;

import java.util.ArrayList;
import java.util.List;

record Grid(List<Point> points, int xMax, int yMax) {

 static Grid fromFile(List<String> lines) {
        var xIndex = 0;
        var yIndex = 0;
        var trees = new ArrayList<Point>();
        for(String line: lines) {
            List<Character> points = line.chars().mapToObj(point -> (char) point).toList();
            for(char point: points) {
                trees.add(new Point(xIndex, yIndex, point == '#'));
                xIndex++;
            }
            xIndex = 0;
            yIndex++;
        }

        return new Grid(trees, lines.get(0).chars().toArray().length, lines.size());
    }

    boolean hasTree(int xIndex, int yIndex) {
        var xNormalized = xIndex <= xMax ? xIndex : (xIndex % xMax);
        return points.stream().anyMatch(point -> point.xIndex() == xNormalized && point.yIndex() == yIndex && point.hasTree());
    }
}
