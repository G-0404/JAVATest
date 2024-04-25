package com.G04.Generic;

import java.util.*;

/**
 * @Author G04
 * @Create 2024/4/14 11:22
 * @Version 1.0
 * ClassName: GenericTest
 * Package: com.G04.Generic
 * Description:
 */
public class GenericTest1 {

    public static void main(String[] args) {

    }


}

class DAO<T> {
    private final Map<String, T> map = new HashMap<>();


    public void save(String id, T entity) {
        map.put(id, entity);
    }

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        map.put(id, entity);
    }

    public List<T> list() {
        return new ArrayList<T>(map.values());
    }

    public void delete(String id) {
        map.remove(id);
    }

    ;
}

