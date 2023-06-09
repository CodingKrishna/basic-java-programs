package com.Functions;

import java.util.Scanner;

public class SimpleCalculator {

    static float sum(float a, float b) {
        float s = a + b;
        return s;
    }

    static float sb(float a, float b) {
        float s = a - b;
        return s;
    }

    static float pro(float a, float b) {
        float p = a * b;
        return p;
    }

    static float div(float a, float b) {
        return a / b;
    }

    static float sqrt(float a) {
        return (float) Math.sqrt(a);
    }

    public static void main(String[] args) {
        System.out.println("ENTER THE OPERATION");
        System.out.println("1. SUM\n2. MINUS\n3. PRODUCT\n4. DIVISION\n5. SQUARE_ROOT\n");
        System.out.println("Nth UNDER_ROOT");
        System.out.println("ENTER YOUR CHOICE");
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        SimpleCalculator cc = new SimpleCalculator();
        switch (c) {
            case 1:
                System.out.println("ENTER THE TWO NUMBERS TO BE ADDED");
                float a1 = in.nextFloat();
                float a2 = in.nextFloat();
                double ss = cc.sum(a1, a2);
                System.out.println(ss);
                break;
            case 2:
                System.out.println("ENTER THE TWO NUMBERS TO BE SUBSTRACTED");
                float s1 = in.nextFloat();
                float s2 = in.nextFloat();
                double su = cc.sb(s1, s2);
                System.out.println(su);
                break;
            case 3:
                System.out.println("ENTER THE TWO NUMBERS TO BE MULTIPLIED");
                float m1 = in.nextFloat();
                float m2 = in.nextFloat();
                double mm = cc.pro(m1, m2);
                System.out.println(mm);
                break;
            case 4:
                System.out.println("ENTER THE TWO NUMBERS TO BE DIVIED");
                float d1 = in.nextFloat();
                float d2 = in.nextFloat();
                double dd = cc.div(d1, d2);
                System.out.println(dd);
                break;
            case 5:
                System.out.println("ENTER THE  NUMBER WHOSE SQUARE ROOT TO BE CALCULATED");
                float r = in.nextFloat();
                double sr = cc.sqrt(r);
                System.out.println(sr);
                break;
            default:
                System.out.println("WARNING !ENTER CORRECT CHOICE");
                break;

        }
    }
}
