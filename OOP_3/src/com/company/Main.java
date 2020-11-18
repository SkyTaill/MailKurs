package com.company;

public class Main {


        public static void main(String[] args) {
            boolean stayetly;


            Plate plate = new Plate(40);

            Cat[] cat;
            cat = new Cat[5];
            cat[0]=new Cat("barsik1",5,0);
            cat[1]=new Cat("barsik2",8,0);
            cat[2]=new Cat("barsik3",15,0);
            cat[3]=new Cat("barsik4",4,0);
            cat[4]=new Cat("barsik5",5,0);

            plate.info();
            for(int i=0;i<cat.length;i++){
                stayetly=cat[i].eat(plate,cat[i]);
                cat[i].catInfo();
                plate.info();
                System.out.println();
            }




            /*/
            plate.info();
            stayetly=cat[0].eat(plate,cat[0]);
            plate.info();
            plate.addFood(10);
            cat[0].catInfo();
            /*/

        }


}
