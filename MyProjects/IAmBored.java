import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class IAmBored {
    public void writeFile(String string, File path) throws IOException {
        try {
            // String path = "hello2.txt";
            BufferedWriter file = new BufferedWriter(new FileWriter(path));
            file.write(string);
            file.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("Such a file doesn't exist sadly.");
        }
    }

    public String readFile(File file) {
        try {
            // File file = new File("hello.txt");
            Stack<String> stack = new Stack<String>();
            Scanner myReader = new Scanner(file);
            String lines = "";
            while (myReader.hasNextLine()) {
                stack.push(myReader.nextLine());
            }
            while(!stack.isEmpty()){
                lines+=stack.pop();
            }
            myReader.close();
            return lines;

        } catch (FileNotFoundException e) {
            return e.getLocalizedMessage();
        }
    }

    public void writeFiles() {
        try {
            IAmBored bored = new IAmBored();
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter how many lines you want to write: ");
            int lines = scanner.nextInt();
            StringBuilder str = new StringBuilder();

            for (int i = 0; i <= lines; i++) {
                String write = scanner.nextLine();
                str.append(write + "\n");

            }
            System.out.print("Enter the file to write and read from: ");
            String startFile = scanner.nextLine();
            System.out.print("Enter the destination file: ");
            String destinationFile = scanner.nextLine();
            File file1 = new File(startFile);
            File file2 = new File(destinationFile);
            bored.writeFile(str.toString(), file1);
            bored.writeFile(bored.readFile(file1), file2);
            scanner.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    public static void main(String[] args) throws IOException{
        IAmBored iAmBored = new IAmBored();
        iAmBored.writeFiles();
    }
}
