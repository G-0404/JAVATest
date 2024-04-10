package com.zjt.a_homework.day1.car;

/**
 * @Author ZJT
 * @Create 2024/4/9 20:02
 * @Version 1.0
 * ClassName: Taxi
 * Package: com.zjt.a_homework.day1.car
 * Description:
 */
public class Taxi extends Car{
    private String company;

    public Taxi(){

    }
    public Taxi(String company) {
        this.company = company;
    }

    public Taxi(String type, String plateNumber, String company) {
        super(type, plateNumber);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public void start() {
        System.out.println("准备出发,请系好安全带!!!");
    }

    @Override
    public void end() {
        System.out.println("到达目的地,带好随身物品!!!");
    }
}
