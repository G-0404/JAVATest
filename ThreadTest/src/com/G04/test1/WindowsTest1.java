package com.G04.test1;

/**
 * @Author G04
 * @Create 2024/4/2 15:00
 * @Version 1.0
 * ClassName: WindowsTest1
 * Package: com.G04.test1
 * Description:使用继承Thread类的方式实现多线程
 */
public class WindowsTest1 {
    public static void main(String[] args) {
        // Ticket1 t = new Ticket1();
        Ticket1 t1 = new Ticket1();
        Ticket1 t2 = new Ticket1();
        Ticket1 t3 = new Ticket1();
        t1.setName("一号窗口");
        t2.setName("二号窗口");
        t3.setName("三号窗口");
        t1.start();
        t2.start();
        t3.start();

    }
}

class Ticket1 extends Thread {
    static int ticket = 100;
    // static final Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            // 如果用this,会有三个，t1t2t3
            // 如果使用obj，也会有三个，每个实例都会有一个
            synchronized (Ticket1.class) {

                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "卖了票，票号" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}
