package homeWorks.homeWork2.secondLevel;

import java.util.Scanner;

public class Stok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер склада м/кв:");
        int x = scan.nextInt();
        System.out.print("Введите ширину товара :");
        int y = scan.nextInt();
        System.out.print("Введите длину товара :");
        int z = scan.nextInt();
        int s = y * z;
        int k = x / s;
        System.out.println("Количество товара,которое возможно разместить на складе = " + k );


    }
}
