package org.example.case03;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            if (num == 3) {
                iterator.remove();
            }else {
                System.out.print(num + ",");
            }
        }
        System.out.println();
        System.out.println(list);
    }
}
