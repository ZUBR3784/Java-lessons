package homeWorks.homeWork6.secondLevel;

import java.util.Random;

public class Clock {
    public static void main(String[] args) {
        Random sekund = new Random();
        int sek = sekund.nextInt(28800);
        System.out.println("Для тех, кто понимает в секундах: " + sek + "cek.");
        int hour = sek / 360;
        double min = sek % hour;
        System.out.println("Для тех, кто не понимает в секундах: " + hour + "ч. " + min + "мин.");
    }
}
