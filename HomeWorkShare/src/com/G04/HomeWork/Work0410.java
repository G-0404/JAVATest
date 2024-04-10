package com.G04.HomeWork;

/**
 * @Author G04
 * @Create 2024/4/10 20:34
 * @Version 1.0
 * ClassName: Work0410
 * Package: com.G04.HomeWork
 * Description:
 */
public class Work0410 {

    public static void main(String[] args) {
        DingZhen dingZhen = new DingZhen();
        dingZhen.listenAnimal(new XB());
        dingZhen.listenAnimal(new SL());
        dingZhen.listenAnimal(new ZZ());
    }
}

class DingZhen {
    private void talkDirty() {
        System.out.println("我测你马");
    }

    public void listenAnimal(DzAnimal dzAnimal) {
        dzAnimal.animalHowl();

    }
}

abstract class DzAnimal {
    abstract void animalHowl();

}

class XB extends DzAnimal {
    @Override
    void animalHowl() {
        System.out.println("芝士雪豹");
    }
}

class SL extends DzAnimal {
    @Override
    void animalHowl() {
        System.out.println("芝士猞猁");
    }
}

class ZZ extends DzAnimal {
    @Override
    void animalHowl() {
        System.out.println("芝士獐子");
    }
}
