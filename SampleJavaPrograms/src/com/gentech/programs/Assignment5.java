package com.gentech.programs;

import javax.print.DocFlavor;

class Students {
    String Student_Name;
    String College_Name;
    int Student_ID;
    int College_code;
}
class Library {
    String Book_Name;
    String Author_Name;
}
class Sports {
    String Sports_Name1;
    String Sports_Name2;
}
class ComputerLab {
    String Lab_Name;
    int Lab_code;
    String Teacher_Name;
}

public class Assignment5 {
    public static void main(String[] args) {
        Students Demo1=new Students();
        Demo1.Student_Name="Bharath";
        Demo1.College_Name="Maharaja Institue of Technology";
        Demo1.Student_ID=414;
        Demo1.College_code=16;
        System.out.println("Student Name :"+Demo1.Student_Name);
        System.out.println("College Name :"+Demo1.College_Name);
        System.out.println("Student ID :"+Demo1.Student_ID);
        System.out.println("College Code :"+Demo1.College_code);
        System.out.println("------------------------------------");
        Library Demo2=new Library();
        Demo2.Book_Name="Wings of Fire";
        Demo2.Author_Name="APJ Abdul Kalam";
        System.out.println("Book Name :"+Demo2.Book_Name);
        System.out.println("Author Name :"+Demo2.Author_Name);
        System.out.println("--------------------------------");
        Sports Demo3=new Sports();
        Demo3.Sports_Name1="Volley Ball";
        Demo3.Sports_Name2="Hockey";
        System.out.println("Sports Name1 :"+Demo3.Sports_Name1);
        System.out.println("Sports Name2 :"+Demo3.Sports_Name2);
        System.out.println("----------------------------------");
        ComputerLab Demo4=new ComputerLab();
        Demo4.Lab_Name="Core Java";
        Demo4.Lab_code=29;
        Demo4.Teacher_Name="Bharathi";
        System.out.println("Lab Name :"+Demo4.Lab_Name);
        System.out.println("Lab Code :"+Demo4.Lab_code);
        System.out.println("Teacher Name :"+Demo4.Teacher_Name);
    }
}
