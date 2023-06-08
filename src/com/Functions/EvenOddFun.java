package com.Functions;

public class EvenOddFun {

    public static void main(String[] args) {

        Boolean res = isEven(54);
        System.out.println(res);
    }

    public static Boolean isEven(int x) {
        Boolean res = x % 2 == 0;
        return res;
    }
}
