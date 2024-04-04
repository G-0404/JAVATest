package com.G04.threadSafeMore.singleton;

/**
 * @Author G04
 * @Create 2024/4/2 17:24
 * @Version 1.0
 * ClassName: BankTest
 * Package: com.G04.threadSafeMore.singleton
 * Description:
 */
public class BankTest {
    static Bank b1 = null;
    static Bank b2 = null;

    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                b1 = Bank.getInstance();
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                b2 = Bank.getInstance();
            }
        };

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            // throw new RuntimeException(e);
            e.printStackTrace();
        }


        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1 == b2);
        //  new Thread() {
        //     @Override
        //     public void run() {
        //         b2 = Bank.getInstance();
        //     }
        // }.start();
    }
}

class Bank {
    private Bank() {
    }

    private static Bank instance = null;

    // public static synchronized Bank getInstance() {
    //     try {
    //         Thread.sleep(1000);
    //     } catch (InterruptedException e) {
    //         // throw new RuntimeException(e);
    //         e.printStackTrace();
    //     }
    //     if (instance == null) {
    //         instance = new Bank();
    //     }
    //     return instance;
    // }

    public static Bank getInstance() {
        if (instance == null) {
            synchronized (Bank.class) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // throw new RuntimeException(e);
                    e.printStackTrace();
                }
                if (instance == null) {
                    instance = new Bank();
                }

            }
        }
        return instance;

    }
}
