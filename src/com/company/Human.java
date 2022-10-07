package com.company;

public class Human {
    private String name;
    private int age;
    private int numberOflegs;
    private String skin;
    private int idNumber;

    public void walk(){
        if (numberOflegs == 2){
            System.out.println(name + " is walking");
        }else {
            System.out.println(name + " is wheelchair drifting");
        }
    }
    public void cook(){
        System.out.println("neumim varit");
    }
    public void talk(){
        System.out.println(name + " is talking");
    }
    public void greettings(){
        System.out.println(" hello ");
    }

    public Human(String name, int age, int numberOflegs, String skin, int idNumber) {
        this.name = name;
        this.age = age;
        this.numberOflegs = numberOflegs;
        this.skin = skin;
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", numberOflegs=" + numberOflegs +
                ", skin='" + skin + '\'' +
                ", idNumber=" + idNumber +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOflegs() {
        return numberOflegs;
    }

    public void setNumberOflegs(int numberOflegs) {
        this.numberOflegs = numberOflegs;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
}
