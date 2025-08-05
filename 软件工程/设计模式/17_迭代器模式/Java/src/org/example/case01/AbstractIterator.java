package org.example.case01;

public interface AbstractIterator<E> {
    void first();

    void next();

    E currentItem();

    boolean isDone();
}
