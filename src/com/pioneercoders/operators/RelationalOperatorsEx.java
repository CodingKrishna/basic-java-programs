package com.pioneercoders.operators;

public class RelationalOperatorsEx {
	public static void main(String[] args) {
		int x = 10, y = 6, p = 2, q = 8, k = 12, l = 12;
		if (x < y) { // less than operator
			System.out.println("True");
		} else
			System.out.println("False");
		if (p > q) { // greater than operator
			System.out.println("False");
		} else
			System.out.println("True");
		if (k >= l) { // greater than or equal to than operator
			System.out.println("True");
		} else
			System.out.println("False");
		if (l <= k) { // less than or equal to than operator
			System.out.println("True");
		} else
			System.out.println("False");
		if (k == l) { // comparision operator
			System.out.println("True");
		} else
			System.out.println("False");
	}
}
