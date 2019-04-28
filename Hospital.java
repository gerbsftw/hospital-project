package com.callmegerbs;

/**
 * @author gabsy
 * @version 1.0
 */

public class Hospital {
    String name;
    int patients;
    int staff;
    int foundationYear;

    {
        name = "Unknown";
        patients = 0;
        staff = 0;
        foundationYear = 2019;
    }

    Hospital() {
        name = name;
        patients = patients;
        staff = staff;
        foundationYear = foundationYear;
    }

    Hospital(String name, int foundationYear, int patients, int staff) {
        this.name = name;
        this.patients = patients;
        this.staff = staff;
        this.foundationYear = foundationYear;
    }

    public String toString() {
        String s = "\"" + name + "\"" + " hospital was founded in " + foundationYear + " and hosts " + patients + " well-treated patients." +
        " Number of staff is " + staff;

        return s;
    }

    public String getName() {
        return this.name;
    }
}
