package nio;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ReadFromFile {

    public static void main(String[] args) throws Exception{
        FileInputStream fin = new FileInputStream("/home/leiline/Documents/Spark/spark_source/spark-2.1.1/python/README.md");
        FileChannel fc = fin.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        fc.read(buffer);

        buffer.flip();

        int i=0;
        while(buffer.remaining() > 0){
            byte b = buffer.get();
            System.out.println("Character " + i + ": " + (char)b);
            i++;
        }
        fin.close();
    }
}
