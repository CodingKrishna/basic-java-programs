package com.LambdaFunctions;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces1 {

    public static void main(String[] args) {

        //Consumer Interface
        Consumer<Integer> mul = x -> {
            int z = x * x;
            System.out.println(z);
        };

        f1(mul);

        //Supplier Interface
        Supplier<String> fun1 = () -> "Hello World";
        String s = fun1.get();
        System.out.println(s);


        //Predicate Interface
        Predicate<Integer> marksTest = x -> x % 2 == 0;
        Boolean b = marksTest.test(567);
        System.out.println(b);
    }

    public static void f1(Consumer<Integer> fun){
        fun.accept(6);
    }

}
