package com.zjt.day12_TankWar.demo02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author ZJT
 * @Create 2024/3/30 14:34
 * @Version 1.0
 * ClassName: YanZhengMa
 * Package: com.zjt.day12.demo02
 * Description:
 */
public class YanZhengMa {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        //面板（就是一张白纸）
        MyPanel panel = new MyPanel();

        frame.add(panel);

        //添加一个按钮
        Button button = new Button("refresh");
        button.setBounds(20,20,100,40);
        panel.setLayout(null);
        panel.add(button);

        //按钮添加点击事件
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //repaint();重新绘画
                panel.repaint();
            }
        });
    }
}
