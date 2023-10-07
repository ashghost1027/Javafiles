package MessagingApplication.Programs;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;  


public class Messages {
    Scanner scanner = new Scanner(System.in);

    public void sendMessage(User user) throws IOException{

        System.out.println("To whom would you like to send a message? ");
        String listOfUsers = getUsers();
        System.out.println(listOfUsers);
        String userInput = getUserToText(listOfUsers);

        while (userInput.equals("undefined")){
            System.out.print("That username does not exit. Please enter the user name from the list: ");
            userInput = getUserToText(listOfUsers);
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(userInput+".txt", true));
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");
        writer.write(getMessageToSend()+" "+LocalDateTime.now().format(format));
        writer.write("From: "+user.name);
        writer.flush();
        writer.close(); 

    }

    private String getUsers() throws FileNotFoundException{

        String usersList = "[ ";
        Scanner fileReader = new Scanner(new File("users.txt"));
        while (fileReader.hasNextLine()){
            String userInfo = fileReader.nextLine();
            String userName = getNameFromLine(userInfo);
            usersList += userName + " ";
        }

        return usersList+"]";
    }
    private String getNameFromLine(String line){ 

        String name = "";
        for (int i = 0; i < line.length(); i++){
            if ((line.charAt(i)+"").equals(" ")) break;
            name += line.charAt(i);
        }

        return name;

    }

    private String getUserToText(String users){

        String userToText = scanner.nextLine();
        if (users.contains(userToText)) return userToText;
        else return "undefined";

    }

    private String getMessageToSend(){

        System.out.println("Enter |*| once your done writing. ");
        String message = "";
        String line = scanner.nextLine();

        while (!line.equals("|*|")){
            message = line;
            line += scanner.nextLine();
        }

        return message;
    }


    public void readInbox(User user) throws IOException{

        Scanner fileReader = new Scanner(new File(user.name+".txt"));
        while (fileReader.hasNextLine()){
            System.out.println(fileReader.nextLine());
        }

        System.out.print("Would you like to clear inbox? Y/y");
        String clearInbox = scanner.nextLine();
        if (clearInbox.equalsIgnoreCase("Y")) clearInbox(new File(user.name + ".txt"));

    }

    private void clearInbox(File file) throws IOException{

        BufferedWriter writer = new BufferedWriter(new FileWriter(file, false));
        writer.write("");
        writer.flush();
        writer.close();

    }

}
