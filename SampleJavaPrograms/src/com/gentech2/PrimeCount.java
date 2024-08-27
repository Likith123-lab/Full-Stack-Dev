package com.gentech2;
class Primenumber {
    boolean PrimeCount(int num) {
        if (num <=1) {
            return false;
        }
        for (int i=2;i<=Math.sqrt(num);i++) {
            if (num%i==0) {
                return false;
            }
        }
        return true;
    }
    void PrimeCount() {
        int count=0;
        System.out.print("Prime Number Between 50 and 150 :");
        for(int num = 50;num<=150;num++){
            if (PrimeCount(num)) {
                System.out.print(num + " ");
                count++;
            }
        }
        System.out.println("Count of Prime num Between 50 to 150 is :" + count);
    }
}
public class PrimeCount {
    public static void main (String [] args) {
        Primenumber o1 = new Primenumber();
        o1.PrimeCount();
    }
}
