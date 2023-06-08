package com.Java8Features;

import java.util.function.Function;

public class SumOfNum {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 190};
        Integer r1 = sum(arr, x -> x);
        System.out.println("Sum of Numbers is " + r1);

    }

    public static int sum(int arr[], Function<Integer, Integer> fun) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + fun.apply(arr[i]);
        }
        return sum;
    }

}
