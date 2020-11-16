package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cat cat=new Cat(200,2);
        Dog dog=new Dog(500,10,0.5);

        cat.jumpOf(3);
        cat.jumpOf(2000);
        dog.swimOf(3);
        dog.swimOf(300);
        cat.swimOf(5);
        cat.jumpOverOf(1);

    }
}
