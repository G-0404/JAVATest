package com.G04.Map;

import org.junit.Test;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
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
                    User u1 = (User) o1;
                    User u2 = (User) o2;
                    int val = u1.age - u2.age;
                    if (val == 0) {
                        return u1.name.compareTo(u2.name);
                    } else {
                        return val;
                    }
                } else {
                    throw new RuntimeException("参数异常");
                }
            }
        });
        treeMap.put(new User("张三", 43), 98);
        treeMap.put(new User("例子", 23), 86);
        treeMap.put(new User("王武", 23), 98);
        treeMap.put(new User("案例", 98), 13);
        // System.out.println(treeMap);
        // treeMap
        Set entrySet = treeMap.entrySet();
        for (Object o : entrySet) {
            System.out.println(o);
        }


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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


