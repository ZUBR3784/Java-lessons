package homeWorks.homeWork9.firstPart;

import java.util.Scanner;

public class Quest1_4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Введите число: ");
        int myNum= scanner.nextInt();
        int sum=0;
        for (int i = 0; i < 10; i++) {
            int digit= myNum%10;
                sum=sum+digit;
                myNum=myNum/10;
                if (myNum<=0){
                    break;
                }
            }
        System.out.println(sum);
        }
    }
// Для введённого пользователем с клавиатуры натурального числа посчитайте
// сумму всех его цифр (заранее не известно сколько цифр будет в числе).
