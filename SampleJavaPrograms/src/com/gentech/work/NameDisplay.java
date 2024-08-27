package com.gentech.work;

class Name {
    public String NameDisplay (String Name) {
        String Myname=Name;
        return Myname;
    }
}

public class NameDisplay {
    public static void main (String [] args) {
        Name o1 = new Name();
        String res=o1.NameDisplay("Likith");
        System.out.print(res);
    }
}

