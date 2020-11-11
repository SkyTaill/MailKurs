package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee[] persArray = new Employee[5]; // Вначале объявляем массив объектов
        persArray[0] = new Employee("Ivanov tere", "Engineer1", "ivivan@mailbox.com1", "892312222312", 300000, 50);
        persArray[1] = new Employee("Ivanov Ivan1", "Engineer2", "ivivan@mailbox.com2", "892313332312", 320000, 60);
        persArray[2] = new Employee("Ivanov Ivan2", "Engineer3", "ivivan@mailbox.com3", "892315552312", 330000, 10);
        persArray[3] = new Employee("Ivanov Ivan3", "Engineer4", "ivivan@mailbox.com4", "892314442312", 305000, 12);
        persArray[4] = new Employee("Ivanov Ivan4", "Engineer5", "ivivan@mailbox.com5", "892317772312", 370000, 30);


        for(int lenOfPersArray=0;lenOfPersArray<persArray.length;lenOfPersArray++){
            persArray[lenOfPersArray].printInformation();
        }
        System.out.println("Сотрудники старше 40");

        for(int lenOfPersArray=0;lenOfPersArray<persArray.length;lenOfPersArray++){
            if(persArray[lenOfPersArray].age>40) {
                persArray[lenOfPersArray].printInformation();
            }
        }



        //persArray[1] = new Person();
    }
}
