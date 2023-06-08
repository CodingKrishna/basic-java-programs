package com.LambdaFunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LambdaFunctionsTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(7);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Mul of number itself in list : ");
        list.stream().forEach(x -> {
            int z = x * x;
            System.out.println(z);
        });
        System.out.println("Mapping Mul of number with itself in list  : ");
        list.stream().map(x -> x * x).forEach(x -> System.out.println(x));

        System.out.println("Filtering Mul of number and printing above 150  : ");
        list.stream().map(x -> x * x).filter(x -> x > 150).forEach(x -> System.out.println(x));

        System.out.println("Printing ever numbers between 1 to 10 using IntStream : ");
        IntStream.range(1, 10).filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));

        System.out.println("Printing ever numbers in an array using IntStream : ");
        int arr[] = new int[]{45, 23, 7, 983, 26};
        IntStream.range(0, arr.length).filter(index -> arr[index] % 2 == 0).forEach(x -> System.out.println(arr[x]));

        System.out.println("Printing array using functional interfaces :");
        //Function<Integer,Boolean> fun = ListTest1::isEven;
        List<Integer> lis = list.stream().filter(LambdaFunctionsTest:: isEven).collect(Collectors.toList());
        System.out.println(lis);

        System.out.println("Printing table using intStream");
        int n =5;
        IntStream.range(1, 11).map(i-> i*n).forEach(x -> System.out.println(x));
    };

    public static boolean isEven(int x)  {
        return x%2 ==0;
    }
}
