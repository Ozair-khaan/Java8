package com.javaEight.Bi;

import java.util.function.BiPredicate;

public class BiPredciateEx {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> isEven=(x, y)->x%2==0 && y%2==0;
        System.out.println(isEven.test(2,6));

        BiPredicate<String, Integer> checkLength=(str, x)->str.length()==x;
        System.out.println(checkLength.test("Ozair", 5));
    }
}
