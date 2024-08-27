package com.gentech4;
class Read1 {
    void Addition (int a, int b) {
        System.out.println("Addition Result : " + (a+b));
    }
}
class Read2 extends Read1 {
    void Subtract (int a,int b) {
        System.out.println("Subtract Result : " + (a-b));
    }
}
class Read3 extends Read1 {
    void Multiply(int a, int b) {
        System.out.println("Multiply Result : " + (a*b));
    }
}
class Read4 extends Read3 {
    void Division (int a,int b) {
        System.out.println("Division Result : " + (a/b));
    }
}
public class Hybrid {
    public static void main (String [] args) {
        Read2 o1 = new Read2();
        o1.Addition(20,50);
        o1.Subtract(100,50);
        System.out.println("+++++++++++++++++++++");
        Read4 o2 = new Read4();
        o2.Multiply(20,30);
        o2.Division(40,20);
    }
}
