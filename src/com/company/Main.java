package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        Woman myWoman = new Woman("adela", 15, 5, "white", 5575);
        Man myMen = new Man("Peter", 15, 1,"dark", 15245);
        myMen.greettings();
        myWoman.greettings();
        myMen.cook();
        myWoman.cook();
        if (myMen instanceof Man){
            System.out.println(myMen.getName() + " is a man");
        }*/
        Dog myDog = new Dog();
        Cat myCat = new Cat();
        myCat.sound();
        myDog.sound();
    }
}
