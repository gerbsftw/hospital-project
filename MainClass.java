package com.callmegerbs;

/**
 * @author gabsy
 * @version 1.0
 */

public class MainClass {
    public static void main(String[] args) {
        Hospital hospitalA = new Hospital();
        Hospital hospitalB = new Hospital("Spitalul Militar", 1890, 109332, 20);

        System.out.println(hospitalA);
        System.out.println(hospitalB);

        Doctor doctorA = new Doctor();
        Doctor doctorB = new Doctor(hospitalB.getName(), "Borcna", "Ioks", 33, "Chirurg", true);

        System.out.println(doctorA);
        System.out.println(doctorB);
    }
}
