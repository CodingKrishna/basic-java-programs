package com.Java8Features;

import java.util.function.Function;

public class MulFunctionTest2 {

    public static void main(String[] args) {

        Function<Integer,Integer> mul = x -> x * x ;
        System.out.println(f1(mul));
    }

    static int f1(Function<Integer, Integer> fun){
        int r1 = fun.apply(11);
        return r1;
    }

}
