package com.zjt.day11.demo02_polymorphic;

/**
 * @Author ZJT
 * @Create 2024/3/29 15:02
 * @Version 1.0
 * ClassName: DemoTest
 * Package: com.zjt.day11.demo02_polymorphic
 * Description:
 */
public class DemoTest {
    public static void main(String[] args) {
        Person student = new Student();
        Person teacher = new Teacher();
        test(student);
        test(teacher);
    }

    /*
    参数People p既可以接收Student对象，也能接收Teacher对象。
     */
    public static void test(Person person) {
        if (person instanceof Student) {
            ((Student) person).study();
        } else if (person instanceof Teacher) {
            ((Teacher) person).teach();
        }
        // person.eveDay();
    }
}
