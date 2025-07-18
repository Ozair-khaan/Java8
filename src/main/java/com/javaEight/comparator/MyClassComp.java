package com.javaEight.comparator;

import java.util.Comparator;

public class MyClassComp implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        return b - a;
    }
}
