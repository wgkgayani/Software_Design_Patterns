package foodapp;

interface MealFactory {
    MainCourse createMainCourse();
    SideDish createSideDish();
    Dessert createDessert();
}
