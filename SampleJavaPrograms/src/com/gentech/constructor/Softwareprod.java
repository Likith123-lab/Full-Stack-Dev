package com.gentech.constructor;
class Product {
    Product (String name) {
        System.out.println("Software Name : " + name);
    }
    Product (double Version) {
        System.out.println("Version is : " + Version);
    }
    Product(int Price) {
        System.out.println("Total Amount : " + Price);
    }
}
public class Softwareprod {
    public static void main (String [] args) {
        Product P1 = new Product("Adobe PhotoShop");
        Product P2 = new Product(6.7);
        Product P3 = new Product(7000);
    }
}
