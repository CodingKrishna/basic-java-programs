package com.Arrays;

public class ArrayOrderFIFO {

    int arr[] = new int[5];
    int cursor = -1;

    public int add(int a) {
        if (cursor < arr.length - 1) {
            cursor++;
            arr[cursor] = a;
        }
        return a;
    }

    public int[] remove() {
        int r = 0;
        int[] f = new int[arr.length];
        if (cursor >= 0) {
            r = arr[0];
            cursor++;
            f = copyArr(arr, cursor);
        }
        return f;
    }

    public static int[] copyArr(int[] arr, int cursor) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i + 1];
            System.out.println(arr[i]);
        }
        return arr;
    }

    public static void main(String[] args) {

        ArrayOrderFIFO ao1 = new ArrayOrderFIFO();

        int a1 = ao1.add(10);
        int a2 = ao1.add(30);
        int a3 = ao1.add(60);

        int a4 = ao1.add(80);
        int a5 = ao1.add(90);
        int[] r1 = ao1.remove();
//        System.out.println(a1);
//        System.out.println(a2);
//        System.out.println(a3);
//        for(int r: r1){
//            System.out.println(r);
//        }
    }
}
