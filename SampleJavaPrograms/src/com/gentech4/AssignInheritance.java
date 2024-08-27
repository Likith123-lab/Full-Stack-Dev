package com.gentech4;
class  Calculation1 {
    void Addition (int a , int b) {
        System.out.println("Addition Result : " + (a+b));
    }
}
class Calculation2 extends Calculation1 {
    void Subtraction (int a,int b) {
        System.out.println("Subtraction Result : " + (a-b));
    }
}
class Calculation3 extends Calculation2 {
    void Division (int a, int b) {
        System.out.println("Division Result : " + (a/b));
    }
}
public class AssignInheritance {
    public static void main (String [] args) {
        Calculation3 o1 = new Calculation3();
        o1.Addition(40,50);
        o1.Subtraction(50,30);
        o1.Division(20,5);
    }
}
