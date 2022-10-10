package homeWorks.homeWork6.secondLevel;

import java.util.Random;

public class ImprovementTheRoadRools{
    public static void main(String[] args) {
        Random numberOfRegister = new Random();
        int registerNumber = numberOfRegister.nextInt(10000) + 1;
        System.out.println("Your car registration number is: " + registerNumber);

        Random typeOfCar = new Random();
        boolean typeCar = typeOfCar.nextBoolean();
        if (typeCar == true){
            System.out.println("Your car is not lorry!") ;
        } else {
            System.out.println("Your car is lorry!" );
        }


        Random dayOfWeek = new Random();
        boolean weekEnd = typeOfCar.nextBoolean();
        if (weekEnd == true){
            System.out.println("Today is a Weekend!") ;
        } else {
            System.out.println("Today is a Weekday!" );
        }



        if (((typeCar == true) && (registerNumber%2==0) && (weekEnd == true)||((typeCar != true) && (registerNumber % 2 != 0) && (weekEnd != true))))
        {
            System.out.println("Your can entry!");
        }
        else if ((typeCar == true) && (registerNumber %2 != 0) && (weekEnd == true) ||  (typeCar != true) && ( registerNumber %2 ==0) &&(weekEnd != true)) {
            System.out.println("Your can not entry today, because № of your car is not suitable! Sorry.Try in ather days.");
        }
        else if ((registerNumber % 2 == 0) && (typeCar == false) && (weekEnd == true) || (registerNumber %2 != 0) && (typeCar ==true)&&(weekEnd != true)){
            System.out.println("Your can not entry, because type of your car not suitable! Sorry. Try in ather days.");
        }
        else {
            System.out.println("Your can not entry, because type and № of your car are not suitable! Sorry. Try in ather days.");
        }
    }
}



//в том же городе Б решили доработать систему с пробками и решили усовершенствовать систему проезда в город,
// теперь в выходные могут заезжать только легковые автомобили с четными номерами, а в будни все грузовые,
// а так же машины с нечетными номерами. Напишите программу, которая принимает 3 параметра
// isWeekend, isLorry, carNumber и пишет можно ли заезжать этой машине