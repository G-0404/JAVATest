package com.xiaoguo.Dt;

/**
 * @Author G04
 * @Create 2024/3/26 13:19
 * @Version 1.0
 * ClassName: PersonTest
 * Package: com.xiaoguo.Dt
 * Description:
 */
public class PersonTest {
    public static void main(String[] args) {
        // meeting(new Man());
        PersonTest personTest = new PersonTest();
        // personTest.meeting(new Man());
        // personTest.meeting(new Woman());
    }

    public void meeting(Person person) {
        person.eat();
        person.toilet();
        if (person instanceof Man man) {
            // ((Man) person).smoke();
            man.smoke();
        }
        if (person instanceof Woman woman) {
            woman.makeup();
        }
    }
}
