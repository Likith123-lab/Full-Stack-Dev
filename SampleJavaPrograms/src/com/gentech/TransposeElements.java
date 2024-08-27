package com.gentech;
class Transelements {
    void Transpose (int [][] Array) {
        int[][] Transpose = new int[Array[0].length][Array.length];
        for(int i=0;i<Array.length;i++) {
            for(int j=0;j<Array[i].length;j++) {
                Transpose[j][i] = Array[i][j];
            }
        }
        for (int i=0;i<Transpose.length;i++) {
            for (int j=0;j<Transpose[i].length;j++) {
                System.out.print(Transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
public class TransposeElements {
    public static void main(String [] args) {
        int[][] Array = {{1,2,3},{4,5,6},{7,8,9}};
        Transelements o1 = new Transelements();
        o1.Transpose(Array);
    }
}
