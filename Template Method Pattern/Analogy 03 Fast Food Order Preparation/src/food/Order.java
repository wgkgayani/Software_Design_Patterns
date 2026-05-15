package food;

//Abstract Class
abstract class FoodOrder {
    // Template Method
    final void processOrder() {
        takeOrder();
        prepareFood();
        packFood();
        deliverFood();
    }
    void takeOrder() {
        System.out.println("Order Taken");
    }
    abstract void prepareFood();
    void packFood() {
        System.out.println("Food Packed");
    }
    void deliverFood() {
        System.out.println("Food Delivered");
    }
}
//Burger Order
class BurgerOrder extends FoodOrder {
    void prepareFood() {
        System.out.println("Preparing Burger");
    }
}
//Pizza Order
class PizzaOrder extends FoodOrder {
    void prepareFood() {
        System.out.println("Preparing Pizza");
    }
}