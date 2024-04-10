package com.zjt.sta.demo02;

import java.util.Random;

/**
 * @Author ZJT
 * @Create 2024/4/9 10:21
 * @Version 1.0
 * ClassName: CodeUtil
 * Package: com.zjt.sta.demo02
 * Description:
 */
public class CodeUtil {
    // 验证码
    public static String code() {
        String a = "123467890qweruoQOIEUQPZXJCNZEJDHDOILQAiahjsdhcao";
        String code = " ";
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            code += a.charAt(random.nextInt(a.length()));
        }
        return code;
    }
}
