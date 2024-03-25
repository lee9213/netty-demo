package com.lee9213.buff;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Arrays;

/**
 * @author lee9213@163.com
 * @date 2024/3/21 15:38
 */
public class MyBufferTest3 {

    public static void main(String[] args) throws Exception {

        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.socket().bind(new InetSocketAddress(8899));
        SocketChannel socketChannel = serverSocketChannel.accept();
        ByteBuffer[] byteBuffers = new ByteBuffer[3];
        int length = 2 + 3 + 4;
        byteBuffers[0] = ByteBuffer.allocate(2);
        byteBuffers[1] = ByteBuffer.allocate(3);
        byteBuffers[2] = ByteBuffer.allocate(4);
        while (true) {
            int byteRead = 0;
            while (byteRead < length) {
                long l = socketChannel.read(byteBuffers);
                byteRead += l;

                System.out.println("byteRead:" + byteRead);
                Arrays.asList(byteBuffers).stream().map(buffer -> "position:" + buffer.position() + ",limit:" + buffer.limit())
                        .forEach(System.out::println);
            }
            Arrays.asList(byteBuffers).forEach(ByteBuffer::flip);

            int byteWrite = 0;
            while (byteWrite < length) {
                long write = socketChannel.write(byteBuffers);
                byteWrite += write;
            }
            Arrays.asList(byteBuffers).forEach(ByteBuffer::clear);

            System.out.println("byteRead:" + byteRead + ",byteWrite:" + byteWrite + ",length:" + length);
        }
    }
}
