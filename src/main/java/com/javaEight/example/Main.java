package com.javaEight.example;

public class Main {
    public static void main(String[] args) {
        Employee employee = new SoftwareEngineer();
        System.out.println(employee.getName());

        //using lambda with functional
        Employee employee1=()->"Software engineer from lambda"; //don't need here to create class to implement interface method
        System.out.println(employee1.getName());

        Employee editor=()->"Editor from lambda";
        System.out.println(editor.getName());

    }
}
