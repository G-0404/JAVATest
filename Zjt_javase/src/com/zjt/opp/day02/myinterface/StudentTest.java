package com.zjt.opp.day02.myinterface;


/**
 * @Author ZJT
 * @Create 2024/4/6 17:14
 * @Version 1.0
 * ClassName: StudentTest
 * Package: com.zjt.day13
 * Description:
 */
public class StudentTest {
    public static void main(String[] args) {
        Student[] info = StudentService.info();
        StudentImpl student = new StudentImpl2();
        student.print();
        student.printAvg(info);
    }


}
