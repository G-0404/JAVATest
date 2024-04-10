package com.zjt.extents.demo01;

/**
 * @Author ZJT
 * @Create 2024/4/9 17:06
 * @Version 1.0
 * ClassName: exer
 * Package: com.zjt.extents.demo01
 * Description:
 */
public class exer{
    public static void main(String[] args) {
        People people = new People("张三",23);
        System.out.println(people);
        people.printName();
        System.out.println(people.toString());
    }
}
