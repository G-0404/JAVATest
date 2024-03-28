package com.G04.interface1;

import java.util.Random;

/**
 * @Author G04
 * @Create 2024/3/27 21:51
 * @Version 1.0
 * ClassName: EatableTest
 * Package: com.G04.interface1
 * Description:
 */
public class EatableTest {

    public static void main(String[] args) {
        Eatable[] eatables = new Eatable[3];
        eatables[0] = new Chinese();
        eatables[1] = new American();
        eatables[2] = new Indian();
        for (Eatable item : eatables) {
            item.eat();
        }
    }
}
