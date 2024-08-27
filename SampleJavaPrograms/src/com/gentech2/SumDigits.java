package com.gentech2;
class DigitSum {
    void sumofdigits(int num) {
        int sum = 0;
        while (num !=0) {
            int digit = num % 10;
            sum +=digit;
            num = num/10;
        }
        System.out.println("Sum of Digits : " + sum);
    }
}
public class SumDigits {
    public static void main (String [] args ) {
        int num = 34567;
        DigitSum o1 = new DigitSum();
        o1.sumofdigits(num);
    }
}
