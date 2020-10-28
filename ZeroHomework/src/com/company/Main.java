package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
System.out.println("ВВедите число");
for (int i=10;i<=30;i+=10) {
    int inputNumber = scanner.nextInt();
    FindRand(inputNumber);
}
    }


    public static int FindRand(int i){
        final Random random = new Random();
        int x = random.nextInt(10) + 0;
        if (i==x)
            System.out.println("Угадали");
        else
        {System.out.println("Ne ygodal");
            System.out.println(x);}
    return(1);
    }
}


