package com.zjt.day12_TankWar.demo02;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Author ZJT
 * @Create 2024/3/30 14:34
 * @Version 1.0
 * ClassName: MyFrame
 * Package: com.zjt.day12.demo02
 * Description:
 */
public class MyFrame extends Frame{
    public MyFrame() {
        super("测试");
        setVisible(true);
        setBounds(300,150,400,400);
        //关闭窗口
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

}
