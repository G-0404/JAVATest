package com.G04.NetTest;

import org.junit.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

/**
 * @Author G04
 * @Create 2024/4/25 10:18
 * @Version 1.0
 * ClassName: netTest2
 * Package: com.G04.NetTest
 * Description:
 */
public class netTest2 {
    @Test
    public void client() throws IOException {
        int port = 8866;  // 定义服务器端口号
        Socket socket = new Socket("127.0.1", port); // 创建一个 Socket 对象并连接到服务器
        File ori_pic = new File("/Users/realtech/Desktop/测试用图片/adasdas.png"); // 要发送的原始图片文件
        FileInputStream fis = new FileInputStream(ori_pic); // 创建文件输入流，用于读取原始图片文件内容
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(128); // 创建一个字节数组输出流，用于保存读取到的图片数据
        int len; // 用于存储每次读取的字节数
        byte[] buffer = new byte[128]; // 创建一个缓冲区字节数组
        while ((len = fis.read(buffer)) != -1) { // 循环读取原始图片文件内容到缓冲区
            byteArrayOutputStream.write(buffer, 0, len); // 将缓冲区的数据写入字节数组输出流
        }
        OutputStream outputStream = socket.getOutputStream(); // 获取与服务器的输出流，用于向服务器发送数据
        outputStream.write(byteArrayOutputStream.toByteArray()); // 将字节数组输出流中的数据发送到服务器
    }

    @Test
    public void server() throws IOException {
        int port = 8866; // 定义服务器端口号
        ServerSocket serverSocket = new ServerSocket(port); // 创建 ServerSocket 对象并指定端口号，用于监听客户端连接
        Socket socket = serverSocket.accept(); // 监听端口并等待客户端连接，一旦有客户端连接成功，返回一个 Socket 对象
        InputStream inputStream = socket.getInputStream(); // 获取与客户端连接的输入流，用于接收客户端发送的数据
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(128); // 创建一个字节数组输出流，用于保存接收到的数据
        byte[] buffer = new byte[128]; // 创建一个缓冲区字节数组
        int len; // 定义获取到的字节的长度
        while ((len = inputStream.read(buffer)) != -1) { // 循环读取客户端发送的数据到缓冲区
            byteArrayOutputStream.write(buffer, 0, len); // 将缓冲区的数据写入字节数组输出流
        }
        System.out.println(Arrays.toString(byteArrayOutputStream.toByteArray())); // 打印接收到的数据，转换字节数组为字符串并打印
        File copy_pic = new File("/Users/realtech/Desktop/测试用图片/复制adasdas.png"); // 定义复制图片的文件路径
        FileOutputStream fos = new FileOutputStream(copy_pic); // 创建文件输出流，用于写入复制的图片数据
        fos.write(byteArrayOutputStream.toByteArray()); // 将字节数组输出流中的数据写入到文件输出流中
        copy_pic.createNewFile(); // 创建复制图片文件
        byteArrayOutputStream.close(); // 关闭字节数组输出流
        fos.close(); // 关闭文件输出流
        inputStream.close(); // 关闭输入流
        socket.close(); // 关闭Socket连接
        serverSocket.close(); // 关闭ServerSocket
    }
}
