package com.gentech3;
class shortarray {
    void PrintSecondshort(short [] array) {
        for (int i=array.length/2;i<array.length;i++) {
            System.out.println("Second Short Elements :" + array[i]);
        }
    }
}
public class Secondshort {
    public static void main(String [] args) {
        shortarray o1 = new shortarray();
        short [] array=new short []{1,2,3,4,5,6};
        o1.PrintSecondshort(array);
    }
}
