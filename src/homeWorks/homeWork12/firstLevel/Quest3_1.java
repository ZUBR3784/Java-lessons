package homeWorks.homeWork12.firstLevel;

import java.util.Random;

public class Quest3_1 {
    public static void main(String[] args) {
        Random random=new Random();
        int num = random.nextInt(999)+1;
        System.out.println(num);

        int hangr = num / 100;
        int dec = (num % 100) / 10;
        int un = num % 10;
        int sum = hangr+dec+un;
        int multi =hangr*dec*un;

        System.out.println(" Cумма этих цифр = "+sum);
        System.out.println(" Произведение этих цифр = "+multi);
        }
    }
//Сгенерировать случайное трехзначное число. Вывести на экран само число, сумму и произведение его цифр.
