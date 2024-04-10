package com.zjt.a_homework.day1;

/**
 * @Author ZJT
 * @Create 2024/4/9 20:44
 * @Version 1.0
 * ClassName: Student01
 * Package: com.zjt.a_homework.day1
 * Description:
 */
public class Student01 {
    public String name;
    public String birthday;
    public int age;

    public static void study(){
        System.out.println("在努力学习====");
    }

    public static void main(String[] args) {
        Student01.study();

        Student01 s1 = new Student01();
        System.out.println(s1.age = 24);
        System.out.println(s1.name = "王");
        System.out.println(s1.birthday = "2024.1.1");
    }
}
