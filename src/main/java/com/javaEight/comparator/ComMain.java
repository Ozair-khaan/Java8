package com.javaEight.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(27);
        list.add(24);
        list.add(22);
        list.add(21);
        list.add(29);
        list.add(288);
        list.add(42);
//        Collections.sort(list, new MyClassComp());
        Collections.sort(list, (a, b)->b-a);//using lambda
        System.out.println(list);
    }
}
