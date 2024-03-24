package com.xiaoguo.thisTest;

/**
 * @Author G04
 * @Create 2024/3/24 13:10
 * @Version 1.0
 * ClassName: Person
 * Package: com.xiaoguo.thisTest
 * Description:
 */
public class Person {

    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
