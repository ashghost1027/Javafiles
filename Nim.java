import java.util.Random;
import java.util.Scanner;

public class Nim {

    private int[] array;
    private int length;

    public Nim() {
        this.length = 10;
        array = new int[length];
    }

    public Nim(int length) {
        this.length = length;
        array = new int[length];
    }

    public int getComputerInput() {
        Random random = new Random();
        int randomInt = random.nextInt();
        if (randomInt % 2 == 0 && this.length > 1) {
            return 2;
        } else if (randomInt % 2 == 1 && this.length > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int userNumber = scanner.nextInt();
        scanner.nextLine();
        if (userNumber % 2 == 0) {
            return 2;
        } else {
            return 1;
        }
    }

    public String toString() {
        String arrayString = "[";
        for (int i = 0; i < array.length - 2; i++) {
            arrayString += array[i];
            arrayString += ',';
        }
        arrayString += array[length - 1] + "]";
        return arrayString;
    }

    public void removeElements(int numberOfElementsToRemove) {
        try {
            int[] removedArray = new int[length - numberOfElementsToRemove];
            for (int i = 0; i < length - numberOfElementsToRemove - 1; i++) {
                removedArray[i] = array[i];
            }
            this.array = removedArray;
            this.length -= numberOfElementsToRemove;
        } catch (NegativeArraySizeException nse) {
            int[] removedArray = new int[length - 1];
            for (int i = 0; i < length - 1; i++) {
                removedArray[i] = array[i];
            }
            this.array = removedArray;
            this.length -= numberOfElementsToRemove;
        }

        // System.out.println(array);
    }

    public boolean isEmpty() {
        if (array.length > 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();
        scanner.nextLine();
        Nim nim = new Nim(length);
        while (nim.length > 0) {
            int playerInput = nim.getUserInput();
            nim.removeElements(playerInput);
            if (nim.isEmpty()) {
                System.out.println("You won.");
                break;
            }
            int computerInput = nim.getComputerInput();
            nim.removeElements(computerInput);
            if (nim.isEmpty()) {
                System.out.println("You lost.");
                break;
            }
        }
        scanner.close();
    }

}
