package com.xiaoguo.singleItem;

/**
 * @Author G04
 * @Create 2024/3/27 11:11
 * @Version 1.0
 * ClassName: BankTest
 * Package: com.xiaoguo.singleItem
 * Description:
 */
public class BankTest {
    public static void main(String[] args) {
        // Bank bank = new Bank();
        Bank bank = Bank.getSingle();
        Bank bank1 = Bank.getSingle();
        // System.out.println(bank == bank1);
    }

}

class Bank {
    int blance;

    private Bank() {
    }

    private static Bank bank = new Bank();

    public static Bank getSingle() {
        return bank;
    }
}
