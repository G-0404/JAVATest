package com.G04.Generic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author G04
 * @Create 2024/4/14 11:22
 * @Version 1.0
 * ClassName: GenericTest
 * Package: com.G04.Generic
 * Description:
 */
public class GenericTest {

    public static void main(String[] args) {
        Order<Integer> order = new Order<>();
        order.setOrderId(13);
        order.setDemo(99);
        System.out.println(order.getDemo());

        MeetOrder meetOrder = new MeetOrder();
        meetOrder.setOrderId(111);
        meetOrder.setDemo("AA");
        System.out.println(meetOrder.getOrderId());

        GrassOrder<Character> grassOrder = new GrassOrder<>();
        grassOrder.setOrderId(111);
        grassOrder.setDemo('A');
        System.out.println(grassOrder.getOrderId());
    }

    @Test
    public void test1() {

    }

    public <E> ArrayList<E> copyFromArrayToList(E[] oriList) {
        ArrayList<E> list = new ArrayList<>(Arrays.asList(oriList));
        return list;
    }
}


class Order<T> {
    private int orderId;
    private T demo;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public T getDemo() {
        return demo;
    }

    public void setDemo(T demo) {
        this.demo = demo;
    }
}

class MeetOrder extends Order<String> {
}

class GrassOrder<T> extends Order<T> {

}