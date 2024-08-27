package com.gentech.test;
class OneDarray {
static boolean [] arrayElements() {
boolean [] array = {true,false,false,true,true,false};
return array;
}
}
public class test1 {
public static void main (String [] args) {
boolean[]res = OneDarray.arrayElements();
for(boolean elements:res) {
    System.out.println(elements);
}
}
}
