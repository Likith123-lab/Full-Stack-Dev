package com.gentech.constructor;
class Profile {
    Profile (String name) {
        System.out.println("User Name : " + name);
    }
    Profile (int Password) {
        System.out.println("Password is : " + Password);
    }
}
public class userprofile {
    public static void main (String [] args) {
        Profile T1 = new Profile("Chand Pasha");
        Profile T2 = new Profile (1234);
    }
}
