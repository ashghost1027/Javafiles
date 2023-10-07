import java.util.Scanner;

public class Construction {
    public static void main(String[] args) {
        Constructor House1 = new Constructor();
        Constructor House2 = new Constructor();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the house: ");
        String name = scanner.nextLine();
        System.out.print("Enter the bar of the house: ");
        String bars = scanner.nextLine();
        System.out.print("Enter the time consumption of the house: ");
        Double time = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter the cement of the house: ");
        String cement = scanner.nextLine();
        House1.House(name, bars, time, cement);

        System.out.print("Enter the name of the house: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter the bar of the house: ");
        String bars2 = scanner.nextLine();
        System.out.print("Enter the time consumption of the house: ");
        Double time2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter the cement of the house: ");
        String cement2 = scanner.nextLine();

        House2.House(name2, bars2, time2, cement2);

        System.out.println(House1.name);
        System.out.println(House2.bars);
        System.out.println(House1.time);
        System.out.println(House2.cement);

        House1.destroyHouse();
        House2.furnishHouse();
        scanner.close();
    }

}
