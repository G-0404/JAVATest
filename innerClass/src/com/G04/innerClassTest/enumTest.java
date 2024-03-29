package com.G04.innerClassTest;

/**
 * @Author G04
 * @Create 2024/3/28 11:28
 * @Version 1.0
 * ClassName: enumTest
 * Package: com.G04.innerClassTest
 * Description:
 */
public class enumTest {
    // Season1.
    public static void main(String[] args) {
        Season1.SPRING.show();
        System.out.println(Season1.SPRING.getSeasonName());
        System.out.println(Season1.SPRING.getSeasonDesc());
    }
    // sdk5以后的定义

    enum Season1 implements info {
        SPRING("春天", "春暖花开"),
        SUMMER("春天", "春暖花开"),
        AUTUMN("春天", "春暖花开"),
        WINTER("春天", "春暖花开");
        // SPRIng();

        private final String seasonName;
        private final String seasonDesc;

        @Override
        public void show() {
            System.out.println("这是一个季节");
        }


        Season1(String seasonName, String seasonDesc) {
            this.seasonName = seasonName;
            this.seasonDesc = seasonDesc;
        }

        public String getSeasonName() {
            return seasonName;
        }

        public String getSeasonDesc() {
            return seasonDesc;
        }
    }

    interface info {
        void show();
    }
}
