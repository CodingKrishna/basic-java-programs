package com.Arrays;

public class MoveAllZeroesToEnd {

    public static void main(String[] args) {
        int array[] = {1, 0, 4, 3, 0, 0, 2, 0, 1, 0};
        System.out.println("The Given Array is :: ");
        for (int v : array)
            System.out.print(v + " ");

        int count = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] != 0)
                array[count++] = array[i];

        while (count < array.length)
            array[count++] = 0;

        System.out.println("\nAfter moving all zeros to end of array :: ");
        for (int v : array)
            System.out.print(v + " ");

    }
}
