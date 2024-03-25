package com.lee9213.buff;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author lee9213@163.com
 * @date 2024/3/21 15:38
 */
public class MyBufferTest2 {

    public static void main(String[] args) throws Exception {

        RandomAccessFile file = new RandomAccessFile("test4.txt", "rw");
        FileChannel fileChannel = file.getChannel();
        MappedByteBuffer byteBuffer = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, 5);

        byteBuffer.put(0, (byte) '1');
        byteBuffer.put(1, (byte) '2');

        file.close();
    }
}
