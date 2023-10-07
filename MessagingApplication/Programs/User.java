package MessagingApplication.Programs;
import java.io.*;
import java.util.Scanner;

public class User {
    String name;
    private String password;
    private String emailId;
    private String accountType;


    public User(String name, String emailId, String accountType) throws FileNotFoundException{
        this.name = name;
        this.emailId = emailId;
        this.accountType = accountType;
        setPasswordFromUsertxt();
    }

    private void setPasswordFromUsertxt() throws FileNotFoundException{
        Scanner fileReader = new Scanner(new File("./MessagingApplication/users.txt"));
        String reversePassword = "";
        while(fileReader.hasNextLine()){
            String line = fileReader.nextLine();
            if(line.contains(name)) {
                reversePassword = getPasswordFromString(line);
            }
        }
        for (int i = reversePassword.length()-1; i == 0; i++){
            password += reversePassword.charAt(i);
        }
    }
    private String getPasswordFromString(String line){
        String reversePassword = "";
        for (int i = line.length()-1; i == 0; i--){
            if ((line.charAt(i)+"").equals(" ")) break;
                reversePassword += line.charAt(i);
            }
        return reversePassword.strip();
    }

    
    public static boolean usernameTaken(String name) throws FileNotFoundException{
        Scanner fileReader = new Scanner(new File("./MessagingApplication/users.txt"));
        while(fileReader.hasNextLine()){
            if(fileReader.nextLine().contains(name)) return true;
        }
        return false;
    }

    public boolean authenticatePassword(String userPassword) {
        Encryptor encryptor = new Encryptor(userPassword);
        String encryptedPassword = encryptor.getEncryptedPassword();
        if(password.equals(encryptedPassword)) return true;
        return false;
    }
    
    public void createNewUser(String name, String emailId, String accountType, String password) throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter("./MessagingApplication/users.txt", true));
        Encryptor encrypt = new Encryptor(password);
        writer.write("\n");
        writer.write(name + " " + emailId + " " + accountType + " " + encrypt.getEncryptedPassword());
        writer.flush();
        writer.close();
    }

    public static boolean emailRegistered(String emailId) throws FileNotFoundException{
        Scanner fileReader = new Scanner(new File("./MessagingApplication/users.txt"));
        while(fileReader.hasNextLine()){
            if(fileReader.nextLine().contains(emailId)) return true;
        }
        return false;
    }

    public String onlyBusinessAccounts() throws FileNotFoundException{
        Scanner fileReader = new Scanner(new File("./MessagingApplication/users.txt"));
        while (fileReader.hasNextLine()){
            if(fileReader.nextLine().contains("business")) return fileReader.nextLine();
        }
        return "";
    }

    public boolean isDefaultAccount(){
        if(accountType.equals("Default")) return true;
        return false;
    }
    
    public String getEmailId(){
        return emailId;
    }
    
}
