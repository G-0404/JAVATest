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
        personTest.meeting(new Man(), new Man(), new Woman());
        // personTest.equals()
        // String str = "asdasd";
        // str.equals("dasd");

    }

    public void meeting(Person... persons) {
        for (Person person : persons) {
            person.eat();
            person.toilet();
            if (person instanceof Man man) {
                man.smoke();
            }
            if (person instanceof Woman woman) {
                woman.makeup();
            }
        }
    }

    // @Override
    // public boolean equals(Object obj) {
    //     // return super.equals(obj);
    //
    // }
}
