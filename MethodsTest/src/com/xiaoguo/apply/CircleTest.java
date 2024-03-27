package com.xiaoguo.apply;

/**
 * @Author G04
 * @Create 2024/3/27 10:11
 * @Version 1.0
 * ClassName: CircleTest
 * Package: com.xiaoguo.apply
 * Description:
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle[] cList = new Circle[10];
        for (int i = 0; i < cList.length; i++) {
            cList[i] = new Circle((i + 1) * 1.2);
            System.out.println(cList[i].toString());
        }
    }

}

class Circle {
    static double pai = 3.14;
    double radius;
    int id;
    static int total = 0;
    static int id_sort = 1001;

    public Circle() {
        id = id_sort++;
        total++;
    }

    public Circle(double radius) {
        this();
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", id=" + id +
                '}';
    }
}
