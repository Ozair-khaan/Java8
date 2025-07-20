package com.javaEight.function;

import java.util.function.Function;

public class AndThen {
    public static void main(String[] args) {
        Function<String, String> function1 = s -> s.toUpperCase();
        Function<String, String> function2 = s -> s.substring(0, 3);

        System.out.println(function1.andThen(function2).apply("Ozair"));

        Function<Integer, Integer> function3 = x -> 2 * x;
        Function<Integer, Integer> function4 = x -> x * x * x;

        System.out.println(function3.andThen(function4).apply(3));//216  (2*3=6) (6*6*6=216)
        System.out.println(function4.andThen(function3).apply(3));//54 (3*3*3=27) (2*27=54)

        System.out.println(function4.compose(function3).apply(3));//54 (3*3*3=27) (2*27=54)

        //identity
        Function<Object, Object> identityFunction = Function.identity();  //this is static method because we are returing the same input value
        //below is the comparision
        System.out.println(identityFunction.apply("Ozair"));
    }

    //the above code is same as
    private Object identityFunction(String s){
        return s;
    }
}
