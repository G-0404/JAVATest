package com.G04.threadSafeMore.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author G04
 * @Create 2024/4/2 19:20
 * @Version 1.0
 * ClassName: LockTest
 * Package: com.G04.threadSafeMore.lock
 * Description:
 */
public class LockTest {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread t1 = new Thread(ticket);
        Thread t2 = new Thread(ticket);
        Thread t3 = new Thread(ticket);
        t1.setName("一号窗口");
        t2.setName("二号窗口");
        t3.setName("三号窗口");
        t1.start();
        t2.start();
        t3.start();
    }
}

class Ticket implements Runnable {
    int ticket = 100;
    //
    private static ReentrantLock lock = null;

    public Ticket() {
        lock = new ReentrantLock();
    }

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();

                if (ticket > 0) {
                    Thread.sleep(50);
                    System.out.println(Thread.currentThread().getName() + "卖了票。票号为" + ticket);
                    ticket--;
                } else {
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();

            } finally {
                lock.unlock();
            }
        }

    }
}
