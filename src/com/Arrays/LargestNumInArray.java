package com.Arrays;

import java.util.Scanner;

public class LargestNumInArray {

    public static void main(String[] args) {
        int n, max;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        max = arr[0];
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Maximum value:" + max);
    }
}
