package com.gentech2;
class Givennum {
    void Tables(int num) {
        for (int i=1;i<=10;i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
public class TableDisplay {
    public static void main (String [] args) {
        Givennum o1 = new Givennum();
        o1.Tables(15);
    }
}
