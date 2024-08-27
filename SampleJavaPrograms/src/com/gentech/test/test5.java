package com.gentech.test;
class vote {
    static String elgevote() {
        int age = 22;
        String res = "";
        if(age>=18)
            return "Eligible for vote";
        else
            return "Elegible to not vote";
    }
}
public class test5 {
    public static void main (String [] args) {
        String res = vote.elgevote();
        System.out.println(res);
    }
}
