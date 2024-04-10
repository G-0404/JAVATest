package com.zjt.opp.day02.duotai;

/**
 * @Author ZJT
 * @Create 2024/4/10 10:20
 * @Version 1.0
 * ClassName: DemoTest
 * Package: com.zjt.opp.day02.duotai
 * Description:
 */
public class DemoTest {
    public static void main(String[] args) {
        Person p1 = new Student();
        p1.run();
        Person p2 = new Teacher();
        p2.run();
        demo(p1);
        demo(p2);
    }

    public static void demo(Person person) {
        person.run();
        if (person instanceof Teacher) {
            Teacher teacher = (Teacher) person;
            teacher.teach();
        } else if (person instanceof Student student) {
            student.study();

        }
    }
}
