package com.Functions;

public class CallByValue {

    public static void main(String[] args) {

        int age = 24;
        System.out.println(age);
        changeAge(87);
    }

    public static void changeAge(int age) {
        System.out.println(age);
    }
}
