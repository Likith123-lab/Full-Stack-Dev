package com.gentech.constructor;
class Values {
    Values(String Clientname) {
        System.out.println("Client Name : " + Clientname);
    }
    Values(int ContractDuration) {
        System.out.println("Contract Duration in Months : " + ContractDuration);
    }
    Values(double ContractValue) {
        System.out.println("Contract Value in Lakhs : " + ContractValue);
    }
}
public class Contract {
    public static void main (String [] args) {
        Values V1 = new Values("Zensor Company");
        Values V2 = new Values(24);
        Values V3 = new Values(25.5);
    }
}
