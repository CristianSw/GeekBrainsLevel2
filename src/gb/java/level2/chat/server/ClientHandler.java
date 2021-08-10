package gb.java.level2.chat.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Optional;

public class ClientHandler {
    private Server server;
    private DataInputStream in;
    private DataOutputStream out;
    private String name;

    public ClientHandler(Server server, Socket socket) {

        try {
            this.server = server;
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            new Thread(()->{
                try {
                    doAuthentication();
                    listenMessages();
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    closeConnections(socket);
                }
            }).start();

        } catch (IOException e) {
            throw new RuntimeException("Something went wrong when create client", e);
        }
    }

    private void closeConnections(Socket socket){
        server.unsubscribe(this);
        server.broadcastMessage(String.format("User[%s] exit from chat", name));
        try{
            in.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        try{
            out.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        try{
            socket.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    private void doAuthentication() throws IOException {
        while (true) {
            String mayBeCredentials = in.readUTF();
            if (mayBeCredentials.startsWith("-auth")) {
                String[] credentials = mayBeCredentials.split("\\s");
                Optional<AuthService.Entry> mayBeUser = server.getAuthService().findUserByLoginAndPassword(credentials[2], credentials[3]);
                if (mayBeUser.isPresent()) {
                    AuthService.Entry user = mayBeUser.get();
                    if (server.isNotOccupied(user.getName())) {
                        name = user.getName();
                        sendMessage("AUTH OK");
                        sendMessage("Welcome");
                        server.broadcastMessage(String.format("User[%s] entered chat", name));
                        server.subscribe(this);
                        return;
                    } else {
                        sendMessage("User already logged in ");
                    }
                } else {
                    sendMessage("Invalid Credentials");

                }
            }
        }
    }

    public void sendMessage(String outboundMessage) {
        try {
            out.writeUTF(outboundMessage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void listenMessages() throws IOException {
        while (true){
            String inboundMessage = in.readUTF();

            if (inboundMessage.equals("-exit")){
                break;
            }
            server.broadcastMessage(inboundMessage);
        }
    }
}
