package com.Statements;

public class DivisibleBy2and3 {
    public static void main(String args[]) {
        int n = 5;
        if (n % 2 == 0 && n % 3 == 0) {
            System.out.println("Given number is divisible by 2 and 3.");
        } else {
            System.out.println("Given number is Not divisible by 2 and 3.");
        }
    }
}
