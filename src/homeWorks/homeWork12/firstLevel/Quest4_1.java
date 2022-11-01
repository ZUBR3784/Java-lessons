package homeWorks.homeWork12.firstLevel;

import java.util.Scanner;

public class Quest4_1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Введите первую сторону треугольника: ");
        int first= scan.nextInt();
        System.out.println("Введите вторую сторону треугольника: ");
        int second=scan.nextInt();
        System.out.println("Введите третью сторону треугольника: ");
        int third = scan.nextInt();
        if (first+second>=third && second+third>=first && first+third>=second){
            System.out.println("Треугольник с такими сторонами существует!");
        }else {
            System.out.println("Треугольник с такими сторонами не существует!");
        }
    }
}
//Вводятся длины трех сторон предполагаемого треугольника.
// Определить, может ли существовать треугольник с такими сторонами при условии что,
// треугольник существует только тогда, когда ни одна его сторона не превышает сумму двух других.
// Например 10 11 12 существует 10 11 22 не существует - так как 22 больше чем сумма 10 и 11
