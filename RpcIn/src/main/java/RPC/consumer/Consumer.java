package RPC.consumer;

import RPC.SayHello;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.net.Socket;

public class Consumer {

    private String interfaceName;
    private Method method;
    private Object[] arguments = {"hello"};

    public Consumer() throws Exception{
        interfaceName = SayHello.class.getName();
        method = SayHello.class.getMethod("sayHello", java.lang.String.class);
    }

    public void execute() throws Exception{
        //发送调用信息到服务器端，调用相应的服务
        Socket socket = new Socket("127.0.0.1",8080);
        ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
        outputStream.writeUTF(interfaceName);
        outputStream.writeUTF(method.getName());
        outputStream.writeObject(method.getParameterTypes());
        outputStream.writeObject(arguments);
        System.out.println("发送信息到服务端，发送的信息为:"+arguments[0]);

        //服务返回的结果
        ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
        Object object = inputStream.readObject();
        System.out.println("服务返回的结果为"+object);
    }
    public static void main(String[] args) throws Exception{
        new Consumer().execute();
    }
}
