package com.company;

public class Main {

    public static void main(String[] args) {
        Person sickPerson1 = new Person("Stu Dent");
        Doctor dr = new Doctor(300, "Expensive U");
        dr.treatPatient(sickPerson1);
        dr.billPatient(sickPerson1);
    }
}
