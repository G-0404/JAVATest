package com.G04.innerClassTest;

/**
 * @Author G04
 * @Create 2024/3/28 17:42
 * @Version 1.0
 * ClassName: SeasonTest
 * Package: com.G04.innerClassTest
 * Description:
 */
public class SeasonTest {
    // Season season = new Season();
    public static void main(String[] args) {
        // Season.autumn
    }
}

// JDK5.0之前的方式
class Season {
    // 2、 声明当前类的对象的实例变量
    private final String seasonName; // 季节名称
    private final String seasonDesc; // 季节描述
    // 1、私有化构造器


    private Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
    // 3、提供get

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    // 4、创建当前类的实例
    public static final Season SPRING = new Season("春天", "春暖花开");
    public static final Season SUMMER = new Season("夏天", "夏日炎炎");
    public static final Season AUTUMN = new Season("秋天", "秋高气爽");
    public static final Season WINTER = new Season("冬天", "白雪皑皑");
}