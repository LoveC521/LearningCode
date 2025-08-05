package org.example.case01;

public class Main {
    public static void main(String[] args) {
        AbstractList<Integer> list = new AbstractListImpl<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        AbstractIterator<Integer> iterator = list.createIterator();

        while (!iterator.isDone()) {
            System.out.print(iterator.currentItem() + ",");
            iterator.next();
        }
        System.out.println();
        iterator.first();
        while (!iterator.isDone()) {
            System.out.print(iterator.currentItem() + ",");
            iterator.next();
        }
    }
}
