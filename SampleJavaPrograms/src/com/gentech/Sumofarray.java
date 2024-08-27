package com.gentech;

import java.lang.reflect.Array;

class Arraysum {
    void Sumarray(int [] array) {
        int sum=0;
        for (int i=0;i<array.length;i++) {
            sum += array [i];
        }
        System.out.println("Summ Array :" + sum);
    }
}
public class Sumofarray {
    public static void main(String [] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10};
        Arraysum o1 = new Arraysum();
        o1.Sumarray(array);
    }
}
