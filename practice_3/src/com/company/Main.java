package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        GenerationOfRandomNumber();  //первый пункт дз
        GenerationOfRandomWords();   // второй пункт дз
       
    }
    public static void GenerationOfRandomNumber(){
        System.out.print("Загадайте число от 0 до 9 \n");
        Scanner sc = new Scanner(System.in);



        Random rand = new Random();
        int NumberToGuess = rand.nextInt(9);
        int AttemptCounter=0;

        while(true){

            int UserVariable=sc.nextInt();
            if(UserVariable==NumberToGuess){
                System.out.print("Вы угадали,Повторить игру еще раз? 1 – да / 0 – нет \n");
                if((sc.nextInt())==1){
                   // sc.close();
                    GenerationOfRandomNumber();
                }
               // sc.close();
            break;
            }

            if(AttemptCounter==2){
                System.out.print("попытки закончились,Повторить игру еще раз? 1 – да / 0 – нет\n");
                if((sc.nextInt())==1){
                   // sc.close();
                    GenerationOfRandomNumber();
                }
              //  sc.close();
                break;
            }

            if(UserVariable>NumberToGuess){
                System.out.println("число больше");
                AttemptCounter++;
            }
            if(UserVariable<NumberToGuess){
                System.out.println("число меньше");
                AttemptCounter++;
            }
        }

    }
    public static void  GenerationOfRandomWords(){
        Random rand = new Random();
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                "mango","mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int RundomWords = rand.nextInt(24);
        String SecretWord="xxxxxxxxxxxxxx";
        char[]  SecretWordMirrow=SecretWord.toCharArray();
        Scanner sc = new Scanner(System.in);
        boolean Checkpoint=true;
        
        System.out.println("Задание-2");
        while (Checkpoint) {
            System.out.println("ВВедите слово");
            String UserVariable = sc.nextLine();

            for (int counterUserWord = 0; counterUserWord < UserVariable.length(); counterUserWord++) {
                for (int counterWord = 0; counterWord < words[RundomWords].length(); counterWord++) {

                    if (UserVariable.charAt(counterUserWord) == words[RundomWords].charAt(counterWord)) {
                        SecretWordMirrow[counterWord] = words[RundomWords].charAt(counterWord);


                        String StringSecretWordMirrow = String.valueOf(SecretWordMirrow);
                        StringSecretWordMirrow =StringSecretWordMirrow.substring(0, words[RundomWords].length());

                        if (StringSecretWordMirrow.equals(words[RundomWords])) {
                            System.out.println("Угадал!!!");
                            Checkpoint=false;

                        }
                    }
                }
            }
                System.out.println(SecretWordMirrow);

            }


    }
}
