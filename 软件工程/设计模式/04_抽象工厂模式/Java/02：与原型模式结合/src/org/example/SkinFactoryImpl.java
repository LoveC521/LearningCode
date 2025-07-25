package org.example;

public class SkinFactoryImpl implements SkinFactory{
    private final Button button;
    private final TextField textField;
    private final ComboBox comboBox;

    public SkinFactoryImpl(Button button, ComboBox comboBox, TextField textField) {
        this.button = button;
        this.comboBox = comboBox;
        this.textField = textField;
    }

    @Override
    public Button createButton() {
        return button.clone();
    }

    @Override
    public TextField createTextField() {
        return textField.clone();
    }

    @Override
    public ComboBox createComboBox() {
        return comboBox.clone();
    }
}
