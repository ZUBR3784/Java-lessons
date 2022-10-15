package homeWorks.homeWork6.easy;

import java.util.Scanner;

public class BuyCookies {
    public static void main(String[] args) {
        double priceForOne =0.5;
        System.out.print("How mach cookies do you want? ");
        Scanner numberOfCookie = new Scanner(System.in);
        int numberOfCookies = numberOfCookie.nextInt();

        System.out.print("How mach money do you have? ");
        Scanner amountOfMoney = new Scanner(System.in);
        double amountOfMon = amountOfMoney.nextDouble();
        if (amountOfMon >= numberOfCookies * priceForOne){
            System.out.print("Можно");
        }else {
            System.out.print("Нельзя");
        }
    }

}
