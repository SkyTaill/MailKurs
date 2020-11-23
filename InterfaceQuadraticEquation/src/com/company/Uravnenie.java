package com.company;
import java.util.InputMismatchException;

public class Uravnenie {

    static float d;
     private double x1, x2;
    float a;
    float b;
    float c;
    boolean flag=false;


    public Uravnenie(float a,float b,float c) {
         this.a=a;
         this.b=b;
         this.c=c;
         qb();
    }


    public void qb(){
            try {
                System.out.println("Решение квадратного уравнения");


                d = (b * b) - (4 * a * c);

                System.out.println("Дискриминант = " + d);

                if (d < 0)
                    System.out.print("Уравнение не имеет решений!!!");
                else if (d == 0) {
                    x1 = (-b) / (2 * a);
                    System.out.println("x = " + x1);
                } else {
                    x1 = (-b + Math.sqrt(d)) / (2 * a);
                    x2 = (-b - Math.sqrt(d)) / (2 * a);
                    if (x1 == x2) {
                        System.out.println("x1 = x2 " + x1);
                        flag=true;
                    }
                    else {
                        System.out.println("x1 =  " + x1 + "  x2 = " + x2);
                        flag=true;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("!!!Ошибка ввода!!!");
            }

    }

    public boolean chekFlag(){
        return flag;
    }


    public double getX1() {
        if (flag) {
            return x1;
        }
        else return 0;
    }

    public double getX2() {
        if (flag) {
            return x2;
        }
        else return 0;
    }
    }

