package com.javaEight.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx {
    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s); //this method return noting, can be used to save values in db
        consumer.accept("Ozair");

        Consumer<List<Integer>> listConsumer1=li->{
          for(Integer i:li){
              System.out.println(i);
          }
        };

        Consumer<List<Integer>> listConsumer2=li->{
            for(Integer i:li){
                System.out.println(i+100);
            }
        };

        Consumer<List<Integer>> listConsumer = listConsumer1.andThen(listConsumer2);
        listConsumer.accept(Arrays.asList(1,2,3,4,5));
    }
}
