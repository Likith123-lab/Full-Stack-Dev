package com.gentech3;
class tablenum {
    void displaytable(int num) {
        for (int i=1;i<=10;i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
public class tablegiven {
    public static void main (String [] args) {
        tablenum o1 = new tablenum();
        o1.displaytable(12);
    }
}
