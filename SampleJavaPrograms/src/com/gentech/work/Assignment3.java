package com.gentech.work;
class Country2 {
    String CountryName;
    String CountryCapital;

    public Country2(String cn, String cc) {
        CountryName = cn;
        CountryCapital = cc;
        System.out.println("Country Name : " + CountryName);
        System.out.println("Country Capital : " + CountryCapital);
        System.out.println("++++++++++++++++++++++++++++++++++++");
    }
}
class State2 {
    String StateName;
    String StateCapital;

    public State2(String sn, String sc) {
        StateName = sn;
        StateCapital = sc;
        System.out.println("State Name : " + StateName);
        System.out.println("State Capital : " + StateCapital);
        System.out.println("+++++++++++++++++++++++++++++++");
    }
}
class Village2 {
    String VillageName;
    String VillageDistrict;

    public Village2(String vn, String vd) {
        VillageName = vn;
        VillageDistrict = vd;
        System.out.println("Village Name : " + VillageName);
        System.out.println("Village District : " + VillageDistrict);
        System.out.println("+++++++++++++++++++++++++++++++++++++");
    }
}
public class Assignment3 {
    public static void main (String [] args) {
        Country2 obj1 = new Country2("India", "Delhi");
        State2 obj2 = new State2("Karnataka", "Bengaluru");
        Village2 obj3 = new Village2("Keelara", "Mandya");
    }
}
