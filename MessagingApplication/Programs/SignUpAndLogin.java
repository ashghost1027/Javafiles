package MessagingApplication.Programs;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;


public class SignUpAndLogin {
    Scanner scanner = new Scanner(System.in);

    public void signupUser() throws FileNotFoundException {

        System.out.println("--------------------------Welcome to Console-Consoler.--------------------------");
        System.out.println("The place to connect to your friends via the console!!");
        String userName = getNewUserName();
        String password = getNewPassword();
        String emailId = getEmailId();
        String accountType = getAccountType();

        User user;
        try {

            user = new User(userName, emailId, accountType);
            user.createNewUser(userName, emailId, accountType, password);
            File file = new File(userName+".txt");
            file.createNewFile();
            System.out.println("Account successfully created. ");

        } catch (IOException e) {

            System.out.println("Error 505!!");

        }
    }

    private String getNewUserName() throws FileNotFoundException{

        System.out.print("Please enter a username: ");
        String userName = scanner.nextLine();
        while (userName.isBlank()||User.usernameTaken(userName)||userName.equals("undefined")){
            System.out.println("Please enter another user name: ");
            userName = scanner.nextLine();
        }

        return userName.strip();
    }

    private String getNewPassword(){

        PasswordChecker checker = new PasswordChecker();
        System.out.print("Please enter your password: ");
        String password = scanner.nextLine().strip();
        while (checker.mains(password).equals("weak")){
            System.out.print("Your password is weak. Please enter a stronger password: ");
            password = scanner.nextLine().strip();
        }

        System.out.print("Re-enter your password: ");
        String reCheckPassword = scanner.nextLine();
        while(!reCheckPassword.equals(password)){
            System.out.print("Please enter the password you entered the first time: ");
            reCheckPassword = scanner.nextLine();
        }

        return password;
    }

    private String getEmailId() throws FileNotFoundException{

        System.out.println("Please enter your emailId: ");
        String email = scanner.nextLine();
        if (email.contains("@")&&email.contains(".")&& !User.emailRegistered(email)) return email;
        else return getEmailId();

    }

    private String getAccountType(){

        System.out.print("Change account type to business? Y/N");
        String accountType = scanner.nextLine();
        if (accountType.equalsIgnoreCase("Y")) return "Business";
        else return "Default";

    }

    public void login() throws IOException{
        System.out.println("Welcome back!!");

        String userName = getUserName();
        String password = getPassword();
        String emailId = emailId();
        String accountType = getAccountType();
        User user = new User(userName, emailId, accountType);

        int passwordAttempts = 0;
        while (passwordAttempts<5 && !user.authenticatePassword(password)){ 

            System.out.print("That password is incorrect. Please try again: ");
            password = scanner.nextLine();
            passwordAttempts++;

        }
        if (passwordAttempts>=5 && !user.authenticatePassword(password)){
            System.out.println("You have exceeded the maximum number of attempts. Please try later.");
            System.exit(0);
        }
        else { 

            Messages messaging = new Messages();
            System.out.println("Welcome, "+ userName + ". What would you like to do?(Type 1 to send message. ) \n--->Send message \n--->Read messages");
            String userChoice = scanner.nextLine();

            if (userChoice.equals("1")) messaging.sendMessage(user);
            else messaging.readInbox(user);

        }

        
    }

    private String getUserName() throws FileNotFoundException{

        System.out.print("Please enter your username: ");
        String userName = scanner.nextLine();
        if (User.usernameTaken(userName)) return userName;
        return "undefined";

    }

    private String getPassword(){
        
        System.out.print("Please enter your password: ");
        String password = scanner.nextLine();
        while (password.isBlank()||password.length()<8){
            System.out.print("Please enter a valid password: ");
            password = scanner.nextLine();
        }

        return password;
    }

    private String emailId() throws FileNotFoundException{

        System.out.print("Please enter your email Id: ");
        String emailId = scanner.nextLine();
        while (!User.emailRegistered(emailId)){
            System.out.print("That email Id is not registered. Please enter the proper email Id: ");
            emailId = scanner.nextLine();
        }
        return emailId;

    }


}
