package com.Functions;

public class ToUpperCaseFun {

    public static void main(String[] args) {

        String res = upperCase("Stranger");
        System.out.println(res);
    }

    public static String upperCase(String str) {

        String r = str.toUpperCase();
        return r;
    }
}
