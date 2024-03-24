import java.util.Random;

public class ObjectTest1 {
    public static void main(String[] args) {
        Random random = new Random();
        Student[] studentList = new Student[20];

        for (int i = 0; i < studentList.length; i++) {
            studentList[i] = new Student();
            studentList[i].studentNum = i + 1;
            studentList[i].score = random.nextInt(100);
            studentList[i].grade = random.nextInt(6) + 1;
            // System.out.print(studentList[i].studentNum + "+");
            // System.out.print(studentList[i].score + "+");
            // System.out.print(studentList[i].grade + "+");
            // System.out.println();


        }

    }

}
