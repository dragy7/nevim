package com.company;

public class Woman extends Human{
    public Woman(String name, int age, int numberOflegs, String skin, int idNumber) {
        super(name, age, numberOflegs, skin, idNumber);
    }
    public void greettings(){
        System.out.println( " ahojky ");
    }
    public void cook(){
        System.out.println(" uvarim vse");
    }
}
