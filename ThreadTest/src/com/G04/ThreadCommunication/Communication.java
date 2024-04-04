package com.G04.ThreadCommunication;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author G04
 * @Create 2024/4/2 19:41
 * @Version 1.0
 * ClassName: Communication
 * Package: com.G04.ThreadCommunication
 * Description:
 */
public class Communication {
    public static void main(String[] args) {
        PrintNumber printNumber1 = new PrintNumber();
        Thread t1 = new Thread(printNumber1, "线程1");
        Thread t2 = new Thread(printNumber1, "线程2");
        t1.start();
        t2.start();

    }

}

class PrintNumber extends Thread {
    private static int num = 1;

    final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (num <= 100) {
                    notify();
                    try {
                        Thread.sleep(5);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "打印的" + num);
                    num++;
                    try {
                        wait();
                    } catch (Exception e) {
                        e.printStackTrace();

                    }
                } else {
                    break;
                }
            }

        }

    }
}
