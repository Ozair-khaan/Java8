package com.javaEight.Bi;

import java.util.function.BiFunction;

public class BiFunctionEx {
    public static void main(String[] args) {
        BiFunction<String, String , Integer> length=(x, y)->x.length()+y.length();
        System.out.println(length.apply("Hi", "Hello"));
    }
}
