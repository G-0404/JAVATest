package com.zjt.day11.demo01_extend;

/**
 * @Author ZJT
 * @Create 2024/3/29 10:06
 * @Version 1.0
 * ClassName: A
 * Package: com.zjt.day11.demo01
 * Description:
 */
public class A extends B {

    public int tall;

    public A(String name, int age, int tall) {
        super(name, age);
        this.tall = tall;
    }

    public A(int tall) {
        this.tall = tall;
    }

    public A() {
        // super();
        System.out.println("子类的无参构造,执行了~~~~~~");
    }
}

