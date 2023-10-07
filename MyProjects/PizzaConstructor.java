import java.util.Scanner;

public class PizzaConstructor {

    public static void main(String[] args) {
        // PizzaBody pizza = new PizzaBody();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome!!");
        System.out.print(
                "Enter the index of the pizza you want (101:Crust,sauce,cheese,toppings);(102:Crust,sauce,cheese);(103:Crust,sauce): ");
        int index = scanner.nextInt();
        scanner.nextLine();
        // PizzaBody stuff = new PizzaBody("thin","tomato");
        // PizzaBody stuff2 = new PizzaBody("thin","bbq");
        // PizzaBody stuff3 = new PizzaBody("thin","tomato");

        // PizzaBody[] listBodies = {stuff,stuff2,stuff3};
        // System.out.println(listBodies[0].crust);
        // System.out.println(listBodies[1].sauce);

        if (index == 101) {
            System.out.print("Enter your crust preference: ");
            String crust = scanner.nextLine();
            // System.out.println();
            System.out.print("Enter your sauce preference: ");
            String sauce = scanner.nextLine();
            System.out.print("Enter your cheese preference: ");
            String cheese = scanner.nextLine();
            System.out.print("Enter your toppings: ");
            String toppings = scanner.nextLine();
            PizzaBody pizza = new PizzaBody(crust, sauce, cheese, toppings);
            System.out.println("Your pizza consists: ");
            System.out.println("Crust: " + pizza.crust + ", Sauce: " + pizza.sauce + ", Cheese: " + pizza.cheese
                    + ", Toppings: " + pizza.toppings);
            System.out.println(pizza);

        } else if (index == 102) {
            System.out.print("Enter your crust preference: ");
            String crust = scanner.nextLine();
            // System.out.print();
            System.out.print("Enter your sauce preference: ");
            String sauce = scanner.nextLine();
            System.out.print("Enter your cheese preference: ");
            String cheese = scanner.nextLine();

            PizzaBody pizza = new PizzaBody(crust, sauce, cheese);
            System.out.println("Your pizza consists: ");
            System.out.println("Crust: " + pizza.crust + ", Sauce: " + pizza.sauce + ", Cheese: " + pizza.cheese);

        } else if (index == 103) {
            System.out.print("Enter your crust preference: ");
            String crust = scanner.nextLine();
            // System.out.println();
            System.out.print("Enter your sauce preference: ");
            String sauce = scanner.nextLine();

            PizzaBody pizza = new PizzaBody(crust, sauce);
            System.out.println("Your pizza consists: ");
            System.out.println("Crust: " + pizza.crust + ", Sauce: " + pizza.sauce);

        } else {
            System.out.println("That order is invalid!!!!");
        }

        scanner.close();
    }
}
