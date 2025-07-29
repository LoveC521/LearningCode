package org.example.case01;

public class BlackBorderDecorator extends ComponentDecorator{
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    public void display() {
        this.setBlackBorder();
        super.display();
    }

    private void setBlackBorder() {
        System.out.println("为构件增加黑色边框");
    }
}
