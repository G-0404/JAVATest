package com.zjt.opp.day02.myabstract2;

/**
 * @Author ZJT
 * @Create 2024/4/10 15:06
 * @Version 1.0
 * ClassName: DemoTest
 * Package: com.zjt.opp.day02.myabstract2
 * Description:
 */
public class DemoTest {
    public static void main(String[] args) {
        Father teach = new Teacher();
        Father ask = new Asker();

        teach.name = "周传雄";
        teach.age = 43;


        teach.info();
        ask.info();
    }
}
