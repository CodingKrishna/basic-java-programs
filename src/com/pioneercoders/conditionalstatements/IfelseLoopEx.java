package com.pioneercoders.conditionalstatements;

public class IfelseLoopEx {
	public static void main(String[] args) {
		int marks, attendance;
		marks = 51;
		attendance = 74;
		if (marks > 35) {
			System.out.println("The student was Passed");
			if (attendance >= 75) {
				System.out.println("The student was Regular");
			} else {
				System.out.println("But the student was not Regular");
			}
		} else {
			System.out.println("The student was failed");
		}
	}
}