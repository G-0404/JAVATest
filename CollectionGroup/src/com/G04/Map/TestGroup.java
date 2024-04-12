package com.G04.Map;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @Author G04
 * @Create 2024/4/12 11:21
 * @Version 1.0
 * ClassName: TestGroup
 * Package: com.G04.Map
 * Description:
 */
public class TestGroup {


    @Test
    public void test() {


        TreeMap<String, ArrayList<String>> singleList = new TreeMap<String, ArrayList<String>>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("请输入歌手:");
            String singleName = scanner.next();
            System.out.print("请输入歌曲:");
            String songName = scanner.next();
            System.out.println("本次输入的" + singleName + songName);
            System.out.println(singleList);
            ArrayList<String> StringName = singleList.get(singleName);

            if (StringName == null) {
                ArrayList<String> arrayList = new ArrayList<String>();
                arrayList.add(songName);
                singleList.put(singleName, arrayList);
            } else {
                StringName.add(songName);
            }

            System.out.println("还想继续么，继续扣1，不继续扣2");
            int val = scanner.nextInt();
            if (val != 1) {
                System.out.println("输出遍历");
                for (Map.Entry<String, ArrayList<String>> entry : singleList.entrySet()) {
                    System.out.println(entry);
                }

                break;
            }
        }
    }
}
