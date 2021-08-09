package gb.java.level2.homework6;

public class Main {
    public static void main(String[] args) {

        new Thread(Server::new).start();
        new Thread(Client::new).start();

    }
}
