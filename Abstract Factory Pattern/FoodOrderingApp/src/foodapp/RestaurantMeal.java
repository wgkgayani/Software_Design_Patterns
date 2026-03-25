package foodapp;

public class RestaurantMeal {

    public static void main(String[] args) {

        // 🍛 North Indian Order
        MealFactory northFactory = new NorthIndianMealFactory();
        FoodOrderingApp northOrder = new FoodOrderingApp(northFactory);
        northOrder.prepareAndServeMeal();

        System.out.println();

        // 🍚 South Indian Order
        MealFactory southFactory = new SouthIndianMealFactory();
        FoodOrderingApp southOrder = new FoodOrderingApp(southFactory);
        southOrder.prepareAndServeMeal();
    }
}
