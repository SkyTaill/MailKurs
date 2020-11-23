package com.company;

public class Main {

    public static void main(String[] args) {

        int t1=0;
        double t2=1.3;
        boolean t3=true;
        long t4=344443222;
        float t5=2.00224f;
        char t6='a';
        String t7="fsfd342";    // пункт 2

        double a=3,b=10,c=23,d=12;
        boolean a1;
        boolean FourthPeremen;
        int Tseloe=342;
        String SixthPeremen="ERROR001";
            double a5;
            FirstStage(a,b,c,d);
            a1=SecondStage(a,b);
            ThirdStage(Tseloe);
            FourthPeremen=FourthStage(Tseloe);
            SixthStage(SixthPeremen);
            SeventhStage();

    }



    public static double FirstStage(double a,double b,double c,double d){   //пункт 3
        double Res=a*(b+(c/d));
        return Res;
    }
    public static boolean SecondStage(double a,double b){     //пункт 4
        boolean Res=false;
        if(((a+b)>=10) && ((a+b)<=20))
                Res=true;

        return Res;
    }
    public static void ThirdStage(int a){     //пункт 5
        if(a>=0)
            System.out.println("Положительное число/n");
        else
            System.out.println("Отрицательное число/n");
    }
    public static boolean FourthStage(int a){       //пункт 6
        if(a<0)
            return true;
        else
            return false;
    }
    public static void SixthStage(String a){        //пункт 7
        System.out.println("Привет, "+a+"/n");
    }
    public static void SeventhStage(){              //пункт 8

        int Year=2015;

        if ((Year%4)==0)
        {
            if((Year%100)!=0)
            {
                System.out.println("Високосный");

            }
            if(Year%400==400)
                System.out.println("Високосный");

        }
        else
            System.out.println("Не Високосный");

    }

}
