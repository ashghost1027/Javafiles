import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public int randomNum(int max){
        Random random = new Random();
        int randint = random.nextInt(max);
        return randint;
    }
    // public int userNum(){
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.print("Enter your guess: ");
    //     int guess = scanner.nextInt();
    //     System.out.println(scanner.nextLine());
    //     scanner.close();
    //     return guess;
    // }
    public static boolean winOrLose(int user, int random){
        if (user == random){
            System.out.println("Correct");
            return true;
        }
        else if(user > random){
            System.out.println("Go lower");
            return false;
        }
        else if(user < random){
            System.out.println("Go higher");
            return false;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        NumberGuessing program = new NumberGuessing();

        System.out.println("Welcome to the number guessing game.");
        System.out.print("Enter the maximum limit: ");
        int max = scanner.nextInt();

        System.out.println(scanner.nextLine());
        int random  = program.randomNum(max);
        boolean result = false;
        while (result == false){
            
            System.out.print("Enter your guess: ");
            int user = scanner.nextInt();
            System.out.print(scanner.nextLine());

            result = winOrLose(user,random);
        }
        scanner.close();
    }

}
