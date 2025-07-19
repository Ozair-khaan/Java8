package com.javaEight.anonymousInnerClass;

public class MainAnonymousImpl {
    int x=10;
    public static void main(String[] args) {
        Emp emp = new Emp()
                //this is anonymous inner class
                //can't use lambda because the interface have more than one abstract method
        {
            int x=5;
            @Override
            public String getSalary() {
                System.out.println(this.x);
                return "1000";
            }

            @Override
            public String getDesignation() {
                return "Software developer";
            }
        };
        System.out.println(emp.getSalary());
    }
}
