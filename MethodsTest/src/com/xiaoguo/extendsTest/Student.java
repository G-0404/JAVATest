package com.xiaoguo.extendsTest;

/**
 * @Author G04
 * @Create 2024/3/24 17:33
 * @Version 1.0
 * ClassName: Student
 * Package: com.xiaoguo.extendsTest
 * Description:
 */
public class Student extends Person {
    String school;

    public void study() {
        System.out.println("学习");
    }

    public void eat() {
        System.out.println("学生吃");
    }
}
