package com.gentech.test;
class Logicoper {
    boolean logicalAnd(int x,int y) {
        if(x>=10&&y<50)
            return true;
        else
            return false;
    }
}
public class test6 {
    public static void main (String [] args) {
        int x =15;
        int y =22;
        Logicoper o1=new Logicoper();
        boolean res = o1.logicalAnd(x,y);
        System.out.println(res);
    }
}
