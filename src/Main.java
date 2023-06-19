import jdk.incubator.vector.VectorOperators;

import java.io.IOException;
import java.net.*;
public class Main {


    public static void main(String[] args) {


        try
        {
            ServerSocket serverSocket = new ServerSocket(80);
            boolean isStop = false;

            while(true)
            {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client " + clientSocket.getInetAddress().getHostAddress() + " is connected"); // print client ip address
                ClientThread clientThread = new ClientThread(clientSocket); // create a new thread for each client
                clientThread.start(); //start the thread
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

}
