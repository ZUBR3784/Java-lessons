package homeWorks.homeWork8.firstLevel;

public class Quest2_1 {
    public static void main(String[] args) {
        for (int i = 10; i < 100; i++) {
            if (i % 1 == 0 && i % i == 0 && i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                System.out.print(i);
            }

        }
    }
    }
//    напишите программу, которая проверяет является ли число простым
//        Простое число - число которое делится только на 1 и на самого себя
//        Например число 17 - просто оно делится только на 1 и на 17
//        число 6 не простое - оно делится на 1, 2,3 и 6
//        Подсказка - используйте цикл чтобы проверить сколько чисел меньше данного числа делится без остатка

