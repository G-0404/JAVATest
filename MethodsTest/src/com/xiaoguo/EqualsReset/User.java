package com.xiaoguo.EqualsReset;

import java.util.Objects;

/**
 * @Author G04
 * @Create 2024/3/26 16:58
 * @Version 1.0
 * ClassName: User
 * Package: com.xiaoguo.EqualsReset
 * Description:
 */
public class User {
    String name;
    int age;


    // @Override
    // public boolean equals(Object obj) {
    //     if (this == obj) {
    //         return true;
    //     }
    //     if (obj instanceof User user) {
    //         return this.age == user.age && this.name.equals(user.name);
    //
    //     }
    //     return false;
    // }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

}


