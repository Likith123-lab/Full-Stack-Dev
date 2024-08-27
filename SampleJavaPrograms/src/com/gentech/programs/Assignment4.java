package com.gentech.programs;
class Production {
    String Company_Name;
    String Company_Base;
}
class Sales {
    String Product_Name;
    String Product_Quality;
}
class Order {
    String Order_Name;
    int Order_ID;
    String Order_Place;
}
class Inventory {
    String Order_status;
    String Month_Status;
}
public class Assignment4 {
    public static void main(String[] args) {
        Production obj1=new Production();
        obj1.Company_Name="JK Tyres";
        obj1.Company_Base="Tyre Manafacturing";
        System.out.println("Company Name :"+obj1.Company_Name);
        System.out.println("Company Base :"+obj1.Company_Base);
        System.out.println("----------------------------------");
        Sales obj2=new Sales();
        obj2.Product_Name="Ball Bearing";
        obj2.Product_Quality="Tested Good";
        System.out.println("Product Name :"+obj2.Product_Name);
        System.out.println("Product Quality :"+obj2.Product_Quality);
        System.out.println("--------------------------------------");
        Order obj3=new Order();
        obj3.Order_Name="Ball Bearings";
        obj3.Order_ID=95;
        obj3.Order_Place="Bengaluru";
        System.out.println("Order Name :"+obj3.Order_Name);
        System.out.println("Order ID :"+obj3.Order_ID);
        System.out.println("Order Place :"+obj3.Order_Place);
        System.out.println("-------------------------------------");
        Inventory obj4=new Inventory();
        obj4.Order_status="Delivered";
        obj4.Month_Status="Audit Completed";
        System.out.println("Order Status :"+obj4.Order_status);
        System.out.println("Month Status :"+obj4.Month_Status);
        System.out.println("---------------------------------");
    }
}
