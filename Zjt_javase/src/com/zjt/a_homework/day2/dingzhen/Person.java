package com.zjt.a_homework.day2.dingzhen;

/**
 * @Author ZJT
 * @Create 2024/4/10 20:17
 * @Version 1.0
 * ClassName: Person
 * Package: com.zjt.a_homework.day2.dingzhen
 * Description:
 */
public abstract class Person {
    private String name;
    private String language;
    public abstract void listenAnimal();

    public Person() {
    }

    public Person(String name, String language) {
        this.name = name;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
