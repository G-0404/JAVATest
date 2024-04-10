package com.zjt.sta.singleton;

/**
 * @Author ZJT
 * @Create 2024/4/9 11:50
 * @Version 1.0
 * ClassName: A
 * Package: com.zjt.sta.singlelon
 * Description:
 */
public class A {
    private static  A a = new A();

    // 外界无法访问
    private A() {

    }

    // 提供一个公共的方法用来获取当前类的对象
    public static A getInstance() {
        return a;
    }
}
