package org.example;

public class SpringButton extends Button {
    @Override
    public void display() {
        System.out.println("显示绿色按钮");
    }

    @Override
    public Button clone() {
        return new SpringButton();
    }
}
