package org.example;

public class SummerComboBox extends ComboBox {

    @Override
    public void display() {
        System.out.println("显示蓝色边框组合框");
    }

    @Override
    public ComboBox clone() {
        return new SummerComboBox();
    }
}
