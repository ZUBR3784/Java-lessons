package homeWorks.homeWork6.easy;

import java.util.Scanner;

public class HumanInTheCinema {
    public static void main(String[] args) {
        boolean decision = dressCode();
        if (decision){
            System.out.println("Можно идти смотреть кино");
        }
        else
            System.out.println("Нельзя идти смотреть кино");
    }
    static boolean dressCode () {
        System.out.print("Сколько тебе лет?: ");
        Scanner age = new Scanner(System.in);
        int ageOfHuman = age.nextInt();
        return ageOfHuman >= 18;
    }
}
