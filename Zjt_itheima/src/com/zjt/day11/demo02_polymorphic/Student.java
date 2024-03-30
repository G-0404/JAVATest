package com.zjt.day11.demo02_polymorphic;

/**
 * @Author ZJT
 * @Create 2024/3/29 14:57
 * @Version 1.0
 * ClassName: Student
 * Package: com.zjt.day11.demo02_polymorphic
 * Description:
 */
public class Student extends Person{
    @Override
    public void eveDay() {
        System.out.println("俩包子一杯豆浆油条~~~~~~");
    }

    public void study(){
        System.out.println("努力学习Java~~~~~~~");
    }
}
