package socket.simple;

import java.io.OutputStream;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws Exception{

        String host = "127.0.0.1";
        int port = 8888;
        Socket socket = new Socket(host, port);
        OutputStream outputStream = socket.getOutputStream();
        String message = "hello, world!";
        socket.getOutputStream().write(message.getBytes("utf-8"));


    }
}
