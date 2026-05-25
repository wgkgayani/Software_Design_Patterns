package shopping;

public class Main {

    public static void main(String[] args) {

        // Products
        Product p1 = new Product("iPhone 15");
        Product p2 = new Product("Samsung Galaxy");
        Product p3 = new Product("Dell Laptop");

        // Categories
        Category mobiles = new Category("Mobile Phones");
        mobiles.addItem(p1);
        mobiles.addItem(p2);

        Category laptops = new Category("Laptops");
        laptops.addItem(p3);

        Category electronics = new Category("Electronics");

        electronics.addItem(mobiles);
        electronics.addItem(laptops);

        // Display all
        electronics.display();
    }
}
