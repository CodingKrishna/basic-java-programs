package com.Functions;

import java.util.Scanner;

class Product {
    int id;
    String name;
    float price;
}

public class ProductList {
    public static void main(String[] args) {
        Product products[] = new Product[2];
        Product p1 = new Product();
        p1.id = 1;
        p1.name = "Iphone";
        p1.price = 45000.0f;

        Product p2 = new Product();
        p2.id = 2;
        p2.name = "Samsung";
        p2.price = 70000.0f;

        products[0] = p1;
        products[1] = p2;

        printProducts(products);
        products = getProducts();
        printProducts(products);

    }

    private static Product[] getProducts() {

        Product products[] = new Product[2];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter the product id : ");
            int productId = sc.nextInt();
            System.out.println("Enter the product name : ");
            String productName = sc.next();
            System.out.println("Enter the product price : ");
            float productPrice = sc.nextFloat();

            Product pro = new Product();
            pro.id = productId;
            pro.name = productName;
            pro.price = productPrice;
            products[i] = pro;

        }
        sc.close();
        return products;
    }

    private static void printProducts(Product[] products) {

        for (int index = 0; index < products.length; index++) {
            System.out.println(products[index].id + " " + products[index].name + " " + products[index].price);
        }

    }


}
