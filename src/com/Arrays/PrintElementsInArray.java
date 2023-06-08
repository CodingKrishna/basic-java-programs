package com.Arrays;

public class PrintElementsInArray {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {1, 2, 3, 4, 5};//initialization of elements in an array
        printArr(arr);
    }

    private static void printArr(int arr[]) {
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);//printing the array elements using for loop
        }
    }
}
