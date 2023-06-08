package com.Statements;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number :");

        int num = sc.nextInt();

        if (isNum(num)) {
            System.out.println("Given number " + num + " is perfect number");
        } else {
            System.out.println("Given number " + num + " is not a perfect number");
        }

    }

    private static boolean isNum(int num) {

        int tempNum = num;
        int divisorNum = 1;

        for (int i = 2; i <= num / 2; i++)
            if (num % i == 0)
                divisorNum += i;

        if (tempNum == divisorNum)
            return true;
        else return false;

        //statements - 15
        //loops - 9
        //functions - 8
        //strings - 5
        //arrays - 11

        //ALTER USER user_name IDENTIFIED BY new_password;
    }
}