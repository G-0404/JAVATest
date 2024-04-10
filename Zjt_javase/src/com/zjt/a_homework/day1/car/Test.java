package com.zjt.a_homework.day1.car;

/**
 * @Author ZJT
 * @Create 2024/4/9 20:03
 * @Version 1.0
 * ClassName: Test
 * Package: com.zjt.a_homework.day1.car
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        // 出租车类
        Taxi taxi = new Taxi("BYD", "浙A99999", "滴滴打人");
        taxi.start();
        taxi.end();
        System.out.println("公司:" + taxi.getCompany() + " \t车型:" + taxi.getType() + " \t车牌:" + taxi.getPlateNumber());
        System.out.println("---------------------------");
        // 私家车类
        PrivateCar p1 = new PrivateCar("小刀", "沪A99999", "王撕葱");
        p1.start();
        p1.end();
        System.out.println("车主:" + p1.getName() + "\t车型:" + p1.getType() + "\t车牌:" + p1.getPlateNumber());
    }
}
