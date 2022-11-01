package homeWorks.homeWork12.secondLevel;

import java.util.Scanner;


public class Quest3_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Площадь какой фигуры Вы хотите посчитать?"+'\n'+"Если площадь прямоугольника введите - 1,"+'\n'+"Если площадь треугольника введите - 2,"+'\n'+"Если площадь круга введите - 3,"+'\n'+"Введите число: ");
        int choice = scan.nextInt();
        if (choice==1){
            System.out.print("Введите длину меньшей стороны прямоугольника: ");
            int littleSide1= scan.nextInt();
            System.out.print("Введите длину большей стороны прямоугольника: ");
            int bigSide1 =scan.nextInt();
            int area = littleSide1 * bigSide1;
            System.out.println("Площадь прямоугольника = "+area);
        }

        else if (choice==2){
            System.out.print("Введите длину 1-ой стороны треугольника: ");
            int a = scan.nextInt();
            System.out.print("Введите длину 2-ой стороны треугольника: ");
            int b =scan.nextInt();
            System.out.print("Введите длину 3-й стороны треугольника: ");
            int c =scan.nextInt();
            int s = (a + b + c) / 2;
            double area2 = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("Площадь прямоугольника = "+area2);

        }else if (choice==3){
            System.out.print("Введите диаметр круга: ");
            int d = scan.nextInt();
            double PI = 3.14;
            double area3 = d * d / 4* PI  ;
            System.out.println("Площадь круга = "+area3);
        }
        else {
            System.out.println("Правильно введите номер фигуры!");
        }
    }
}
//Написать программу, которая в зависимости от выбора пользователя вычисляет площадь одной из трех геометрических фигур:
// прямоугольника, треугольника или круга.
//
//Для вычисления площади прямоугольника вводятся длины двух его сторон, треугольника - трех сторон, круга - вводится диаметр.
//
//Площадь прямоугольника: area = a * b Площадь треугольника: area = sqrt(s * (s - a) * (s - b) * (s - c)),
// где s = (a + b + c) / 2. В языке Java функция Math.sprt() извлекает квадратный корень. Площадь круга: area = pi * sqr(d) / 4. Функция sqr() возводит в квадрат.
//
//Пользователь осуществляет выбор фигуры, площадь которой он хочет получить, путем ввода цифр 1, 2 или 3.
//
//1 - подсчитывается площадь прямоугольника
//2 - подсчитывается площадь треугольника
//3 - подсчитывается площадь круга
