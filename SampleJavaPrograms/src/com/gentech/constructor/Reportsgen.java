package com.gentech.constructor;
class Reports {
    Reports(String Title) {
        System.out.println("Title Name : " + Title);
        System.out.println("+++++++++++++++++++++++");
    }
    Reports(String Title, String Content ) {
        System.out.println("Title Name : " + Title);
        System.out.println("Content Name : " + Content);
        System.out.println("+++++++++++++++++++++++++++");
    }
    Reports(String Title, String Content, String Format) {
        System.out.println("Title Name : " + Title);
        System.out.println("Content Name : " + Content);
        System.out.println("Format name : " + Format);
    }
}
public class Reportsgen {
    public static void main(String [] args) {
        Reports R1 = new Reports("Monthly Inventory Details");
        Reports R2 = new Reports("Sales for the month June","Detailed Sales Report");
        Reports R3 = new Reports("Monthly Reports","Reports Summary","PDF");

    }
}
