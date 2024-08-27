package com.gentech.test;
class Arearect {
    static int length = 12;
    static int breadth = 15;
    static int area() {
        return length*breadth;
    }
}
public class test4 {
    public static void main(String [] args) {
        int res=Arearect.area();
        System.out.println(res);
    }
}
