package homeWorks.homeWork8.secondtLevel;

import java.util.Scanner;

public class Qest1_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print( "Введите первый множитель: ");//2*3=2+2+2=3+3
        int firstNum = scan.nextInt();
        System.out.print( "Введите второй множитель: ");
        int secondNum = scan.nextInt();
        int sum =0;
        for (int i = 1; i <= firstNum; i++) {
            sum=sum+firstNum;
        }
        System.out.println(firstNum+" * "+secondNum+" = "+sum);
    }
}
// написать программу которая выводит результат умножения одного числа на другое,
// не используя *. только знаки сложения
//Подсказка: 5 * 3 = 5+5+5. (используйте цикл)