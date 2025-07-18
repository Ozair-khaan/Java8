package com.javaEight.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student(2, "Ozair");
        Student s2= new Student(3, "Zaid");
        Student s3= new Student(33, "Akshit");

        ArrayList<Student> li = new ArrayList<>();
        li.add(s1);
        li.add(s2);
        li.add(s3);
        Collections.sort(li, (a,b)->b.id-a.id);
        System.out.println(li);
    }
}
