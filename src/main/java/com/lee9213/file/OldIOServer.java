package com.lee9213.file;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author lee9213@163.com
 * @date 2024/3/26 14:59
 */
public class OldIOServer {

    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8898);
        while (true) {
            Socket socket = serverSocket.accept();
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            byte[] byteArrays = new byte[4096];
            long total = 0;
            long start = System.currentTimeMillis();
            while (true) {
                int read = dataInputStream.read(byteArrays, 0, byteArrays.length);
                if (read == -1) {
                    break;
                }
                total += read;
            }
            System.out.println("共读取文件：" + total + "，耗时：" + (System.currentTimeMillis() - start));
        }
    }
}
