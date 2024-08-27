package com.gentech;
class DivbySix {
    void Div() {
        int count=0;
        for(int i=50;i<=150;i++) {
            if(i%6==0)
                count++;
        }
        System.out.println("Count is :" +count);
    }
}
public class Test2 {
    public static void main(String [] args) {
        DivbySix o1 = new DivbySix();
        o1.Div();
    }
}
