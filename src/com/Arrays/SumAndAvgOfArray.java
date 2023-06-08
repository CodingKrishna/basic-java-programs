package com.Arrays;

import java.util.Scanner;

public class SumAndAvgOfArray {

    public static void main(String[] args) {
        int n, sum = 0;
        float average;
        Scanner sr = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = sr.nextInt();//storing the elemnts in 'n' varaible
        int arr[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++)//displaying all elements in an array
        {
            arr[i] = sr.nextInt();
            sum = sum + arr[i];//adding one by one element and storing in a sum varaible
        }
        System.out.println("Sum:" + sum);
        average = (float) sum / n;//calculation average of given numbers in an aray
        System.out.println("Average:" + average);//printing the average value
    }
}
