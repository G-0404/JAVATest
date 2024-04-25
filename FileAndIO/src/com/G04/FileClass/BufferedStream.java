package com.G04.FileClass;

import org.junit.Test;

import java.io.*;

/**
 * @Author G04
 * @Create 2024/4/22 19:01
 * @Version 1.0
 * ClassName: BufferedStream
 * Package: com.G04.FileClass
 * Description:
 */
public class BufferedStream {
    @Test
    public void test() {
        long time1 = System.currentTimeMillis();
        File file = new File("/Users/realtech/Desktop/file-demo/168-数据结构与集合源码-数据结构概述与手写线性表、二叉树.mp4");
        File copy_file = new File("/Users/realtech/Desktop/file-demo/测试肤质.mp4");
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            fis = new FileInputStream(file);
            fos = new FileOutputStream(copy_file);

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            long time2 = System.currentTimeMillis();
            System.out.println("复制成功，耗时" + (time2 - time1));
        } catch (IOException e) {
            // throw new RuntimeException(e);
            e.printStackTrace();
        } finally {

            // try {
            //     fis.close();
            // } catch (IOException e) {
            //     // throw new RuntimeException(e);
            //     e.printStackTrace();
            // }
            // try {
            //     fos.close();
            // } catch (IOException e) {
            //     // throw new RuntimeException(e);
            //     e.printStackTrace();
            // }
            // 外层流的关闭也会自动的对内层的流进行关闭操作，所以可以省略内层流的操作
            try {
                bis.close();
            } catch (IOException e) {
                // throw new RuntimeException(e);
                e.printStackTrace();
            }
            try {
                bos.close();
            } catch (IOException e) {
                // throw new RuntimeException(e);
                e.printStackTrace();
            }


        }

    }
}
