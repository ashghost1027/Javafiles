import java.util.Scanner;

class BodySafety {
    public void Arms(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your ailment: ");
        String ailment = scanner.nextLine();
        if (ailment.equalsIgnoreCase("broken")){
            System.out.println("Get a maavu kattu");
        }
        else if(ailment.equalsIgnoreCase("sprain")){
            System.out.println("Take rest");
        }
        else{
            System.out.println("Sell it on the dark web");
        }
        scanner.close();
    
    }
    public void Leg(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your ailment:");
        String ailment = scanner.nextLine();
        if(ailment.equalsIgnoreCase("Broken")){
            System.out.println("No more football");
        }
        else if(ailment.equalsIgnoreCase("sprain")){
            System.out.println("Football in a few days");
        }
        else{
            System.out.println("Lets play football");
        }
        scanner.close();
    }
    public void Sick(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Are you sick? ");
        String ailment = scanner.nextLine();
        if(ailment.equalsIgnoreCase("Yes")){
            System.out.println("Don't eat");
        }
        else{
            System.out.println("Go fuck yourself");
        }
        scanner.close();
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        BodySafety body = new BodySafety();
        System.out.println("Enter thy disfunctional location: ");
        String disease = scanner.nextLine();
        if (disease.equalsIgnoreCase("arm")){
            body.Arms();
        }
        else if(disease.equalsIgnoreCase("leg")){
            body.Leg();
        }
        else if(disease.equalsIgnoreCase("sick")){
            body.Sick();
        }
        scanner.close();

    }
}

