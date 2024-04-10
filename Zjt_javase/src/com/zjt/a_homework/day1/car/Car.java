package com.zjt.a_homework.day1.car;

/**
 * @Author ZJT
 * @Create 2024/4/9 20:02
 * @Version 1.0
 * ClassName: Car
 * Package: com.zjt.a_homework.day1.car
 * Description:
 */
public abstract class Car {
    private String type;
    private String plateNumber;

    public abstract void start();
    public abstract void end();

    public Car() {
    }
    public Car(String type, String plateNumber) {
        this.type = type;
        this.plateNumber = plateNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }
}
