package org.example.case02;

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
        return new AbstractIteratorImpl();
    }

    private class AbstractIteratorImpl implements AbstractIterator<E>{
        private int cursor;

        @Override
        public void first() {
            cursor = 0;
        }

        @Override
        public void next() {
            cursor++;
        }

        @Override
        public E currentItem() {
            return list.get(cursor);
        }

        @Override
        public boolean isDone() {
            return cursor == list.size();
        }
    }
}
