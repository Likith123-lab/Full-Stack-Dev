package com.gentech;
class ReverseArray {
    void Reverse(String [] array) {
        for (int i=array.length-1;i>=0;i--) {
            System.out.println(array[i]);
        }
    }
}
public class oneDReverse {
    public static void main (String [] args) {
        String [] array = new String[]{"one","two","Three","four","five"};
        ReverseArray o1=new ReverseArray();
        o1.Reverse(array);
    }
}
