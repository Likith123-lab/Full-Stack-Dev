package com.gentech3;
class Concatenation{
    void ConcatenateString(String [] array) {
        String res = " ";
        for (int i=0;i<array.length;i++) {
            res+=array[i];
        }
        System.out.println("the Concatenated String :" +res);
    }
}
public class StringArray {
    public static void main (String [] args) {
        String [] name = {"one","two","Three","four"};
        Concatenation o1=new Concatenation();
        o1.ConcatenateString(name);
    }
}
