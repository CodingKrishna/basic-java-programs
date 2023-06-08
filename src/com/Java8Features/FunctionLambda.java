package com.Java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionLambda {


    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();

        myList.add(45);
        myList.add(34);
        myList.add(23);

        Function<Integer, Void> displayFun = x -> {
            System.out.println(x);
            return null;
        };
        myList.stream().forEach(x -> System.out.println(x));

    }

}
