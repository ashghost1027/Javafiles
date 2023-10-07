import java.util.Random;
import java.util.Scanner;

public class AddRandom {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = Integer.parseInt(scanner.nextLine());
        int y = random.nextInt(100);
        int z = x + y;
        System.out.println("The random number was: "+y);
        System.out.println(z);
        scanner.close();
    }
}
