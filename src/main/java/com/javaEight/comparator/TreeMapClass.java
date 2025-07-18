package com.javaEight.comparator;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapClass {
    public static void main(String[] args) {
        Map<Integer, String > map = new TreeMap<>();
        map.put(22, "z");
        map.put(1, "x");
        map.put(13,"yb");
        System.out.println("Before manual sorting: "+map);

        Map<Integer, String > map1 = new TreeMap<>((a, b)->b-a);
        map1.put(22, "z");
        map1.put(1, "x");
        map1.put(13,"yb");
        System.out.println("After manual sorting: "+map1);
    }
}
