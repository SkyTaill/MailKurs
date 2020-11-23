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
        return cat.catInfo(cat);
    }
    public void addFood(int valOfFood){
        food+=valOfFood;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
}

