package com.javaEight.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SimpleStreamEx {
    public static void main(String[] args) {
        int [] array={1,2,3,4,5};
        int sum=0;
        for(int i=0; i<array.length;i++){
            if(array[i]%2==0){
                sum+=array[i];
            }
        }
//        System.out.println(sum);

        int [] array2={1,2,3,4,5};
        IntStream even = Arrays.stream(array2).filter(n -> n % 2 == 0);
        even.forEach(System.out::println);
    }
}
