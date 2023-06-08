package com.Functions;


class Product1 {
    int id;
    String name;
    float price;
}

public class CallByReference {

    public static void main(String[] args) {
        Product1 pro = new Product1();
        pro.id = 12;
        pro.name = "Iphone";
        pro.price = 3.4f;
        printProduct(pro);
        changeProductValues(pro);
        printProduct(pro);
        makeProductNull(pro);
        printProduct(pro);
    }

    private static void printProduct(Product1 pro) {
        System.out.println("printProduct() -> " + pro.id + " " + pro.name + " " + pro.price);
    }

    private static void changeProductValues(Product1 pro) {
        pro.id = 14;
        pro.name = "Samsung";
        pro.price = 3000.50f;
    }

    private static void makeProductNull(Product1 pro) {
        pro = null;
    }
}

