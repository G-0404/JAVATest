package com.G04.FileClass;

import org.junit.Test;

import java.io.*;

/**
 * @Author G04
 * @Create 2024/4/21 18:55
 * @Version 1.0
 * ClassName: IOStream
 * Package: com.G04.FileClass
 * Description:
 */
public class IOStream {
    @Test
    public void test() {
        File dir = new File("/Users/realtech/Desktop/file-demo/file测试.txt");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(dir);


            int res = fileReader.read();
            while (res != -1) {
                System.out.println((char) res);
                res = fileReader.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                // throw new RuntimeException(e);
                e.printStackTrace();
            }
        }


    }

    @Test
    public void test1() {
        File dir = new File("/Users/realtech/Desktop/file-demo/file测试.txt");
        FileReader fr = null;
        try {
            fr = new FileReader(dir);

            char[] cBuffer = new char[5];
            int flag = fr.read(cBuffer);
            while (flag != -1) {
                // System.out.println(cBuffer);
                for (int i = 0; i < flag; i++) {
                    System.out.println(cBuffer[i]);
                }
                flag = fr.read(cBuffer);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    // throw new RuntimeException(e);
                    e.printStackTrace();
                }
            }
        }

    }

    @Test
    public void test2() {
        // 创建对象并写明需要输出的文件
        File dir = new File("/Users/realtech/Desktop/file-demo/file测试.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(dir, true);
            fw.write("测试文案111");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                // throw new RuntimeException(e);
                e.printStackTrace();
            }
        }

    }

    @Test
    public void test3() {

        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            File src_dir = new File("/Users/realtech/Desktop/file-demo/file测试.txt");
            File copy_dir = new File("/Users/realtech/Desktop/file-demo/file测试-copy.txt");


            fileReader = new FileReader(src_dir);
            fileWriter = new FileWriter(copy_dir, true);

            char[] cBuffer = new char[5];

            int len;
            while ((len = fileReader.read(cBuffer)) != -1) {
                fileWriter.write(cBuffer, 0, len);
            }
        } catch (IOException e) {
            // throw new RuntimeException(e);
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
                fileReader.close();
            } catch (IOException e) {
                // throw new RuntimeException(e);
                e.printStackTrace();
            }
        }

    }
}
