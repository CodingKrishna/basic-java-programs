package com.LambdaFunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SquareAndPrintingUniqueNum {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(50);

        List<Integer> unique = list.stream().map(x -> x * x).filter(x -> checkDuplicates(list, x)).collect(Collectors.toList());
        unique.stream().forEach(x -> System.out.println(x));
    }


    private static boolean checkDuplicates(List<Integer> list, int x) {
        int count = 0;
        for (int y : list) {
            if (x == (y * y)) {
                count++;
            }
        }
        return count == 1;
    }
}
