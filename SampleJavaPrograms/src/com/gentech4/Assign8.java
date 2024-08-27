package com.gentech4;
class Emp {
    String ename = "Shenoy";
    int emp_id = 300;
}
class Dept extends Emp {
    String dname = "Analyst";
    int dept_id = 100;
}
class Project extends Dept {
    String pname = "Java";
    int p_id = 25;
    void empdetails () {
        System.out.println("Employee Name : " + ename);
        System.out.println("Employee Id : " + emp_id);
    }
    void deptdetails () {
        System.out.println("Department Name : " + dname);
        System.out.println("Department ID : " + dept_id);
    }
    void ProjectDetails() {
        System.out.println("Project name : " + pname);
        System.out.println("Project ID : " + p_id);
    }
}
public class Assign8 {
    public static void main (String [] args) {
        Project O1 = new Project();
        O1.empdetails();
        O1.deptdetails();
        O1.ProjectDetails();
    }
}
