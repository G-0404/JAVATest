package com.xiaoguo.PDS;

/**
 * @Author G04
 * @Create 2024/3/24 14:03
 * @Version 1.0
 * ClassName: CustomerList
 * Package: com.xiaoguo.PDS
 * Description:
 */
public class CustomerList {
    private final Customer[] user_list;
    // 当前尾指针
    private int total;

    public CustomerList() {
        this.user_list = new Customer[0];
    }

    public CustomerList(int totalCustomer) {
        this.user_list = new Customer[totalCustomer];
    }

    /**
     * @param customer
     * @return Boolean
     * @desc 列表添加新对象，添加成功则返回true，失败为false
     */
    public boolean addCustomer(Customer customer) {
        System.out.println("qwewqewqewq");
        System.out.println("qwewqewqewq");
        System.out.println("qwewqewqewq");
        System.out.println("qwewqewqewq");
        if (judgeIndex(this.total)) {
            this.user_list[total] = customer;
            this.user_list[total].setId(this.total);
            this.total++;
            return true;
        } else {
            System.out.println("该数组已满");
            return false;
        }

    }

    /**
     * @param customer Customer
     * @return Boolean
     * @desc 替换数组中对应位置的对象，替换成功则返回true，失败为false
     */
    public boolean replaceCustomer(int i, Customer customer) {
        if (judgeIndex(i)) {
            this.user_list[i] = customer;
            return true;
        } else {
            System.out.println("索引失败");
            return false;
        }

    }

    public boolean deleteCustomer(int i) {
        if (judgeIndex(i)) {
            this.user_list[i] = null;
            return true;
        } else {
            return false;
        }
    }

    /**
     * @return real_list
     * @desc 获得真实满载数组
     */
    public Customer[] getAllCustomer() {
        int real_num = this.getRealCustomerNum();
        Customer[] real_list = new Customer[real_num];

        for (int i = 0; i < this.user_list.length; i++) {
            if (this.user_list[i] != null) {
                real_list[i] = this.user_list[i];
            }
        }
        return real_list;

    }

    /**
     * @return total_num
     * @desc 获得真实队列人数
     */
    public int getRealCustomerNum() {
        int total_num = 0;
        for (int i = 0; i < this.user_list.length; i++) {
            if (this.user_list[i] != null) {
                total_num++;
            }
        }
        return total_num;
    }

    public Customer getCustomer(int i) {
        // System.out.println(this.user_list.toString());
        return this.user_list[i];

    }

    /**
     * @param i
     * @return Boolean
     * @desc 判断传入的下标是否在数组内
     */
    public boolean judgeIndex(int i) {
        return i >= 0 && i <= this.user_list.length;
    }

    public int getTotal() {
        return total;
    }
}
