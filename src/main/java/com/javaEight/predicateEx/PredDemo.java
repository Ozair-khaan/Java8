package com.javaEight.predicateEx;

import com.javaEight.comparator.Student;

import java.util.function.Predicate;

public class PredDemo {
    public static void main(String[] args) {
        Predicate<Integer> isEven= x->x%2==0;
        System.out.println(isEven.test(4));

        Predicate<String> isStartWithLetterO= x->x.toLowerCase().charAt(0)=='o';
        Predicate<String> isEndWithLetterZ= x->x.toLowerCase().charAt(x.length()-1)=='r';
        Predicate<String> and = isStartWithLetterO.and(isEndWithLetterZ);
        System.out.println(and.test("Ozair"));
        System.out.println(isStartWithLetterO.negate().test("Omair"));

        Student s1 = new Student(1, "Zaid");
        Student s2 = new Student(2, "umar");
        Predicate<Student> studentPredicate=x->x.getId()>1;
        System.out.println(studentPredicate.test(s2));

        Predicate<Object> ozair = Predicate.isEqual("Ozair");
        System.out.println("Checking with isEqual method ::: "+ozair.test("Ozair"));
    }
}
