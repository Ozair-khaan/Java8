package com.javaEight.comparator;

import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args) {
        TreeSet<Object> set = new TreeSet<>();
        set.add(22);
        set.add(1);
        set.add(13);
        System.out.println("Before manual sorting: "+set);

        TreeSet<Integer> set1 = new TreeSet<>((a, b) -> b - a);
        set1.add(22);
        set1.add(1);
        set1.add(13);
        System.out.println("After manual sorting: "+set1);
    }
}
