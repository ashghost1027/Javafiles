import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class DateChecker{
    public static String getUserInputString(){
        Scanner scanner = new Scanner(System.in);
        String userInput;
        System.out.print("Enter the date (dd/mm/yyyy): ");
        userInput = scanner.nextLine();
        scanner.close();
        return userInput;
    }
    public static boolean getLength(String date){
        if (date.length() == 10){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean checkSlash(String date){
        if (date.charAt(2) == '/' && date.charAt(5) == '/'){
            return true;

        }
        else{
            return false;
        }
    }
    public static boolean checkMonth(String date){
        String[] month = {"01","02","03","04","05","06","07","08","09","10","11","12"};
        String inMonth = date.substring(3,5);
        for (String str : month){
           
            if (inMonth.equals(str)){
                return true;
            }    
        }
        return false;   
    }
    public static boolean checkDate(String dates, String month, boolean leapYear){
        String[] month31 = {"01","03","05","07","08","10","12"};
        String[] month30 = {"04","06","09","11"};
        String feb = "02";
        ArrayList<String> monthbig= new ArrayList<String>(Arrays.asList(month31));
        ArrayList<String> monthsmol= new ArrayList<String>(Arrays.asList(month30));
        if (monthbig.contains(month)){
            int date = Integer.parseInt(dates);
            if(date<=31 && date>0){
                return true;
            }
            else{
                return false;
            }

        }
        else if(monthsmol.contains(month)){
            int date = Integer.parseInt(dates);
            if (date<31 && date>0){
                return true;
            }
            else{
                return false;
            }
        }
        else if(feb.equals(month)){
            int date = Integer.parseInt(dates);
            if (leapYear){
                if(date<30 && date>0){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                if(date>0 && date<29){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        else{
            return false;
        }
    }
    
    public static boolean checkLeapYear(String year){
        int years = Integer.parseInt(year);
        if (years%400==0){
            return true;
        }
        else if(years%100!=0 && years%4==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean checkYear(String year){
        if (year.length()!=4){
            return false;
        }
        
        try {
            int years = Integer.parseInt(year);
            if(years>0){
                return true;
            }
                
        } catch (NumberFormatException nfe) {
            return false;
        }
        return false;
        
    }

    public static void main(String[] args) {
        String date = DateChecker.getUserInputString();
        String day = date.substring(0, 2);
        String month = date.substring(3,5);
        String year = date.substring(6);
        boolean leap = DateChecker.checkLeapYear(year);
        if(DateChecker.checkMonth(date) &&
        DateChecker.checkYear(year) &&
        DateChecker.getLength(date) &&
        DateChecker.checkSlash(date)){
            if(DateChecker.checkDate(day, month, leap)){
                System.out.println("It is a valid date!!");
            }
            else{
                System.out.println("It is invalid.");
            }
            
        }
        else{
            System.out.println("You have entered an Invalid Date.");
        }



    }
}

