package com.lee9213.file;

import java.io.FileInputStream;
import java.net.InetSocketAddress;
import java.nio.channels.FileChannel;
import java.nio.channels.SocketChannel;

/**
 * @author lee9213@163.com
 * @date 2024/3/26 15:19
 */
public class NewIOClient {

    public static void main(String[] args) throws Exception {
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.connect(new InetSocketAddress("localhost", 8899));
        socketChannel.configureBlocking(true);
        long start = System.currentTimeMillis();
        String fileName = "/Users/lee9213/Documents/3_Netty课程大纲深度解读.mp4";
        FileChannel fileChannel = new FileInputStream(fileName).getChannel();
        long total = fileChannel.transferTo(0, fileChannel.size(), socketChannel);
        System.out.println("读取文件：" + total + "，耗时：" + (System.currentTimeMillis() - start));
        fileChannel.close();
    }
}
