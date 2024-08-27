package com.gentech;
class BooleanOne {
    void BooleanArray(Boolean [] Array) {
        for (int i=Array.length-1;i>=0;i--) {
            System.out.print(Array[i] + " ");
        }
        System.out.println();
    }
}
public class Booleanreverse {
    public static void main (String [] args) {
        Boolean [] Array = {true,false,true,true,false};
        BooleanOne o1 = new BooleanOne();
        o1.BooleanArray(Array);
    }
}
