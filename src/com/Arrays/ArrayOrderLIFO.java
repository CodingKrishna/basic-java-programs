package com.Arrays;

public class ArrayOrderLIFO {

    //In Java, the Stack class is a subclass of the Vector class and represents a last-in-first-out (LIFO) stack of objects.
    //It extends the Vector class to allow for easy implementation of the stack data structure.
    //Stack extends Vector implements List extends Collection extends Iterable.

    int arr[] = new int[5];
    int cursor = -1;

    public int add(int a) {
        if (cursor < arr.length - 1) {   //
            cursor++;
            arr[cursor] = a;
        }
        return a;
    }

    public int remove() {
        int r = 0;
        if (cursor >= 0) {
            r = arr[cursor];
            cursor--;
        }
        return r;
    }

    public static void main(String[] args) {
        ArrayOrderLIFO ao1 = new ArrayOrderLIFO();

        int[] arr = new int[]{ao1.add(78), ao1.add(30), ao1.add(60), ao1.add(80), ao1.remove()};

        for (int data : arr) {
            System.out.println(data);
        }

    }

}
