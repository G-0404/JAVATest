import com.zjt.extents.People;
import com.zjt.extents.Teacher;

import java.util.HashSet;
import java.util.Random;

/**
 * @Author ZJT
 * @Create 2024/4/9 9:19
 * @Version 1.0
 * ClassName: ${NAME}
 * Package:
 * Description:
 */
public class Main {

    public static void main(String[] args) {
        HashSet<Integer> hashset = new HashSet<Integer>();
        Random random = new Random();
        while (hashset.size()<10) {
            hashset.add(random.nextInt(1, 20));
        }
        System.out.println(hashset);
        // System.out.println(Math.random());
        // People people = new People();
        // people.setName("www");
        // System.out.println(people.getName());
        // System.out.println(people.number);
        // System.out.println("Hello world!");
    }
}