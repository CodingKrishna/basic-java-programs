package com.Java8Features;

import java.util.function.BiFunction;

public class BiFunctionTest {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> fun1 = f1();
        Integer r = fun1.apply(30, 40);
        System.out.println(r);
    }

    static BiFunction<Integer, Integer, Integer> f1() {
        BiFunction<Integer, Integer, Integer> mul = (x, y) -> x * y;
        return mul;
    }


}
