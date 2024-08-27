package com.gentech.work;
class Students2 {
    String StudentName;
    int StudendId;
    String StudentCity;

    public Students2(String Sn, int si, String sc) {
        StudentName = Sn;
        StudendId = si;
        StudentCity = sc;
        System.out.println("Student Name : " + StudentName);
        System.out.println("Student Id : " + StudendId);
        System.out.println("Student City : " + StudentCity);
        System.out.println("+++++++++++++++++++++++++++++++");
    }
}
class Library2 {
    String BookName;
    String AuthorName;

    public Library2(String bn, String an) {
        BookName = bn;
        AuthorName = an;
        System.out.println("Book Name : " +  BookName);
        System.out.println("Author Name : " + AuthorName);
        System.out.println("+++++++++++++++++++++++++++++++");
    }
}
class Sports2 {
    String SportsName;
    int CountPlayers;

    public Sports2(String sn, int cp) {
        SportsName = sn;
        CountPlayers = cp;
        System.out.println("Sports Name : " + SportsName);
        System.out.println(" Players Count : " + CountPlayers);
        System.out.println("++++++++++++++++++++++++++++++++");
    }
}
class ComputerLab2 {
    String LabName;
    int StudentsCount;

    public ComputerLab2(String ln, int sc) {
        LabName = ln;
        StudentsCount = sc;
        System.out.println("Lab Name : " + LabName);
        System.out.println("Students Count : " + StudentsCount);
    }
}

public class Assignment5 {
    public static void main (String [] args ) {
        Students2 obj1 = new Students2("Chaithra", 712, "Bengaluru");
        Library2 obj2 = new Library2("Java Program", "Richard");
        Sports2 obj3 = new Sports2("Cricket", 11);
        ComputerLab2 obj4 = new ComputerLab2("BCS", 20);
    }
}
