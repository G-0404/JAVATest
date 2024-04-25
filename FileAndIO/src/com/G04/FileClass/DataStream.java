package com.G04.FileClass;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * @Author G04
 * @Create 2024/4/23 16:54
 * @Version 1.0
 * ClassName: DataStream
 * Package: com.G04.FileClass
 * Description:对象流
 * DataOutputStream : 可以将内存中的基本数据类型的变量、String类型的变量写出到具体的文件中
 * DataInputStream : 可以将文件中保存的数据还原为内存中的基本数据类型的变量、String类型的变量
 * API
 */
public class DataStream {
    @Test
    public void test() {

        File file = new File("/Users/realtech/Desktop/file-demo/tstst.txt");
        FileReader fr = null;

        // StringBuffer sb = new StringBuffer();
        ArrayList<Character> arrayList = new ArrayList<>();
        try {
            fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            int len;
            String line;
            StringBuilder res_long_str = new StringBuilder();
            char[] cBuffer = new char[5];
            while ((line = reader.readLine()) != null) {
                // 去除每一行的空格并写回文件
                res_long_str.append(line.replaceAll("\\s+", "")); // 使用正则表达式去除所有空格
            }
            System.out.println(res_long_str);
            String[] new_str_list = res_long_str.toString().split(",");
            // while ((len = fr.read(cBuffer)) != -1) {
            //     for (int i = 0; i < len; i++) {
            //         arrayList.add(cBuffer[i]);
            //     }
            // }
        } catch (IOException e) {
            // throw new RuntimeException(e);
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                // throw new RuntimeException(e);
                e.printStackTrace();
            }
        }

        ArrayList<String> res_list = new ArrayList<>();
        StringBuilder res_str = new StringBuilder();
        for (Character item : arrayList) {
            if (item.equals(',')) {
                res_list.add(String.valueOf(res_str));
                res_str = new StringBuilder();
            } else {
                res_str.append(item);
            }
        }
        res_list.add(String.valueOf(res_str));

        HashMap<String, Integer> countMap = new HashMap<>();
        for (String s : res_list) {
            // Integer i = countMap.get(s);
            // System.out.println(s);
            if (countMap.get(s) == null) {
                countMap.put(s, 1);
            } else {
                int old_val = countMap.get(s);
                // System.out.println(old_val++);
                countMap.put(s, ++old_val);
            }
        }
        Set<Map.Entry<String, Integer>> entries = countMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            // System.out.println(entry);
        }


    }

    @Test
    public void test1() {
        File file = new File("/Users/realtech/Desktop/file-demo/tstst.txt");
        FileReader fr = null;
        String[] new_str_list = new String[0];
        try {
            fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line;
            StringBuilder res_long_str = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                // 去除每一行的空格并写回文件
                res_long_str.append(line.trim()); // 使用正则表达式去除所有空格
                System.out.println(line);
            }
            new_str_list = res_long_str.toString().split(",");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        HashMap<String, Integer> countMap = new HashMap<>();
        for (String s : new_str_list) {
            if (countMap.get(s) == null) {
                countMap.put(s, 1);
            } else {
                int old_val = countMap.get(s);
                countMap.put(s, ++old_val);
            }
        }
        Set<Map.Entry<String, Integer>> entries = countMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry);
        }


    }


    @Test
    public void test2() {

    }
}
