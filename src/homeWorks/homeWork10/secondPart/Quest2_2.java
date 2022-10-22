package homeWorks.homeWork10.secondPart;

import java.util.Scanner;

public class Quest2_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int howMuchOfNum=0;
        int sum = 0;
        for (int i = 1; howMuchOfNum>=0 ; i++) {
            System.out.println("Введите целое число: ");
            int myNum = scanner.nextInt();
            sum+=myNum;
            if (myNum==0){
                System.out.println(howMuchOfNum+" простых чисел было введено");
                break;
            }
            howMuchOfNum=i;
        }
        int midlle =sum/howMuchOfNum;
        System.out.println("Общая сумма чисел = "+sum);
        System.out.println("Среднее арифметическое значение = "+midlle);
    }
}
//Организовать беспрерывный ввод чисел с клавиатуры, пока пользователь не введёт 0.
// После ввода нуля, показать на экран количество чисел, которые были введены,
// их общую сумму и среднее арифметическое. Подсказка: необходимо объявить переменную-счетчик,
// которая будет считать количество введенных чисел, и переменную, которая будет накапливать общую сумму чисел.
