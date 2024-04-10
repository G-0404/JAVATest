package com.zjt.opp.day02.myabstract2;

/**
 * @Author ZJT
 * @Create 2024/4/10 14:57
 * @Version 1.0
 * ClassName: Father
 * Package: com.zjt.opp.day02.myabstract2
 * Description:
 */
public abstract class Father {
    public String name;
    public int age;

    /*
    final定死info模板,防止被子类重写
     */
    public final void info() {
        System.out.print("name:" + name);
        System.out.print("\tage:" + age + "\t");
        doThing();
    }

    public abstract void doThing();
}
