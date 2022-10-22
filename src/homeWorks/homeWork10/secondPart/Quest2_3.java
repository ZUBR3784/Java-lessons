package homeWorks.homeWork10.secondPart;

import java.util.Random;

public class Quest2_3 {
    public static void main(String[] args) {
        Random random= new Random();
        int num = random.nextInt(100)+1;
        System.out.println("Вводимое число: "+num);
        int res =0;
            for (int i = 0; i < num; i=i) {
                if (num%2==0){
                num=num/2;
                res++;
                if (num==1){
                    System.out.println("Гипотеза Сиракуз верна, т.к данное число спустя "+res+" циклов стало = 1");
                    break;
                }else if (num<1){
                    System.out.println("Гипотеза Сиракуз не верна, т.к данное число спустя "+res+" циклов стало < 1");
                }
            }
        else {
            for (int j = 0; j < num; j=j) {
                num=(num*3+1)/2;
                res++;
                break;
            }
        }
            }
    }
}
//Возьмем любое натуральное число. Если оно четное - разделим его пополам,
// если нечетное - умножим на 3, прибавим 1 и разделим пополам.
// Повторим эти действия с вновь полученным числом.
// Гипотеза гласит, что независимо от выбора первого числа рано или поздно мы получим 1.
//Проверка гипотезы Сиракуз
