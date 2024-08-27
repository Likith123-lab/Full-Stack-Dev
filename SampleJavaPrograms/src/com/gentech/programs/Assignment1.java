package com.gentech.programs;

import javax.swing.*;

class TwoWheelers{
    String vehicle_type;
    String vehicle_name;
}
class FourWheeler{
    String vehicle_type;
    String vehicle_name;
}
class HeavyVehicle{
    String vehicle_type;
    String vehicle_name;
}
public class Assignment1 {
    public static void main(String[] args) {
        TwoWheelers obj = new TwoWheelers();
        obj.vehicle_name="Honda";
        obj.vehicle_type="two_wheeler";
        System.out.println("Vehicle name :"+obj.vehicle_name);
        System.out.println("Vehicle type :"+obj.vehicle_type);
        System.out.println("--------------------------------");
        FourWheeler obj1 = new FourWheeler();
        obj1.vehicle_name="Audi";
        obj1.vehicle_type="four_wheeler";
        System.out.println("Vehicle name :"+obj1.vehicle_name);
        System.out.println("Vehicle type :"+obj1.vehicle_type);
        System.out.println("--------------------------------");
        HeavyVehicle obj2 = new HeavyVehicle();
        obj2.vehicle_name="Truck";
        obj2.vehicle_type="Heavy vehicle";
        System.out.println("Vehicle name :"+obj2.vehicle_name);
        System.out.println("Vehicle type :"+obj2.vehicle_type);
        System.out.println("--------------------------------");
    }
}
