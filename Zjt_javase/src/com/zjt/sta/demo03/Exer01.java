package com.zjt.sta.demo03;

/**
 * @Author ZJT
 * @Create 2024/4/9 10:56
 * @Version 1.0
 * ClassName: Exer01
 * Package: com.zjt.sta.demo03
 * Description:
 */
public class Exer01 {
    public static String name;
    public int age;

    public Exer01(){
        age = 25;
        System.out.println("age属性初始化完成");
        System.out.println("构造方法.....");
    }

    static {
        System.out.println("黑马程序员");
        System.out.println("name初始化完成了");
    }
    // {
    //     age = 25;
    //     System.out.println("age初始化完成...");
    // }
}
