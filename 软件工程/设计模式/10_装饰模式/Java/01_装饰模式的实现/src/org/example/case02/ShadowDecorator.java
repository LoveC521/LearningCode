package org.example.case02;

public class ShadowDecorator extends ShapeDecorator{
    private String shadowColor;

    public ShadowDecorator(Shape shape) {
        super(shape);
    }

    public void setShadowColor(String shadowColor) {
        this.shadowColor = shadowColor;
    }

    @Override
    public void draw() {
        System.out.println("绘制" + shadowColor + "阴影");
        super.draw();
    }
}
