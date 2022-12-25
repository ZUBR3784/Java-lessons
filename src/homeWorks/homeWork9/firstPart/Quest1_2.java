package homeWorks.homeWork9.firstPart;

import java.util.Scanner;

public class Quest1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        int numToStart = scanner.nextInt();
        System.out.print("Введите число 2: ");
        int numToEnd =scanner.nextInt();
        int sum =0;
        for (int i = numToStart; i <=numToEnd ; i++) {
            if (i%2!=0)
            sum+=i;
        }
        System.out.println("Сумма нечётных целых чисел в заданном диапазоне ="+sum);
    }
}
//Необходимо суммировать все нечётные целые числа в диапазоне, который введёт пользователь с клавиатуры