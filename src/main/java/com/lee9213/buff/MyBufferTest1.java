package com.lee9213.buff;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author lee9213@163.com
 * @date 2024/3/21 15:38
 */
public class MyBufferTest1 {

    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("test1.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("test3.txt");

        FileChannel inputStreamChannel = fileInputStream.getChannel();
        FileChannel outputStreamChannel = fileOutputStream.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(4);
        while (true) {
            byteBuffer.clear();
            int read = inputStreamChannel.read(byteBuffer);
            if (read == -1) {
                break;
            }
            byteBuffer.flip();
            outputStreamChannel.write(byteBuffer);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
