package com.xiaoguo.Dt;

/**
 * @Author G04
 * @Create 2024/3/26 13:15
 * @Version 1.0
 * ClassName: Woman
 * Package: com.xiaoguo.Dt
 * Description:
 */
public class Woman extends Person {
    @Override
    public void eat() {
        System.out.println("女人吃饭");
    }

    @Override
    public void toilet() {
        System.out.println("女人上厕所");
    }

    public void makeup() {
        System.out.println("化妆");
    }

}
