package com.gentech.work;
class Employee2 {
    String EmployeeName;
    int EmployeeID;

    public Employee2(String en,int E_id) {
        EmployeeName = en;
        EmployeeID = E_id;
        System.out.println("Employee Name : " + EmployeeName);
        System.out.println("Employee ID : " + EmployeeID);
    }
}
class Department2 {
    String DepartmentName;
    int DepartmentID;
    public Department2(String dn,int did) {
        DepartmentName = dn;
        DepartmentID = did;
        System.out.println("Department Name : " + DepartmentName);
        System.out.println("Department ID :" + DepartmentID);
    }
}
class Insurance2 {
    String PolicyHolder;
    int PolicyNumber;
    public Insurance2(String ph,int pn) {
        PolicyHolder = ph;
        PolicyNumber = pn;
        System.out.println("Policy Holder : " + PolicyHolder);
        System.out.println("Policy Number : " + PolicyNumber);
    }
}
public class Assignment1 {
    public static void main (String [] args) {
        Employee2 obj1 = new Employee2("Sharath", 2345);
        Department2 obj2 = new Department2("Audit", 2344);
        Insurance2 obj3 = new Insurance2("Janardhanachar", 9876);
    }
}
