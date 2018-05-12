package Condition_1_2;

public class Point {

    private float x;
    private float y;

    void changeCoords(float x, float y) {
        this.x = x;
        this.y = y;
    }

    Point() {
        this.changeCoords(0, 0);
    }

    Point(float x, float y) {
        this.changeCoords(x, y);
    }

    Point(Point point) {
        this.changeCoords(point.getX(), point.getY());
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
