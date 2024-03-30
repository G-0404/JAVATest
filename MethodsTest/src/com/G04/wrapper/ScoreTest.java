package com.G04.wrapper;

import java.util.Scanner;
import java.util.Vector;

/**
 * @Author G04
 * @Create 2024/3/30 20:04
 * @Version 1.0
 * ClassName: ScoreTest
 * Package: com.G04.wrapper
 * Description:
 */
public class ScoreTest {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        Scanner scanner = new Scanner(System.in);
        int maxScore = 0;
        while (true) {
            int score = scanner.nextInt();
            if (score < 0) break;
            // Double d1 = score;
            if (maxScore < score) maxScore = score;
            v.addElement(score);
        }
        System.out.println("最高分是" + maxScore);


    }
}
