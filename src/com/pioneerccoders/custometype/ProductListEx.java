package com.pioneerccoders.custometype;

import java.util.Scanner;

public class ProductListEx {

	public static void main(String[] args) {
		Product products[] = new Product[2];
		// create first product
		Product pro = new Product();
		pro.id = 2;
		pro.name = "Nokia 6";
		pro.price = 7000.50f;

		Product pro1 = new Product();
		pro1.id = 4;
		pro1.name = "Samsung";
		pro1.price = 9000.50f;

		products[0] = pro; // assign product to array zero location
		products[1] = pro1; // assign product to array first location

		printProducts(products);

		products = getProducts();
		printProducts(products);
	}

	private static Product[] getProducts() {
		Product products[] = new Product[2];
		Scanner scaner = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			System.out.println("Enter product Id:");
			int productId = scaner.nextInt();
			System.out.println("Enter product Name:");
			String productName = scaner.next();
			System.out.println("Enter product Price:");
			float productPrice = scaner.nextFloat();
			Product pro = new Product();
			pro.id = productId;
			pro.name = productName;
			pro.price = productPrice;
			products[i] = pro;
		}
		scaner.close();
		return products;
	}

	private static void printProducts(Product[] products) {
		for (int index = 0; index < products.length; index++) {
			System.out.println(products[index].id + " " + products[index].name + " " + products[index].price);
		}
	}

}
