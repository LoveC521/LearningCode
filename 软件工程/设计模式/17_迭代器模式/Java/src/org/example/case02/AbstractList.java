package org.example.case02;

public abstract class AbstractList<E> {

    public abstract void add(E e);

    public abstract void remove(E e);

    public abstract E get(int index);

    public abstract int size();

    public abstract AbstractIterator<E> createIterator();
}
