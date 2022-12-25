package homeWorks.homeWork9.firstPart;

import java.util.Random;

public class Quest1_3 {
    public static void main(String[] args) {
        Random random =new Random();
        int myNum= random.nextInt(900)+100;
        System.out.println(myNum);
        int maxNum=0;
        for (int i = 0; i < 2; i++) {
            int digit= myNum%10;
            if (maxNum<digit){
                maxNum=digit;
            }
            myNum=myNum/10;
        }
        System.out.println(maxNum);
    }
}
//Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное число и его наибольшую цифру.
