package com.zjt.day13;

/**
 * @Author ZJT
 * @Create 2024/4/6 17:14
 * @Version 1.0
 * ClassName: Student
 * Package: com.zjt.day13
 * Description:
 */
public class Student {
    int number; // 学号
    int state; // 年纪
    int score; // 成绩

    public String show() {
        return "number:" + number + "\t state:" + state + "\t score:" + score;
    }
}
