package com.Java8Features;

import java.util.function.Function;

public class CheckPrimeNum {

    public static void main(String[] args) {
        Function<Integer, Boolean> isPrime = x -> {
            int count = 0;
            for (int i = 1; i <= x; i++) {
                if (x % i == 0) {
                    count++;
                }
            }
            return count == 2;
        };
        Boolean res = isPrime.apply(43);
        System.out.println(res);
    }
}
