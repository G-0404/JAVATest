package com.zjt.day11.demo03_multithreading;

/**
 * @Author ZJT
 * @Create 2024/3/29 15:57
 * @Version 1.0
 * ClassName: Test
 * Package: com.zjt.day11.demo03_multithreading
 * Description:
 */
public class Test {
    public static void main(String[] args) throws Exception {
/**
 *  多线程实现   new Thread(()->{   代码   }).start();
 */
        new Thread(() -> {
            for (int i = 0; i < 60; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("吃粑粑``````");
            }
        }).start();

        for (int i = 0; i < 60; i++) {
            Thread.sleep(1000);
            System.out.println("郭世杰~~~~");

        }
    }
}
