package com.gentech3;
class OneintArray {
    void PrintFirsthalf(String [] Array) {
        int a = 0;
        for (int i=a;i<=Array.length/2;i++)
            System.out.println("First Half Elements : " + Array[i]);
    }
}
public class Firsthalf {
    public static void main (String [] args) {
        String [] Array = new String[] {"1","2","3","4","5","6","7","8","9","10"};
        OneintArray o1 = new OneintArray();
        o1.PrintFirsthalf(Array);
    }
}
