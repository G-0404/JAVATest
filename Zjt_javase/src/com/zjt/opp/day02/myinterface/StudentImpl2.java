package com.zjt.opp.day02.myinterface;

/**
 * @Author ZJT
 * @Create 2024/4/10 17:19
 * @Version 1.0
 * ClassName: StudentImpl2
 * Package: com.zjt.opp.day02.myinterface
 * Description:
 */
public class StudentImpl2 implements StudentImpl{
    @Override
    public void print() {
        StudentService.info();
    }
    @Override
    public void printAvg(Student[] students) {
        int total = 0;
        for (int i = 0; i < students.length; i++) {
            total += students[i].score;
        }
        System.out.println("总成绩为:"+total);
    }
}
