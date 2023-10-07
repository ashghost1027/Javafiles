import java.lang.Math;
import java.util.Scanner;

public class Pythagoras {
    public boolean checkRightAngle(int[] angles) {

        int sum = 0;
        for (int i : angles) {
            sum += i;
        }
        for (int i : angles) {
            if (i == 90 && sum == 180) {
                return true;
            }
        }

        return false;
    }

    public boolean checkHypontenuse(int[] sides) {
        if (Math.pow(sides[0], 2) == (Math.pow(sides[1], 2) + Math.pow(sides[2], 2))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Pythagoras pytho = new Pythagoras();
        Scanner scanner = new Scanner(System.in);
        int[] angles = new int[3];
        int[] sides = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the angles: ");
            angles[i] = scanner.nextInt();
            scanner.nextLine();

        }
        System.out.print("Enter the side: ");
        sides[1] = scanner.nextInt();
        System.out.print("Enter the side: ");
        sides[2] = scanner.nextInt();
        System.out.print("Enter the hypontenuse: ");
        sides[0] = scanner.nextInt();
        if (pytho.checkHypontenuse(sides) && pytho.checkRightAngle(angles)) {
            System.out.println("It is a right angled triangle.");

        } else {
            System.out.println("Not a right angled triangle.");
        }
        scanner.close();

    }

}
