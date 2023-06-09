package com.Arrays;

public class IncreaseArraySize {

    public static void main(String[] args) {
        int arr[] = new int[5];
        int index = 0;
        for (int i = 0; i < 30; i++) {
            if (index == arr.length - 1) {
                arr = createAndCopyArr(arr, 5);
            }

            arr[index] = i;
            index++;
        }
        display(arr);
    }

    private static void display(int[] arr) {
        for (int x : arr) {
            System.out.println(x);
        }
    }

    public static int[] createAndCopyArr(int[] arr, int z) {
        int newArr[] = new int[arr.length + z];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
