package BurgerVariations;

class Cheese extends BurgerDecorator {
    public Cheese(Burger burger) {
        super(burger);
    }
    public String getDescription() {
        return burger.getDescription() + " + Cheese";
    }
    public double cost() {
        return burger.cost() + 50;
    }
}