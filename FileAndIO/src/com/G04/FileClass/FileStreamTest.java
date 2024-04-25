package com.G04.FileClass;

import org.junit.Test;

import java.io.*;
import java.util.Arrays;

/**
 * @Author G04
 * @Create 2024/4/22 14:58
 * @Version 1.0
 * ClassName: FileStreamTest
 * Package: com.G04.FileClass
 * Description:
 */
public class FileStreamTest {
    @Test
    public void test() {
        // 1、创建file类对象
        File file = new File("/Users/realtech/Desktop/file-demo/demoImg/测试海报图1.png");
        File copy_file = new File("/Users/realtech/Desktop/file-demo/demoImg/19sb.png");
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            System.out.println(file.length());
            // 2、创建相关字节流对象
            fis = new FileInputStream(file);
            fos = new FileOutputStream(copy_file, true);
            // 3、数据读入写出
            byte[] buffer = new byte[1024];
            // 写法1
            // int len = fis.read(buffer);
            // while (len != -1) {
            //     System.out.println(Arrays.toString(buffer));
            //     fos.write(buffer, 0, len);
            //     len = fis.read(buffer);
            // }

            // 写法2 ---->推荐
            int len;
            while ((len = fis.read(buffer)) != -1) {
                // System.out.println(Arrays.toString(buffer));
                fos.write(buffer, 0, len);
            }

            System.out.println("复制成功");
        } catch (IOException e) {
            // throw new RuntimeException(e);
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                // throw new RuntimeException(e);
                e.printStackTrace();
            }
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                // throw new RuntimeException(e);
                e.printStackTrace();
            }
        }
        // fis.read(buffer);

        // 4、关闭资源

    }
}
