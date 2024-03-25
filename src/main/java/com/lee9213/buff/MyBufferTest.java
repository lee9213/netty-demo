package com.lee9213.buff;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author lee9213@163.com
 * @date 2024/3/21 15:38
 */
public class MyBufferTest {

    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("test1.txt");
        FileChannel channel = fileInputStream.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(512);
        channel.read(byteBuffer);
        byteBuffer.flip();
        while (byteBuffer.hasRemaining()) {
            System.out.println("read txt:" + (char) byteBuffer.get());
        }
        fileInputStream.close();


        FileOutputStream fileOutputStream = new FileOutputStream("test2.txt");
        FileChannel fileChannel = fileOutputStream.getChannel();
        ByteBuffer byteBuffer1 = ByteBuffer.allocate(512);
        byte[] bytes = "hello world 2".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            byteBuffer1.put(bytes[i]);
        }
        byteBuffer1.flip();
        fileChannel.write(byteBuffer1);

        fileOutputStream.close();
    }
}
