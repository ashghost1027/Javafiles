import java.util.Scanner;

public class PasswordChecker {
    public boolean checkSpl(String password){
        int splChars =0 ;
        String[] splChar = {"!","@","#","$","%","^","&","*","?"};
        for (int i = 0; i < password.length();i++){
            String chars = password.charAt(i)+"";
            for (String str : splChar){
                if (chars.equals(str)){
                    splChars++;
                }
            }
        }
        if (splChars>0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean checkNum(String password){
        int nums =0 ;
        String[] numbers = {"1","2","3","4","5","6","7","8","9","0"};
        for (int i = 0; i < password.length();i++){
            String chars = password.charAt(i)+"";
            for (String str : numbers){
                if (chars.equals(str)){
                    nums++;
                }
            }
        }
        if (nums>0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean checkCaps(String password){
        int caps =0 ;
        String[] capitals = {"Q","W","E","R","T","Y","U","I","O","P","A","S","D","F","G","H","J","K","L","Z","X","C","V","B","N","M"};
        for (int i = 0; i < password.length();i++){
            String chars = password.charAt(i)+"";
            for (String str : capitals){
                if (chars.equals(str)){
                    caps++;
                }
            }
        }
        if (caps>0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean checkLength(String password){

        
        if (password.length()>8){
            return true;
        }
        else{
            return false;
        }
    }
    public String mains(){
        Scanner scanner = new Scanner(System.in);
        PasswordChecker check = new PasswordChecker();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        boolean spl = check.checkSpl(password);
        boolean nums = check.checkNum(password);
        boolean caps = check.checkCaps(password);
        boolean letters = check.checkLength(password);
        scanner.close();

        if (spl ==true && nums == true && caps == true && letters == true){
            return "strong";
        }
        else if(nums == true && caps == true && letters == true){
            return "medium";
        }
        else{
           return "weak";
        }
        
    }
    public static void main(String[] args){
        

    }

}
