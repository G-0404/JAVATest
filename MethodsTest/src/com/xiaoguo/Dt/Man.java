package com.xiaoguo.Dt;

/**
 * @Author G04
 * @Create 2024/3/26 13:15
 * @Version 1.0
 * ClassName: Man
 * Package: com.xiaoguo.Dt
 * Description:
 */
public class Man extends Person {
    @Override
    public void eat() {
        System.out.println("男人吃饭");
    }

    @Override
    public void toilet() {
        System.out.println("男人上厕所");
    }

    public void smoke() {
        System.out.println("抽烟");
    }
}
