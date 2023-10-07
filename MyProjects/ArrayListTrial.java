import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTrial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> fruits = new ArrayList<String>();
        int fruitnum = 7;
        for (int i = 0;i<fruitnum;i++){
           System.out.print("Enter a fruit: "); 
           fruits.add(scanner.nextLine());
        }
        // System.out.println("List of fruit for salad: "+fruits);
        for(String i : fruits){
            System.out.println(i);
        }
        
        
        scanner.close();
    }
}
