package homeWorks.homeWork10.firstPart;

import java.util.Scanner;

public class Quest1_5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int howMuchOfNum=0;
        for (int i = 1; howMuchOfNum>=0 ; i++) {
            System.out.println("Введите целое число: ");
            int myNum = scanner.nextInt();
            if (myNum<2){
                System.out.println(howMuchOfNum+" простых чисел было введено");
                break;
            }
            howMuchOfNum=i;
        }
    }
}
//С клавиатуры вводятся целые числа до первого числа, которое меньше двух.
// Написать программу, которая определяет сколько простых чисел было введено.
