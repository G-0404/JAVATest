package com.zjt.extents;

/**
 * @Author ZJT
 * @Create 2024/4/9 14:47
 * @Version 1.0
 * ClassName: A
 * Package: com.zjt.extents
 * Description:
 */
public class A {
    public A() {
        System.out.println("A的构造执行了.....");
        i = 6;
    }

    public int i;

    public void printI() {
        System.out.println("i的值为:" + i);
    }

    private int j;

    public void printJ() {
        System.out.println("J的值为: " + j);
    }

}
