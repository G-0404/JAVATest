package com.G04.test1;

/**
 * @Author G04
 * @Create 2024/4/2 14:44
 * @Version 1.0
 * ClassName: WindowTest
 * Package: com.G04.test1
 * Description:使用实现Runnable接口方式实现多线程
 */
public class WindowTest {
    public static void main(String[] args) {
        // 新建线程对象并分别传入三个线程
        Ticket t = new Ticket();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        t1.setName("第一个窗口");
        t2.setName("第二个窗口");
        t3.setName("第三个窗口");
        t1.start();
        t2.start();
        t3.start();
    }

}

class Ticket implements Runnable {
    int ticket = 100;
    // final Object obj = new Object();
    boolean flag = true;

    @Override
    public void run() {

        // 使用synchronized解决安全问题
        // while (true) {
        //     try {
        //         Thread.sleep(5);
        //     } catch (InterruptedException e) {
        //         // throw new RuntimeException(e);
        //         e.printStackTrace();
        //     }
        //     // 此处若要使用this，需保证实现类，如果用extends继承Thread方法实现多线程，不可使用
        //     synchronized (this) {
        //         if (ticket > 0) {
        //             // try {
        //             //     Thread.sleep(1000);
        //             // } catch (InterruptedException e) {
        //             //     // throw new RuntimeException(e);
        //             //     e.printStackTrace();
        //             // }
        //             System.out.println(Thread.currentThread().getName() + "卖了票，票号" + ticket);
        //             ticket--;
        //         } else {
        //             break;
        //         }
        //     }
        //
        // }
        // 使用同步方法解决安全问题
        while (flag) {
            // 此处若要使用this，需保证实现类，如果用extends继承Thread方法实现多线程，不可使用

            // synchronized (Ticket.class) {
            //     show();
            // }
            show();

        }

    }

    public synchronized void show() {
        if (ticket > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // throw new RuntimeException(e);
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "卖了票，票号" + ticket);
            ticket--;
        } else {
            // break;
            this.flag = false;
        }
    }
}
