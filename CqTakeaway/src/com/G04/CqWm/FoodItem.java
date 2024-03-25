package com.G04.CqWm;

/**
 * @Author G04
 * @Create 2024/3/25 15:43
 * @Version 1.0
 * ClassName: FoodItem
 * Package: com.G04.CqWm
 * Description:
 */
public class FoodItem {
    String food_name;
    String food_img;

    FoodType food_type;
    double price;
    boolean is_on_sell;

    public FoodItem() {
    }

    public FoodItem(String food_name, String food_img, FoodType food_type, double price, boolean is_on_sell) {
        this.food_name = food_name;
        this.food_img = food_img;
        this.food_type = food_type;
        this.price = price;
        this.is_on_sell = is_on_sell;
    }
}
