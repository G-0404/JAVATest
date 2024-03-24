package com.xiaoguo.demo1;

/**
 * @Author 郭世杰
 * @Create 2024/3/22 20:29
 * @Version 1.0
 * ClassName: Customer
 * Package: com.xiaoguo.demo1
 * Description:
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer() {

    }

    public Customer(String f, String l) {
        firstName = f;
        lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account acc) {
        account = acc;
    }


}
