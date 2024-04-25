package com.G04.NetTest;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * @Author G04
 * @Create 2024/4/24 17:22
 * @Version 1.0
 * ClassName: TCPTest1
 * Package: com.G04.NetTest
 * Description:
 */
public class TCPTest1 {
    @Test
    public void client() {
        // 创建一个Socket
        Socket socket = null;
        OutputStream outputStream = null;
        try {
            InetAddress inetAddress = InetAddress.getByName("127.0.1");
            int port = 8899; // 声明端口号
            socket = new Socket(inetAddress, port);
            // 发送

            outputStream = socket.getOutputStream();
            outputStream.write("测试Socket测试Socket测试Socket测试Socket测试Socket".getBytes());

        } catch (IOException e) {
            // throw new RuntimeException(e);
            e.printStackTrace();
        } finally {
            try {
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                // throw new RuntimeException(e);
                e.printStackTrace();
            }
            try {
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                // throw new RuntimeException(e);
                e.printStackTrace();
            }
        }
        // 关闭


    }

    @Test
    public void server() throws IOException {
        // 创建一个ServerSocket
        int port = 8899; // 声明端口号,应该由ServerSocket的端口号决定client的端口号
        ServerSocket serverSocket = new ServerSocket(port);
        // 调用accept()，接收客户端的Socket

        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        byte[] cBuffer = new byte[5];
        int len;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        while ((len = inputStream.read(cBuffer)) != -1) {
            // System.out.println(Arrays.toString(cBuffer));
            // String str = new String(cBuffer, 0, len);
            // System.out.println(str);
            baos.write(cBuffer, 0, len);
        }
        System.out.println(baos);

        // 接收


    }
}
