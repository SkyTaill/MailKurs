package com.company;

public class Employee {
    String FIO;   //Фио- в англоязвчных стран нет фамили, так что фио- нет такой расшифровки , так что я записал как транслит это
    String position;
    String email;
    String number;
    int salary;
    int age;


     Employee(String FIO, String position, String email, String number, int salary, int age) {



         this.FIO=FIO;
         this.position=position;
         this.email=email;
         this.number=number;
         this.salary=salary;
         this.age=age;

    }


    public void printInformation(){
        System.out.println(FIO+" "+ position +" "+ email +" "+ number +" "+ salary +" "+ age);
    }
 

}
