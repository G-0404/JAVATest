package com.G04.interface1;

/**
 * @Author G04
 * @Create 2024/3/27 20:31
 * @Version 1.0
 * ClassName: interface1Test
 * Package: com.G04.interface1
 * Description:
 */
public class interface1Test {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        // Attackable.attack();
        Plane b1 = new Plane();
        b1.fly();
        b1.attack();

        Flyable b2 = new Plane();
        b2.fly();

    }
}

/**
 * 格式：class A extends SuperA implements B,C{}
 * A相较于SuperA来说，叫做子类
 * A相较于B,C来讲，叫做实现类
 * 满足此关系后说明
 * 1、类可以实现多个借口
 * 类针对于接口的多实现，一定程度弥补了类的单继承的局限性
 * 类必须将实现的接口中的所有的抽象方法都重写（或实现），才可以实例化，否则此实现类必须声明为抽象类
 */

interface Flyable {

    public static final int MIN_SPEED = 0;
    int MAX_SPEED = 7900;

    // 抽象方法
    void fly();

}

interface Attachable {
    public abstract void attack();

}

class Plane implements Flyable, Attachable {
    @Override
    public void fly() {
        System.out.println("飞机飞");
    }

    @Override
    public void attack() {
        System.out.println("飞机攻击");
    }
}

class Bullet implements Flyable {
    @Override
    public void fly() {

    }
}

// 测试接口的继承关系
interface AA {
    void methods1();
}

interface BB {
    void methods2();

}

interface CC extends AA, BB {
    // @Override
    // default void methods1() {
    //
    // }
    //
    // @Override
    // default void methods2() {
    //
    // }
}

class DD implements CC {

    @Override
    public void methods1() {

    }

    @Override
    public void methods2() {

    }
}