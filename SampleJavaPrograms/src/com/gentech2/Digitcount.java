package com.gentech2;
class Digitcountmain {
    void Intgercount(int num) {
        int count = 0;
        while(num !=0) {
            num = num/10;
            count++;
        }
        System.out.println("Count of Digits :" + count);
    }
}
public class Digitcount {
    public static void main (String [] args) {
        int number = 56789;
        Digitcountmain o1 = new Digitcountmain();
        o1.Intgercount(number);
    }
}
