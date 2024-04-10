package com.G04.Map;

import org.junit.Test;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @Author G04
 * @Create 2024/4/10 21:36
 * @Version 1.0
 * ClassName: TreeMapTest
 * Package: com.G04.Map
 * Description:
 */
public class TreeMapTest {

    @Test
    public void test() {
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                // return 0;
                // return o1.
                // System.out.println(o1.getClass());
                if (o1 instanceof User && o2 instanceof User) {
    
                } else {
                    throw new RuntimeException("参数异常");
                }
                return 0;
            }
        });
        treeMap.put(new User("张三", 43), 98);
        treeMap.put(new User("例子", 23), 86);
        treeMap.put(new User("王武", 23), 98);
        treeMap.put(new User("案例", 98), 13);
    }
}

class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }
}


