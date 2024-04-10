package com.zjt.a_homework.day1;

/**
 * @Author ZJT
 * @Create 2024/4/9 18:30
 * @Version 1.0
 * ClassName: exer2
 * Package: com.zjt.a_homework.day1
 * Description:
 */
public class Exercise3 {
    public static String country;
    public static void main(String[] args) {
        Exercise3 e3 = new Exercise3();
        e3.country = "中国";
        Exercise3 e2 = new Exercise3();

        System.out.println(e3.country);
        System.out.println(e2.country);
    }
}
