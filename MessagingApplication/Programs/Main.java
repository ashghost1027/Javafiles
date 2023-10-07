package MessagingApplication.Programs;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) throws IOException{

        SignUpAndLogin signin = new SignUpAndLogin();

        System.out.println("What would you like to do? \n> Sign in \n> Sign up. ");
        String userInput = read.nextLine();
        if (userInput.equals("0")) signin.login();
        else signin.signupUser();
    
    }
}
