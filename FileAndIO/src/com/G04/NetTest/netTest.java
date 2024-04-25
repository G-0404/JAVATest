package com.G04.NetTest;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author G04
 * @Create 2024/4/24 17:00
 * @Version 1.0
 * ClassName: netTest
 * Package: com.G04.NetTest
 * Description:
 */
public class netTest {
    public static void main(String[] args) {
        try {
            InetAddress ine_name = InetAddress.getByName("192.168.23.31");
            InetAddress ine_name1 = InetAddress.getByName("www.g04.online");

            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println(ine_name);
            System.out.println(ine_name1);
            System.out.println(localHost);
            System.out.println(ine_name1.getHostName());
        } catch (UnknownHostException e) {
            // throw new RuntimeException(e);
            e.printStackTrace();
        }
    }
}
