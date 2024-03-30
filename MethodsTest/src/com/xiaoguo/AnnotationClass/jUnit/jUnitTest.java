package com.xiaoguo.AnnotationClass.jUnit;

import org.junit.Test;

/**
 * @Author G04
 * @Create 2024/3/29 16:47
 * @Version 1.0
 * ClassName: jUnitTest
 * Package: com.xiaoguo.AnnotationClass.jUnit
 * Description:
 */
public class jUnitTest {
    // @Test
    // public void test1() {
    //     System.out.println("hello");
    // }
    @Test
    public void test() {
        // Integer inta = 80;
        int i1 = 10;
        Integer I11 = Integer.valueOf(i1);
        int i2 = I11.intValue();
        Integer I22 = Integer.valueOf(i2);


    }

    @Test
    public void test1() {
        // 自动拆箱自动装箱
        int i = 10;
        Integer i11 = i++;
        int i2 = i11 + 1;


    }
}
