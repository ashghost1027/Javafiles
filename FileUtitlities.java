import java.io.File;
import java.io.FileNotFoundException;
// import java.io.IOException;

import java.util.Scanner;

public class FileUtitlities {

    public String readFile(File file) {

        try {
            Scanner myReader = new Scanner(file);
            String lines = "";
            String data = "";
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
                lines += data + "\n";
            }

            myReader.close();
            return lines;

        } catch (FileNotFoundException e) {
            return e.getLocalizedMessage();
        }
    }

    public static void main(String[] args) {
        StringSeeker seek = new StringSeeker();
        FileUtitlities files = new FileUtitlities();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file you want to check: ");
        String filePath = scanner.nextLine();
        File file = new File(filePath);
        String stringToCount = files.readFile(file);
        System.out.println("The number of characters = " + seek.countCharacters(stringToCount));
        System.out.println("The number of words = " + seek.countWords(stringToCount));
        System.out.println("The number of lines = " + (seek.countLines(stringToCount) - 1));
        System.out.println(seek.isContains(stringToCount));
        scanner.close();

    }
}
