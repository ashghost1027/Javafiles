import java.util.Scanner;
import java.util.Random;

public class PasswordGenerator {
    String finalPassword;
    public String getSpecialCharacter(int n){
        String[] splChar = {"!","@","#","$","%","^","&","*","?"};
        Random random = new Random();
        String spls = "";
        for (int i=0; i<n; i++){
            String a = splChar[random.nextInt(splChar.length)];
            spls+=a;
        }
        return spls;
    }
    public String getNumbers(int n){
        String[] numbers = {"1","2","3","4","5","6","7","8","9","0"};
        Random random = new Random();
        String nums = "";
        for(int i=0;i<n;i++){
            nums += numbers[random.nextInt(9)];
        }
        return nums;

    }
    public String getCaps(int n){
        String caps = "";
        Random random = new Random();
        String capitals = "QWERTYUIOPASDFGHJKLZXCVBNM";
    
        for(int i=0;i<=n;i++){
            char cap = capitals.charAt(random.nextInt(capitals.length()));
            String send = cap +"";
            caps+=send;
        }
        return caps;
    }
    public String getLetters(int n,int defaults){
        String letters = "";
        Random random = new Random();
        String lowers = "qwertyuiopasdfghjklzxcvbnm";
        if (n>defaults){
            for(int i=0;i<=n;i++){
                char cap = lowers.charAt(random.nextInt(lowers.length()-1));
                String send = cap +"";
                letters+=send;
            }
        }
        else{
            for(int i=0;i<defaults;i++){
                char cap = lowers.charAt(random.nextInt(lowers.length()));
                String send = cap +"";
                letters+=send;
            }
        }
        return letters;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        PasswordGenerator password = new PasswordGenerator();
        System.out.println("Welcome to Password Generator!!");
        System.out.print("Enter the number of special characters you want: ");
        int splcharacters = scanner.nextInt();
        System.out.print("Enter the number of whole numbers you want: ");
        int numbers = scanner.nextInt();
        System.out.print("Enter the number of capitals you want: ");
        int caps = scanner.nextInt();
        System.out.print("Enter the number of letters you want: ");
        int letters = scanner.nextInt();
        int defaults =0;
        if (splcharacters+numbers+caps+letters<8){
             defaults += 8 - (splcharacters+numbers+caps);
        }
        String spl = password.getSpecialCharacter(splcharacters);
        // System.out.println(spl);
        String number = password.getNumbers(numbers);
        // System.out.println(number);
        String capital = password.getCaps(caps);
        // System.out.println(capital);
        String chars = password.getLetters(letters,defaults);
        // System.out.println(chars);
        String finalPassword = spl+number+capital+chars;
        int len = finalPassword.length();
        String passwordReturn = "";
        for (int i = 0; i < len; i++) {
            char let = finalPassword.charAt(random.nextInt(len-1));
            passwordReturn += let;
        }
        System.out.println("Your password is: "+passwordReturn);
        System.out.println("The length of your password is: "+passwordReturn.length());
        scanner.close();
        finalPassword = passwordReturn;
    }
}
