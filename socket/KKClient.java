import java.net.*;
import java.io.*;
import java.util.Scanner;

public class KKClient{
    public static void main(String[] args) {
        try {
            int portNumber = 9876;
            ServerSocket serverSocket = new ServerSocket(portNumber);
            Socket clientSocket = serverSocket.accept();

            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
 
            String knockKnockMessage = "Knock! Knock!";
            out.println(knockKnockMessage);

            String clientResponse = in.readLine();
            if ("Who's there?".equals(clientResponse)) {
                String response = "Java.";
                out.println(response);

                clientResponse = in.readLine();
                if ("Java who?".equals(clientResponse)) {
                    response = "Java the Hut!";
                    out.println(response);
                }
            }

            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
