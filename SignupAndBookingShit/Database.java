package SignupAndBookingShit;

import java.io.File;
import java.io.FileNotFoundException;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedWriter;

public class Database {
    private String userData;
    File file;

    public Database() {
        file = new File("./SignupAndBookingShit/UserInfo.txt");
    }

    public Database(String pathName) {
        file = new File(pathName);
    }

    public void writeIntoFile(String name, String password, int userId) {
        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
            Encrypt encryption = new Encrypt(password);
            String storePassword = encryption.getEncryption();
            String key = encryption.getKey();
            writer.write(
                    "\n" + userId + ", " + name.strip() + ", ||||" + storePassword.strip() + ", " + key.strip() + "\n");
            writer.flush();
            writer.close();
        } catch (IOException ioe) {
            System.out.println("Could not sign up due to error.");
        }
    }

    public String retrieveUserDataFromFile(String name) {

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String usersData = scanner.nextLine();
                if (usersData.contains(name)) {
                    userData = usersData;
                    break;
                }
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return userData;
    }

    public String retrieveAllDataFromFile() {
        String allData = "";
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                if (!scanner.nextLine().equals("\n")) {

                    while (scanner.hasNextLine()) {
                        allData += scanner.nextLine();
                    }
                }

                else {
                    allData += "";
                }
            }

            // scanner.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return allData;
    }

    public void searchBlogs() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word you want to search: ");

        String substring = scanner.nextLine();
        Database data = new Database("./SignupAndBookingShit/Blogs");
        File directory = new File("./SignupAndBookingShit/Blogs");
        File[] files = directory.listFiles();
        for (File file : files) {
            if (stringInBlog(file, substring)) {
                System.out.println(data.readBlog(file.getName()));
            } else {
                System.out.println("No. We can't find that anywhere.");
            }
        }
    }

    public boolean stringInBlog(File blog, String substring) throws FileNotFoundException {
        File directory = new File("./SignupAndBookingShit/Blogs");
        File fileToRead = new File(directory, blog.getName());
        Scanner scanner = new Scanner(fileToRead);
        int increment = substring.length();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            for (int i = 0; i + increment < line.length(); i++) {
                if (line.substring(i, i + increment).equals(substring)) {
                    return true;
                }
            }
        }
        return false;

    }

    public void writeBlog(String name) {
        Scanner scanner = new Scanner(System.in);

        File fileToWrite = new File("./SignupAndBookingShit/Blogs", name + ".txt");
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileToWrite, true));
            System.out.println("Enter |*| if you are done writing. Enter your title: ");
            String userInput = scanner.nextLine();
            while (!userInput.equals("|*|")) {
                writer.write(userInput);
                writer.flush();
                userInput = scanner.nextLine();
            }
            System.out.println("Blog successfully entered.");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // @Override
    public static String toString(File[] files) {
        String fileList = "";
        for (int i = 0; i < files.length; i++) {
            fileList += (i + 1) + ") " + files[0] + "\n";
        }
        return fileList;
    }

    public void readBlogs() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        File directory = new File("./SignupAndBookingShit/Blogs");
        File[] files = directory.listFiles();
        System.out.println(toString(files));
        System.out.print("Enter the name of the writer who's blog you want to read: ");
        String fileName = scanner.nextLine();
        fileName += ".txt";
        File fileToRead = new File(directory, fileName);
        while (!Arrays.asList(files).contains(fileToRead)) {
            System.out.println("That artist cannot be found.");
            System.out.print("Please enter the name correctly: ");
            fileName = scanner.nextLine();
            fileName += ".txt";
            fileToRead = new File(directory, fileName);
        }
        System.out.println(readBlog(fileName));

    }

    public String readBlog(String fileName) throws FileNotFoundException {
        File fileToRead = new File("./SignupAndBookingShit/Blogs", fileName);
        Scanner scanner = new Scanner(fileToRead);
        String blog = "";
        while (scanner.hasNextLine()) {
            blog += scanner.nextLine() + "\n";
        }
        return blog;
    }

    public void createUserFile(String name) {
        File directory = new File("./SignupAndBookingShit/Blogs");
        String userFileName = name + ".txt";
        File userFile = new File(directory, userFileName);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(userFile));
            writer.write(name);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean isExists(String name) {

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                if (scanner.nextLine().contains(name))
                    return true;
            }

        } catch (FileNotFoundException e) {

            return false;
        }

        return false;
    }

    public void deleteUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the user you want to delete: ");
        String userName = scanner.nextLine();
        if (!isExists(userName))
            System.out.println("There is no such user.");
        else {
            try {
                File file = new File("UserInfo.txt");
                Scanner fileScanner = new Scanner(file);
                String newFile = "";
                while (fileScanner.hasNextLine()) {
                    if (fileScanner.nextLine().equals(userName)) {
                        newFile += "";
                    } else {
                        newFile += fileScanner.nextLine() + "\n";
                    }
                }

                BufferedWriter writer = new BufferedWriter(new FileWriter(file));

                writer.write(newFile);
                writer.flush();
                writer.close();
            } catch (IOException ioe) {
                System.out.println("Could not sign up due to error.");
            }
        }
    }

    public void allBlogs() {
        Scanner scanner = new Scanner(System.in);
        File directory = new File("./SignupAndBookingShit/Blogs");
        File[] files = directory.listFiles();
        System.out.println(toString(files));
    }
}