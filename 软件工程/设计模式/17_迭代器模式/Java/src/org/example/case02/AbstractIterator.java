package org.example.case02;

public interface AbstractIterator<E> {
    void first();

    void next();

    E currentItem();

    boolean isDone();
}
