package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] ArrayForSixTask = new int[]{2, 2, 2, 1, 2, 2, 10, 1};    //массив для 6
        int[] ArrayForSixTask2 = new int[]{2, 2, 2, 1, 12, 2, 10, 1};  //массив для 6 пункта
        int[] ArrayForSevenTask = new int[]{1,2,3,4,5,6,7,8,9};
        MeterBinaryValue();   //1 пункт дз
        System.out.println();
        PlaceholderArray();  //2 пункт
        System.out.println();
        MultiplierByTwo();      //3 пункт
        System.out.println();
        PlaceholderOfMatrix();      //4 пункт
        System.out.println();
        FindingMinandMax();       //5 пункт
        System.out.println();
        System.out.println(CheckBalanceFinder(ArrayForSixTask));    //6 пункт в данном пункте не до конца понял где должны стоять границы с помощью которых можно определить где левая и где правая часть
        System.out.println(CheckBalanceFinder(ArrayForSixTask2));     //поэтому я определил границу массива как последние два числа -граница левого массива

        int s=2;                                                                //7 пункт - значение на сколько будем смещать, можно ставить и отрицательное значение
        System.out.println(" \nзначение до смещения на ="+s);
                     for(int i1=0;i1< ArrayForSevenTask.length;i1++) {                     // 7 пункт
                         System.out.print(ArrayForSevenTask[i1]);
                     }
        System.out.println(" \nзначение после смещения");
                       OffsetNumber(ArrayForSevenTask,s);
    }



    public static void MeterBinaryValue(){
        int [] Array=new int [] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for(int i=0;i< Array.length;i++){
            if (Array[i]==0){
                Array[i]=1;
            }else{
                Array[i]=0;
            }
        }
        for(int i=0;i< Array.length;i++) {

            System.out.print(Array[i]);
        }

    }
    public static void PlaceholderArray(){
        int [] Array=new int [7];
        int delta=3;
        for(int i=0;i< Array.length;i++){
            Array[i]+=delta;
            delta+=3;
        }
        for(int i=0;i< Array.length;i++) {

            System.out.print(Array[i]+" ");
        }
    }
    public static void MultiplierByTwo(){
        int [] Array=new int []{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for(int i=0;i< Array.length;i++){
           if (Array[i]<6){
               Array[i]=Array[i]*2;
           }
        }
        for(int i=0;i< Array.length;i++) {

            System.out.print(Array[i]+" ");
        }
    }
    public static void PlaceholderOfMatrix(){
        int [][] Array=new int [10][10];
        for(int x=0;x< Array.length;x++){
            for(int y=0;y< Array.length;y++){
                if(x==y){
                    Array[x][y] = 1;
                }
                else {
                    Array[x][y] = 0;
                }

            }

        }
           int LocalValueMatrix=Array.length-1;
          for(int secondLine=0;secondLine< Array.length;secondLine++){

              Array[secondLine][LocalValueMatrix]=1;
              LocalValueMatrix--;
          }
        for(int x=0;x< Array.length;x++){
            for(int y=0;y< Array.length;y++) {
                System.out.print(Array[x][y]);
            }
            System.out.println();
            }

    }
    public static void FindingMinandMax(){
         Random random = new Random();
        int [] Array=new int [40] ;
        int Small=101;
        int Big=0;

        for(int i=0;i< Array.length;i++){
            int x = random.nextInt(100) + 0;
            Array[i]=x;
        }
        for(int i=0;i< Array.length;i++){
            if(Array[i]>Big){
                Big=Array[i];
            }
            if(Array[i]<Small){
                Small=Array[i];
            }

        }
        System.out.print("Small-"+Small+"Big-"+Big);
    }
    public static boolean CheckBalanceFinder(int [] a){
    boolean Answer=false;
    int sum=0;
    int sum2=0;
        for(int i=0;i< a.length-2;i++){
            sum+=a[i];
        }
        for(int i=a.length-2;i< a.length;i++){
            sum2+=a[i];
        }
        if(sum2==sum){
            Answer=true;
        }


    return Answer;
    }
    public static void OffsetNumber(int [] a, int n){
        if(n>=0) {
            int x = a[0];
            int y = 0;
            int i=0;
            int flag=0;
           while(flag<a.length){
               if(i+n>a.length-1) {
                   i=i-a.length;
               }
                   y = a[i + n];
                   a[i + n] = x;
                   x = y;
                   i += n;
                   flag++;
            }
            for(int i1=0;i1< a.length;i1++) {

                System.out.print(a[i1]);
            }
        }
        if(n<0){
            int x = a[0];
            int y = 0;
            int i=0;
            int flag=0;
            while(flag<a.length){
                if(i+n<0) {
                    int w=i+n;
                    i=a.length+w;
                }else{
                    i+=n;
                }
                y = a[i];
                a[i] = x;
                x = y;
              //  i += n;
                flag++;
            }
            for(int i1=0;i1< a.length;i1++) {

                System.out.print(a[i1]);
            }
        }

    }


}
