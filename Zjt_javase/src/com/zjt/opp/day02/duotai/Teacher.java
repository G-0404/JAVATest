package com.zjt.opp.day02.duotai;

/**
 * @Author ZJT
 * @Create 2024/4/10 10:13
 * @Version 1.0
 * ClassName: Teacher
 * Package: com.zjt.opp.day02
 * Description:
 */
public class Teacher extends Person{

    @Override
    public void run() {
        System.out.println("跑不过校长,");
    }

    public void teach(){
        System.out.println("教体育课===========");
    }
}
