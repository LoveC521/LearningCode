package org.example.case01;

public class AbstractIteratorImpl<E> implements AbstractIterator<E>{
    private final AbstractList<E> abstractList;
    private int cursor;

    public AbstractIteratorImpl(AbstractList<E> abstractList) {
        this.abstractList = abstractList;
    }

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
        return abstractList.get(cursor);
    }

    @Override
    public boolean isDone() {
        return cursor == abstractList.size();
    }
}
