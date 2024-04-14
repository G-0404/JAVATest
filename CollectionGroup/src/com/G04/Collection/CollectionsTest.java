package com.G04.Collection;

import org.junit.Test;

import java.util.*;

/**
 * @Author G04
 * @Create 2024/4/12 15:44
 * @Version 1.0
 * ClassName: CollectionsTest
 * Package: com.G04.Collection
 * Description:
 */
public class CollectionsTest {
    /*
        reverse(List):反转 List 中元素的顺序
        shuffle(List):对 List 集合元素进行随机排序
        sort(List):根据元素的自然顺序对指定 List 集合元素按升序排序
        sort(List，Comparator):根据指定的 Comparator 产生的顺序对 List 集合元素进行排序
        swap(List，int, int):将指定 list 集合中的 i 处元素和 j 处元素进行交换
     */
    @Test
    public void test() {

        ArrayList<String> arr = new ArrayList<String>();
        arr.add("aa");
        arr.add("bb");
        arr.add("cc");
        arr.add("dd");
        arr.add("ee");
        arr.add("ff");
        arr.add("ff");
        arr.add("ff");
        arr.add("ff");
        arr.add("ff");
        arr.add("gg");
        arr.add("hh");


        // ArrayList<String> initializedList = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        // Collections.sort(arr, new Comparator<String>() {
        //     @Override
        //     public int compare(String o1, String o2) {
        //         return -o1.compareTo(o2);
        //     }
        // });

        // Collections.reverse(arr);
        Collections.shuffle(arr);

        System.out.println(Collections.frequency(arr, "ff"));
        System.out.println(arr);


    }
}
