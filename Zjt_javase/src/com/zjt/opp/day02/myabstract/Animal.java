package com.zjt.opp.day02.myabstract;

/**
 * @Author ZJT
 * @Create 2024/4/10 11:46
 * @Version 1.0
 * ClassName: Animal
 * Package: com.zjt.opp.day02.myabstract
 * Description:
 */
public abstract class Animal {
    public void drink() {
        System.out.println("喝水");
    }

    public abstract void eat();
}
