package com.Loops;

public class PascalTriangle {

    public static void main(String args[]){
        int r, i, k, number=1, j;
        r = 6;//storing the number of rows in r variable

        for(i=0;i<r;i++) {
            for(k=r; k>i; k--) {
                System.out.print(" ");//printing empty other than the elements in the triangle shape
            }
            number = 1;
            for(j=0;j<=i;j++) {
                System.out.print(number+ " ");
                number = number * (i - j) / (j + 1);//printing the elements based on considering the number of rows
            }
            System.out.println();
        }
    }
}
