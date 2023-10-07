package SignupAndBookingShit;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {
    static int idCount = 0;
    private String pass;

    public static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        // scanner.close();
        return userInput;

    }

    public String[] returnPasswordAndKey(String userInfo) {
        String password = "";
        String key = "";
        for (int i = 0; i < userInfo.length() - 4; i++) {
            if (userInfo.substring(i, i + 4).equals("||||")) {
                for (int j = i; j < userInfo.length() - 2; j++) {
                    if (userInfo.substring(j, j + 2).equals(", ")) {
                        password = userInfo.substring(i + 4, j);
                        key = userInfo.substring(j + 2);
                    }
                }
            }
        }
        String[] passwordAndKey = new String[2];
        passwordAndKey[0] = password;
        passwordAndKey[1] = key;
        // System.out.println(password + ", " + key);
        return passwordAndKey;
    }

    public boolean checkAuthenticity(Database database, String name) {
        Scanner scanner = new Scanner(System.in);
        UserInterface interFace = new UserInterface();
        String userInfo = database.retrieveUserDataFromFile(name);
        String[] passwordAndKey = interFace.returnPasswordAndKey(userInfo);
        Encrypt encrypt = new Encrypt(passwordAndKey[0], passwordAndKey[1]);
        String password = encrypt.decrypt(passwordAndKey[0]);
        pass = password;
        System.out.print("Enter your password: ");
        String userPassword = scanner.nextLine();
        if (password.equals(userPassword)) {
            return true;
        } else {
            return false;
        }
    }

    public static void login() throws FileNotFoundException {
        Database database = new Database();
        Scanner scanner = new Scanner(System.in);
        UserInterface interFace = new UserInterface();
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        if (database.isExists(name)) {
            if (interFace.checkAuthenticity(database, name)) {
                interFace.accessGranted(name);
            } else {
                interFace.accessDenied();
            }
        } else {
            System.out.println("User does not exist.");
        }
        // scanner.close();
    }

    public void writeBlog(String name) {

    }

    public void accessGranted(String name) throws FileNotFoundException {
        UserInterface interFace = new UserInterface();
        Scanner scanner = new Scanner(System.in);
        Database database = new Database();
        System.out.println(
                "What would you like to do today? \na>Write blog \nb>Read blog \nc>Profile \nd>Search Blog \ne>Logout (Enter a, b, c, d, e) ");
        String request = scanner.nextLine();
        switch (request) {
            case "a":
                database.writeBlog(name);
                break;
            case "b":
                database.readBlogs();
                break;
            case "c":
                database.retrieveUserDataFromFile(name);
                break;
            case "d":
                database.searchBlogs();
                break;
            case "e":
                UserInterface.UI();
                break;
            default:
                System.out.println("Enter the proper value: ");
                interFace.accessGranted(name);
                break;
        }

    }

    public boolean accessDenied() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Incorrect password. Re-try: ");

            String attemptI = scanner.nextLine();
            if (attemptI.equals(this.pass)) {
                accessGranted("");
                return true;
            }
        }
        System.out.println("You have exceeded maximum number of tries.");
        return false;
    }

    public static void signup() {
        Database data = new Database();
        PasswordChecker passwordStrength = new PasswordChecker();
        Scanner scanner = new Scanner(System.in);

        System.out.print("To sign up, please enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        while (passwordStrength.mains(password).equals("weak")) {
            System.out.println("Your password is weak. Retry with numbers and special characters.");
            password = scanner.nextLine();
        }
        System.out.print("Re-Confirm your password: ");
        String rePassword = scanner.nextLine().strip();
        while (!rePassword.equals(password)) {
            System.out.print("Please enter the same password as before: ");
            rePassword = scanner.nextLine();
        }
        if (isEligibleForSignup(name)) {
            data.createUserFile(name);
            data.writeIntoFile(name, password, idCount + 1000);
        } else {
            System.out.println("That user already exists. Please try again. ");
            signup();
        }

        // scanner.close();

    }

    public static boolean isEligibleForSignup(String name) {
        Database database = new Database();
        String data = database.retrieveAllDataFromFile();
        for (int i = 0; i < data.length(); i++) {
            if ((data.charAt(i) + "").equals("\n"))
                idCount++;
        }

        if (data.contains(name))
            return false;
        else
            return true;
    }

    public boolean userExists(String name) {
        Database data = new Database();
        String userData = data.retrieveUserDataFromFile(name);
        if (userData.isBlank())
            return false;
        return true;
    }

    public static void UI() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------WELCOME-------------------");
        System.out.println("Enter what you would like to do: \n>---->Login \n>---->Signup \n>quit");
        String userInput = getUserInput();
        while (true) {
            if (userInput.equalsIgnoreCase("login")) {
                login();
                break;
            } else if (userInput.equalsIgnoreCase("signup")) {
                signup();
                break;
            } else if (userInput.equalsIgnoreCase("quit")) {
                break;
            } else {
                System.out
                        .println("Sorry you cannot perform that function. Please re-enter what you would like to do:\n"
                                + ">login \n" + ">signup \n>quit");
                userInput = getUserInput();
            }
        }

        scanner.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you Admin? Y/N");
        String adminConf = scanner.nextLine().toUpperCase();
        if (adminConf.equals("Y")) {
            Admin admin = new Admin();
            admin.authorize();

        }
        UserInterface.UI();

    }
}
