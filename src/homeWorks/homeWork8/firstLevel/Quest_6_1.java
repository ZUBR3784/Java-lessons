package homeWorks.homeWork8.firstLevel;

import java.util.Scanner;

public class Quest_6_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print( "Введите первый множитель: ");
        int firstNum = scan.nextInt();
        System.out.print( "Введите второй множитель: ");
        int secondNum = scan.nextInt();
        System.out.print("Введите результат умножения первого множителя на второй: ");
        int answer = scan.nextInt();
        int multi = firstNum * secondNum;
        if ( answer == multi) {
            System.out.println( "Верно!");
        } else {
            System.out.println("К сожалению ваш ответ неверный. Правильный ответ: "+ multi);
        }

    }
}
//Необходимо написать программу, которая проверяет пользователя на
// знание таблицы умножения. Пользователь сам вводит два целых однозначных числа.
// Программа задаёт вопрос: результат умножения первого числа на второе.
// Пользователь должен ввести ответ и увидеть на экране правильно он ответил или нет.
// Если нет – показать еще и правильный результат.