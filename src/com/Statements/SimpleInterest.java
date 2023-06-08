package com.Statements;

public class SimpleInterest {

    public static void main(String[] args) {

        //Simple Interest = (P × R × T)/100
        //where P = Principal Amount, R = Rate per Annum, T = Time (years)

        int principleAmount = 40000;
        float rate =2;
        float time =5;
        float SI = principleAmount * rate * time/100 ;

        System.out.println("Simple Interest is " + SI);


    }

}
