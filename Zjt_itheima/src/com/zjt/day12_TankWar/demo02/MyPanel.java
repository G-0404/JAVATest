package com.zjt.day12_TankWar.demo02;

import java.awt.*;
import java.util.Random;

/**
 * @Author ZJT
 * @Create 2024/3/30 14:59
 * @Version 1.0
 * ClassName: MyPanel
 * Package: com.zjt.day12.demo02
 * Description:
 */
public class MyPanel extends Panel {
    public MyPanel(){
        super();
        setSize(400,400);
    }
    /**
     *
     */
    public void paint(Graphics g){
        // super.paint(g); //调用父类的绘画方法
        //绘制背景色
        g.setColor(Color.LIGHT_GRAY); //设置画笔的颜色
        g.fillRect(0,0,400,400);
        //g.drawRect(50,50,50,50);
        //获取随机字符串
        String code = randomStr();
        //绘制字符串
        g.setColor(Color.BLUE);
        //设置画笔的字体
        Font font = new Font("宋体",Font.BOLD,20);
        g.setFont(font);
        g.drawString(code,150,180);
    }
    public String randomStr(){
        String code = "";
        String source = "abcdefghijklmnopqrstuvwxyz123456789FFAKJDFLASKJFANWEIU";
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            code+=source.charAt(random.nextInt(source.length()));
        }
        return code;
    }
}
