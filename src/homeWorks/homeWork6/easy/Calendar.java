package homeWorks.homeWork6.easy;

import java.util.Random;

public class Calendar {
    public static void main(String[] args) {
        Random random = new Random();
        int year = random.nextInt(83) + 1940;
        double mat =  (2020 -year) % 4;
        System.out.println(year);
        if (year>=2023) {
            System.out.println("Наша фирма так далеко не заглядывает;))");
        } else if (mat == 0){
            System.out.println("Високосный год");
        }
        else {
            System.out.println("Не високосный год");
        }
    }
}

