package com.Arrays;

public class FindMissingNum {
    public static void main(String[] args) {
        int array[] = {2, 4, 1, 6, 3};
        int n = array.length;

        //calculate the sum of array
        int arraySum = 0;
        for (int v : array)
            arraySum += v;

        //array length is 8
        //one no is missing, then n should be n+1
        // here 8+1
        n = n + 1;

        //this calculates the sum from 1 to (n).
        //1+2+3+....n
        int expectedSum = (n * (n + 1)) / 2;

        System.out.println("The Given Array is : ");
        for (int v : array)
            System.out.print(v + " ");

        int missingNo = expectedSum - arraySum;
        System.out.println("\nMissing Number is : " + missingNo);
    }
}
