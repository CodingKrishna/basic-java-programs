package com.Arrays;

public class NonDuplicates {
    public static void main(String[] args) {
        int arr[] = {5, 5, 6, 7, 7, 8, 9, 10, 11, 12, 12};
        int arr1[] = getAllUniElements(arr);
        display(arr1);
    }

    private static int[] getAllUniElements(int[] arr) {
        int index = 0;
        int uniArr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            boolean isUplicatePresent = isElementPresent(uniArr, arr[i]);
            if (!isUplicatePresent) {
                uniArr[index] = arr[i];
                index++;
            }
        }
        return uniArr;
    }

    private static boolean isDuplicateElement(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count > 1;
    }

    private static boolean isElementPresent(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return true;
            }
        }
        return false;
    }

    private static void display(int[] arr) {
        for (int results : arr) {
            System.out.println(results);
        }
    }


}
