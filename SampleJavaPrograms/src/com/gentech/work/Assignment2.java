package com.gentech.work;
class TwoWheeler2 {
    String VehicleName;
    int Vehiclecode;

    public TwoWheeler2(String vn,int vc) {
        VehicleName = vn;
        Vehiclecode = vc;
        System.out.println("Vehicle Name :" + VehicleName);
        System.out.println("Vehicle Code : " + Vehiclecode);
        System.out.println("++++++++++++++++++++++++++++++");
    }
}
class FourWheeler2 {
    String VehicleName;
    int VehicleCode;

    public FourWheeler2(String vn, int vc) {
        VehicleName = vn;
        VehicleCode = vc;
        System.out.println("Vehicle Name : " + VehicleName);
        System.out.println("Vehicle Code : " + VehicleCode);
        System.out.println("++++++++++++++++++++++++++++++");
    }
}
class HeavyVehicle2 {
    String VehicleName;
    int VehicleDigit;

    public HeavyVehicle2(String vn, int vd) {
        VehicleName = vn;
        VehicleDigit = vd;
        System.out.println("Vehicle Name : " + VehicleName);
        System.out.println("Vehicle Digit : " + VehicleDigit);
        System.out.println("++++++++++++++++++++++++++++++++");
    }
}
public class Assignment2 {
    public static void main (String [] args) {
        TwoWheeler2 obj1 = new TwoWheeler2("Bajaj", 234);
        FourWheeler2 obj2 = new FourWheeler2("Mini Truck", 568);
        HeavyVehicle2 obj3 = new HeavyVehicle2("Truck", 234);
    }
}
