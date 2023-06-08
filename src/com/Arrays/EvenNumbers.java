package com.Arrays;

public class EvenNumbers {

    public static boolean isEven(int n) {

        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    public static int[] getEven(int[] arr) {
        int outArr[] = new int[arr.length];
        int i = 0;
        for (int index = 0; index < arr.length; index++) {
            int x = arr[index];

            boolean isEv = isEven(x);

            if (isEv) {
                outArr[i] = x;
                i++;
            }

        }
        return outArr;
    }

    public static void main(String[] args) {
        boolean result = isEven(47);
        System.out.println(result);

        int arrNum[] = {56, 12, 67, 33, 12, 14, 2};

        int[] result1 = getEven(arrNum);
        for (int res : result1) {
            System.out.println(res);
        }


    }
}
