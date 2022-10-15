package homeWorks.homeWork6.easy;

import java.util.Random;

public class TheRoadRools {
    public static void main(String[] args) {
        Random numberOfRegister = new Random();
        int registerNumber = numberOfRegister.nextInt(10000) + 1;
        System.out.println("Your car registration number is: " + registerNumber);

        Random typeOfCar = new Random();
        boolean typeCar = typeOfCar.nextBoolean();
        if (typeCar){
            System.out.println("Your car is not lorry!") ;
        } else {
            System.out.println("Your car is lorry!" );
        }

        if (typeCar && registerNumber%2==0){
            System.out.println("Your can entry!");
        } else if (typeCar && registerNumber%2!=0){
            System.out.println("Your can not entry, because № of your car is not suitable! Sorry.");
        }
        else if ((registerNumber % 2 == 0) & (typeCar == false)){
            System.out.println("Your can not entry, because type of your car not suitable! Sorry.");
        }
        else {
            System.out.println("Your can not entry, because type and № of your car are not suitable! Sorry.");
        }
    }
}

