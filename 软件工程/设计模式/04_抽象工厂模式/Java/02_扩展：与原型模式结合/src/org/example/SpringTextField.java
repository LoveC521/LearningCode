package org.example;

public class SpringTextField extends TextField {
    @Override
    public void display() {
        System.out.println("显示绿色边框文本框");
    }

    @Override
    public TextField clone() {
        return new SpringTextField();
    }
}
