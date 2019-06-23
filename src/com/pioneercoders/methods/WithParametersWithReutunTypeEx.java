package com.pioneercoders.methods;

public class WithParametersWithReutunTypeEx {
	public static void main(String[] args) {
		int add = add(9, 9); // call for methods
		int sub = sub(8, 3);
		int mul = mul(4, 4);
		int div = div(7, 3);
		int mod = mod(7, 3);
		System.out.println("Addition is:" + add); // printing output
		System.out.println("Subtraction is:" + sub);
		System.out.println("Multiplication is:" + mul);
		System.out.println("Division is:" + div);
		System.out.println("Modular division is:" + mod);
	}

	/**
	 * Addition method is used to add two values.
	 * @param a -- input value 
	 * @param b -- input value
	 * @return -- sum of the input variables.
	 */
	static int add(int a, int b) {
		int add = a + b;
		return add;
	}

	static int sub(int a, int b) {
		int sub = a - b;
		return sub;
	}

	static int mul(int a, int b) {
		int mul = a * b;
		return mul;
	}

	static int div(int a, int b) { // code for division
		int div = a / b;
		return div;
	}

	static int mod(int a, int b) { // code for modular
		int mod = a % b;
		return mod;
	}
}