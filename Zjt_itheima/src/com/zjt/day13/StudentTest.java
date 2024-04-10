package com.zjt.day13;

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
        // StudentUtil util = new StudentUtil();
        // 创建student[]
        Student[] students = new Student[20];
        // 循环,给素组的元素赋值
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            // 给学生的每个num,score,state赋值
            students[i].number = i + 1;
            students[i].state = (int) (Math.random() * 6 + 1);
            students[i].score = (int) (Math.random() * 101);
        }
        StudentUtil.info(students);
        System.out.println("-=--------------------------------");
        // 打出3年纪的信息
        StudentUtil.printStudentState(students, 3);
        System.out.println("------------------------------");
        // 使用冒泡排序,按学生成绩排序,并遍历所有学生信息
        StudentUtil.bubbleSortWithState(students);
        StudentUtil.info(students);

    }


}
