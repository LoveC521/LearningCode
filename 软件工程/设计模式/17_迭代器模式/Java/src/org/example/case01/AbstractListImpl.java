package org.example.case01;

import java.util.ArrayList;

public class AbstractListImpl<E> extends AbstractList<E> {
    private final ArrayList<E> list = new ArrayList<>();

    @Override
    public void add(E e) {
        list.add(e);
    }

    @Override
    public void remove(E e) {
        list.remove(e);
    }

    @Override
    public E get(int index) {
        return list.get(index);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public AbstractIterator<E> createIterator() {
        return new AbstractIteratorImpl<>(this);
    }
}
