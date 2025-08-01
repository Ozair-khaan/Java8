package com.javaEight.Optional;

import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
        Optional<String> name = getName(1);
        if (name.isPresent()){
            System.out.println(name.get());
        }

        name.ifPresent(System.out::println);

        String firstWay = name.isPresent() ? name.get() : "NA";
        String secondWay = name.orElse("NA"); //if any small op then use orElse otherwise use orElseGet()
        String useToThrowException = name.orElseThrow(NoSuchFieldError::new);
        System.out.println(firstWay);
        System.out.println(secondWay);
    }

    private static Optional<String> getName(int id){
        String name="Ozair";
        return Optional.ofNullable(name);  //can be null
    }
}
