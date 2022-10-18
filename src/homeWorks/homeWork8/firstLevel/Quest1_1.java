package homeWorks.homeWork8.firstLevel;

import java.util.Scanner;

public class Quest1_1 {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        System.out.print( "Введите год, от которого начнем подсчет: ");
        int firstYear = one.nextInt();
        System.out.println( "Введите год, до которого ведём подсчет: ");
        int secondYear = one.nextInt();
        int x =(secondYear -firstYear) / 4;
        System.out.println( "Колличество високосных лет : " + x);
    }
}
//1)  пользователь вводит с консоли (Scanner) 2 числа (года)
//написать программу, которая считает сколько годов между двумя числами високосные
//Например
//(2000,2022) -> 6