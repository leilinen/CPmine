package nio;

import java.nio.ByteBuffer;

public class TypesInByteBuffer {

    public static void main(String[] args) throws Exception{
        ByteBuffer buffer = ByteBuffer.allocateDirect(64);

        buffer.putInt(30);
        buffer.putLong(700000000000000L);
        buffer.putDouble(Math.PI);
        buffer.putInt(40);
        buffer.putInt(50);


        buffer.flip();

        System.out.println(buffer.getInt());
        System.out.println(buffer.getLong());
        System.out.println(buffer.getDouble());
        System.out.println(buffer.getInt());
        System.out.println(buffer.getInt());

    }
}
