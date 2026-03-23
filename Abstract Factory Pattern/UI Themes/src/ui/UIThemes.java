package ui;

public class UIThemes {

    public static void main(String[] args) {

        GUIFactory factory;

        String theme = "light"; // change to "light"

        if (theme.equalsIgnoreCase("dark")) {
            factory = new DarkThemeFactory();
        } else {
            factory = new LightThemeFactory();
        }

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();
        TextBox textBox = factory.createTextBox();

        button.paint();
        checkbox.paint();
        textBox.paint();
    }
}