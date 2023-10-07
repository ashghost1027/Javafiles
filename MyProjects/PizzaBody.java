public class PizzaBody {

    String crust;
    String sauce;
    String cheese;
    String toppings;

    PizzaBody(String crust, String sauce, String cheese, String toppings) {
        this.crust = crust;
        this.sauce = sauce;
        this.cheese = cheese;
        this.toppings = toppings;
    }

    PizzaBody(String crust, String sauce, String cheese) {
        this.crust = crust;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    PizzaBody(String crust, String sauce) {
        this.crust = crust;
        this.sauce = sauce;
    }

    public String toString() {
        return crust + "\n" + sauce + "\n" + cheese + "\n" + toppings;
    }

}
