package com.G04.test1;

import org.junit.Test;

/**
 * @Author G04
 * @Create 2024/4/1 19:36
 * @Version 1.0
 * ClassName: CreateThread
 * Package: com.G04.test1
 * Description:线程的创建方式①：继承Thread类
 * Description:线程的创建方式②：实现Runnable接口
 */
public class CreateThread {
    public static void main(String[] args) {

        // 匿名类+匿名子类

        // new Thread() {
        //     @Override
        //     public void run() {
        //         for (int i = 0; i <= 200; i++) {
        //             if (i % 2 != 0) {
        //                 System.out.println(PrintNumberEven.currentThread().getName() + ":" + i);
        //             }
        //         }
        //     }
        // }.start();
        // new Thread() {
        //     @Override
        //     public void run() {
        //         for (int i = 0; i <= 200; i++) {
        //             if (i % 2 == 0) {
        //                 System.out.println(PrintNumberEven.currentThread().getName() + ":" + i);
        //             }
        //         }
        //     }
        // }.start();

        // 匿名子类
        // new PrintNumberEven() {
        //     @Override
        //     public void run() {
        //         for (int i = 0; i <= 200; i++) {
        //             if (i % 2 == 0) {
        //                 System.out.println(PrintNumberEven.currentThread().getName() + ":" + i);
        //             }
        //         }
        //     }
        // }.start();
        //
        // new PrintNumberOdd() {
        //     @Override
        //     public void run() {
        //         for (int i = 0; i <= 200; i++) {
        //             if (i % 2 != 0) {
        //                 System.out.println(PrintNumberEven.currentThread().getName() + ":" + i);
        //             }
        //         }
        //     }
        // }.start();


        // 常规
        // PrintNumberEven p1 = new PrintNumberEven();
        // PrintNumberOdd p2 = new PrintNumberOdd();
        // p1.start();
        // p2.start();
        // PrintNumber p1 = new PrintNumber();
        // p1.start();
        //
        // for (int i = 0; i < 1000; i++) {
        //     if (i % 2 == 0) System.out.println(PrintNumber.currentThread().getName() + ":" + i);
        // }
        // PrintNumber p2 = new PrintNumber();
        // p2.start();

        // CreateThreadMethod2 createThreadMethod2 = new CreateThreadMethod2();
        // createThreadMethod2

        // Thread t1 =
        new Thread(new CreateThreadMethod2()) {
        }.start();
        // new Thread("abc")
    }

}
// 创建一个分线程1，用于得出100以内的偶数

/**
 * 1、创建一个继承于Thread的子类的对象
 */
// @Test
class PrintNumber extends Thread {

    // 2、重写Thread类的run方法
    @Override
    public void run() {
        // super.run();
        for (int i = 0; i < 1000; i++) {
            if (i % 2 == 0) System.out.println(PrintNumber.currentThread().getName() + ":" + i);
        }
    }
}


class PrintNumberEven extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 200; i++) {
            if (i % 2 == 0) {
                System.out.println(PrintNumberEven.currentThread().getName() + ":" + i);
            }
        }
    }
}

class PrintNumberOdd extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 200; i++) {
            if (i % 2 != 0) {
                System.out.println(PrintNumberEven.currentThread().getName() + ":" + i);
            }
        }
    }
}


/**
 * 1、创建一个实现Runnable接口的类
 * 2、实现接口中的run（）----->将此线程要执行的操作生命在此方法体中
 * 2、创建当前实现类的对象
 * 4、将此对象作为参数传递到Thread类的构造器中,创建Thread类的实例
 * 5、Thread类实例调用start
 */
class CreateThreadMethod2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 200; i++) {
            if (i % 2 == 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // throw new RuntimeException(e);
                    e.printStackTrace();
                }
                System.out.println(PrintNumberEven.currentThread().getName() + ":" + i);
            }
        }
    }
}