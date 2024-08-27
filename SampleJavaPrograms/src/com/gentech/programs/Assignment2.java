package com.gentech.programs;

class Employee {
    String Employee_name;
    int Employee_ID;
}
class Department {
    String Department_name;
    int Department_ID;
}
class Insurance {
    String Policy_Holder;
    int Policy_number;
}

public class Assignment2 {
    public static void main(String[] args) {
        Employee Rama=new Employee();
        Rama.Employee_name="Rama Krishna";
        Rama.Employee_ID=26;
        System.out.println("Employee Name :"+Rama.Employee_name);
        System.out.println("Employee ID :"+Rama.Employee_ID);
        System.out.println("--------------------------------");
        Department GPO=new Department();
        GPO.Department_name="Audit Section";
        GPO.Department_ID=324;
        System.out.println("Department Name :"+GPO.Department_name);
        System.out.println("Department ID :"+GPO.Department_ID);
        System.out.println("----------------------------------");
        Insurance Jeevananand=new Insurance();
        Jeevananand.Policy_Holder="Janardhanachar";
        Jeevananand.Policy_number=23456;
        System.out.println("Policy Holder :"+Jeevananand.Policy_Holder);
        System.out.println("Policy Number :"+Jeevananand.Policy_number);
        System.out.println("-------------------------------------------");
    }
}
