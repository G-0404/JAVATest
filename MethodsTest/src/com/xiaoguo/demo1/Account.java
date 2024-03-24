package com.xiaoguo.demo1;

/**
 * @Author 郭世杰
 * @Create 2024/3/22 19:45
 * @Version 1.0
 * ClassName: Account
 * Package: com.xiaoguo.demo1
 * Description:
 */
public class Account {
    // 账号id
    private int id;
    // 余额
    private double balance;
    // 年利率
    private double annualInterestRate;

    // 获得余额
    public double getBalance() {
        return balance;
    }

    /**
     * @param money
     * @desc 取款
     */
    public void withdraw(double money) {
        if (money > balance) {
            System.out.println("余额不足");
        } else {
            balance -= money;
            System.out.println("取款成功");
        }
    }

    /**
     * @param balance
     * @desc 存款
     */
    public void deposit(int balance) {
        if (balance > 0) {
            this.balance += balance;
        } else {
            System.out.println("你输入的值不符合规范");
        }
    }

    public Account(int id) {
        this.id = id;
    }

    public Account() {

    }
}
