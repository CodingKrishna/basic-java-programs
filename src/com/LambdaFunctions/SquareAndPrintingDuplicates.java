package com.LambdaFunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SquareAndPrintingDuplicates {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(50);

        List<Integer> newList = new ArrayList<>();
        list.stream().map(x -> x * x).filter(x -> {
                    if (!newList.contains(x)) {
                        newList.add(x);
                        return true;
                    }
                    return false;
                }
        ).collect(Collectors.toList());

        for (int lis : newList) {
            System.out.println(lis);
        }
    }
}
