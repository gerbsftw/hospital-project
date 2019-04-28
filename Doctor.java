package com.callmegerbs;

public class Doctor {
    String hospital;
    String fname;
    String lname;
    int age;
    String specialization;
    boolean isMale;

    {
        hospital = "Unknown";
        fname = "Unknown";
        lname = "Unknown";
        age = 0;
        specialization = "Unknown";
        isMale = false;
    }

    Doctor() {
        fname = fname;
        lname = lname;
        age = age;
        specialization = specialization;
        isMale = isMale;
    }

    Doctor(String hospital, String fname, String lname, int age, String specialization, boolean isMale) {
        this.hospital = hospital;
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.specialization = specialization;
        this.isMale = isMale;
    }

    @Override
    public String toString() {
        return "Doctor "+ fname + " " + lname + ", " + age + " is known for his mastery in " + specialization + ". He is male: " +
        isMale + ". He works in hospital " + "\"" + hospital + "\"" + ".";
    }
}
