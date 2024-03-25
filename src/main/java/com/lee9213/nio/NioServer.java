package com.lee9213.nio;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/**
 * @author lee9213@163.com
 * @date 2024/3/25 13:49
 */
public class NioServer {

    private static Map<String, SocketChannel> socketChannelMap = new HashMap<>();


    public static void main(String[] args) throws Exception {
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel.socket().bind(new InetSocketAddress(8899));
        Selector selector = Selector.open();
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);


        while (true) {
            selector.select();
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            selectionKeys.forEach(selectionKey -> {
                try {
                    if (selectionKey.isAcceptable()) {
                        ServerSocketChannel serverSocketChannel1 = (ServerSocketChannel) selectionKey.channel();
                        SocketChannel client = serverSocketChannel1.accept();
                        client.configureBlocking(false);
                        client.register(selector, SelectionKey.OP_READ);
                        System.out.println("获得客户端连接：" + client);

                        socketChannelMap.put("【"+ UUID.randomUUID().toString() +"】", client);
                    } else if (selectionKey.isReadable()) {
                        SocketChannel client = (SocketChannel) selectionKey.channel();
                        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                        int read = client.read(byteBuffer);
                        if (read > 0) {
                            byteBuffer.flip();
                            char[] array = Charset.forName("UTF-8").decode(byteBuffer).array();

                            String key = "";
                            for (Map.Entry<String, SocketChannel> entry : socketChannelMap.entrySet()) {
                                if (entry.getValue() == client) {
                                    key = entry.getKey();
                                    break;
                                }
                            }
                            String message = String.valueOf(array);
                            System.out.println("服务端收到" + key + "：" + message);
                            for (Map.Entry<String, SocketChannel> entry : socketChannelMap.entrySet()) {
                                SocketChannel value = entry.getValue();
                                ByteBuffer writeBuffer = ByteBuffer.allocate(1024);
                                if (value == client) {
                                    writeBuffer.put(("自己说：" + message).getBytes("UTF-8"));
                                } else {
                                    writeBuffer.put((entry.getKey() + "说：" + message).getBytes());
                                }
                                writeBuffer.flip();
                                value.write(writeBuffer);
                                writeBuffer.clear();
                            }
                        }
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            });
            selectionKeys.clear();
        }
    }
}
