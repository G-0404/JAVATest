package com.xiaoguo.PDS;

/**
 * @Author G04
 * @Create 2024/3/24 14:02
 * @Version 1.0
 * ClassName: Customer
 * Package: com.xiaoguo.PDS
 * Description:
 */
public class Customer {
    private String name;
    private char gender;
    private int age;
    private String phone;
    private String email;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public int getDisplayId() {
        return id + 1;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer() {

    }

    public Customer(String name, char gender, int age, String phone, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }
}
