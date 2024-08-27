package com.gentech2;
class Primenum {
    boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    void PrimeDisplay(int Maxnum) {
        for (int num = 2;num<=Maxnum;num++) {
            if(isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
public class PrimeDisplay {
    public static void main (String [] args) {
        Primenum o1=new Primenum();
        o1.PrimeDisplay(50);
    }
}
