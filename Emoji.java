import java.util.Scanner;

public class Emoji {
    String word;
    
    public void getString(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the emoji code: ");
        word = scanner.nextLine();
        scanner.close();
        
    }
    public void getEmoji(){
        String[] words = word.split(":");
        if (words[1].equals("\ud83c\udf6d")){
            System.out.println(words[0]+" Lollipop");
        }
        else if (words[1].equals("\u2615")){
            System.out.println(words[0]+" Coffee");
        }
        else if (words[1].equals("\ud83c\udf68")){
            System.out.println(words[0]+" Ice Cream");
        }
        else if (words[1].equals("\ud83c\udf6a")){
            System.out.println(words[0]+" Cookie");
        }
        else if (words[1].equals("\ud83c\udf6c")){
            System.out.println(words[0]+" Candy");
        }
        else{
            System.out.println("That emoji is not available...");
        }
        
    }
    public void getUnicode(){
        String[] words = word.split(":");
        if (words[0].equals("Lollipop")){
            System.out.println(words[1]+" \ud83c\udf6d");
        }
        else if (words[0].equals("Coffee")){
            System.out.println(words[1]+" \u2615");
        }
        else if (words[0].equals("Ice Cream")){
            System.out.println(words[1]+" \ud83c\udf68");
        }
        else if (words[0].equals("Cookie")){
            System.out.println(words[1]+" \ud83c\udf6a");
        }
        else if (words[0].equals("Candy")){
            System.out.println(words[1]+" \ud83c\udf6c");
        }
        else{
            System.out.println("That emoji is not available...");
        }
    }
    public static void main(String[] args){
        Emoji emoji = new Emoji();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 't2e' for text to emoji conversion or 'e2t' for emoji to text");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("t2e")){
            emoji.getString();
            emoji.getEmoji();
        }
        else if(input.equalsIgnoreCase("e2t")){
            emoji.getString();
            emoji.getUnicode();
        }
        else{
            System.out.println("Please enter a valid response.");
        }
        scanner.close();
    }
}