import java.util.Scanner;
import java.util.Random;

public class SlotMachine {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int deposit;
    int lines;
    int amount;
    String[] splChar = { "@", "#", "$" };

    public void welcomeUser() {
        System.out.println("Welcome to slot machine!!");
        System.out.print("Enter your username: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);
    }

    // Gets the input required from the user
    public void getDepositFromUser() {

        System.out.print("Enter your deposit: ");
        deposit = scanner.nextInt();
        System.out.print("Enter the number of lines you want to bet on: ");
        lines = scanner.nextInt();
        System.out.print("Enter the amount you want to bet on each line: ");
        amount = scanner.nextInt();
    }

    // Check User input
    public boolean checkUserInput() {
        if (amount * lines > deposit) {
            System.out.println("You are exceeding your deposit. Please bet on a smaller amount.");
            // getDepositFromUser();
            return false;
        } else if (lines < 1) {
            System.out.println("Please play atleast one line.");
            // getDepositFromUser();
            return false;
        } else if (deposit < 100) {
            System.out.println("Your deposit needs to be more than 100/- to be valid.");
            return false;
        } else if (amount < 100) {
            System.out.println("You need to bet more than 100/-");
            return false;
        } else {
            return true;
        }
    }

    // Get lines of slot
    public String[][] slotGenerator(boolean check) {
        if (check == true) {
            String[][] resultLines = new String[lines][splChar.length];
            for (int i = 0; i < lines; i++) {

                String[] characters = new String[3];

                for (int j = 0; j < splChar.length; j++) {
                    int characterIndex = random.nextInt(3);
                    if (characterIndex == 0) {
                        characters[j] = splChar[0];
                    } else if (characterIndex == 1) {
                        characters[j] = splChar[1];
                    } else if (characterIndex == 2) {
                        characters[j] = splChar[2];
                    }
                }
                resultLines[i] = characters;
            }
            for (String[] i : resultLines) {
                for (String j : i) {
                    System.out.print("  " + j + "  ");
                }
                System.out.println("");
            }
            return resultLines;

        } else {
            String[][] resultLines = null;
            return resultLines;
        }
    }

    // Check the slot
    public int checkSlot(String[][] slot) {
        String a = "@";
        String b = "#";
        String c = "$";
        int linesWon = 0;
        int linesLost = 0;

        for (int i = 0; i < slot.length; i++) {
            int countA = 0;
            int countB = 0;
            int countC = 0;

            for (int j = 0; j < slot[i].length; j++) {
                if (slot[i][j] == a) {
                    countA++;
                } else if (slot[i][j] == b) {
                    countB++;
                } else if (slot[i][j] == c) {
                    countC++;
                }
            }
            if (countA == 3 || countB == 3 || countC == 3) {
                linesWon++;
            } else {
                linesLost--;
            }

        }
        if (linesWon > linesLost) {
            return linesWon;
        } else {
            return linesLost;
        }

    }

    public void checkVictory(boolean strike, int line) {
        int remains = deposit - amount * lines;
        if (strike == true) {
            System.out.println("You have won!!!");
            System.out.println("Your earnings: " + amount * lines);
            int result = remains + amount * line;
            System.out.println("Your current deposit: " + result);
        } else {
            System.out.println("You lost ):");
            System.out.println("Your loss: " + amount * lines);
            remains -= amount * line;
            System.out.println("Your current deposit: " + remains);
        }
    }

    public static void main(String[] args) {
        SlotMachine slot = new SlotMachine();
        slot.welcomeUser();
        slot.getDepositFromUser();
        boolean cont = slot.checkUserInput();
        while (cont == false) {
            slot.getDepositFromUser();
            cont = slot.checkUserInput();
        }

        String[][] betLines = slot.slotGenerator(cont);
        int won = slot.checkSlot(betLines);
        if (won > 0) {
            boolean strike = true;
            slot.checkVictory(strike, won);
        } else {
            boolean strike = false;
            slot.checkVictory(strike, won);
        }
    }
}
