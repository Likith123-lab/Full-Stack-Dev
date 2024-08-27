package com.gentech3;
class table {
    void seventhtable (int num) {
        for (int i=10;i>=1;i--) {
            System.out.println("7 * " +i+" = "+(7*i));
        }
    }
}

public class TableReverse {
    public static void main(String [] args ) {
        table o1 = new table();
        o1.seventhtable(7);
    }
}
