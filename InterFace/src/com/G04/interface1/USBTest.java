package com.G04.interface1;

/**
 * @Author G04
 * @Create 2024/3/27 21:28
 * @Version 1.0
 * ClassName: USBTest
 * Package: com.G04.interface1
 * Description:
 */
public class USBTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        // 类的匿名对象
        computer.transformData(new Printer());
        // 类的对象
        Camera camera = new Camera();
        computer.transformData(camera);
        // 创建接口匿名实现类的对象
        USB usb1 = new USB() {

            @Override
            public void start() {
                System.out.println("匿名实现类start");
            }

            @Override
            public void stop() {
                System.out.println("匿名实现类stop");
            }
        };
        computer.transformData(usb1);

        computer.transformData(new USB() {
            @Override
            public void start() {

            }

            @Override
            public void stop() {

            }
        });
    }
}

class Computer {
    public void transformData(USB usb) {
        System.out.println("设备连接成功....");
        usb.start();
        System.out.println("数据传输中");
    }
}

class Printer implements USB {
    @Override
    public void start() {
        System.out.println("打印机开始运行");
    }

    @Override
    public void stop() {
        System.out.println("打印机停止运行");

    }
}

class Camera implements USB {
    @Override
    public void start() {
        System.out.println("照相机开始运行");
    }

    @Override
    public void stop() {
        System.out.println("照相机停止运行");


    }
}

interface USB {
    public abstract void start();

    void stop();
}

