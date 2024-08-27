package com.gentech2;
class DoubleArray {
    void SecondRow(Double [][] array) {
        int Row=1;
        Double sum=0.0;
        for(int j =0; j<array[Row].length;j++) {
            sum+=array[Row] [j];
        }
        System.out.println("Second Row Elements : " + sum);
    }
}
public class SeconRow {
    public static void main(String [] args) {
        Double[][] array = {{1.1,2.2,3.3},{4.4,5.5,6.6},{7.7,8.8,9.9}};
        DoubleArray o1=new DoubleArray();
        o1.SecondRow(array);
    }
}
