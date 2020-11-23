package com.company;

public class Animals {
    int jump;
    int swim;
    double jumpOver;
    Animals(int jump,int swim,double jumpOver){
        this.jump=jump;
        this.swim=swim;
        this.jumpOver=jumpOver;
    }
    public void jumpOf(int maxJump){
        boolean localFlag=false;
        if(jump<=maxJump){
            localFlag=true;
        }
        System.out.println("jump-"+localFlag);

    }

    public void swimOf(int maxSwim){
        boolean localFlag=false;
        if(jump<=maxSwim){
            localFlag=true;
        }
        System.out.println("swim-"+localFlag);
    }
    public void jumpOverOf(double maxJumpOverOf){
        boolean localFlag=false;
        if(jump<=maxJumpOverOf){
            localFlag=true;
        }
        System.out.println("JumpOver-"+localFlag);
    }
}
