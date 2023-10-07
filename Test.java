import java.util.Scanner;

public class Test {
    public String getUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String strs = scanner.nextLine();
        scanner.close();
        return strs;
    }
    public int countSpecialChars(String spl){
        String spls = "!@#$%^&*<>?+-[];',.`~";
        int splcount = 0;
        for (int i = 0; i <spl.length();i++){
            String charInString = spl.charAt(i)+"";
            for (int j = 0; j < spls.length();j++){
                String special = spls.charAt(j)+"";
                
                if (charInString.equals(special)){
                    splcount++;
                }
            }

        }
        return splcount;
    }
    public int countCapitals(String spl){
        String caps = "QWERTYUIOASDFGHJKLZXCVBNM";
        int count = 0;
        for (int i = 0 ; i < spl.length();i++){
            String capInString = spl.charAt(i)+"";
            for (int j = 0; j < caps.length();j++){
                String cap = caps.charAt(j)+"";

                if (capInString.equals(cap)){
                    count++;
                }
            }
        }
        return count;

    }
    public int countLetter(String spl){
        String letters = "qwertyuiopsdfghjklzxcvbnm";
        int count = 0;
        for (int i = 0 ; i < spl.length();i++){
            String capInString = spl.charAt(i)+"";
            for (int j = 0; j < letters.length();j++){
                String cap = letters.charAt(j)+"";

                if (capInString.equals(cap)){
                    count++;
                }
            }
        }
        return count;

    }
    public int countNumber(String spl){
        String nums = "1234567890";
        int count = 0;
        for (int i = 0 ; i < spl.length();i++){
            String capInString = spl.charAt(i)+"";
            for (int j = 0; j < nums.length();j++){
                String cap = nums.charAt(j)+"";

                if (capInString.equals(cap)){
                    count++;
                }
            }
        }
        return count;

    }
    public static void main(String[] args) {
        Test test = new Test();
        String returns = test.getUserInput();
        int spls = test.countSpecialChars(returns);
        int caps = test.countCapitals(returns);
        int lets = test.countLetter(returns);
        int nums = test.countNumber(returns);
        System.out.println("Special characters: "+spls+" Capital characters: "+caps+" Letters: "+lets+" Numbers: "+nums);
    }
}
