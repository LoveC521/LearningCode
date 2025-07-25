package org.example;

public class SummerTextField extends TextField {
    @Override
    public void display() {
        System.out.println("显示蓝色边框文本框");
    }

    @Override
    public TextField clone() {
        return new SummerTextField();
    }
}
