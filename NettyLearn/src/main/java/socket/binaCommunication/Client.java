package socket.binaCommunication;

import java.io.InputStream;
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

        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();

        byte[] bytes = new byte[1024];
        int len;
        StringBuilder sb = new StringBuilder();
        while((len = inputStream.read(bytes)) != -1){
            sb.append(new String(bytes, 0, len, "utf-8"));
        }
        System.out.println("get message from server: " + sb);

        inputStream.close();
        outputStream.close();
        socket.close();
    }
}
