package com.gentech;
class OneDArray {
    void PrintSecondhalf(String[] Array) {
        int a = Array.length / 2;
        for (int i = a; i < Array.length; i++) {
            System.out.println("Second Elements : " + Array[i]);
        }
    }
}
public class Secondhalf {
    public static void main(String [] args) {
        String [] Array = new String[] {"1","2","3","4","5","6","7","8","9","10"};
        OneDArray o1 = new OneDArray();
        o1.PrintSecondhalf(Array);
    }
}
