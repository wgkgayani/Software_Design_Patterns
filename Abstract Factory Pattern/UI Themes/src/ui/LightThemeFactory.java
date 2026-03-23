package ui;

class LightThemeFactory implements GUIFactory {

    public Button createButton() {
        return new LightButton();
    }

    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }

    public TextBox createTextBox() {
        return new LightTextBox();
    }
}