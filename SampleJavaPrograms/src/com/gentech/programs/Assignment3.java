package com.gentech.programs;
class Country {
    String Country_Name;
    String Country_Capital;
}
class State {
    String State_Name;
    String State_Capital;
}
class District {
    String District_Name;
    String District_State;
}
class Village {
    String Village_Name;
    String Village_District;
}
public class Assignment3 {
    public static void main(String[] args) {
        Country obj1=new Country();
        obj1.Country_Name="India";
        obj1.Country_Capital="Delhi";
        System.out.println("Country Name :"+obj1.Country_Name);
        System.out.println("Country Capital :"+obj1.Country_Capital);
        System.out.println("*****************************************");
        State obj2=new State();
        obj2.State_Name="Karnataka";
        obj2.State_Capital="Bengaluru";
        System.out.println("State Name :"+obj2.State_Name);
        System.out.println("State Capital :"+obj2.State_Capital);
        System.out.println("===================================");
        District obj3=new District();
        obj3.District_Name="Mandya";
        obj3.District_State="Karnataka";
        System.out.println("District Name :"+obj3.District_Name);
        System.out.println("District State :"+obj3.District_State);
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        Village obj4=new Village();
        obj4.Village_Name="Keelara";
        obj4.Village_District="Mandya";
        System.out.println("Village Name :"+obj4.Village_Name);
        System.out.println("Village District :"+obj4.Village_District);
        System.out.println("########################################");
    }
}
