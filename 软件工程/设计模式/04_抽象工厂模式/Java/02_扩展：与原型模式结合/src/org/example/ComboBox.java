package org.example;

public abstract class ComboBox implements Prototype<ComboBox>{
    public abstract void display();

    public ComboBox clone() {
        try {
            return (ComboBox) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
