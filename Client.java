import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client{
    
    public static void main(String[] args) {
        final Socket clientSocket; 
        final BufferedReader in; 
        final PrintWriter out; 
        final Scanner sc = new Scanner(System.in); 
        try {
            clientSocket = new Socket("10.51.25.21", 1234);
            out = new PrintWriter(clientSocket.getOutputStream());
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            
            // Start sender thread
            Thread sender = new Thread(() -> {
                String msg;
                while (true) {
                    msg = sc.nextLine();
                    out.println(msg);
                    out.flush();
                }
            });
            sender.start();
            // Start receiver thread
            Thread receiver = new Thread(() -> {
                String msg;
                try {
                    while (true) {
                        msg = in.readLine();
                        if (msg == null) {
                            System.out.println("Server disconnected");
                            break;
                        }
                        System.out.println(msg);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        in.close();
                        out.close();
                        clientSocket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
            receiver.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



