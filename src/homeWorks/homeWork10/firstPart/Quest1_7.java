package homeWorks.homeWork10.firstPart;

import java.util.Scanner;

public class Quest1_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "Я всегда делаю домашнее задание";
        String exchange = str.replace('а','А');
        System.out.println(exchange);
    }
}
//Напишите метод, который принимает строку и два символа. В результате он возвращает заданную строку,
//где каждый первый символ был заменен вторым символом. Вы должны использовать только методы length()
//и charAt() класса String. Например: «Я всегда делаю домашнее задание», «a», «A» -> «Я всегда делаю домашнее задание».
//используйте циклы
