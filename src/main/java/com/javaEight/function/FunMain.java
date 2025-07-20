package com.javaEight.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunMain {
    public static void main(String[] args) {
        Function<String, Integer> function1 = x -> x.length();
        Function<String, String> function2 = x -> x.substring(0, 2);
        Function<List<Student>, List<Student>> studentWithRaAsPrefix = li -> {
            List<Student> result = new ArrayList<>();
            for (Student s : li) {
                if (function2.apply(s.getName()).equalsIgnoreCase("ra")) {
                    result.add(s);
                }
            }
            return result;
        };
        Student s1 = new Student(1, "Ram");
        Student s2 = new Student(2, "Ramesh");
        Student s3 = new Student(3, "Rahul");
        Student s4 = new Student(4, "Raj");
        List<Student> student = Arrays.asList(s1, s2, s3, s4);
        List<Student> filteredStudent = studentWithRaAsPrefix.apply(student);
        System.out.println(filteredStudent);

    }

    private static class Student {
        private int id;
        private String name;

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }
}
