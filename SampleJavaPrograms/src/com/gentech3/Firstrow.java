package com.gentech3;
class Rowelements {
    void displayrow(int [][] array) {
        int row = array[0].length;
        for (int j=0;j<row;j++) {
            System.out.print(array[0][j] + " ");

        }
        System.out.println();
    }
}
public class Firstrow {
    public static void main (String [] args) {
        int [][] array = {{1,2,3},{4,5,6},{7,8,9}};
        Rowelements o1 = new Rowelements();
        o1.displayrow(array);
    }
}
