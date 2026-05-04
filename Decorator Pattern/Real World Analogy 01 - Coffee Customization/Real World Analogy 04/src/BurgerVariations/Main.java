package BurgerVariations;

public class Main {
    public static void main(String[] args) {
// Basic Burger
        Burger burger = new BasicBurger();
// Add Cheese, Lettuce, and Sauce
        burger = new Cheese(burger);
        burger = new Lettuce(burger);
        burger = new Sauce(burger);
        System.out.println("Order: " + burger.getDescription());
        System.out.println("Total Cost: " + burger.cost());
    }
}