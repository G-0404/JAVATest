package com.zjt.extents.demo01;

/**
 * @Author ZJT
 * @Create 2024/4/9 17:06
 * @Version 1.0
 * ClassName: People
 * Package: com.zjt.extents.demo01
 * Description:
 */
public class People {
    private String name;
    private int age;

    public void printName() {
        System.out.println("name:" + name);
    }

    public void printAge() {
        System.out.println("age: " + age);
    }

    public People() {
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
