package homeWorks.homeWork6.secondLevel;

import java.util.Random;

public class Clock {
    public static void main(String[] args) {
        Random seсund = new Random();
        int seс = seсund.nextInt(28800);
        System.out.println("Для тех, кто понимает в секундах: " + seс + "cek.");
        int hour = seс / 3600;
        double min = seс % hour;
        System.out.println("Для тех, кто не понимает в секундах: " + hour + "ч. " + min + "мин.");
    }
}
