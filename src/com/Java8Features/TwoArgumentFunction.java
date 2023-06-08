package com.Java8Features;

import java.util.function.Function;

public class TwoArgumentFunction {

    public static void main(String[] args) {

        Function<String,String> toUpper = x -> x.toUpperCase();
        Function<Integer,Integer> mul = x -> x * x ;
        Function<Integer, Integer> mul1 = x -> {
                int z = x * x ;
                return z;
        };
        f1(toUpper, mul1);

    }

    static void f1(Function<String, String> toUpperFun, Function<Integer, Integer> mulFun){

        String r1 = toUpperFun.apply("Sai");
        System.out.println(r1);
        int r2 = mulFun.apply(15);
        System.out.println(r2);
    }

}
