package com.G04.FileClass;

import org.junit.Test;

import java.io.*;

/**
 * @Author G04
 * @Create 2024/4/23 19:55
 * @Version 1.0
 * ClassName: ObjectInputOutputStreamTest
 * Package: com.G04.FileClass
 * Description:
 */
public class ObjectInputOutputStreamTest {
    @Test
    public void test() throws IOException {
        File file = new File(".demo.txt");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeUTF("测试文本1111");
        oos.flush();
        oos.close();
    }

    @Test
    public void test1() throws IOException {
        File file = new File(".demo.txt");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        System.out.println(ois.readUTF());
        ois.close();

    }


}

class Account implements Serializable {
    @Serial
    private static final long serialVersionUID = 4564564654654L;
    
}
