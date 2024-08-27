package com.gentech.test;
class AreaCircle {
    static int rad=20;
    static double area () {
        int radiusSquare=rad*rad;
        double pi=3.14;
        double area = pi*radiusSquare;
        return area;
    }
}
public class Circle {
    public static void main (String [] args) {
        double res = AreaCircle.area();
        System.out.println(res);
    }
}
