package com.lee9213.buff;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * @author lee9213@163.com
 * @date 2024/3/21 15:38
 */
public class MyBufferTest4 {

    public static void main(String[] args) throws Exception {
        Selector selector = Selector.open();
        for (int i = 0; i < 5; i++) {
            int port = 8000 + i;
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.configureBlocking(false);
            serverSocketChannel.socket().bind(new InetSocketAddress(port));
            serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
            System.out.println("监听端口：" + port);
        }

        while (true) {
            int select = selector.select();
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            System.out.println("selectKyes:" + selectionKeys);
            Iterator<SelectionKey> keyIterator = selectionKeys.iterator();
            while (keyIterator.hasNext()) {
                SelectionKey selectionKey = keyIterator.next();
                if (selectionKey.isReadable()) {
                    SocketChannel channel = (SocketChannel) selectionKey.channel();
                    int byteRead;
                    while (true) {
                    ByteBuffer byteBuffer = ByteBuffer.allocate(512);
                        byteBuffer.clear();
                        byteRead = channel.read(byteBuffer);
                        if (byteRead <= 0) {
                            break;
                        }
                        byteBuffer.flip();
                        channel.write(byteBuffer);
                    }
                    System.out.println("读取：" + byteRead + "，来自于：" + channel);
                    keyIterator.remove();
                }
                else if (selectionKey.isAcceptable()) {
                    ServerSocketChannel socketChannel = (ServerSocketChannel) selectionKey.channel();
                    SocketChannel accept = socketChannel.accept();
                    accept.configureBlocking(false);
                    accept.register(selector, SelectionKey.OP_READ);
                    keyIterator.remove();
                    System.out.println("获得客户端连接：" + socketChannel);
                }
            }

        }
    }
}
