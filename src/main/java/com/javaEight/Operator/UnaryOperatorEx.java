package com.javaEight.Operator;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorEx {
    //unary operator is nothing but a special case of function interface where we don't need to provide the return type
    public static void main(String[] args) {
        Function<Integer, Integer> function=x->x*x;
        Function<String, String> function1= str->str.toLowerCase();

        UnaryOperator<Integer> unaryOperator= x->x*x;
        System.out.println(unaryOperator.apply(5));
    }
}
