package com.pioneercoders.methods;

public class ReturntypeEx {
	public static void main(String args[]) {
String names[]=	name();

	//System.out.println("fnames");
	}

	static String[] name() {
		String names[] = { "Siva", "Ram", "Krishna", "Ganesh" };
		for (int i = 0; i < names.length; i++) {
			String fnames = names[i];
			System.out.println(fnames);
		}
		return names;
		
	
	}
} 
