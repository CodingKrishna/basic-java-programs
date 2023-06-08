package com.Arrays;

public class CompareStrings {

    public static void main(String[] args) {

        String s1 = "Sai";
        String s2 = "Sai";

        String s3 = new String("Sai");

        if (s1 == s2) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        if (s1.equals(s3)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

    }
}
