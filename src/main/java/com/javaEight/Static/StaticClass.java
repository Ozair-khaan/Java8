package com.javaEight.Static;


interface A{
    static void sayHello(){
        System.out.println("Say hello!!!");
    }
    default void sayBye(){
        System.out.println("Bye");
    }
}

public class StaticClass implements A{

    static void sayHello(){
        System.out.println("Hello there..."); //the same static method is in the interface, but here it will not override
    }

    public static void main(String[] args) {
        StaticClass obj = new StaticClass();
        obj.sayBye();
        A.sayHello();
        sayHello();
    }

}
