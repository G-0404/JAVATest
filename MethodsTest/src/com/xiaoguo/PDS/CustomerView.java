package com.xiaoguo.PDS;

import java.util.Scanner;

/**
 * @Author G04
 * @Create 2024/3/24 14:04
 * @Version 1.0
 * ClassName: CustomerView
 * Package: com.xiaoguo.PDS
 * Description:
 */
public class CustomerView {
    // 客户列表
    CustomerList customerList = new CustomerList(10);
    Scanner scanner = new Scanner(System.in);

    public void enterMainMenu() {

        this.soutMenuMessage();
        // 当前操作

        int operation_index = scanner.nextInt();
        switch (operation_index) {
            case 1:
                this.addNewCustomer();
                break;
            case 2:
                this.modifyCustomer();
                break;
            case 3:
                this.deleteCustomer();
                break;
            case 4:
                this.listAllCustomer();
                break;
            case 5:
                System.out.println("您已成功退出系统");
                return;
            default:
                break;

        }
        this.enterMainMenu();


    }

    private void soutMenuMessage() {
        System.out.println("             -----------------拼电商客户管理系统-----------------\n");
        System.out.println("                              1 添 加 客 户");
        System.out.println("                              2 修 改 客 户");
        System.out.println("                              3 删 除 客 户");
        System.out.println("                              4 客 户 列 表");
        System.out.println("                              5 退       出");
        System.out.println("                              请选择(1-5)：");
    }

    private void addNewCustomer() {
        System.out.println("---------------------添加客户---------------------");
        // Customer customer = new Customer("张三", '男', 18, "12321321312312", "asdjsadjkdjsk@qq.com");
        // this.customerList.addCustomer(new Customer("张三", '男', 18, "12321321312312", "asdjsadjkdjsk@qq.com"));
        // this.customerList.addCustomer(new Customer("李四", '男', 18, "3218938291381298", "asdjsadjkdjsk@qq.com"));

        Customer customer = this.createCustomer();
        boolean flag = this.customerList.addCustomer(customer);
        // System.out.println("成功添加客户,客户名 " + customer.getName());
        System.out.println("---------------------添加完成---------------------");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }


    private void modifyCustomer() {
        System.out.println("修改客户");
        System.out.println("---------------------修改客户---------------------");
        System.out.print("请选择待修改客户编号(-1退出)：");
        int operation_num = scanner.nextInt();
        if (operation_num == -1) return;
        if (operation_num - 1 > this.customerList.getTotal()) {
            System.out.println("您输入的值不合法");
        }
        int list_index = operation_num - 1;
        Customer current_cus = this.customerList.getCustomer(list_index);
        System.out.println(current_cus.getName());
        System.out.println(current_cus.getDisplayId());
        System.out.print("姓名(" + current_cus.getName() + ")：");
        String new_name = scanner.next();
        if (new_name.isEmpty()) {
            new_name = current_cus.getName();
        }
        System.out.print("性别(" + current_cus.getGender() + ")：");
        String new_gender = scanner.next();
        System.out.print("年龄(" + current_cus.getAge() + ")：");
        String new_age = scanner.next();
        System.out.print("电话(" + current_cus.getPhone() + ")：");
        String new_phone = scanner.next();
        System.out.print("邮箱(" + current_cus.getEmail() + ")：");
        String new_emil = scanner.next();


        // getTotal

    }

    private void deleteCustomer() {
        System.out.println("删除客户");

    }

    private void listAllCustomer() {
        System.out.println("客户列表");
        System.out.println("---------------------------客户列表---------------------------");
        System.out.println("编号  姓名       性别    年龄   电话                   邮箱");
        for (int i = 0; i < this.customerList.getTotal(); i++) {
            Customer customer = this.customerList.getCustomer(i);
            System.out.print(customer.getDisplayId() + "  ");
            System.out.print(customer.getName() + "  ");
            System.out.print(customer.getGender() + "  ");
            System.out.print(customer.getAge() + "  ");
            System.out.print(customer.getPhone() + "  ");
            System.out.print(customer.getPhone() + "       ");
            System.out.println(customer.getEmail());
        }
        System.out.println("-------------------------客户列表完成-------------------------");
        // System.out.println("编号");
        // customerList

    }

    /**
     * @return Customer
     * @desc 添加客户时创建新客户对象
     */
    public Customer createCustomer() {
        Customer customer = new Customer();
        System.out.print("姓名：");
        String name = scanner.next();
        customer.setName(name);
        System.out.print("性别：");
        char gender = scanner.next().charAt(0);
        customer.setGender(gender);
        System.out.print("年龄：");
        int age = scanner.nextInt();
        customer.setAge(age);
        System.out.print("电话：");
        String phone = scanner.next();
        customer.setPhone(phone);
        System.out.print("邮箱：");
        String emil = scanner.next();
        customer.setEmail(emil);
        return customer;
    }


}
