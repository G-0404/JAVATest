package com.G04.innerClassTest.APPLY;

/**
 * @Author G04
 * @Create 2024/3/29 14:55
 * @Version 1.0
 * ClassName: ColorTest
 * Package: com.G04.innerClassTest.APPLY
 * Description:
 */
public class ColorTest {
    public static void main(String[] args) {
        Color[] colorList = Color.values();
        for (Color color : colorList) {
            // System.out.println(color);
            if (color.name().equals("GREEN")) {
                System.out.println(color);
            }
        }
    }
}

enum Color {
    RED(255, 0, 0, "红"),
    ORANGE(255, 128, 0, "橙"),
    YELLOW(255, 255, 0, "黄"),
    GREEN(0, 255, 0, "绿"),
    CYAN(0, 255, 255, "青"),
    BLUE(0, 0, 255, "蓝"),
    PURPLE(128, 0, 255, "紫");

    private final int red;
    private final int green;
    private final int blue;
    private final String description;

    Color(int red, int green, int blue, String description) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.description = description;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.name() + "(" + getRed() + "," + getGreen() + "," + getBlue() + ")->" + getDescription() + "色";
    }
}