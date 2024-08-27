package com.gentech.test;
class Laptopbrnd {
    static String LaptopName() {
        String LaptopName1="HP";
    return LaptopName1;
    }
}
public class laptop {
    public static void main (String [] args) {
        String res = Laptopbrnd.LaptopName();
        System.out.println(res);
    }
}
