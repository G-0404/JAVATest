package com.zjt.day12_TankWar.demo02;

import java.awt.*;

/**
 * @Author ZJT
 * @Create 2024/3/30 14:39
 * @Version 1.0
 * ClassName: Frame
 * Package: com.zjt.day12.demo02
 * Description:
 */
public class Frame_demo01 {
    public static void main(String[] args) {
        Frame frame = new Frame("窗口");
        //设置大小
        frame.setSize(500,500);
        //设置初始化的位置
        frame.setLocation(300,100);
        //设置frame大小不可变
        frame.setResizable(false);
        //设置窗口的可见
        frame.setVisible(true);
    }
}
