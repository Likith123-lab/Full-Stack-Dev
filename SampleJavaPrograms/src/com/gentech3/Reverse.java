package com.gentech3;
class Reverseorder {
    void PrintReverse (int [] array) {
        for(int i=array.length-1;i>=0;i--) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
}
public class Reverse {
    public static void main (String [] args) {
        int [] array = {1,2,3,4,5,6,7,8,9};
        Reverseorder o1 = new Reverseorder();
        o1.PrintReverse(array);
    }
}