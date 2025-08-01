package com.javaEight.stream;

import java.util.stream.Stream;

public class TerminalEx {
    public static void main(String[] args) {
        Object collect = Stream.iterate(0, x -> x + 1)
                .limit(101)
                .map(x -> x / 20)
                .distinct()
                .count();  //this is terminal operator for ex: count, max, min etc
        System.out.println(collect);
    }
}
