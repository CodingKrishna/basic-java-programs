package com.Loops;

import java.util.Scanner;

public class PatternSeries {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the N value for the series : ");
            int N = scanner.nextInt();

            int baseValue = 3;
            int result = 0;
            for(int i=0;i<N;i++){
                result = result + baseValue * (int)Math.pow(10, i);
                System.out.print(result+" ");
            }

            System.out.print("\nUsing String approach: ");
            //Alternate approach
            String s = "";
            for(int i=0;i<N;i++){
                s += "3";
                System.out.print(s+" ");
            }

            scanner.close();
        }
    }


