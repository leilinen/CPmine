package socket.simple;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws Exception{
        int port = 8888;
        ServerSocket server = new ServerSocket(port);
        System.out.println("server is waiting connection.");
        Socket socket = server.accept();
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len;
        StringBuilder sb = new StringBuilder();
        while((len = inputStream.read(bytes)) != -1){
            sb.append(new String(bytes, 0, len, "utf-8"));
        }
        System.out.println("get message from client: " + sb);

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("Hello client, I get the message.".getBytes("utf-8"));

        inputStream.close();
        outputStream.close();
        socket.close();
        server.close();
    }
}
