package com.xiaoguo.demo1;

import com.xiaoguo.thisTest.MyClassObj;

import java.util.Scanner;

/**
 * @Author G04
 * @Create 2024/3/22 20:40
 * @Version 1.0
 * ClassName: CustomerTest
 * Package: com.xiaoguo.demo1
 * Description:
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane", "Smith");
        customer.setAccount(new Account(1000));
        Account customerAcc = customer.getAccount();
        customerAcc.deposit(2000);
        customerAcc.deposit(100);
        customerAcc.withdraw(960);
        customerAcc.withdraw(2000);
        // System.out.println(customer.getFirstName());
        // MyClassObj myClassObj = new MyClassObj();
        // MyClassObj.
        // myClassObj.

    }
}
