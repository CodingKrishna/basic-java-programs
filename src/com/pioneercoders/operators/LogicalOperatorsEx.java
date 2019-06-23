package com.pioneercoders.operators;

public class LogicalOperatorsEx {
	public static void main(String[] args) {
		int a = 5, b = 9, c = 4;
		if (a < b || a < c) { // Logical OR Operator ||
			System.out.println("True");
		} else
			System.out.println("False");
		if (a < b && a > b) { // Logical AND Operator &&
			System.out.println("True");
		} else
			System.out.println("False");
		System.out.println(!(b > a && b < c)); // Logical Not Operator !()
	}
}
