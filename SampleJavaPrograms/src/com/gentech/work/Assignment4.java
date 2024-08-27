package com.gentech.work;
class Product2 {
    String CompanyName;
    String CompanyBase;

        public Product2(String cn, String cb) {
            CompanyName = cn;
            CompanyBase = cb;
            System.out.println("Company Name : " + CompanyName);
            System.out.println("Company Base : " + CompanyBase);
            System.out.println("++++++++++++++++++++++++++++++");
    }
}
class Sales2 {
    String ProductName;
    String ProductBase;

    public Sales2(String pn, String pb) {
        ProductName = pn;
        ProductBase = pb;
        System.out.println("Product Name : " + ProductName);
        System.out.println("Product Base : " + ProductBase);
        System.out.println("++++++++++++++++++++++++++++++");
    }
}
class Order2 {
    String OrderName;
    String OrderType;

    public Order2(String on,String ot) {
        OrderName = on;
        OrderType = ot;
        System.out.println("Order Name : " + OrderName);
        System.out.println("Order Type : " + OrderType);
        System.out.println("+++++++++++++++++++++++++");
    }
}
class Inventory2 {
    String ReportStatus;
    String AuditStatus;

    public Inventory2(String rs, String as) {
        ReportStatus = rs;
        AuditStatus = as;
        System.out.println("Report Status : " + ReportStatus);
        System.out.println("Audit Status : " + AuditStatus);
        System.out.println("++++++++++++++++++++++++++++++");
    }
}
public class Assignment4 {
    public static void main(String [] args) {
        Product2 obj1 = new Product2("SKF", "Ball Bearings");
        Sales2 obj2 = new Sales2("Engine Oil", "Bike");
        Order2 obj3 = new Order2("Bearings", "Multiple");
        Inventory2 obj4 = new Inventory2("Completed", "Pending");
    }
}
