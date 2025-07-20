package com.javaEight.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7554, 223, 1321, 12,1,2,4);
//        List<Integer> filteredList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
//        System.out.println(filteredList);
//        List<Integer> mappedList = filteredList.stream().map(x -> x / 2).collect(Collectors.toList());
//        System.out.println(mappedList);

        //same above program can be done as

        List<Integer> filteredList = list.stream().
                filter(x -> x % 2 == 0)
                .map(x->x/2)
                .distinct().sorted((a,b)->(b-a)) //descending
                .limit(4)
                .skip(1)
                .collect(Collectors.toList());
        System.out.println(filteredList);


        List<Integer> collect = Stream.iterate(0, x -> x + 1)
                .limit(101).skip(1)
                .filter(x -> x % 2 == 0)
                .map(x -> x / 10)
                .distinct()
                .sorted()
                .peek(x -> System.out.println(x))
                .collect(Collectors.toList());

    }
}
