package com.gentech.test;
class OneByteArray{
    byte[] arrElements(){
        byte[] arr = {10,20,30,40,50};
        return arr;
    }
}
public class test8 {
    public static void main(String [] args) {
        OneByteArray obj = new OneByteArray();
        byte[] res = obj.arrElements();
        for(byte element:res){
            System.out.println(element);
        }
    }
}
