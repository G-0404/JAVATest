package com.zjt.extents;

/**
 * @Author ZJT
 * @Create 2024/4/9 15:10
 * @Version 1.0
 * ClassName: Test02
 * Package: com.zjt.extents
 * Description:
 */
public class Test02 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("张三");
        teacher.setSkill("法律");

        Student student = new Student();
        student.setName("赵四");
        student.setNumber(6);

        System.out.println(teacher.getName());
        System.out.println(teacher.getSkill());

        System.out.println(student.getName());
        System.out.println(student.getNumber());
    }
}
