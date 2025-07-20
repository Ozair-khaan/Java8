package com.javaEight.Bi;

import java.util.function.BiConsumer;

public class BiConsumerEx {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> biConsumer=(x, y)->{
            System.out.println(x+y);
        };
        biConsumer.accept(12,15);
    };

    //note: BiSupplier is there, because a method can return only one value
}
