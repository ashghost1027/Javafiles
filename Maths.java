import java.util.Scanner;

public class Maths {
    public static double returnSquareRoot(double squared) {
        return Math.sqrt(squared);
    }

    public static double returnLog(double expression) {
        return Math.log(expression);
    }

    public static double returnTan0(double angle1, double angle2) {
        try {
            return Math.sin(angle1) / Math.cos(angle2);
        } catch (ArithmeticException a) {
            System.out.println("Cannot divide by 0");
            return 0;
        }
    }

    public static double returnExponentOf(double base, double power) {
        return Math.pow(base, power);
    }

    public static double returnCubeRoot(double cube) {
        return Math.cbrt(cube);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Square root of 2025 = " + Maths.returnSquareRoot(2025));
        System.out.println("The log of 5 = " + Maths.returnLog(5));
        System.out.println("The Tan0 of 120deg and 140deg = " + Maths.returnTan0(120, 140));
        System.out.println("The value of 10 to the power 10 = " + Maths.returnExponentOf(10, 10));
        System.out.println("The cube root of 27= " + Maths.returnCubeRoot(27));
        scanner.close();
    }

}
