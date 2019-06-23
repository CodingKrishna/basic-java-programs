package com.pioneercoders.loops;

public class ForLoopEx {
	public static void main(String[] args) {
		for (int i = 0; i <= 9; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " " + "is" + " " + "Even number");
			} else {
				System.out.println(i + " " + "is" + " " + "Odd number");
			}
		}

		System.out.println("The multiples of 4 are:");
		for (int i = 4; i <= 32; i = i + 4) {
			System.out.println(i);
		}
	}
}