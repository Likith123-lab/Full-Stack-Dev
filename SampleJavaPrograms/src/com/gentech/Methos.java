package com.gentech;
class Sum {
    int sum=0;
    void add() {
        for(int i=1;i<=50;i++) {
            sum+=i;
        }
        System.out.println("Sum Number Between 1 to 50 :" +sum);
    }
}
public class Methos {
    public static void main(String [] args) {
        Sum o1=new Sum();
        o1.add();
    }
}
