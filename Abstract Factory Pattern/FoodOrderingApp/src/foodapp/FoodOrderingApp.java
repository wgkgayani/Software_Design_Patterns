package foodapp;

class FoodOrderingApp {

    private MainCourse main;
    private SideDish side;
    private Dessert dessert;

    public FoodOrderingApp(MealFactory factory) {
        main = factory.createMainCourse();
        side = factory.createSideDish();
        dessert = factory.createDessert();
    }

    public void prepareAndServeMeal() {
        System.out.println("--- Your meal is ready! ---");
        main.prepare();
        side.serve();
        dessert.enjoy();
    }
}
