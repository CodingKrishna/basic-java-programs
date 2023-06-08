package com.Functions;

public class RecursionFun {

    // Recursion is the technique of making a function call itself. This technique provides a way to break
    // complicated problems down into simple problems which are easier to solve.

    public static void printWithoutLoop(int n) {
        if (n <= 10) {
            System.out.print(n + " ");
            printWithoutLoop(n + 1);
        }
    }

    //Recursion Approach 1
    public static void main(String[] args) {
        printWithoutLoop(1);

        int res = sum(13);
        System.out.println(res);
    }

    //Recursion Approach 2
    public static int sum(int n) {
        if (n > 0) {
            return n + sum(n - 1);
        } else {
            return 0;
        }
    }
}
