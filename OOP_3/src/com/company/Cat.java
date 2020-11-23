package com.company;

public class Cat {
    private String name;
    private int appetite;
    private int satietyMax=15;
    private int satiety;
    public Cat(String name, int appetite,int satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety=satiety;
    }
    public boolean eat(Plate p,Cat cat) {
        boolean localSatiety;
        localSatiety=p.decreaseFood(appetite,satietyMax,satiety,cat);
        return localSatiety;
    }
    public void catEater(int eater){
        satiety+=eater;
    }
    public int catEater(){

        return satiety;
    }

    public void catInfo(){

        System.out.println(name+" наелся на "+satietyMax+" / "+satiety );
    }
    public boolean catInfo(Cat cat) {
        boolean catInfoEat=false;
        if (cat.catEater() >= satietyMax) {
            System.out.println("Кот наелся и спит");
            catInfoEat= true;

        }
        return catInfoEat;
    }
}
