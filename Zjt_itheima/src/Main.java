import java.util.Random;
import java.util.Scanner;

/**
 * @Author ZJT
 * @Create 2024/3/26 16:29
 * @Version 1.0
 * ClassName: ${NAME}
 * Package:
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        Main m1 = new Main();
        m1.method1();

    }

    public void method1() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}