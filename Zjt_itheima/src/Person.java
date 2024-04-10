/**
 * @Author ZJT
 * @Create 2024/4/6 9:29
 * @Version 1.0
 * ClassName: Person
 * Package: PACKAGE_NAME
 * Description:
 */
public class Person {
    String name;
    int age;
    char gender;

    public void study(){
        System.out.println("studying");
    }
    public int showAge(){
        return age;
    }
    public int addAge(int addAge){
        age = age + addAge;
        return age;
    }
}
