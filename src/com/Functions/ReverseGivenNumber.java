package com.Functions;

import java.util.Scanner;

public class ReverseGivenNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverse(n));
    }

    private static int reverse(int n) {
        int reverse = 0;
        while (n > 0) {
            int last_digit = n % 10;
            reverse = reverse * 10 + last_digit;
            n = n / 10;
        }
        return reverse;
    }
}