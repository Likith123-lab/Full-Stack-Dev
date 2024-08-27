package com.gentech3;
class DiagonalMatrix {
    void Diagonalelements(int [][] array) {
        for (int i=0;i<array.length;i++) {
            for(int j=0;j<array[i].length;j++) {
                if(i==j) {
                    System.out.println(array[i][j] + " ");
                }
            }
        }
    }
}
public class TwoMatrix {
    public static void main (String [] args) {
        int [][] matrix = {{10,20,30},{40,50,60},{70,80,90}};
        DiagonalMatrix o1 = new DiagonalMatrix();
        o1.Diagonalelements(matrix);
    }
}
