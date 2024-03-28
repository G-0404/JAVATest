package com.xiaoguo.singleItem;

/**
 * @Author G04
 * @Create 2024/3/27 11:18
 * @Version 1.0
 * ClassName: GirlFriend
 * Package: com.xiaoguo.singleItem
 * Description:
 */
public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend girlFriend = GirlFriend.getInstance();
    }
}

class GirlFriend {
    int age;

    public GirlFriend() {
    }

    private static GirlFriend instance = null;

    public static GirlFriend getInstance() {
        if (instance == null) {
            instance = new GirlFriend();
        }
        return instance;
    }
}
