package com.Loops;

public class IndividualDigitsSum {

    public static void main(String[] args) {

        int originalNumber = 3355678;
        int number = originalNumber;
        int digit;
        int sum = 0;
        while (number > 0) {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println(sum);
    }
}
