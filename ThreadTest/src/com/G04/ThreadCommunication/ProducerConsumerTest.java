package com.G04.ThreadCommunication;

/**
 * @Author G04
 * @Create 2024/4/2 20:24
 * @Version 1.0
 * ClassName: ProducerConsumerTest
 * Package: com.G04.ThreadCommunication
 * Description:
 * <p>
 * 1、是否是多线程？是
 * 2、都有谁？生产者、消费者
 * 3、共享数据？
 * 4、有，产品数量是共享数据
 * 5、是否有线程安全问题
 * 6、有
 * 7、是否存在线程间通信？
 * 8、是
 */
public class ProducerConsumerTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        // Thread producer = new Thread();
        Producer producer = new Producer(clerk);
        Consumer consumer = new Consumer(clerk);
        Consumer consumer1 = new Consumer(clerk);
        // Thread t1 = new Thread(new Produce);
        producer.setName("生产者1");
        consumer.setName("消费者1");
        consumer1.setName("消费者2");
        producer.start();
        consumer.start();
    }
}

class Producer extends Thread {
    private Clerk clerk;

    public Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true) {

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                // throw new RuntimeException(e);
                e.printStackTrace();
            }

            clerk.addProductNum();
        }
    }
}

class Consumer extends Thread {
    private Clerk clerk;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true) {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.reduceProductNum();
        }
    }
}

class Clerk {
    private int productNum = 0;

    public int getProductNum() {
        return productNum;
    }

    // public void setProductNum(int productNum) {
    //     this.productNum = productNum;
    // }
    public synchronized void addProductNum() {
        if (productNum >= 20) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        productNum++;
        System.out.println("生产者开始生产产品");
        System.out.println("产品还剩" + productNum);
        notifyAll();
    }

    public synchronized void reduceProductNum() {
        if (productNum <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            productNum--;
            System.out.println("消费者开始消费产品");
            System.out.println("产品还剩" + productNum);
            notify();
        }

    }
}


