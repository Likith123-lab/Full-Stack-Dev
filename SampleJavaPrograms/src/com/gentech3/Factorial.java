package com.gentech3;
class Factor {
    void Factornum (int num) {
        int factnum = num;
        int res = 1;
        while (num>0) {
            res*=num;
            num--;
        }
        System.out.println("Factorial num is :" + res);
    }
}
public class Factorial {
    public static void main (String [] args) {
        Factor o1 = new Factor();
        o1.Factornum(4);
    }
}
