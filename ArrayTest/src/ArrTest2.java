
import java.util.Scanner;

public class ArrTest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int studentNum = scan.nextInt();
        int[] studentGrade = new int[studentNum];
        int maxNum = 0;
        System.out.println("请输入" + studentNum + "个成绩");
        for (int i = 0; i < studentNum; i++) {
            studentGrade[i] = scan.nextInt();
            if (studentGrade[i] > maxNum) maxNum = studentGrade[i];
//            maxNum = studentGrade[i] > maxNum ? studentGrade[i] : maxNum;
        }
        System.out.println("最高分是：" + maxNum);
        for (int i = 0; i < studentGrade.length; i++) {
            char gradeChar;
            if (studentGrade[i] < 60) {
                gradeChar = 'D';
            } else if (studentGrade[i] >= 60 && studentGrade[i] < 70) {
                gradeChar = 'C';
            } else if (studentGrade[i] >= 70 && studentGrade[i] < 85) {
                gradeChar = 'B';
            } else {
                gradeChar = 'A';
            }
            System.out.println("student" + i + "score is" + studentGrade[i] + "grade is" + gradeChar);


        }
        scan.close();
    }

}
