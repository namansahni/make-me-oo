package org.oop;

public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point from) {
        return Math.sqrt(Math.pow(xDistance(from), 2) + Math.pow(yDistance(from), 2));
    }

    public double direction(Point from) {
        return Math.atan2(yDistance(from), xDistance(from));
    }

    public double xDistance(Point from) {
        return this.x - from.x;
    }

    public double yDistance(Point from) {
        return this.y - from.y;
    }
}
