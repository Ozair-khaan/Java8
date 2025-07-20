package com.javaEight.MReferenceEx;

import java.util.Arrays;
import java.util.List;

public class MethRefEx {

    private void print(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        MethRefEx methRefEx = new MethRefEx();
        List<String> student = Arrays.asList("Alice", "Bob", "Charlie");
        student.forEach(methRefEx::print);
    }
}
