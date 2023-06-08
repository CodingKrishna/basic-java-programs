package com.Statements;

public class LCM {
    public static void main(String[] args) {
        int a = 10;
        int b = 47;

        int lcm = (a < b) ? a : b;
        System.out.println(lcm); // 7

        while(true){
            if(lcm % a == 0 && lcm % b == 0){
                // 7 % 5 == 0 && 7 % 7 == 0    - both condition not satisfies
                // 35 % 5 == 0 && 35 % 7 == 0  - both condition satisfies
                System.out.println("LCM of "+a+" & "+b+" is "+lcm);
                break;
            }
            lcm++;
        }
    }
}
