package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static char[][] map;
    public static  int SIZE ;

    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static void main(String[] args) {
	InitMaps();
    StartWorkingMaps();

    }


    public static void InitMaps(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ВВедите размер поля-");
        SIZE= sc.nextInt()+2;
        map = new char[SIZE][SIZE];
        map[0][1]='X';
        map[1][0]='Y';



        for(int Xline=0;Xline<SIZE;Xline++){
            for(int Yline=0;Yline<SIZE;Yline++){
               map[Xline][Yline]=DOT_EMPTY;
            }
        }
        map[0][1]='X';
        map[1][0]='Y';
        for (int MapLine=2;MapLine<SIZE;MapLine++){
            map[MapLine][0]=(char) (MapLine-2+ '0');
            map[0][MapLine]=(char) (MapLine-2+ '0');
        }
        for (int i=1;i<SIZE;i++){
            map[i][1]=' ';
            map[1][i]=' ';
        }

     PrintMap();
    }
    public static void PrintMap(){
        for(int Xline=0;Xline<SIZE;Xline++) {
            for (int Yline = 0; Yline < SIZE; Yline++) {
                System.out.print(map[Xline][Yline]+" ");
            }
            System.out.println();
        }
    }
    public static void StartWorkingMaps(){
        Scanner sc = new Scanner(System.in);
        int CoordinatPersonX;
        int CoordinatPersonY;
        boolean FlagOfWining=false;
        boolean Flag=false;
        do {
            System.out.println("введите координаты куда хотите пойти ");
            System.out.println("ВВедите координату Y-");
            CoordinatPersonX = sc.nextInt()+2;
            System.out.println("ВВедите координату X-");
            CoordinatPersonY = sc.nextInt()+2;
            Flag=CheckCoordinat(CoordinatPersonX,CoordinatPersonY);
        }while(Flag);
           if(MoveOfPerson(CoordinatPersonX,CoordinatPersonY)==true){
             System.out.println("Выйграл человек");
             FlagOfWining=true;

           }
        if(FlagOfWining==false) {
           if(MoveOfII()==true){

                   System.out.println("Выйграл II");
                   FlagOfWining = true;
               }
           }
           if (FlagOfWining==false){
               StartWorkingMaps();
           }

    }

    public static boolean CheckCoordinat(int CoordinatPersonX, int CoordinatPersonY){
        boolean Flag=true;

        if (CoordinatPersonX<SIZE){
                if(CoordinatPersonY<SIZE) {


            if (map[CoordinatPersonX][CoordinatPersonY] == DOT_EMPTY) {
                Flag = false;
            } else {
                //System.out.println("не верные координаты");
            }
        }
        }
        return Flag;
    }
    public static boolean MoveOfPerson(int CoordinatPersonX,int CoordinatPersonY){
        boolean FlagOfWining=false;
        map[CoordinatPersonX][CoordinatPersonY]=DOT_X;
        FlagOfWining=CheckOfWinPerson();

        PrintMap();
        return (FlagOfWining);
    }



    public static boolean MoveOfII(){
        boolean FlagOfWining=false;
        boolean LocalFlag=false;
        int PerOfIIX=0;
        int PerOfIIY=0;
        Random rand = new Random();
        do {
            PerOfIIX = rand.nextInt(SIZE);
            PerOfIIY= rand.nextInt(SIZE);
            LocalFlag=CheckCoordinat(PerOfIIX,PerOfIIY);
        }while (LocalFlag);

        map[PerOfIIX][PerOfIIY]=DOT_O;
        FlagOfWining=CheckOfWinII();
        PrintMap();
        return (FlagOfWining);
    }
    public static boolean CheckOfWinPerson() {
        boolean LocalFlagWin = false;
        int CounterWins=0;
        int CounterWins2=0;
        int CounterWinsDiagonal=0;
        int CounterWinsDiagonal2=0;
        for (int MapLineBig=2;MapLineBig<SIZE;MapLineBig++) {
            for (int MapLine = 2; MapLine < SIZE; MapLine++) {
                if (map[MapLineBig][MapLine] == DOT_X) {
                    CounterWins++;
                }
                if (map[MapLine][MapLineBig] == DOT_X) {
                    CounterWins2++;
                }
                if (CounterWins == SIZE - 2) {
                    LocalFlagWin = true;
                    //System.out.println("Победил Человек");
                    break;
                }
                if (CounterWins2 == SIZE - 2) {
                    LocalFlagWin = true;
                  //  System.out.println("Победил Человек");
                    break;
                }
            }
            CounterWins=0;
            CounterWins2=0;

        }
        for (int MapLineBig=2;MapLineBig<SIZE;MapLineBig++) {
            for (int MapLine = 2; MapLine < SIZE; MapLine++) {
                if(MapLine==MapLineBig){
                    if(map[MapLine][MapLineBig]==DOT_X){
                        CounterWinsDiagonal++;
                    }
                }

                if (CounterWinsDiagonal == SIZE - 2) {
                    LocalFlagWin = true;
                    //System.out.println("Победил Человек");
                    break;
                }

            }



            }
        int LocalVelhValue=map.length-1;
        for (int MapLineBig=2;MapLineBig<SIZE;MapLineBig++) {
            if(map[MapLineBig][LocalVelhValue]==DOT_X){
                CounterWinsDiagonal2++;
            }
            if (CounterWinsDiagonal2 == SIZE - 2) {
                LocalFlagWin = true;
                //System.out.println("Победил Человек");
                break;
            }
            LocalVelhValue--;
        }

        return LocalFlagWin;
    }
    public static boolean CheckOfWinII() {
        boolean LocalFlagWin = false;
        int CounterWins=0;
        int CounterWins2=0;
        int CounterWinsDiagonal=0;
        int CounterWinsDiagonal2=0;
        for (int MapLineBig=2;MapLineBig<SIZE;MapLineBig++) {
            for (int MapLine = 2; MapLine < SIZE; MapLine++) {
                if (map[MapLineBig][MapLine] == DOT_O) {
                    CounterWins++;
                }
                if (map[MapLine][MapLineBig] == DOT_O) {
                    CounterWins2++;
                }
                if (CounterWins == SIZE - 2) {
                    LocalFlagWin = true;
                    //System.out.println("Победил Человек");
                    break;
                }
                if (CounterWins2 == SIZE - 2) {
                    LocalFlagWin = true;
                    //  System.out.println("Победил Человек");
                    break;
                }
            }
            CounterWins=0;
            CounterWins2=0;

        }
        for (int MapLineBig=2;MapLineBig<SIZE;MapLineBig++) {
            for (int MapLine = 2; MapLine < SIZE; MapLine++) {
                if(MapLine==MapLineBig){
                    if(map[MapLine][MapLineBig]==DOT_O){
                        CounterWinsDiagonal++;
                    }
                }

                if (CounterWinsDiagonal == SIZE - 2) {
                    LocalFlagWin = true;
                    //System.out.println("Победил Человек");
                    break;
                }

            }



        }
        int LocalVelhValue=map.length-1;
        for (int MapLineBig=2;MapLineBig<SIZE;MapLineBig++) {
            if(map[MapLineBig][LocalVelhValue]==DOT_O){
                CounterWinsDiagonal2++;
            }
            if (CounterWinsDiagonal2 == SIZE - 2) {
                LocalFlagWin = true;
                //System.out.println("Победил Человек");
                break;
            }
            LocalVelhValue--;
        }

        return LocalFlagWin;
    }
}
