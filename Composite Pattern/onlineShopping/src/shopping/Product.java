package shopping;

class Product implements ShoppingItem {

    private String name;

    public Product(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Product: " + name);
    }
}