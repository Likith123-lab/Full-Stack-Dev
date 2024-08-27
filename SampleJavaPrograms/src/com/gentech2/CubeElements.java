package com.gentech2;
class CubeArray {
    void CubeElements(int [] array) {
        for (int i=0;i<array.length;i++) {
            int cube = array[i] * array[i] * array[i];
            System.out.println(array[i] + "   " + cube);
        }
    }
}
public class CubeElements {
    public static void main (String [] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        CubeArray o1 = new CubeArray();
        o1.CubeElements(numbers);
    }
}
