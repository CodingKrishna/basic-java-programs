package com.pioneercoders.methods;

public class ReturnfloatEx {
	public static void main(String[] args) {
		float area = areaOfCircle(3);
		System.out.println(area);
	}

	static float areaOfCircle(int r) {
		float area = 3.14f * r * r;
		return area;
	}
}