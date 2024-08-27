package com.gentech.constructor;
class Itables {
    Itables(String Agencyname) {
        System.out.println("Agency Name : " + Agencyname);
    }
    Itables(double rate) {
        System.out.println("Rate : " + rate);
    }
    Itables(int Amount) {
        System.out.println("Total Amount : " + Amount);
    }
}
public class Invoice {
    public static void main(String [] args ) {
        Itables O1 = new Itables("KRIBHCO");
        Itables O2 = new Itables(13.50);
        Itables O3 = new Itables(25000);
    }
}
