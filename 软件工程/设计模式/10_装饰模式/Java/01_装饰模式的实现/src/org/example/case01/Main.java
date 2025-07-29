package org.example.case01;

/**
 * 透明装饰模式的实现
 */
public class Main {
    public static void main(String[] args) {
        Component component = new ScrollBarDecorator(new Window());
        component.display();
    }
}
