package com.xiaoguo.EqualsReset;

import java.util.Objects;

/**
 * @Author G04
 * @Create 2024/3/26 17:46
 * @Version 1.0
 * ClassName: Order
 * Package: com.xiaoguo.EqualsReset
 * Description:
 */
public class Order {
    int orderId;
    String orderName;

    public static void main(String[] args) {
        Order o1 = new Order(10, "ABC");
        Order o2 = new Order(10, "ABC");
        System.out.println(o2.toString());
        System.out.println(o1.equals(o2));

    }

    public Order() {
    }

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId && Objects.equals(orderName, order.orderName);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderName='" + orderName + '\'' +
                '}';
    }
}
