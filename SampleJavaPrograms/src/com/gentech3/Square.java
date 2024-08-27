package com.gentech3;
class Squarearray {
    void Squarenum(int [] array) {
        for(int i=0;i<array.length;i++) {
            int Square = array[i] * array[i];
            System.out.println(array[i] + " " + Square);
        }
    }
}
public class Square {
    public static void main (String [] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        Squarearray o1=new Squarearray();
        o1.Squarenum(numbers);
    }
}
