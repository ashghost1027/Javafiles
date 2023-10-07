import java.util.Scanner;

public class TestFile {
    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(input);
        scanner.close();
    }
}
