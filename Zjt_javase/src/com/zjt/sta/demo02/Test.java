package com.zjt.sta.demo02;

/**
 * @Author ZJT
 * @Create 2024/4/9 10:20
 * @Version 1.0
 * ClassName: Test
 * Package: com.zjt.sta.demo02
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        String code = CodeUtil.code();
        System.out.println("验证码为:" + code);
    }
}
