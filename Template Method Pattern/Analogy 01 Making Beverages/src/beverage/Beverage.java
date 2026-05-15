package beverage;

// Abstract Class
abstract class Beverage {
    // Template Method
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    void boilWater() {
        System.out.println("Boiling Water");
    }
    abstract void brew();
    void pourInCup() {
        System.out.println("Pouring into Cup");
    }
    abstract void addCondiments();
}
// Tea
class Tea extends Beverage {
    void brew() {
        System.out.println("Brewing Tea");
    }
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
// Coffee
class Coffee extends Beverage {
    void brew() {
        System.out.println("Brewing Coffee");
    }
    void addCondiments() {
        System.out.println("Adding Milk");
    }
}