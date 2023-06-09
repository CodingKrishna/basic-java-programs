package com.Arrays;

public class PrimeNumPrint {

    public static boolean isPrime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count == 2;
    }

    public static int[] getPrime(int[] arr) {
        int outArr[] = new int[arr.length];
        int i = 0;
        for (int index = 0; index < arr.length; index++) {
            int x = arr[index];
            boolean isP = isPrime(x);
            if (isP) {
                outArr[i] = x;
                i++;
            }
        }
        return outArr;
    }

    public static void main(String[] args) {
        boolean result = isPrime(23);
        System.out.println(result);
        int arrNum[] = {56, 12, 67, 33, 12, 14, 2};

        int[] result1 = getPrime(arrNum);
        for (int x : result1) {
            System.out.println(x);
        }
    }
}
