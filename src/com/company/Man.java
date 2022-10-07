package com.company;

public class Man extends Human{

    public Man(String name, int age, int numberOflegs, String skin, int idNumber) {
        super(name, age, numberOflegs, skin, idNumber);
    }
    public void greettings(){
        System.out.println(" Nazdar ");
    }
    public void cook(){
        System.out.println("uvarim ti caj ");
    }
}
