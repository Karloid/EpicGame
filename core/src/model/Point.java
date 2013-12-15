package model;

/**
 * Created with IntelliJ IDEA.
 * User: glotovd
 * Date: 08.12.13
 * Time: 21:36
 * To change this template use File | Settings | File Templates.
 */
public class Point {
    public int y;
    public int x;

    @Override
    public String toString() {
        return "x: " + x + " y: " + y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public Point(Unit unit) {
        x = unit.x;
        y = unit.y;
    }
}
