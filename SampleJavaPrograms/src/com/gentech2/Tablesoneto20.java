package com.gentech2;
class table {
    void tableonetotwenty () {
        for (int i=1;i<20;i++) {
            System.out.println("Multipication table of :" + i + ":");
            for (int j=1;j<=10;j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
        System.out.println();
    }
}
public class Tablesoneto20 {
    public static void main ( String [] args) {
        table o1 = new table();
        o1.tableonetotwenty();
    }
}
