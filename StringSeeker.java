import java.util.Scanner;



public class StringSeeker {

    static int lineCount = 0;
    Scanner scanner = new Scanner(System.in);

    public int countCharacters(String string){
        return string.length();
    }
    public String userInput(){
        
        System.out.println("Enter your essay (Enter 69 in newline to finish ): ");
        String essay = "";
        boolean nextLine = true;
        while (nextLine){
            String scan = scanner.nextLine();
            if (scan.equals("69")){
                nextLine=false;
            }
            else{
                essay+=scan;
                lineCount++;
            }
        }

        // scanner.close();
        return essay;   
        }
        
    
    public int countWords(String string){
        int spaceCount = 0;
        for (int i = 0 ; i < string.length();i++){
            String str = string.charAt(i)+"";
            if (str.equals(" ")){
                spaceCount++;
            }
        }
        return spaceCount+1;
    }
    public int countLines(String string){
        for (int i = 0 ; i < string.length(); i++){
            String str  =  string.charAt(i)+"";
            if (str.equals("\n")){
                lineCount++;
            }
        }return lineCount;
    }

    public int countSubstring(String string){
        int count = 0;
        int lastIndex =0;

        // Scanner scanner = new Scanner(System.in);
        System.out.println("Enter substring: ");
        String subs = scanner.nextLine();
        while (lastIndex != -1) {
            lastIndex = string.indexOf(subs, lastIndex);

            if (lastIndex != -1) {
                count++;
                lastIndex += subs.length();
            }
        }
        // scanner.close();
        return count;

    }
    public boolean isContains(String string){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Contains: ");
        String contain = scanner.nextLine();
        scanner.close();
        if (string.contains(contain)){
            return true;
        }
        else{
            return false;
        }
    }
    public String upper(String string){
        return string.toUpperCase();
    }
    public String lower(String string){
        return string.toLowerCase();
    }
    public String reverse(String string){
        String reversed = "";
        for (int i = string.length()-1;i>=0;i--){
            reversed = reversed+string.charAt(i);
        }
        return reversed;
    }
    public String toggleCase(String string){
        String toggleEssay = "";
        for(int i = 0; i<string.length();i++){
            char str = string.charAt(i);
            if (str >= 'A' && str <= 'Z') {
                String temp=str+"";
                toggleEssay += temp.toLowerCase();

            } else if (str >= 'a' && str <= 'z') {
                String temp=str+"";
                toggleEssay += temp.toUpperCase();
            } else{
                toggleEssay+=" ";
            }
        }
        return toggleEssay;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringSeeker seek = new StringSeeker();
        String userString = seek.userInput();
        System.out.println("Character count: "+seek.countCharacters(userString));
        System.out.println("Words: "+seek.countWords(userString));
        seek.countLines(userString);
        System.out.println("Lines: "+lineCount);
        System.out.println("Substring count: "+ seek.countSubstring(userString));
        System.out.println("Contains: "+seek.isContains(userString));
        System.out.println("Upper Case: "+seek.upper(userString));
        System.out.println("Lowercase: "+seek.lower(userString));
        System.out.println("Reversed: "+seek.reverse(userString));
        System.out.println("Toggled case: "+seek.toggleCase(userString));
        scanner.close();

    }



}
