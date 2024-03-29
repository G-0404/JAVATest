package com.xiaoguo.AnnotationClass;

/**
 * @Author G04
 * @Create 2024/3/29 15:18
 * @Version 1.0
 * ClassName: Annotation1
 * Package: com.xiaoguo.AnnotationClass
 * Description:
 */
public @interface Annotation1 {
}

class Person {
    String name;
    int age;

    public void eat() {
        System.out.println("人吃饭");
    }
}

class Student extends Person {
    @Override
    public void eat() {
        // super.eat();
        System.out.println("学生吃饭");
    }
}