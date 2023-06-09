package com.Statements;

public class DivisibleBy3or7 {
    public static void main(String args[]) {
        int n = 14;
        if (n % 3 == 0 || n % 7 == 0) {
            System.out.println("Given number is divisible by 3 or 7.");
        } else {
            System.out.println("Given number is Not divisible by 3 or 7.");
        }
    }
}