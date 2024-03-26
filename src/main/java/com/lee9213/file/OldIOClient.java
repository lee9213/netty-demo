package com.lee9213.file;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.net.Socket;

/**
 * @author lee9213@163.com
 * @date 2024/3/26 14:59
 */
public class OldIOClient {

    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 8898);
        String fileName = "/Users/lee9213/Documents/3_Netty课程大纲深度解读.mp4";
        FileInputStream fileInputStream = new FileInputStream(fileName);
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        byte[] bytes = new byte[4096];
        long length;
        long total = -1;
        long starTime = System.currentTimeMillis();
        while ((length = fileInputStream.read(bytes, 0, bytes.length)) >= 0) {
            total += length;
            dataOutputStream.write(bytes);
        }
        dataOutputStream.close();
        fileInputStream.close();
        System.out.println("读取文件：" + total + "，耗时：" + (System.currentTimeMillis() - starTime));

    }
}
