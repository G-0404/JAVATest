package com.zjt.day11.demo02_polymorphic;

/**
 * @Author ZJT
 * @Create 2024/3/29 14:58
 * @Version 1.0
 * ClassName: Teacher
 * Package: com.zjt.day11.demo02_polymorphic
 * Description:
 */
public class Teacher extends Person{
    @Override
    public void eveDay() {
        System.out.println("每天早上一杯Starbucks,~~~~~~~");
    }

    public void teach(){
        System.out.println("每天教学生Java~~~~~~~~~");
    }
}
