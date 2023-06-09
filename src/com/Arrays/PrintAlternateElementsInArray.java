package com.Arrays;

import java.util.Scanner;

public class PrintAlternateElementsInArray {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] = createArr();
        printArr(arr);
    }

    public static int[] createArr() {
        int i, count;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Length of Array: ");
        count = scan.nextInt();//stores the length of the array in count variable
        int a[] = new int[count];
        for (i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            a[i] = scan.nextInt();//entered elements are stored in an array
        }
        scan.close();//object closing

        System.out.print("\nOriginal array is :\t");
        for (i = 0; i < count; i++)
            System.out.print(a[i] + "\t");//printing the original array

        return a;
    }

    public static void printArr(int arr[]) {
        System.out.print("\n\nAlternate elements :\t");
        for (int i = 0; i < arr.length; i = i + 2)
            System.out.print(arr[i] + "\t");//printing the alternate elements in an array
    }

}
