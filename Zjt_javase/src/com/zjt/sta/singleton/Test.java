package com.zjt.sta.singleton;

/**
 * @Author ZJT
 * @Create 2024/4/9 11:55
 * @Version 1.0
 * ClassName: Test
 * Package: com.zjt.sta.singleton
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(A.getInstance());
        // System.out.println();
        System.out.println(B.getInstance());
        B b1 = B.getInstance();
        System.out.println(b1);
    }
}
