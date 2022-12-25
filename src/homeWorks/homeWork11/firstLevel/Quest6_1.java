package homeWorks.homeWork11.firstLevel;

import java.util.Random;
import java.util.Scanner;

public class Quest6_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int max= 0;
        System.out.println("Введите, из скольки элементов будет массив: ");
        int n =scan.nextInt();
        int[] newMassiv = new int[n];
        for (int i = 0; i <newMassiv.length; i++) {
            newMassiv[i]= Math.abs(random.nextInt(20)-10);
            System.out.println(newMassiv[i]);
            if (max<newMassiv[i]){
                max=newMassiv[i];
            }
        }System.out.println("Максимальный по модулю элемент массива = "+max);
    }
}
//В массиве, состоящем из N вещественных элементов (вводится из консоли), после заполняется случайными числами,
//найти максимальный по модулю элемент массива. Подсказка: модуль числа Math.abs(..)
