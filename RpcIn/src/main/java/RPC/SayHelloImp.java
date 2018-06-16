package RPC;

public class SayHelloImp implements SayHello{
    public String sayHello(String msg){
        if("hello".equals(msg)){
            return "hello client";
        }else{
            return "bye~";
        }
    }
}
