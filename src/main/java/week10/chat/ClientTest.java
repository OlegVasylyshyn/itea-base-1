package week10.chat;

import java.io.IOException;

public class ClientTest {
    public static void main(String[] args) throws IOException {
        Client.start("localhost", 8080);
    }
}
