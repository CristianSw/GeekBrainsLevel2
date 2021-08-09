package gb.java.level2.homework6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    private ServerSocket socket;
    private Socket client;
    private Scanner scanner = new Scanner(System.in);

    public Server() {
        start();
        communicate();
        System.out.println("Server OFF.");
        System.out.println("SERVER STATUS OK");
    }


    private void start() {
        try {
            socket = new ServerSocket(8899);
            System.out.println("Socket Created!");
            System.out.println("Waiting for connection...");
            client = socket.accept();
            System.out.println("Client Connected!");
            System.out.println(client);
            System.out.println("Status is : OK");
        } catch (IOException e) {
            System.out.println("Status is :  NOK");
            e.printStackTrace();
            e.getMessage();
            e.getCause();
        }
    }

    private void communicate() {
        try {
            DataInputStream in = new DataInputStream(client.getInputStream());
            DataOutputStream out = new DataOutputStream(client.getOutputStream());

            while (true) {
                String incomingMessage = in.readUTF();
                if (incomingMessage.equals("-exit")) {
                    out.writeUTF("ECHO: BYE");
                    out.writeUTF("-end");
                    break;
                }
                if (incomingMessage.equals("-answer")) {
                    System.out.println("EnterServerMessage!!!!! :");
                    String outboundServerMessage = scanner.nextLine();
                    out.writeUTF("Server Response" + outboundServerMessage);
                }else
                out.writeUTF("ECHO : " + incomingMessage);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
