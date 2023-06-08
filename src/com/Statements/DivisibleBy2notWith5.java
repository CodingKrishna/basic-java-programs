package com.Statements;

public class DivisibleBy2notWith5 {
    public static void main(String args[]) {
        int n = 14;
        if (n % 2 == 0 && n % 5 != 0) {
            System.out.println("Given number is divisible by 2 but not with 5.");
        } else {
            System.out.println("Given number is divisible by 2 or 5.");
        }
    }
}
