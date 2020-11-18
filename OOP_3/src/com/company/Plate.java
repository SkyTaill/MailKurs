package com.company;

import java.sql.Struct;

public class Plate {
    private int food;

    public Plate(int food) {

        this.food = food;
    }
    public boolean decreaseFood(int n,int satietyMax,int satiety,Cat cat) {

        if((food-n)>=0) {
            food -= n;
            cat.catEater(n);
        }else{
            System.out.println("В тарелке мало еды");
        }
        if(cat.catEater()>=satietyMax){
            System.out.println("Кот наелся и спит");
            return true;
        }
        else{
            return false;
        }
    }
    public void addFood(int valOfFood){
        food+=valOfFood;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
}

