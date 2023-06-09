package com.Loops;

public class ArmStrong {

    public static void main(String[] args) {

        int originalNumber = 371;
        int number = originalNumber;
        int remainder;
        int result =0;

        while(number !=0){
            remainder = number%10;
            result += Math.pow(remainder, 3);
            number = number/10;
        }

        if(result == originalNumber){
            System.out.println(originalNumber+" is Arm Strong Number");
        }
        else{
            System.out.println(originalNumber+" is not a Arm Strong Number");
        }
    }

}
