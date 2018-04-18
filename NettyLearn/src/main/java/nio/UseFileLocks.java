package nio;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class UseFileLocks {

    static private final int start = 10;
    static private final int end = 20;

    public static void main(String[] args) throws Exception{
        RandomAccessFile raf = new RandomAccessFile("/home/leiline/Documents/Spark/NettyLearn/src/main/java/nio/file/usefilelocks.txt", "rw");
        FileChannel fc = raf.getChannel();

        // get lock
        System.out.println("tring to get lock");
        FileLock lock = fc.lock(start, end , false);
        System.out.println("got lock!");

        // Pause
        System.out.println("pausing");
        try{
            Thread.sleep(3000);
        }catch (InterruptedException ie){

        }

        // Release lock
        System.out.print("going to release lock");
        lock.release();
        System.out.println("released lock");

        raf.close();
    }
}
