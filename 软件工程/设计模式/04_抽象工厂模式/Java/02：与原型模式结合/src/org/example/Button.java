package org.example;

public abstract class Button implements Prototype<Button>{
    public abstract void display();

    public Button clone() {
        try {
            return (Button) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
