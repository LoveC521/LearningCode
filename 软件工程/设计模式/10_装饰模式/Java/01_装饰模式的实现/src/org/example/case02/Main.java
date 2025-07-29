package org.example.case02;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle();
        ShadowDecorator shadowDecorator = new ShadowDecorator(shape);
        shadowDecorator.setShadowColor("红色");
        shadowDecorator.draw();
    }
}
