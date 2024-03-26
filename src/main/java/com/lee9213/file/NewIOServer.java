package com.lee9213.file;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * @author lee9213@163.com
 * @date 2024/3/26 15:19
 */
public class NewIOServer {

    public static void main(String[] args) throws Exception {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        ServerSocket serverSocket = serverSocketChannel.socket();
        serverSocket.setReuseAddress(true);
        serverSocket.bind(new InetSocketAddress(8899));

        ByteBuffer byteBuffer = ByteBuffer.allocate(4096);
        while (true) {
            long start = System.currentTimeMillis();
            SocketChannel socketChannel = serverSocketChannel.accept();
            socketChannel.configureBlocking(true);
            int total = 0;
            while (true) {
                int read = socketChannel.read(byteBuffer);
                if (read <= 0) {
                    break;
                }
                byteBuffer.rewind();
                total += read;
            }
            System.out.println("读取文件：" + total + "，耗时：" + (System.currentTimeMillis() - start));
        }
    }
}
