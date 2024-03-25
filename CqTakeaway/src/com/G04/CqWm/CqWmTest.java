package com.G04.CqWm;

import java.util.Scanner;

/**
 * @Author G04
 * @Create 2024/3/25 16:56
 * @Version 1.0
 * ClassName: CqWmTest
 * Package: com.G04.CqWm
 * Description:
 */
public class CqWmTest {

    public void init() {
        // this.loginAdmin();
        this.displayPage();
    }

    public void loginAdmin() {
        LoginItem loginItem = this.inputFunc();
        boolean flag = this.judgeLogin(loginItem.user_name, loginItem.password, 1);
        if (flag) {
            AdminPage adminPage = new AdminPage();
            adminPage.pageInit();
        } else {
            System.out.println("输入错误，请重新输入");
            this.loginAdmin();
        }
    }

    public void loginUser() {
        LoginItem loginItem = this.inputFunc();
        boolean flag = this.judgeLogin(loginItem.user_name, loginItem.password, 2);
        if (flag) {
            UserPage userPage = new UserPage();
            userPage.pageInit();
        } else {
            System.out.println("输入错误，请重新输入");
            this.loginUser();
        }
    }

    private LoginItem inputFunc() {
        LoginItem loginItem = new LoginItem();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入账号");
        loginItem.user_name = scanner.next();
        System.out.println("请输入密码");
        loginItem.password = scanner.next();
        return loginItem;
    }

    public void displayPage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t\t\t\t1.登录管理端");
        System.out.println("\t\t\t\t2.登录用户端");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                this.loginAdmin();
                break;
            case 2:
                this.loginUser();
                break;
            default:
                System.out.println("输出不合法");
                this.displayPage();
        }
        scanner.close();
    }

    public boolean judgeLogin(String username, String password, int version) {
        if (version == 1) {
            return username.equals("admin") && password.equals("admin123");
        } else if (version == 2) {
            if (username.equals("jack") && password.equals("jack123")) {
                return true;
            }
            return username.equals("rose") && password.equals("rose123");
        }
        return false;

    }

    private static class LoginItem {
        String user_name;
        String password;
    }
}
