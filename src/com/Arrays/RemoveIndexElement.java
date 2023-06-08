package com.Arrays;

public class RemoveIndexElement {

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60};
        int arr2[] = deleteAndCopyArr(arr, 1);
        display(arr2);
    }


    public static void display(int[] arr) {
        for (int x : arr) {
            System.out.println(x);
        }
    }

    public static int[] deleteAndCopyArr(int[] arr, int indexToRemove) {
        int newArr[] = new int[arr.length - 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == indexToRemove) {
                continue;
            } else {
                newArr[index] = arr[i];
                index++;
            }
        }
        return newArr;
    }
}