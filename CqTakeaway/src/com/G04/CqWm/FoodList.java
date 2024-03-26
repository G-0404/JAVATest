package com.G04.CqWm;

/**
 * @Author G04
 * @Create 2024/3/25 15:43
 * @Version 1.0
 * ClassName: FoodList
 * Package: com.G04.CqWm
 * Description:
 */
public class FoodList {
    FoodItem[] FoodList;

    public static void main(String[] args) {
        FoodItem[] foodItems = new FoodItem[10];
        for (FoodItem item : foodItems) {
            item = new FoodItem("橘子", "asdadasdsa", FoodType.BUSINESS_SET, 3.33, false);
            item.food_name = "abc";
            System.out.println(item.food_name);
        }

    }

    public FoodList(FoodItem[] foodList) {
        FoodList = foodList;
    }


}
