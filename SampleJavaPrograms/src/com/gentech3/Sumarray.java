package com.gentech3;
class Arraysum {
    void sumofarray(int [] array) {
        int sum = 0;
        for(int i=0;i<array.length;i++) {
            sum +=array[i];
        }
        System.out.println("Sum of elements :" + sum);
    }
}
public class Sumarray {
    public static void main (String [] args) {
        Arraysum o1 = new Arraysum();
        int [] array = {10,20,30,40,50,60,70};
        o1.sumofarray(array);
    }
}
