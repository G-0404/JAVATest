package com.zjt.sta.singleton;

/**
 * @Author ZJT
 * @Create 2024/4/9 11:50
 * @Version 1.0
 * ClassName: B
 * Package: com.zjt.sta.singleton
 * Description:
 */
public class B {
    //懒汉式:第一次获取对象时才创建

    private static B b = null;
    //1.私有化构造
    private B() {

    }
    // 3.提供公共的方法用于获取对象
    public static B getInstance() {
        if (b == null) {
            b = new B();
        }
        return b;
    }
}
