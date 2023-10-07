import java.util.Scanner;

public class Converter {
     static String unit = "";
     static double value = 0.0;
     public static void getUserInput(){
          Scanner scanner = new Scanner(System.in);
          System.out.print("Enter the unit you want to convert to(m,km,in,ft,yd,mi): ");
          unit = scanner.nextLine();
          System.out.print("Enter the value: ");
          value = scanner.nextInt();
          scanner.close();

     }
     public void unitConvert(){
          if (unit.equals("m")){
               value = value/100;
          }
          else if(unit.equals("km")){
               value = value/1000;
          }
          else if(unit.equals("in")){
               value = value/2.54;
          }
          else if(unit.equals("ft")){
               value = value/30.48;
          }
          else if(unit.equals("yd")){
               value = value/91.44;
          }
          else if(unit.equals("mi")){
               value = value/160934.4; 
          }
          else{
               System.out.println("No unit available");
          }
     }
     public static void main(String[] args){
          Converter convert = new Converter();
          Converter.getUserInput();
          convert.unitConvert();
          System.out.println(value+" "+unit);

     }
}
