package com.javaEight.thread;

public class MainThread {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        Thread thread = new Thread(myClass);
        thread.run();

        //using lambda
        Runnable runnable=()->{
            for(int i=1; i<=10; i++){
                System.out.println("hello from lambda :: "+i);
            }
        };
        Thread thread1 = new Thread(runnable);
        thread1.run();
    }
}
