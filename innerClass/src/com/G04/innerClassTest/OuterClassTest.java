package com.G04.innerClassTest;

/**
 * @Author G04
 * @Create 2024/3/28 11:33
 * @Version 1.0
 * ClassName: OuterClassTest
 * Package: com.G04.innerClassTest
 * Description:
 */
public class OuterClassTest {

    public static void main(String[] args) {
        Person.Dog dog = new Person.Dog();
        dog.eatDog();
        // Bird brid = new
        Person person = new Person();
        // Person.Bird
        Person.Bird bird = person.new Bird();

    }
}

class Person { // 外部类

    //     内部类
    static class Dog {
        public void eatDog() {
            System.out.println("吃");
        }

    }

    class Bird {
        public void birdEat() {
            System.out.println("吃");
        }

    }

    public void method() {
        class innerClass1 {

        }

    }

    public Person() {
        class innerClass1 {

        }
    }
}
