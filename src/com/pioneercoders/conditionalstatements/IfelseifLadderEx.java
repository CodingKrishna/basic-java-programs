package com.pioneercoders.conditionalstatements;

public class IfelseifLadderEx {
	public static void main(String[] args) {
		System.out.println("Assume 3 different numbers:");
		int k = 10, l = -5, m = 11;
		System.out.println(k + " " + l + " " + m);
		if (k > l && k > m) {
			System.out.println(k + " " + "is" + "highest value");
		} else if (l > m && l > k) {
			System.out.println(l + " " + "is" + "highest value");
		} else if (m > k && m > l) {
			System.out.println(m + " " + "is" + "highest value");
		} else {
			System.out.println("enter properly");
		}
	}
}
