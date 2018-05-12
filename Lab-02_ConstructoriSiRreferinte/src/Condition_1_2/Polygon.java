package Condition_1_2;

public class Polygon {

    private Point[] points;

    public Polygon() {
        this.points = new Point[1];
        points[0] = new Point();
    }

    Polygon(int nuberOfPoints) {
        this.points = new Point[nuberOfPoints];
        for (int i = 0; i < nuberOfPoints; i++) {
            this.points[i++] = new Point(0, 0);
        }
    }

    Polygon(Point[] arrayOfPoints) {
        this.points = new Point[arrayOfPoints.length];
        int i = 0;
        for (Point point: arrayOfPoints) {
            this.points[i++] = new Point(point);
        }
    }

    int getNumberOfPoints() {
        return points.length;
    }

    public Point[] getPoints() {
        return points;
    }

    @Override
    public String toString() {
        String output = "";
        for (Point point : this.points) {
            output += point.toString();
        }
        return output;
    }
}
