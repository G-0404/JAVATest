package com.zjt.a_homework.day1.car;

/**
 * @Author ZJT
 * @Create 2024/4/9 20:03
 * @Version 1.0
 * ClassName: PrivateCar
 * Package: com.zjt.a_homework.day1.car
 * Description:
 */
public class PrivateCar extends Car{
    private String name;

    @Override
    public void start() {
        System.out.println(name+"的"+getType()+"启动了-------");
    }

    @Override
    public void end() {
        System.out.println(name+"的"+getType()+"没电了-------");
    }

    public PrivateCar(){

    }
    public PrivateCar(String name) {
        this.name = name;
    }

    public PrivateCar(String type, String plateNumber, String name) {
        super(type, plateNumber);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
