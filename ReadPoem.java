import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.Scanner; 
import java.io.FileWriter;

public class ReadPoem {
    
  public static void main(String[] args) {
    try {
      File file = new File("hello.txt");
      Scanner myReader = new Scanner(file);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}