package shopping;

import java.util.ArrayList;
import java.util.List;

class Category implements ShoppingItem {

    private String name;
    private List<ShoppingItem> items = new ArrayList<>();

    public Category(String name) {
        this.name = name;
    }

    public void addItem(ShoppingItem item) {
        items.add(item);
    }

    public void display() {

        System.out.println("Category: " + name);

        for (ShoppingItem item : items) {
            item.display();
        }
    }
}