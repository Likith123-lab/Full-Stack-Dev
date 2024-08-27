package com.gentech.test;
class SecTab{
    int sumsecondTable(){
        int sum=0;
        for(int i=1;i<=10;i++){
            sum+=2*i;
        }
        return sum;
    }
}
public class test7 {
    public static void main(String[] args) {
        SecTab obj = new SecTab();
        int res=obj.sumsecondTable();
        System.out.println(res);
    }
}
