package com.zjt.sta.demo01;

/**
 * @Author ZJT
 * @Create 2024/4/9 9:48
 * @Version 1.0
 * ClassName: Test
 * Package: com.zjt.sta.demo01
 * Description:查询创造对象总数练习
 */
public class Test {
    public static void main(String[] args) {
        TestExer user = new TestExer();
        TestExer user1 = new TestExer();
        TestExer user2 = new TestExer();
        TestExer user3 = new TestExer();
        System.out.println("创建的总数为:"+TestExer.number);
    }
}
