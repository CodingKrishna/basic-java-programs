package com.Java8Features;

import java.util.function.Function;

public class SumOfOddNum {

    public static void main(String[] args) {

        int arr[] = {2,3,4,5,6,7,8,9,10,11,12};

        Function<Integer, Integer> f1 = x-> x%2!=0 ? x : 0;
        Integer res = sum(arr, f1);
        System.out.println(res);

    }

    public static int sum(int arr[], Function<Integer, Integer> fun){
        int sum =0;
        for(int i=0; i< arr.length; i++){
            sum =sum + fun.apply(arr[i]);
        }
        return sum;
    }


}
