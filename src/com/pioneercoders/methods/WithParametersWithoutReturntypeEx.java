package com.pioneercoders.methods;

public class WithParametersWithoutReturntypeEx {
	public static void main(String[] args) { // does not get anything as return
		add(3, 7); // call for add function
		sub(18, 9); // call for sub function
		mul(2, 9); // call for mul function
		div(15, 4); // call for div function
		mod(9, 3); // call for mod function
	}

	static void add(int a, int b) { // code for addition
		int add = a + b;
		System.out.println("Addition is:" + add); // the output value print here only i.e doesn't return anything
	}

	static void sub(int a, int b) { // code for subtraction
		int sub = a - b;
		System.out.println("Subtraction is:" + sub); // doesn't return anything
	}

	static void mul(int a, int b) { // code for multiplication
		int mul = a * b;
		System.out.println("Multiplication is:" + mul); // doesn't return anything
	}

	static void div(int a, int b) { // code for division
		int div = a / b;
		System.out.println("Division is:" + div); // doesn't return anything
	}

	static void mod(int a, int b) { // code for modular
		int mod = a % b;
		System.out.println("Modular division is:" + mod); // doesn't return anything
	}
}