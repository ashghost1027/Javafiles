import java.util.Scanner;

public class Slope {
    double x;
    double m;
    double c;
    double y;

    public Slope(double x, double m, double c) {
        this.x = x;
        this.m = m;
        this.c = c;
        this.y = m * x + c;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        double x = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the value of m: ");
        double m = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the value of c: ");
        double c = scanner.nextInt();
        scanner.nextLine();
        Slope slope = new Slope(x, m, c);
        System.out.println(slope.y);
        scanner.close();

    }
}
