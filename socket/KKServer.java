import java.net.*;
import java.io.*;

public class KKServer {
    public static void main(String[] args) {
        try {
            String hostName = "localhost";
            int portNumber = 9876;

            Socket socket = new Socket(hostName, portNumber);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            String serverMessage = in.readLine();
            System.out.println("Server: " + serverMessage);

            if ("Knock! Knock!".equals(serverMessage)) {
                out.println("Who's there?");

                serverMessage = in.readLine();
                System.out.println("Server: " + serverMessage);

                if ("Java.".equals(serverMessage)) {
                    out.println("Java who?");

                    serverMessage = in.readLine();
                    System.out.println("Server: " + serverMessage);
                }
            }

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

    


