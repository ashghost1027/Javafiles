import java.util.Scanner;

public class PrismArea {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the breadth of the prism: ");
        int breadth = scanner.nextInt();
        System.out.print("Enter the height of the prism: ");
        int height = scanner.nextInt();
        System.out.print("Enter the length of the prism: ");
        int length = scanner.nextInt();

        int area = 2*(breadth*height + height*length +length*breadth);
        System.out.println("The area of the prism is: "+area);
        scanner.close();
    }
}
