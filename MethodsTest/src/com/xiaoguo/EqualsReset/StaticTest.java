package com.xiaoguo.EqualsReset;

/**
 * @Author G04
 * @Create 2024/3/26 19:52
 * @Version 1.0
 * ClassName: StaticTest
 * Package: com.xiaoguo.EqualsReset
 * Description:
 */
public class StaticTest {
    public static void main(String[] args) {
        Chinese c1 = new Chinese();
        c1.name = "姚明";
        c1.age = 12;
        Chinese c2 = new Chinese();
        c2.name = "张伟";
        c2.age = 33;


        System.out.println(c1.toString());
        System.out.println(c2.toString());
        // System.out.println();
        c2.setNation("CNN");

    }


}

class Chinese {
    // 非静态变量
    static String nation = "中国";

    String name;
    int age;
    // 静态变量


    public void setNation(String nation) {
        Chinese.nation = nation;
    }

    @Override
    public String toString() {
        return "Chinese{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

