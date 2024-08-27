package com.gentech4;
class Random1 {
    void Subtract(int a,int b) {
        System.out.println("Subtract Result : " + (a-b));
    }
}
class Random2 extends Random1 {
    void Multiply(int a,int b) {
        System.out.println("Multiply Result : " + (a*b));
    }
}
class Random3 extends Random1 {
    void Division (int a, int b) {
        System.out.println("Division Result : " + (a/b));
    }
}
public class HirarchialInheritance {
    public static void main(String [] args) {
        Random2 O1 = new Random2();
        O1.Subtract(50,40);
        O1.Multiply(30,4);
        O1.Multiply(21,31);
        System.out.println("+++++++++++++++");
        Random3 O2 = new Random3();
        O2.Division(60,30);
        O2.Subtract(60,30);
        O2.Division(100,50);
    }
}
