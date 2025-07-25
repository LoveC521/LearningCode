package org.example;

public class SummerButton extends Button{
    @Override
    public void display() {
        System.out.println("显示浅蓝色按钮");
    }

    @Override
    public Button clone() {
        return new SummerButton();
    }
}
