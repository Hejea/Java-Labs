package Condition_1_2;

public class TestShape {
    public static void testRun() {

        Point[] arrayOfPoints = new Point[2];

        Point point = new Point(1, 2);
        Point point1 = new Point(5, 6);

        arrayOfPoints[0] = point;
        arrayOfPoints[1] = point1;

        point.changeCoords(10, 3);

        System.out.println(point.toString());

        Polygon polygon = new Polygon(3);
        Polygon polygon1 = new Polygon(arrayOfPoints);

        System.out.println("\nNumber Of Points = " + polygon.getNumberOfPoints());

        System.out.print("\nPoints are :");
        System.out.println(polygon1.toString());
    }
}
