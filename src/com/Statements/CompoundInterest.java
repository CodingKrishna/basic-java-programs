package com.Statements;

public class CompoundInterest {

    public static void main(String[] args) {

        //Compound Interest = P(1 + R/100)^t

        int principleAmount = 20000;
        int time = 5;
        double rate = 0.08;
        int n =12;

        double amount = principleAmount * Math.pow(1+rate/n, n*time);
        double CInterest = amount - principleAmount;

        System.out.println("Amount after "+ time + " years is "+ amount);
        System.out.println("Compound Interest after "+ time + " years is "+ CInterest);

    }
}
