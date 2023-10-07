package SignupAndBookingShit;
import java.util.Scanner;

public class Admin {

    private String password = "45W1N94UL";
    private int tries = 5;
    public void authorize(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String pass = scanner.nextLine();
        if (pass.equals(password)){
            Admin.access();

        }
        else{
            System.out.println("Incorrect password. Please Try Again.");
            tries--;
            authorize();
        }
    }
    private static void access(){
        Database data = new Database();
        System.out.println("What would you like to do? \n>View Users \n>Delete Users \n>View all Files" );
        Scanner scanner = new Scanner(System.in);
        String adminChoice = scanner.nextLine();
        switch(adminChoice){
            case "a": System.out.println(data.retrieveAllDataFromFile());
            break;
            case "b": data.deleteUser();
            break;
            case "c": data.allBlogs();
            break;
            default: System.out.println("Nah man that is not under the constraints. ");
        }
    }

}
