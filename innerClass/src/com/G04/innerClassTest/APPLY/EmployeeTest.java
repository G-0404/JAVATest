package com.G04.innerClassTest.APPLY;

/**
 * @Author G04
 * @Create 2024/3/29 14:08
 * @Version 1.0
 * ClassName: EmployeeTest
 * Package: com.G04.innerClassTest.APPLY
 * Description:
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("杰克", 19, Status.BUSY);
        System.out.println(employee);
        // GF2.XIAOHUA
    }
}

class Bank1 {
    public Bank1() {
    }

    private static final Bank1 instance = new Bank1();

    public static Bank1 getInstance() {
        return instance;
    }
}

class Bank2 {
    int age;

    public Bank2() {
    }

    private static Bank2 instance = null;

    public static Bank2 getInstance() {
        if (instance == null) {
            instance = new Bank2();
        }
        return instance;
    }
}

enum GF {
    // public static final GF XIAOHUA = new GF("小花",20);
    // ↑↑↑↑↑↑↑↑上面的方法和下面的一样,是普通类实现的效果
    XIAOHUA("小花", 19),
    XIAOCHEN("陈", 20);
    private final String name;
    private final int age;

    GF(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class GF2 {
    public static final GF2 XIAOHUA = new GF2("小花", 20);
    private final String name;
    private final int age;

    public GF2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}