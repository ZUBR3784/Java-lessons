package homeWorks.homeWork8.firstLevel;

import java.util.Scanner;

public class Quest2_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum =0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum++;
            }
        }
        if (sum == 2) {
            System.out.print(num+ "- простое число");
        } else{
            System.out.print(num+ "- непростое число");
        }
    }
    }
//    напишите программу, которая проверяет является ли число простым
//        Простое число - число которое делится только на 1 и на самого себя
//        Например число 17 - просто оно делится только на 1 и на 17
//        число 6 не простое - оно делится на 1, 2,3 и 6
//        Подсказка - используйте цикл чтобы проверить сколько чисел меньше данного числа делится без остатка

