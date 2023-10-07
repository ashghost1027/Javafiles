public class Area {
    public static double areaOfCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static double areaOfRectangle(double length, double breadth) {
        return length * breadth;
    }

    public static double areaOfTriangle(double base, double height) {
        return 0.5 * (base * height);
    }

    public static double areaOfTriangle(double side1, double side2, double side3) {
        double s = 0.5 * (side1 + side2 + side3);
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public static double areaOfTriangle(double side) {
        return Math.pow(side, 2) * Math.sqrt(3) / 4;
    }

    public static double areaOfTriangle(double side1, double side2, int angle) {
        return side2 * side1 / 2 * (Math.sin(angle));
    }
}
