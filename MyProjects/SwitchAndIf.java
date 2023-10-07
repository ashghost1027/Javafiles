import java.util.Scanner;

public class SwitchAndIf{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        if (age == 0){
            System.out.println("You aren't even born yet!");
        }
        else{
            switch(age){
                case 18: System.out.println("You can vote now");
                break;
                case 21:System.out.println("You can drink now!!");
                break;
                case 30:System.out.println("Life has begun");
                break;
                case 60:System.out.println("Write your will");
                default:
                if (age>18 && age <30){
                    System.out.println("Welcome to the real world");
                }
                else if (age>30 && age<60){
                    System.out.println("Have a fun time");
                }
                else if(age>60){
                    System.out.println("Get some checkup");
                }
                
            }
        }
        scanner.close();
    }
}