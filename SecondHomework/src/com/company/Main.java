package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] arrayForSixTask = new int[]{2, 2, 2, 1, 2, 2, 10, 1};    //массив для 6
        int[] arrayForSixTask2 = new int[]{2, 2, 2, 1, 12, 2, 10, 1};  //массив для 6 пункта
        int[] arrayForSevenTask = new int[]{1,2,3,4,5,6,7,8,9};
        meterBinaryValue();   //1 пункт дз
        System.out.println();
        placeholderArray();  //2 пункт
        System.out.println();
        multiplierByTwo();      //3 пункт
        System.out.println();
        placeholderOfMatrix();      //4 пункт
        System.out.println();
        findingMinandMax();       //5 пункт
        System.out.println();
        System.out.println(checkBalanceFinder(arrayForSixTask));    //6 пункт в данном пункте не до конца понял где должны стоять границы с помощью которых можно определить где левая и где правая часть
        System.out.println(checkBalanceFinder(arrayForSixTask2));     //поэтому я определил границу массива как последние два числа -граница левого массива

        int s=2;                                                                //7 пункт - значение на сколько будем смещать, можно ставить и отрицательное значение
        System.out.println(" \nзначение до смещения на ="+s);
                     for(int i1=0;i1< arrayForSevenTask.length;i1++) {                     // 7 пункт
                         System.out.print(arrayForSevenTask[i1]);
                     }
        System.out.println(" \nзначение после смещения");
                       offsetNumber(arrayForSevenTask,s);
    }



    public static void meterBinaryValue(){
        int [] array=new int [] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for(int i=0;i< array.length;i++){
            if (array[i]==0){
                array[i]=1;
            }else{
                array[i]=0;
            }
        }
        for(int i=0;i< array.length;i++) {

            System.out.print(array[i]);
        }

    }
    public static void placeholderArray(){
        int [] array=new int [7];
        int delta=3;
        for(int i=0;i< array.length;i++){
            array[i]+=delta;
            delta+=3;
        }
        for(int i=0;i< array.length;i++) {

            System.out.print(array[i]+" ");
        }
    }
    public static void multiplierByTwo(){
        int [] array=new int []{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for(int i=0;i< array.length;i++){
           if (array[i]<6){
               array[i]=array[i]*2;
           }
        }
        for(int i=0;i< array.length;i++) {

            System.out.print(array[i]+" ");
        }
    }
    public static void placeholderOfMatrix(){
        int [][] array=new int [10][10];
        for(int x=0;x< array.length;x++){
            for(int y=0;y< array.length;y++){
                if(x==y){
                    array[x][y] = 1;
                }
                else {
                    array[x][y] = 0;
                }

            }

        }
           int localValueMatrix=array.length-1;
          for(int secondLine=0;secondLine< array.length;secondLine++){

              array[secondLine][localValueMatrix]=1;
              localValueMatrix--;
          }
        for(int x=0;x< array.length;x++){
            for(int y=0;y< array.length;y++) {
                System.out.print(array[x][y]);
            }
            System.out.println();
            }

    }
    public static void findingMinandMax(){
         Random random = new Random();
        int [] array=new int [40] ;
        int small=101;
        int big=0;

        for(int i=0;i< array.length;i++){
            int x = random.nextInt(100) + 0;
            array[i]=x;
        }
        for(int i=0;i< array.length;i++){
            if(array[i]>big){
                big=array[i];
            }
            if(array[i]<small){
                small=array[i];
            }

        }
        System.out.print("Small-"+small+"Big-"+big);
    }
    public static boolean checkBalanceFinder(int [] a){
    boolean answer=false;
    int sum=0;
    int sum2=0;
        for(int i=0;i< a.length-2;i++){
            sum+=a[i];
        }
        for(int i=a.length-2;i< a.length;i++){
            sum2+=a[i];
        }
        if(sum2==sum){
            answer=true;
        }


    return answer;
    }
    public static void offsetNumber(int [] a, int n){
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
