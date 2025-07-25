package org.example;

public abstract class TextField implements Prototype<TextField> {
    public abstract void display();

    public TextField clone() {
        try {
            return (TextField) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
