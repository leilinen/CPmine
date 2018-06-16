package RPC.producer;

import RPC.SayHello;
import RPC.SayHelloImp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class Producer {

    private ServerSocket serverSocket;
    private Map<Object, Object> services;

    public Producer() throws Exception{
         serverSocket = new ServerSocket(8080);
         services = new HashMap<Object, Object>();

    }

    public void excute() throws Exception{
        services.put(SayHello.class, new SayHelloImp());
        while(true){
            System.out.println("service starting...");
            Socket socket = serverSocket.accept();

            ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
            String interfaceName = objectInputStream.readUTF();
            String methodName = objectInputStream.readUTF();
            Class<?>[] parameterTypes = (Class<?>[]) objectInputStream.readObject();
            Object[] arguments = (Object[]) objectInputStream.readObject();
            System.out.println("客户端调用服务端接口"+interfaceName+"的"+ methodName+"方法");

            Class serviceClass = Class.forName(interfaceName);
            Object service = services.get(serviceClass);
            Method method = serviceClass.getMethod(methodName, parameterTypes);
            Object result = method.invoke(service, arguments);

            ObjectOutputStream stream = new ObjectOutputStream(socket.getOutputStream());
            stream.writeObject(result);
            System.out.println("服务端返回结果为"+result);
        }
    }

    public static void main(String[] args) throws Exception{
        new Producer().excute();
    }
}
