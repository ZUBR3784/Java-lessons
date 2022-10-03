package homeWorks.homeWork2.secondLevel;

import java.util.Scanner;


public class Pizza {
    public static void main(String[] args) {
        double PI = 3.14;
        double size = 1.1;
        double cal = 40;

        System.out.println("Введите радиус пиццы:");
        Scanner fr1 = new Scanner(System.in);
        String r1 = fr1.next();
        double radOfPizza1 = Double.parseDouble(r1);
        double calories1 = (radOfPizza1 * radOfPizza1 * PI)*cal/size;
        System.out.println( calories1+ " Калорий будет потрачено если съесть пиццу радиусом" + radOfPizza1 + " см");

        System.out.println("Введите радиус пиццы:");
        Scanner fr2 = new Scanner(System.in);
        String r2 = fr2.next();
        double radOfPizza2 = Double.parseDouble(r2);
        double calories2 = (radOfPizza2 * radOfPizza2 * PI)*cal/size;
        System.out.println( calories2+ " Калорий будет потрачено если съесть пиццу радиусом" + radOfPizza2 + " см");


        double x = calories1 - calories2;
        System.out.print("Разница между значениями:" + x);
    }
}



