package com.G04.Collection;

import com.sun.source.tree.Tree;
import org.junit.Test;

import java.security.PublicKey;
import java.util.*;

/**
 * @Author G04
 * @Create 2024/4/7 17:00
 * @Version 1.0
 * ClassName: CollectionTest
 * Package: com.G04.Collection
 * Description:
 */
public class CollectionTest {
    public static void main(String[] args) {
        List strList = new ArrayList();

        for (int i = 0; i < 30; i++) {
            Random random = new Random();
            char i1 = (char) (random.nextInt(25) + 97);

            strList.add(String.valueOf(i1));
        }
        System.out.println(strList);
        System.out.println(listTest(strList, "a"));
        System.out.println(listTest(strList, "b"));
        System.out.println(listTest(strList, "c"));
        System.out.println(listTest(strList, "x"));
        System.out.println(listTest(strList, "z"));
    }

    public static int listTest(Collection list, String s) {
        int i = 0;
        // System.out.println(list);
        for (Object o : list) {
            if (o.equals(s)) i++;
        }
        return i;
    }

    public static char[] getRandom() {
        char[] charList = new char[30];
        for (int i = 0; i < 30; i++) {
            Random random = new Random();
            int i1 = random.nextInt(31) + 67;
            charList[i] = (char) i1;
        }
        return charList;
    }

    @Test
    public void test3() {
        TreeSet set = new TreeSet<>();
        set.add("AA");
        set.add("BB");
        set.add("CC");
        set.add("VV");
        set.add("GG");
        set.add("HH");
        Iterator iteratored = set.iterator();
        while (iteratored.hasNext()) {
            System.out.println(iteratored.next());
        }

    }

    @Test
    public void test4() {
        TreeSet set = new TreeSet();

        Person p1 = new Person("AA", 12);
        Person p2 = new Person("小王122", 32);
        Person p3 = new Person("小里", 55);
        Person p4 = new Person("小啥的", 33);
        Person p5 = new Person("BB", 12);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);

        Iterator iteratored = set.iterator();
        // System.out.println(iteratored.toString());
        System.out.println(set.size());
        while (iteratored.hasNext()) {
            System.out.println(iteratored.next());
        }

    }

    @Test
    public void test5() {
        TreeSet set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 == o2) return 0;
                if (o1 instanceof Person && o2 instanceof Person) {
                    Person p1 = (Person) o1;
                    Person p2 = (Person) o2;
                    int val = p1.age - p2.age;
                    if (val == 0) {
                        return p1.name.compareTo(p2.name);
                    } else {
                        return val;
                    }
                }
                throw new RuntimeException("类型错误");
            }
        });


        Person p1 = new Person("AA", 12);
        Person p2 = new Person("小王122", 32);
        Person p3 = new Person("小里", 55);
        Person p4 = new Person("小啥的", 33);
        Person p5 = new Person("BB", 12);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);

        Iterator iteratored = set.iterator();
        System.out.println(set.size());
        while (iteratored.hasNext()) {
            System.out.println(iteratored.next());
        }
    }


    @Test
    public void test6() {
        Random random = new Random();

        HashSet set = new HashSet();

        while (set.size() <= 18) {
            int randomNum = random.nextInt(20) + 1;
            set.add(randomNum);
        }

        ArrayList list = new ArrayList(set);
        System.out.println(list);
        // Iterator iteratored = set.iterator();
        // while (iteratored.hasNext()) {
        //     System.out.println(iteratored.next());
        // }


    }

    class Person implements Comparable {

        String name;

        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Person() {
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return (age == person.age && Objects.equals(name, person.name));
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public int compareTo(Object o) {
            if (this == o) return 0;
            if (o instanceof Person) {
                Person p = (Person) o;
                if (p.age - this.age == 0) {
                    return -p.name.compareTo(this.name);
                } else {
                    return p.age - this.age;
                }

            }
            throw new RuntimeException("类型不匹配");
        }


        // Comparable


    }

}
