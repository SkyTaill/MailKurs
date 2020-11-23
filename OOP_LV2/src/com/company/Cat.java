package com.company;

public class Cat extends Animals {


    public Cat(int jump, double jumpOver) {
        super(jump, 0, jumpOver);
    }

       @Override
        public void swimOf(int maxSwim){
            System.out.println("Кот не плавает");
        }


        }


