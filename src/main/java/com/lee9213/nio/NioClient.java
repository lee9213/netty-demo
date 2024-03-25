package com.lee9213.nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author lee9213@163.com
 * @date 2024/3/25 13:49
 */
public class NioClient {

    public static void main(String[] args) throws Exception {
        Selector selector = Selector.open();

        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.configureBlocking(false);
        socketChannel.register(selector, SelectionKey.OP_CONNECT);

        socketChannel.connect(new InetSocketAddress("localhost", 8899));

        while (true) {
            selector.select();
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            for (SelectionKey selectionKey : selectionKeys) {
                if (selectionKey.isConnectable()) {
                    SocketChannel client = (SocketChannel) selectionKey.channel();
                    if (client.isConnectionPending()) {
                        client.finishConnect();

                        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                        byteBuffer.put("连接成功".getBytes());
                        byteBuffer.flip();
                        client.write(byteBuffer);
                        ExecutorService executorService = Executors.newSingleThreadExecutor(Executors.defaultThreadFactory());
                        executorService.submit(() -> {
                            while (true) {
                                try {
                                    byteBuffer.clear();
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                                    String message = bufferedReader.readLine();
                                    byteBuffer.put(message.getBytes());
                                    byteBuffer.flip();
                                    client.write(byteBuffer);
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        });
                    }
                    client.register(selector, SelectionKey.OP_READ);
                } else if (selectionKey.isReadable()) {
                    SocketChannel client = (SocketChannel) selectionKey.channel();
                    ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                    int read = client.read(byteBuffer);
                    if (read > 0) {
                        byteBuffer.flip();
                        System.out.println(new String(byteBuffer.array(), 0, read));
                    }
                }
            }
            selectionKeys.clear();
        }

    }
}
