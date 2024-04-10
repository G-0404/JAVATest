package com.zjt.opp.day02.myinterface;

/**
 * @Author ZJT
 * @Create 2024/4/7 10:35
 * @Version 1.0
 * ClassName: StudentUtil
 * Package: com.zjt.day13
 * Description:
 */
public class StudentUtil {
    /*
     *  打出指定年级的成绩信息
     */
    public static void printStudentState(Student[] students, int state) {
        for (int i = 0; i < students.length; i++) {
            if (state == students[i].state) {
                Student stu = students[i];
                System.out.println(stu.show());
            }
        }
    }
    /*
     * 使用冒泡排序,按学生成绩排序,并遍历所有学生信息
     */
    public static void bubbleSortWithState(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].score > students[j + 1].score) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }
    /*
     * 遍历输出学生信息
     */
    public static void info(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].show());
        }
    }

}
