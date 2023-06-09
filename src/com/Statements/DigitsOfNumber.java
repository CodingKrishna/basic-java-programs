package com.Statements;

import java.util.ArrayList;
import java.util.Scanner;

public class DigitsOfNumber {

    public static void main(String[] args) {

        ArrayList<Integer> digitList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any positive number : ");
        int num = sc.nextInt();

        while(num >0){                             // 525 >0 , 52 >0 , 0.2 >0
            int digit = num%10;                    // 525%10 = 5 , 52%10 = 2, 5%10 = 5
            digitList.add(0,digit);          // (0,5) , (1,2) , (2,5)
            num = num/10;                          // 525/10 , 52/10, 5/10
        }

        for(int digit : digitList){
            System.out.print(digit + " ");
        }

    }
}
