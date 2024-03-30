package com.zjt.day11.demo01_extend;

/**
 * @Author ZJT
 * @Create 2024/3/29 10:06
 * @Version 1.0
 * ClassName: B
 * Package: com.zjt.day11.demo01
 * Description:
 */
public class B {
    public String name;
    public int age;

    public B(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public B() {
        System.out.println("父类的无参构造器,执行过了~~~~~");
    }
}