package com.Loops;

import java.util.Scanner;

public class ArithmeticProgression {

    public static void main(String[] args) {
        int a;
        int d;
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start value if the series : ");
        a = sc.nextInt();
        System.out.println("Enter the common ratio : ");
        d = sc.nextInt();
        System.out.println("Enter the value (N) for the series");
        N = sc.nextInt();

        System.out.print(a+ " ");
        for (int i = 1; i <= N; i++) {
            a = a + d;
            System.out.print(a + " ");
        }
        sc.close();
    }
}
