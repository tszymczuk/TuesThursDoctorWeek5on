package com.company;

public class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public void getTreated(){
        System.out.println("My name is " + name + " and I feel so much better!");
    }

    public void payBill(double cost){
        System.out.println("Ouch, my name is " + name + " and I just got a bill of $" + cost);
    }
}
