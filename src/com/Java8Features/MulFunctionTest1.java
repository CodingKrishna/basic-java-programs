package com.Java8Features;

import java.util.function.Function;

public class MulFunctionTest1 {

    public static void main(String[] args) {

        Function<Integer, Integer> mul = x -> x * x;
        f1(mul);
    }

    static void f1(Function<Integer, Integer> fun) {

        int r1 = fun.apply(22);
        System.out.println(r1);
        int r2 = fun.apply(23);
        System.out.println(r2);

    }


}
