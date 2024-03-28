package com.G04.interface1;

/**
 * @Author G04
 * @Create 2024/3/27 21:49
 * @Version 1.0
 * ClassName: EatTest
 * Package: com.G04.interface1
 * Description:
 */
public class EatTest {
}

class Chinese implements Eatable {
    @Override
    public void eat() {
        System.out.println("用筷子吃饭");

    }
}

class American implements Eatable {
    @Override
    public void eat() {
        System.out.println("用刀叉吃饭");

    }
}

class Indian implements Eatable {
    @Override
    public void eat() {
        System.out.println("用手吃饭");

    }
}

interface Eatable {
    public abstract void eat();
}
