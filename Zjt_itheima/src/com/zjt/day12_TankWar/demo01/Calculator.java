package com.zjt.day12_TankWar.demo01;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Author ZJT
 * @Create 2024/3/30 10:16
 * @Version 1.0
 * ClassName: Calculator
 * Package: com.zjt.day12.demo01
 * Description:
 */
public class Calculator {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLocation(300, 100);
        // 文本 TextArea文本域，可以写多行
        TextField num1 = new TextField();
        TextField fix = new TextField();
        TextField num2 = new TextField();
        TextField num3 = new TextField();
        Button button = new Button("=");
        num1.setBounds(10, 100, 50, 30);
        fix.setBounds(70, 100, 50, 30);
        num2.setBounds(130, 100, 50, 30);
        button.setBounds(190, 100, 50, 30);
        num3.setBounds(260, 100, 50, 30);

        frame.add(num1);
        frame.add(num2);
        frame.add(num3);
        frame.add(fix);
        frame.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 获取格子输入的信息
                double a = Double.parseDouble(num1.getText());
                String b = fix.getText();
                double c = Double.parseDouble(num2.getText());
                // 判断符号,算数
                double sum = 0;
                switch (b) {
                    case "+":
                        sum = a + c;
                        break;
                    case "-":
                        sum = a - c;
                        break;
                    case "*":
                        sum = a * c;
                        break;
                    case "/":
                        sum = (a / c);
                        break;
                }
                num3.setText(sum+"");
            }
        });


        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
