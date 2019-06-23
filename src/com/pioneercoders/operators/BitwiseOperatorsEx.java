package com.pioneercoders.operators;

public class BitwiseOperatorsEx {
	public static void main(String[] args) {
		int a = 2, b = 5, and, or, xor, not;
		and = a & b;
		or = a | b;
		xor = a ^ b;
		not = ~b;
		System.out.println("AND Bitwise Operator Result is :" + and);
		System.out.println("OR Bitwise Operator Result is :" + or);
		System.out.println("XOR Bitwise Operator Result is :" + xor);
		System.out.println("NOT Bitwise Operator Result is :" + not);
	}
}
